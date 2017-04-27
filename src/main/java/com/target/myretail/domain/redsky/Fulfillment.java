
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
 * The Class Fulfillment.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "is_po_box_prohibited",
    "po_box_prohibited_message"
})
public class Fulfillment {

    /** The is po box prohibited. */
    @JsonProperty("is_po_box_prohibited")
    private Boolean isPoBoxProhibited;
    
    /** The po box prohibited message. */
    @JsonProperty("po_box_prohibited_message")
    private String poBoxProhibitedMessage;
    
    /** The additional properties. */
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Gets the checks if is po box prohibited.
     *
     * @return the checks if is po box prohibited
     */
    @JsonProperty("is_po_box_prohibited")
    public Boolean getIsPoBoxProhibited() {
        return isPoBoxProhibited;
    }

    /**
     * Sets the checks if is po box prohibited.
     *
     * @param isPoBoxProhibited the new checks if is po box prohibited
     */
    @JsonProperty("is_po_box_prohibited")
    public void setIsPoBoxProhibited(Boolean isPoBoxProhibited) {
        this.isPoBoxProhibited = isPoBoxProhibited;
    }

    /**
     * Gets the po box prohibited message.
     *
     * @return the po box prohibited message
     */
    @JsonProperty("po_box_prohibited_message")
    public String getPoBoxProhibitedMessage() {
        return poBoxProhibitedMessage;
    }

    /**
     * Sets the po box prohibited message.
     *
     * @param poBoxProhibitedMessage the new po box prohibited message
     */
    @JsonProperty("po_box_prohibited_message")
    public void setPoBoxProhibitedMessage(String poBoxProhibitedMessage) {
        this.poBoxProhibitedMessage = poBoxProhibitedMessage;
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
