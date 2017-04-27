
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
 * The Class PackageDimensions.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "weight",
    "weight_unit_of_measure",
    "width",
    "depth",
    "height",
    "dimension_unit_of_measure"
})
public class PackageDimensions {

    /** The weight. */
    @JsonProperty("weight")
    private String weight;
    
    /** The weight unit of measure. */
    @JsonProperty("weight_unit_of_measure")
    private String weightUnitOfMeasure;
    
    /** The width. */
    @JsonProperty("width")
    private String width;
    
    /** The depth. */
    @JsonProperty("depth")
    private String depth;
    
    /** The height. */
    @JsonProperty("height")
    private String height;
    
    /** The dimension unit of measure. */
    @JsonProperty("dimension_unit_of_measure")
    private String dimensionUnitOfMeasure;
    
    /** The additional properties. */
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Gets the weight.
     *
     * @return the weight
     */
    @JsonProperty("weight")
    public String getWeight() {
        return weight;
    }

    /**
     * Sets the weight.
     *
     * @param weight the new weight
     */
    @JsonProperty("weight")
    public void setWeight(String weight) {
        this.weight = weight;
    }

    /**
     * Gets the weight unit of measure.
     *
     * @return the weight unit of measure
     */
    @JsonProperty("weight_unit_of_measure")
    public String getWeightUnitOfMeasure() {
        return weightUnitOfMeasure;
    }

    /**
     * Sets the weight unit of measure.
     *
     * @param weightUnitOfMeasure the new weight unit of measure
     */
    @JsonProperty("weight_unit_of_measure")
    public void setWeightUnitOfMeasure(String weightUnitOfMeasure) {
        this.weightUnitOfMeasure = weightUnitOfMeasure;
    }

    /**
     * Gets the width.
     *
     * @return the width
     */
    @JsonProperty("width")
    public String getWidth() {
        return width;
    }

    /**
     * Sets the width.
     *
     * @param width the new width
     */
    @JsonProperty("width")
    public void setWidth(String width) {
        this.width = width;
    }

    /**
     * Gets the depth.
     *
     * @return the depth
     */
    @JsonProperty("depth")
    public String getDepth() {
        return depth;
    }

    /**
     * Sets the depth.
     *
     * @param depth the new depth
     */
    @JsonProperty("depth")
    public void setDepth(String depth) {
        this.depth = depth;
    }

    /**
     * Gets the height.
     *
     * @return the height
     */
    @JsonProperty("height")
    public String getHeight() {
        return height;
    }

    /**
     * Sets the height.
     *
     * @param height the new height
     */
    @JsonProperty("height")
    public void setHeight(String height) {
        this.height = height;
    }

    /**
     * Gets the dimension unit of measure.
     *
     * @return the dimension unit of measure
     */
    @JsonProperty("dimension_unit_of_measure")
    public String getDimensionUnitOfMeasure() {
        return dimensionUnitOfMeasure;
    }

    /**
     * Sets the dimension unit of measure.
     *
     * @param dimensionUnitOfMeasure the new dimension unit of measure
     */
    @JsonProperty("dimension_unit_of_measure")
    public void setDimensionUnitOfMeasure(String dimensionUnitOfMeasure) {
        this.dimensionUnitOfMeasure = dimensionUnitOfMeasure;
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
