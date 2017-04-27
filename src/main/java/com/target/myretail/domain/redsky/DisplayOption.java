
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
 * The Class DisplayOption.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "is_size_chart",
    "is_warranty"
})
public class DisplayOption {

    /** The is size chart. */
    @JsonProperty("is_size_chart")
    private Boolean isSizeChart;
    
    /** The is warranty. */
    @JsonProperty("is_warranty")
    private Boolean isWarranty;
    
    /** The additional properties. */
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Gets the checks if is size chart.
     *
     * @return the checks if is size chart
     */
    @JsonProperty("is_size_chart")
    public Boolean getIsSizeChart() {
        return isSizeChart;
    }

    /**
     * Sets the checks if is size chart.
     *
     * @param isSizeChart the new checks if is size chart
     */
    @JsonProperty("is_size_chart")
    public void setIsSizeChart(Boolean isSizeChart) {
        this.isSizeChart = isSizeChart;
    }

    /**
     * Gets the checks if is warranty.
     *
     * @return the checks if is warranty
     */
    @JsonProperty("is_warranty")
    public Boolean getIsWarranty() {
        return isWarranty;
    }

    /**
     * Sets the checks if is warranty.
     *
     * @param isWarranty the new checks if is warranty
     */
    @JsonProperty("is_warranty")
    public void setIsWarranty(Boolean isWarranty) {
        this.isWarranty = isWarranty;
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
