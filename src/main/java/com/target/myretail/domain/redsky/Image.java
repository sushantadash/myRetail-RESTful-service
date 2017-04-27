
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
 * The Class Image.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "base_url",
    "primary"
})
public class Image {

    /** The base url. */
    @JsonProperty("base_url")
    private String baseUrl;
    
    /** The primary. */
    @JsonProperty("primary")
    private String primary;
    
    /** The additional properties. */
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Gets the base url.
     *
     * @return the base url
     */
    @JsonProperty("base_url")
    public String getBaseUrl() {
        return baseUrl;
    }

    /**
     * Sets the base url.
     *
     * @param baseUrl the new base url
     */
    @JsonProperty("base_url")
    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    /**
     * Gets the primary.
     *
     * @return the primary
     */
    @JsonProperty("primary")
    public String getPrimary() {
        return primary;
    }

    /**
     * Sets the primary.
     *
     * @param primary the new primary
     */
    @JsonProperty("primary")
    public void setPrimary(String primary) {
        this.primary = primary;
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
