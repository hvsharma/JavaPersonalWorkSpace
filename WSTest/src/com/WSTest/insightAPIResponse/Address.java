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
@JsonPropertyOrder({ "Id", "Name", "AddrLine1", "AddrLine2", "AddrLine3", "AddrLine4", "AddrLine5", "City", "Country",
		"CountryISO", "State", "PostalCode", "Latitude", "Longitude" })
public class Address implements Serializable {

	@JsonProperty("Id")
	private Integer id;
	@JsonProperty("Name")
	private String name;
	@JsonProperty("AddrLine1")
	private String addrLine1;
	@JsonProperty("AddrLine2")
	private String addrLine2;
	@JsonProperty("AddrLine3")
	private String addrLine3;
	@JsonProperty("AddrLine4")
	private String addrLine4;
	@JsonProperty("AddrLine5")
	private String addrLine5;
	@JsonProperty("City")
	private String city;
	@JsonProperty("Country")
	private String country;
	@JsonProperty("CountryISO")
	private String countryISO;
	@JsonProperty("State")
	private String state;
	@JsonProperty("PostalCode")
	private Object postalCode;
	@JsonProperty("Latitude")
	private Double latitude;
	@JsonProperty("Longitude")
	private Double longitude;
	@JsonIgnore
	@Valid
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	private final static long serialVersionUID = 415381696466501579L;

	@JsonProperty("Id")
	public Integer getId() {
		return id;
	}

	@JsonProperty("Id")
	public void setId(Integer id) {
		this.id = id;
	}

	@JsonProperty("Name")
	public String getName() {
		return name;
	}

	@JsonProperty("Name")
	public void setName(String name) {
		this.name = name;
	}

	@JsonProperty("AddrLine1")
	public String getAddrLine1() {
		return addrLine1;
	}

	@JsonProperty("AddrLine1")
	public void setAddrLine1(String addrLine1) {
		this.addrLine1 = addrLine1;
	}

	@JsonProperty("AddrLine2")
	public String getAddrLine2() {
		return addrLine2;
	}

	@JsonProperty("AddrLine2")
	public void setAddrLine2(String addrLine2) {
		this.addrLine2 = addrLine2;
	}

	@JsonProperty("AddrLine3")
	public String getAddrLine3() {
		return addrLine3;
	}

	@JsonProperty("AddrLine3")
	public void setAddrLine3(String addrLine3) {
		this.addrLine3 = addrLine3;
	}

	@JsonProperty("AddrLine4")
	public String getAddrLine4() {
		return addrLine4;
	}

	@JsonProperty("AddrLine4")
	public void setAddrLine4(String addrLine4) {
		this.addrLine4 = addrLine4;
	}

	@JsonProperty("AddrLine5")
	public String getAddrLine5() {
		return addrLine5;
	}

	@JsonProperty("AddrLine5")
	public void setAddrLine5(String addrLine5) {
		this.addrLine5 = addrLine5;
	}

	@JsonProperty("City")
	public String getCity() {
		return city;
	}

	@JsonProperty("City")
	public void setCity(String city) {
		this.city = city;
	}

	@JsonProperty("Country")
	public String getCountry() {
		return country;
	}

	@JsonProperty("Country")
	public void setCountry(String country) {
		this.country = country;
	}

	@JsonProperty("CountryISO")
	public String getCountryISO() {
		return countryISO;
	}

	@JsonProperty("CountryISO")
	public void setCountryISO(String countryISO) {
		this.countryISO = countryISO;
	}

	@JsonProperty("State")
	public String getState() {
		return state;
	}

	@JsonProperty("State")
	public void setState(String state) {
		this.state = state;
	}

	@JsonProperty("PostalCode")
	public Object getPostalCode() {
		return postalCode;
	}

	@JsonProperty("PostalCode")
	public void setPostalCode(Object postalCode) {
		this.postalCode = postalCode;
	}

	@JsonProperty("Latitude")
	public Double getLatitude() {
		return latitude;
	}

	@JsonProperty("Latitude")
	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	@JsonProperty("Longitude")
	public Double getLongitude() {
		return longitude;
	}

	@JsonProperty("Longitude")
	public void setLongitude(Double longitude) {
		this.longitude = longitude;
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
		return new ToStringBuilder(this).append("id", id).append("name", name).append("addrLine1", addrLine1)
				.append("addrLine2", addrLine2).append("addrLine3", addrLine3).append("addrLine4", addrLine4)
				.append("addrLine5", addrLine5).append("city", city).append("country", country)
				.append("countryISO", countryISO).append("state", state).append("postalCode", postalCode)
				.append("latitude", latitude).append("longitude", longitude)
				.append("additionalProperties", additionalProperties).toString();
	}

}