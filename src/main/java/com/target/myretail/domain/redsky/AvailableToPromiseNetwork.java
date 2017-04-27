
package com.target.myretail.domain.redsky;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

// TODO: Auto-generated Javadoc
/**
 * The Class AvailableToPromiseNetwork.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "product_id",
    "id_type",
    "available_to_promise_quantity",
    "street_date",
    "availability",
    "online_available_to_promise_quantity",
    "stores_available_to_promise_quantity",
    "availability_status",
    "multichannel_options"
})
public class AvailableToPromiseNetwork {

    /** The product id. */
    @JsonProperty("product_id")
    private String productId;
    
    /** The id type. */
    @JsonProperty("id_type")
    private String idType;
    
    /** The available to promise quantity. */
    @JsonProperty("available_to_promise_quantity")
    private Double availableToPromiseQuantity;
    
    /** The street date. */
    @JsonProperty("street_date")
    private String streetDate;
    
    /** The availability. */
    @JsonProperty("availability")
    private String availability;
    
    /** The online available to promise quantity. */
    @JsonProperty("online_available_to_promise_quantity")
    private Double onlineAvailableToPromiseQuantity;
    
    /** The stores available to promise quantity. */
    @JsonProperty("stores_available_to_promise_quantity")
    private Double storesAvailableToPromiseQuantity;
    
    /** The availability status. */
    @JsonProperty("availability_status")
    private String availabilityStatus;
    
    /** The multichannel options. */
    @JsonProperty("multichannel_options")
    private List<String> multichannelOptions = null;
    
    /** The additional properties. */
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Gets the product id.
     *
     * @return the product id
     */
    @JsonProperty("product_id")
    public String getProductId() {
        return productId;
    }

    /**
     * Sets the product id.
     *
     * @param productId the new product id
     */
    @JsonProperty("product_id")
    public void setProductId(String productId) {
        this.productId = productId;
    }

    /**
     * Gets the id type.
     *
     * @return the id type
     */
    @JsonProperty("id_type")
    public String getIdType() {
        return idType;
    }

    /**
     * Sets the id type.
     *
     * @param idType the new id type
     */
    @JsonProperty("id_type")
    public void setIdType(String idType) {
        this.idType = idType;
    }

    /**
     * Gets the available to promise quantity.
     *
     * @return the available to promise quantity
     */
    @JsonProperty("available_to_promise_quantity")
    public Double getAvailableToPromiseQuantity() {
        return availableToPromiseQuantity;
    }

    /**
     * Sets the available to promise quantity.
     *
     * @param availableToPromiseQuantity the new available to promise quantity
     */
    @JsonProperty("available_to_promise_quantity")
    public void setAvailableToPromiseQuantity(Double availableToPromiseQuantity) {
        this.availableToPromiseQuantity = availableToPromiseQuantity;
    }

    /**
     * Gets the street date.
     *
     * @return the street date
     */
    @JsonProperty("street_date")
    public String getStreetDate() {
        return streetDate;
    }

    /**
     * Sets the street date.
     *
     * @param streetDate the new street date
     */
    @JsonProperty("street_date")
    public void setStreetDate(String streetDate) {
        this.streetDate = streetDate;
    }

    /**
     * Gets the availability.
     *
     * @return the availability
     */
    @JsonProperty("availability")
    public String getAvailability() {
        return availability;
    }

    /**
     * Sets the availability.
     *
     * @param availability the new availability
     */
    @JsonProperty("availability")
    public void setAvailability(String availability) {
        this.availability = availability;
    }

    /**
     * Gets the online available to promise quantity.
     *
     * @return the online available to promise quantity
     */
    @JsonProperty("online_available_to_promise_quantity")
    public Double getOnlineAvailableToPromiseQuantity() {
        return onlineAvailableToPromiseQuantity;
    }

    /**
     * Sets the online available to promise quantity.
     *
     * @param onlineAvailableToPromiseQuantity the new online available to promise quantity
     */
    @JsonProperty("online_available_to_promise_quantity")
    public void setOnlineAvailableToPromiseQuantity(Double onlineAvailableToPromiseQuantity) {
        this.onlineAvailableToPromiseQuantity = onlineAvailableToPromiseQuantity;
    }

    /**
     * Gets the stores available to promise quantity.
     *
     * @return the stores available to promise quantity
     */
    @JsonProperty("stores_available_to_promise_quantity")
    public Double getStoresAvailableToPromiseQuantity() {
        return storesAvailableToPromiseQuantity;
    }

    /**
     * Sets the stores available to promise quantity.
     *
     * @param storesAvailableToPromiseQuantity the new stores available to promise quantity
     */
    @JsonProperty("stores_available_to_promise_quantity")
    public void setStoresAvailableToPromiseQuantity(Double storesAvailableToPromiseQuantity) {
        this.storesAvailableToPromiseQuantity = storesAvailableToPromiseQuantity;
    }

    /**
     * Gets the availability status.
     *
     * @return the availability status
     */
    @JsonProperty("availability_status")
    public String getAvailabilityStatus() {
        return availabilityStatus;
    }

    /**
     * Sets the availability status.
     *
     * @param availabilityStatus the new availability status
     */
    @JsonProperty("availability_status")
    public void setAvailabilityStatus(String availabilityStatus) {
        this.availabilityStatus = availabilityStatus;
    }

    /**
     * Gets the multichannel options.
     *
     * @return the multichannel options
     */
    @JsonProperty("multichannel_options")
    public List<String> getMultichannelOptions() {
        return multichannelOptions;
    }

    /**
     * Sets the multichannel options.
     *
     * @param multichannelOptions the new multichannel options
     */
    @JsonProperty("multichannel_options")
    public void setMultichannelOptions(List<String> multichannelOptions) {
        this.multichannelOptions = multichannelOptions;
    }

    /**
     * Gets the additional properties.
     *
     * @return the additional properties
     */
    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Sets the additional property.
     *
     * @param name the name
     * @param value the value
     */
    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
