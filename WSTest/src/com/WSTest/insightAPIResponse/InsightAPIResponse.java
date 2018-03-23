package com.WSTest.insightAPIResponse;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
@JsonPropertyOrder({ "Message","IdentifierCode", "ItemDescription", "IdentifierStatus", "StatusColor", "Quantity",
		"IdentifierEvents", "AuthenticationType" })
public class InsightAPIResponse implements Serializable {
	
	@JsonProperty("Message")
	private String message;
	@JsonProperty("IdentifierCode")
	private String identifierCode;
	@JsonProperty("ItemDescription")
	private String itemDescription;
	@JsonProperty("IdentifierStatus")
	private String identifierStatus;
	@JsonProperty("StatusColor")
	private String statusColor;
	@JsonProperty("Quantity")
	private Integer quantity;
	@JsonProperty("IdentifierEvents")
	@Valid
	private List<IdentifierEvent> identifierEvents = new ArrayList<IdentifierEvent>();
	@JsonProperty("AuthenticationType")
	private Integer authenticationType;
	@JsonIgnore
	@Valid
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	private final static long serialVersionUID = -3766573998387273166L;
	
	@JsonProperty("Message")
	public String getMessage() {
		return message;
	}

	@JsonProperty("Message")
	public void setMessage(String message) {
		this.message = message;
	}
	
	@JsonProperty("IdentifierCode")
	public String getIdentifierCode() {
		return identifierCode;
	}

	@JsonProperty("IdentifierCode")
	public void setIdentifierCode(String identifierCode) {
		this.identifierCode = identifierCode;
	}

	@JsonProperty("ItemDescription")
	public String getItemDescription() {
		return itemDescription;
	}

	@JsonProperty("ItemDescription")
	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}

	@JsonProperty("IdentifierStatus")
	public String getIdentifierStatus() {
		return identifierStatus;
	}

	@JsonProperty("IdentifierStatus")
	public void setIdentifierStatus(String identifierStatus) {
		this.identifierStatus = identifierStatus;
	}

	@JsonProperty("StatusColor")
	public String getStatusColor() {
		return statusColor;
	}

	@JsonProperty("StatusColor")
	public void setStatusColor(String statusColor) {
		this.statusColor = statusColor;
	}

	@JsonProperty("Quantity")
	public Integer getQuantity() {
		return quantity;
	}

	@JsonProperty("Quantity")
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	@JsonProperty("IdentifierEvents")
	public List<IdentifierEvent> getIdentifierEvents() {
		return identifierEvents;
	}

	@JsonProperty("IdentifierEvents")
	public void setIdentifierEvents(List<IdentifierEvent> identifierEvents) {
		this.identifierEvents = identifierEvents;
	}

	@JsonProperty("AuthenticationType")
	public Integer getAuthenticationType() {
		return authenticationType;
	}

	@JsonProperty("AuthenticationType")
	public void setAuthenticationType(Integer authenticationType) {
		this.authenticationType = authenticationType;
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
		return new ToStringBuilder(this).append("message", message).append("identifierCode", identifierCode)
				.append("itemDescription", itemDescription).append("identifierStatus", identifierStatus)
				.append("statusColor", statusColor).append("quantity", quantity)
				.append("identifierEvents", identifierEvents).append("authenticationType", authenticationType)
				.append("additionalProperties", additionalProperties).toString();
	}

}