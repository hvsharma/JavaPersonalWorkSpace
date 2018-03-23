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
@JsonPropertyOrder({ "Id", "ProgramId", "EventName", "UserName", "FromIdentifier", "ToIdentifier", "EventDate",
		"EventMetadata", "ItemName", "ItemSku", "Quantity", "UserOrganizationName", "OrganizationName",
		"ParentOrganizationName", "LocationName", "ProgramName", "UserEmail", "Location", "Icon",
		"EventIconUnicodeValue", "EventType", "IsLastEvent", "CanOverrideLastEvent", "ToIdentifierSequence",
		"FromIdentifierSequence", "ShipmentEvent" })
public class IdentifierEvent implements Serializable {

	@JsonProperty("Id")
	private Integer id;
	@JsonProperty("ProgramId")
	private Integer programId;
	@JsonProperty("EventName")
	private String eventName;
	@JsonProperty("UserName")
	private String userName;
	@JsonProperty("FromIdentifier")
	private String fromIdentifier;
	@JsonProperty("ToIdentifier")
	private String toIdentifier;
	@JsonProperty("EventDate")
	private String eventDate;
	@JsonProperty("EventMetadata")
	@Valid
	private List<Object> eventMetadata = new ArrayList<Object>();
	@JsonProperty("ItemName")
	private String itemName;
	@JsonProperty("ItemSku")
	private String itemSku;
	@JsonProperty("Quantity")
	private Integer quantity;
	@JsonProperty("UserOrganizationName")
	private String userOrganizationName;
	@JsonProperty("OrganizationName")
	private String organizationName;
	@JsonProperty("ParentOrganizationName")
	private String parentOrganizationName;
	@JsonProperty("LocationName")
	private String locationName;
	@JsonProperty("ProgramName")
	private String programName;
	@JsonProperty("UserEmail")
	private String userEmail;
	@JsonProperty("Location")
	@Valid
	private Location location;
	@JsonProperty("Icon")
	private String icon;
	@JsonProperty("EventIconUnicodeValue")
	private String eventIconUnicodeValue;
	@JsonProperty("EventType")
	private Integer eventType;
	@JsonProperty("IsLastEvent")
	private Boolean isLastEvent;
	@JsonProperty("CanOverrideLastEvent")
	private Boolean canOverrideLastEvent;
	@JsonProperty("ToIdentifierSequence")
	private Object toIdentifierSequence;
	@JsonProperty("FromIdentifierSequence")
	private Object fromIdentifierSequence;
	@JsonProperty("ShipmentEvent")
	@Valid
	private ShipmentEvent shipmentEvent;
	@JsonIgnore
	@Valid
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	private final static long serialVersionUID = -6795525101423546347L;

	@JsonProperty("Id")
	public Integer getId() {
		return id;
	}

	@JsonProperty("Id")
	public void setId(Integer id) {
		this.id = id;
	}

	@JsonProperty("ProgramId")
	public Integer getProgramId() {
		return programId;
	}

	@JsonProperty("ProgramId")
	public void setProgramId(Integer programId) {
		this.programId = programId;
	}

	@JsonProperty("EventName")
	public String getEventName() {
		return eventName;
	}

	@JsonProperty("EventName")
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	@JsonProperty("UserName")
	public String getUserName() {
		return userName;
	}

	@JsonProperty("UserName")
	public void setUserName(String userName) {
		this.userName = userName;
	}

	@JsonProperty("FromIdentifier")
	public String getFromIdentifier() {
		return fromIdentifier;
	}

	@JsonProperty("FromIdentifier")
	public void setFromIdentifier(String fromIdentifier) {
		this.fromIdentifier = fromIdentifier;
	}

	@JsonProperty("ToIdentifier")
	public String getToIdentifier() {
		return toIdentifier;
	}

	@JsonProperty("ToIdentifier")
	public void setToIdentifier(String toIdentifier) {
		this.toIdentifier = toIdentifier;
	}

	@JsonProperty("EventDate")
	public String getEventDate() {
		return eventDate;
	}

	@JsonProperty("EventDate")
	public void setEventDate(String eventDate) {
		this.eventDate = eventDate;
	}

	@JsonProperty("EventMetadata")
	public List<Object> getEventMetadata() {
		return eventMetadata;
	}

	@JsonProperty("EventMetadata")
	public void setEventMetadata(List<Object> eventMetadata) {
		this.eventMetadata = eventMetadata;
	}

	@JsonProperty("ItemName")
	public String getItemName() {
		return itemName;
	}

	@JsonProperty("ItemName")
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	@JsonProperty("ItemSku")
	public String getItemSku() {
		return itemSku;
	}

	@JsonProperty("ItemSku")
	public void setItemSku(String itemSku) {
		this.itemSku = itemSku;
	}

	@JsonProperty("Quantity")
	public Integer getQuantity() {
		return quantity;
	}

