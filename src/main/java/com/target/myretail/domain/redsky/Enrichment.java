
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
 * The Class Enrichment.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "images",
    "sales_classification_nodes"
})
public class Enrichment {

    /** The images. */
    @JsonProperty("images")
    private List<Image> images = null;
    
    /** The sales classification nodes. */
    @JsonProperty("sales_classification_nodes")
    private List<SalesClassificationNode> salesClassificationNodes = null;
    
    /** The additional properties. */
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Gets the images.
     *
     * @return the images
     */
    @JsonProperty("images")
    public List<Image> getImages() {
        return images;
    }

    /**
     * Sets the images.
     *
     * @param images the new images
     */
    @JsonProperty("images")
    public void setImages(List<Image> images) {
        this.images = images;
    }

    /**
     * Gets the sales classification nodes.
     *
     * @return the sales classification nodes
     */
    @JsonProperty("sales_classification_nodes")
    public List<SalesClassificationNode> getSalesClassificationNodes() {
        return salesClassificationNodes;
    }

    /**
     * Sets the sales classification nodes.
     *
     * @param salesClassificationNodes the new sales classification nodes
     */
    @JsonProperty("sales_classification_nodes")
    public void setSalesClassificationNodes(List<SalesClassificationNode> salesClassificationNodes) {
        this.salesClassificationNodes = salesClassificationNodes;
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
