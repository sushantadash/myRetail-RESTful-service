
package com.target.myretail.domain.redsky;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

// TODO: Auto-generated Javadoc
/**
 * The Class BundleComponents.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "is_assortment",
    "is_kit_master"
})
public class BundleComponents {

    /** The is assortment. */
    @JsonProperty("is_assortment")
    private Boolean isAssortment;
    
    /** The is kit master. */
    @JsonProperty("is_kit_master")
    private Boolean isKitMaster;
    
    /** The additional properties. */
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Gets the checks if is assortment.
     *
     * @return the checks if is assortment
     */
    @JsonProperty("is_assortment")
    public Boolean getIsAssortment() {
        return isAssortment;
    }

    /**
     * Sets the checks if is assortment.
     *
     * @param isAssortment the new checks if is assortment
     */
    @JsonProperty("is_assortment")
    public void setIsAssortment(Boolean isAssortment) {
        this.isAssortment = isAssortment;
    }

    /**
     * Gets the checks if is kit master.
     *
     * @return the checks if is kit master
     */
    @JsonProperty("is_kit_master")
    public Boolean getIsKitMaster() {
        return isKitMaster;
    }

    /**
     * Sets the checks if is kit master.
     *
     * @param isKitMaster the new checks if is kit master
     */
    @JsonProperty("is_kit_master")
    public void setIsKitMaster(Boolean isKitMaster) {
        this.isKitMaster = isKitMaster;
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
