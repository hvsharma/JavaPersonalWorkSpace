import java.io.StringWriter;
import java.net.ProxySelector;
import java.net.URI;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.SystemDefaultRoutePlanner;
import org.apache.http.util.EntityUtils;
import com.WSTest.insightAPIResponse.InsightAPIResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class Test2 {
	
	private static String token = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzb2Z0d2FyZSI6W10sImxvbmdpdHVkZSI6LTc4LjM3MTUsImxhdGl0dWRlIjozNi42NjQ4LCJjb3VudHJ5IjoiVW5pdGVkIFN0YXRlcyIsImlwIjoiMTA0LjQ2LjEwMC4xMzMiLCJpc3MiOiJodHRwczovL29wc2VjZHIuYXV0aDAuY29tLyIsInN1YiI6ImF1dGgwfDVhNmI4ZmQyZDA3NjgyNTlmZmVkZjY4NyIsImF1ZCI6IjhyMlBIOWdrMmZGQlpDNEFkRHc2NzRMbnlYcnNmNm81IiwiaWF0IjoxNTE4MDk4NDc4LCJleHAiOjE1MTgxMzA4Nzh9.y9RHJohiWyA_SpWZdSLQxa5ggR3XaEJkhQmd38CvfPg";
	
	public static void main(String[] args) 
    {
		SystemDefaultRoutePlanner routePlanner = new SystemDefaultRoutePlanner(ProxySelector.getDefault());
		HttpClient httpclient = HttpClients.custom().setRoutePlanner(routePlanner).build();

        try
        {
        	StringBuilder sb = new StringBuilder();
        	sb.append("https://insightapi.opsecsecurity.com/sandbox01/authenticate/").append("35/").append("00000138");
            URIBuilder builder = new URIBuilder(sb.toString());

            builder.setParameter("ValidationCode", "JKL");            

            URI uri = builder.build();
            HttpGet request = new HttpGet(uri);
            request.setHeader("Ocp-Apim-Subscription-Key", "60e39ab05ddb49989c1a99b853f0a491");
            request.setHeader("token", token);

            if(System.getenv("JOLT_ENVIRONMENT")!=null && System.getenv("JOLT_ENVIRONMENT").equalsIgnoreCase("local")) {
		        HttpHost proxy = new HttpHost("www.mc.xerox.com", 8000);
		        RequestConfig config = RequestConfig.custom().setProxy(proxy).build();
		        request.setConfig(config);
	        }
            
            // Request body
            

            HttpResponse response = httpclient.execute(request);
            HttpEntity entity = response.getEntity();

            if (entity != null) 
            {
            	byte[] jsonData = EntityUtils.toByteArray(entity);
            	System.out.println("Response from OpsecInsightAPI Authenticate Web Service Call: \n"+new String(jsonData));
            	ObjectMapper objectMapper = new ObjectMapper();
            	InsightAPIResponse insightAPIResponse = objectMapper.readValue(jsonData, InsightAPIResponse.class);
            	objectMapper.configure(SerializationFeature.INDENT_OUTPUT, true);
            	StringWriter stringEmp = new StringWriter();
        		objectMapper.writeValue(stringEmp, insightAPIResponse);
        		System.out.println("Employee JSON is\n"+stringEmp);
            	System.out.println("\n\n\n"+insightAPIResponse.toString());
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

}
