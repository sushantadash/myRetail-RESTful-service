
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
 * The Class TaxCategory.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "tax_class",
    "tax_code_id",
    "tax_code"
})
public class TaxCategory {

    /** The tax class. */
    @JsonProperty("tax_class")
    private String taxClass;
    
    /** The tax code id. */
    @JsonProperty("tax_code_id")
    private Integer taxCodeId;
    
    /** The tax code. */
    @JsonProperty("tax_code")
    private String taxCode;
    
    /** The additional properties. */
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Gets the tax class.
     *
     * @return the tax class
     */
    @JsonProperty("tax_class")
    public String getTaxClass() {
        return taxClass;
    }

    /**
     * Sets the tax class.
     *
     * @param taxClass the new tax class
     */
    @JsonProperty("tax_class")
    public void setTaxClass(String taxClass) {
        this.taxClass = taxClass;
    }

    /**
     * Gets the tax code id.
     *
     * @return the tax code id
     */
    @JsonProperty("tax_code_id")
    public Integer getTaxCodeId() {
        return taxCodeId;
    }

    /**
     * Sets the tax code id.
     *
     * @param taxCodeId the new tax code id
     */
    @JsonProperty("tax_code_id")
    public void setTaxCodeId(Integer taxCodeId) {
        this.taxCodeId = taxCodeId;
    }

    /**
     * Gets the tax code.
     *
     * @return the tax code
     */
    @JsonProperty("tax_code")
    public String getTaxCode() {
        return taxCode;
    }

    /**
     * Sets the tax code.
     *
     * @param taxCode the new tax code
     */
    @JsonProperty("tax_code")
    public void setTaxCode(String taxCode) {
        this.taxCode = taxCode;
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