	@JsonProperty("Quantity")
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	@JsonProperty("UserOrganizationName")
	public String getUserOrganizationName() {
		return userOrganizationName;
	}

	@JsonProperty("UserOrganizationName")
	public void setUserOrganizationName(String userOrganizationName) {
		this.userOrganizationName = userOrganizationName;
	}

	@JsonProperty("OrganizationName")
	public String getOrganizationName() {
		return organizationName;
	}

	@JsonProperty("OrganizationName")
	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
	}

	@JsonProperty("ParentOrganizationName")
	public String getParentOrganizationName() {
		return parentOrganizationName;
	}

	@JsonProperty("ParentOrganizationName")
	public void setParentOrganizationName(String parentOrganizationName) {
		this.parentOrganizationName = parentOrganizationName;
	}

	@JsonProperty("LocationName")
	public String getLocationName() {
		return locationName;
	}

	@JsonProperty("LocationName")
	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

	@JsonProperty("ProgramName")
	public String getProgramName() {
		return programName;
	}

	@JsonProperty("ProgramName")
	public void setProgramName(String programName) {
		this.programName = programName;
	}

	@JsonProperty("UserEmail")
	public String getUserEmail() {
		return userEmail;
	}

	@JsonProperty("UserEmail")
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	@JsonProperty("Location")
	public Location getLocation() {
		return location;
	}

	@JsonProperty("Location")
	public void setLocation(Location location) {
		this.location = location;
	}

	@JsonProperty("Icon")
	public String getIcon() {
		return icon;
	}

	@JsonProperty("Icon")
	public void setIcon(String icon) {
		this.icon = icon;
	}

	@JsonProperty("EventIconUnicodeValue")
	public String getEventIconUnicodeValue() {
		return eventIconUnicodeValue;
	}

	@JsonProperty("EventIconUnicodeValue")
	public void setEventIconUnicodeValue(String eventIconUnicodeValue) {
		this.eventIconUnicodeValue = eventIconUnicodeValue;
	}

	@JsonProperty("EventType")
	public Integer getEventType() {
		return eventType;
	}

	@JsonProperty("EventType")
	public void setEventType(Integer eventType) {
		this.eventType = eventType;
	}

	@JsonProperty("IsLastEvent")
	public Boolean getIsLastEvent() {
		return isLastEvent;
	}

	@JsonProperty("IsLastEvent")
	public void setIsLastEvent(Boolean isLastEvent) {
		this.isLastEvent = isLastEvent;
	}

	@JsonProperty("CanOverrideLastEvent")
	public Boolean getCanOverrideLastEvent() {
		return canOverrideLastEvent;
	}

	@JsonProperty("CanOverrideLastEvent")
	public void setCanOverrideLastEvent(Boolean canOverrideLastEvent) {
		this.canOverrideLastEvent = canOverrideLastEvent;
	}

	@JsonProperty("ToIdentifierSequence")
	public Object getToIdentifierSequence() {
		return toIdentifierSequence;
	}

	@JsonProperty("ToIdentifierSequence")
	public void setToIdentifierSequence(Object toIdentifierSequence) {
		this.toIdentifierSequence = toIdentifierSequence;
	}

	@JsonProperty("FromIdentifierSequence")
	public Object getFromIdentifierSequence() {
		return fromIdentifierSequence;
	}

	@JsonProperty("FromIdentifierSequence")
	public void setFromIdentifierSequence(Object fromIdentifierSequence) {
		this.fromIdentifierSequence = fromIdentifierSequence;
	}

	@JsonProperty("ShipmentEvent")
	public ShipmentEvent getShipmentEvent() {
		return shipmentEvent;
	}

	@JsonProperty("ShipmentEvent")
	public void setShipmentEvent(ShipmentEvent shipmentEvent) {
		this.shipmentEvent = shipmentEvent;
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
		return new ToStringBuilder(this).append("id", id).append("programId", programId).append("eventName", eventName)
				.append("userName", userName).append("fromIdentifier", fromIdentifier)
				.append("toIdentifier", toIdentifier).append("eventDate", eventDate)
				.append("eventMetadata", eventMetadata).append("itemName", itemName).append("itemSku", itemSku)
				.append("quantity", quantity).append("userOrganizationName", userOrganizationName)
				.append("organizationName", organizationName).append("parentOrganizationName", parentOrganizationName)
				.append("locationName", locationName).append("programName", programName).append("userEmail", userEmail)
				.append("location", location).append("icon", icon)
				.append("eventIconUnicodeValue", eventIconUnicodeValue).append("eventType", eventType)
				.append("isLastEvent", isLastEvent).append("canOverrideLastEvent", canOverrideLastEvent)
				.append("toIdentifierSequence", toIdentifierSequence)
				.append("fromIdentifierSequence", fromIdentifierSequence).append("shipmentEvent", shipmentEvent)
				.append("additionalProperties", additionalProperties).toString();
	}

}