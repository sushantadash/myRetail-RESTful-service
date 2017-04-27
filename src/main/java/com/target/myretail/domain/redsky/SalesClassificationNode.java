
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
 * The Class SalesClassificationNode.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "node_id",
    "wcs_id"
})
public class SalesClassificationNode {

    /** The node id. */
    @JsonProperty("node_id")
    private String nodeId;
    
    /** The wcs id. */
    @JsonProperty("wcs_id")
    private String wcsId;
    
    /** The additional properties. */
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Gets the node id.
     *
     * @return the node id
     */
    @JsonProperty("node_id")
    public String getNodeId() {
        return nodeId;
    }

    /**
     * Sets the node id.
     *
     * @param nodeId the new node id
     */
    @JsonProperty("node_id")
    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    /**
     * Gets the wcs id.
     *
     * @return the wcs id
     */
    @JsonProperty("wcs_id")
    public String getWcsId() {
        return wcsId;
    }

    /**
     * Sets the wcs id.
     *
     * @param wcsId the new wcs id
     */
    @JsonProperty("wcs_id")
    public void setWcsId(String wcsId) {
        this.wcsId = wcsId;
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
