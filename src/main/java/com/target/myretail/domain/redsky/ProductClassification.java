
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
 * The Class ProductClassification.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "product_type",
    "product_type_name",
    "item_type_name",
    "item_type"
})
public class ProductClassification {

    /** The product type. */
    @JsonProperty("product_type")
    private String productType;
    
    /** The product type name. */
    @JsonProperty("product_type_name")
    private String productTypeName;
    
    /** The item type name. */
    @JsonProperty("item_type_name")
    private String itemTypeName;
    
    /** The item type. */
    @JsonProperty("item_type")
    private ItemType itemType;
    
    /** The additional properties. */
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Gets the product type.
     *
     * @return the product type
     */
    @JsonProperty("product_type")
    public String getProductType() {
        return productType;
    }

    /**
     * Sets the product type.
     *
     * @param productType the new product type
     */
    @JsonProperty("product_type")
    public void setProductType(String productType) {
        this.productType = productType;
    }

    /**
     * Gets the product type name.
     *
     * @return the product type name
     */
    @JsonProperty("product_type_name")
    public String getProductTypeName() {
        return productTypeName;
    }

    /**
     * Sets the product type name.
     *
     * @param productTypeName the new product type name
     */
    @JsonProperty("product_type_name")
    public void setProductTypeName(String productTypeName) {
        this.productTypeName = productTypeName;
    }

    /**
     * Gets the item type name.
     *
     * @return the item type name
     */
    @JsonProperty("item_type_name")
    public String getItemTypeName() {
        return itemTypeName;
    }

    /**
     * Sets the item type name.
     *
     * @param itemTypeName the new item type name
     */
    @JsonProperty("item_type_name")
    public void setItemTypeName(String itemTypeName) {
        this.itemTypeName = itemTypeName;
    }

    /**
     * Gets the item type.
     *
     * @return the item type
     */
    @JsonProperty("item_type")
    public ItemType getItemType() {
        return itemType;
    }

    /**
     * Sets the item type.
     *
     * @param itemType the new item type
     */
    @JsonProperty("item_type")
    public void setItemType(ItemType itemType) {
        this.itemType = itemType;
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
