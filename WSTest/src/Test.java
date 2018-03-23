import java.net.ProxySelector;
import java.net.URI;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.SystemDefaultRoutePlanner;
import org.apache.http.util.EntityUtils;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Test 
{
    public static void main(String[] args) throws Exception 
    {
    	SystemDefaultRoutePlanner routePlanner = new SystemDefaultRoutePlanner(ProxySelector.getDefault());
		HttpClient httpclient = HttpClients.custom().setRoutePlanner(routePlanner).build();
		
    	try 
		{
    		
	    	
	       	URIBuilder builder = new URIBuilder("https://insightapi.opsecsecurity.com/sandbox01/");
	        URI uri = builder.build();
	        HttpPost request = new HttpPost(uri);
	        
	        request.setHeader("Content-Type", "application/x-www-form-urlencoded");
	        request.setHeader("Ocp-Apim-Subscription-Key", "60e39ab05ddb49989c1a99b853f0a491");
	        
	        //Sets proxy so that the web service call works in local environment
	        //Please add an environment variable named "JOLT_ENVIRONMENT" and set it's value to "local"
	        if(System.getenv("JOLT_ENVIRONMENT")!=null && System.getenv("JOLT_ENVIRONMENT").equalsIgnoreCase("local")) {
		        HttpHost proxy = new HttpHost("www.mc.xerox.com", 8000);
		        RequestConfig config = RequestConfig.custom().setProxy(proxy).build();
		        request.setConfig(config);
	        }
	        // Request body
	        StringEntity reqEntity = new StringEntity("username=leonard.coia@xerox.com&password=XeroxTest2018");
	        request.setEntity(reqEntity);
	                    
	        HttpResponse response = httpclient.execute(request);
	        HttpEntity entity = response.getEntity();
	        
	        if (entity != null) 
	        {   
	        	byte[] jsonData = EntityUtils.toByteArray(entity);
	        	System.out.println("Response from Token Request Web Service: \n"+new String(jsonData));
	        	
	        	if(response.getStatusLine().getStatusCode()==200) {
	            	
	                //create ObjectMapper instance
	                ObjectMapper objectMapper = new ObjectMapper();
	                //read JSON like DOM Parser
	                JsonNode rootNode = objectMapper.readTree(jsonData);
	                JsonNode tokenNode = rootNode.path("id_token");	    
	                System.out.println("\n\nToken:"+tokenNode.asText());
	        	} else {
	        		throw new Exception("ERROR while getting Token from OpsecInsightAPI - Token not present in response!");
	        	}
	        }  else {
	    		throw new Exception("ERROR while getting Token - response Entity is null!");
	    	}
		}
		catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
    }
}

