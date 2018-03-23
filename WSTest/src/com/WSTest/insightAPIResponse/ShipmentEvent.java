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
@JsonPropertyOrder({ "SoldTo", "FromAddress", "ToAddress" })
public class ShipmentEvent implements Serializable {

	@JsonProperty("SoldTo")
	private String soldTo;
	@JsonProperty("FromAddress")
	@Valid
	private Address fromAddress;
	@JsonProperty("ToAddress")
	@Valid
	private Address toAddress;
	@JsonIgnore
	@Valid
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	private final static long serialVersionUID = -404474051892316991L;

	@JsonProperty("SoldTo")
	public String getSoldTo() {
		return soldTo;
	}

	@JsonProperty("SoldTo")
	public void setSoldTo(String soldTo) {
		this.soldTo = soldTo;
	}

	@JsonProperty("FromAddress")
	public Address getFromAddress() {
		return fromAddress;
	}

	@JsonProperty("FromAddress")
	public void setFromAddress(Address fromAddress) {
		this.fromAddress = fromAddress;
	}

	@JsonProperty("ToAddress")
	public Address getToAddress() {
		return toAddress;
	}

	@JsonProperty("ToAddress")
	public void setToAddress(Address toAddress) {
		this.toAddress = toAddress;
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
		return new ToStringBuilder(this).append("soldTo", soldTo).append("fromAddress", fromAddress)
				.append("toAddress", toAddress).append("additionalProperties", additionalProperties).toString();
	}

}
