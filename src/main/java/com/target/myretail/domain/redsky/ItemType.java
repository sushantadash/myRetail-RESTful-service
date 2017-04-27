
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
 * The Class ItemType.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "category_type",
    "type",
    "name"
})
public class ItemType {

    /** The category type. */
    @JsonProperty("category_type")
    private String categoryType;
    
    /** The type. */
    @JsonProperty("type")
    private Integer type;
    
    /** The name. */
    @JsonProperty("name")
    private String name;
    
    /** The additional properties. */
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Gets the category type.
     *
     * @return the category type
     */
    @JsonProperty("category_type")
    public String getCategoryType() {
        return categoryType;
    }

    /**
     * Sets the category type.
     *
     * @param categoryType the new category type
     */
    @JsonProperty("category_type")
    public void setCategoryType(String categoryType) {
        this.categoryType = categoryType;
    }

    /**
     * Gets the type.
     *
     * @return the type
     */
    @JsonProperty("type")
    public Integer getType() {
        return type;
    }

    /**
     * Sets the type.
     *
     * @param type the new type
     */
    @JsonProperty("type")
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * Gets the name.
     *
     * @return the name
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Sets the name.
     *
     * @param name the new name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
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
