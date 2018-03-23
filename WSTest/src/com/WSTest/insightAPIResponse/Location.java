package com.WSTest.insightAPIResponse;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"Longitude",
"Latitude",
"LocationName"
})
public class Location implements Serializable
{

@JsonProperty("Longitude")
private Double longitude;
@JsonProperty("Latitude")
private Double latitude;
@JsonProperty("LocationName")
private String locationName;
@JsonIgnore
@Valid
private Map<String, Object> additionalProperties = new HashMap<String, Object>();
private final static long serialVersionUID = -6836691329013139834L;

@JsonProperty("Longitude")
public Double getLongitude() {
return longitude;
}

@JsonProperty("Longitude")
public void setLongitude(Double longitude) {
this.longitude = longitude;
}

@JsonProperty("Latitude")
public Double getLatitude() {
return latitude;
}

@JsonProperty("Latitude")
public void setLatitude(Double latitude) {
this.latitude = latitude;
}

@JsonProperty("LocationName")
public String getLocationName() {
return locationName;
}

@JsonProperty("LocationName")
public void setLocationName(String locationName) {
this.locationName = locationName;
}

@JsonAnyGetter
public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

@JsonAnySetter
public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

@Override
public String toString() {
return new ToStringBuilder(this).append("longitude", longitude).append("latitude", latitude).append("locationName", locationName).append("additionalProperties", additionalProperties).toString();
}

}