
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
 * The Class Handling.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "import_designation_description"
})
public class Handling {

    /** The import designation description. */
    @JsonProperty("import_designation_description")
    private String importDesignationDescription;
    
    /** The additional properties. */
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Gets the import designation description.
     *
     * @return the import designation description
     */
    @JsonProperty("import_designation_description")
    public String getImportDesignationDescription() {
        return importDesignationDescription;
    }

    /**
     * Sets the import designation description.
     *
     * @param importDesignationDescription the new import designation description
     */
    @JsonProperty("import_designation_description")
    public void setImportDesignationDescription(String importDesignationDescription) {
        this.importDesignationDescription = importDesignationDescription;
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
