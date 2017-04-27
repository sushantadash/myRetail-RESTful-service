
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
 * The Class ProductDescription.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "title",
    "bullet_description",
    "general_description"
})
public class ProductDescription {

    /** The title. */
    @JsonProperty("title")
    private String title;
    
    /** The bullet description. */
    @JsonProperty("bullet_description")
    private List<String> bulletDescription = null;
    
    /** The general description. */
    @JsonProperty("general_description")
    private String generalDescription;
    
    /** The additional properties. */
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Gets the title.
     *
     * @return the title
     */
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     * Sets the title.
     *
     * @param title the new title
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Gets the bullet description.
     *
     * @return the bullet description
     */
    @JsonProperty("bullet_description")
    public List<String> getBulletDescription() {
        return bulletDescription;
    }

    /**
     * Sets the bullet description.
     *
     * @param bulletDescription the new bullet description
     */
    @JsonProperty("bullet_description")
    public void setBulletDescription(List<String> bulletDescription) {
        this.bulletDescription = bulletDescription;
    }

    /**
     * Gets the general description.
     *
     * @return the general description
     */
    @JsonProperty("general_description")
    public String getGeneralDescription() {
        return generalDescription;
    }

    /**
     * Sets the general description.
     *
     * @param generalDescription the new general description
     */
    @JsonProperty("general_description")
    public void setGeneralDescription(String generalDescription) {
        this.generalDescription = generalDescription;
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
