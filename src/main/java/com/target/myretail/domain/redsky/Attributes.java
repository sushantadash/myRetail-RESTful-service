
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
 * The Class Attributes.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "gift_wrapable",
    "has_prop65",
    "is_hazmat",
    "max_order_qty",
    "street_date",
    "media_format",
    "merch_class",
    "merch_subclass",
    "return_method"
})
public class Attributes {

    /** The gift wrapable. */
    @JsonProperty("gift_wrapable")
    private String giftWrapable;
    
    /** The has prop 65. */
    @JsonProperty("has_prop65")
    private String hasProp65;
    
    /** The is hazmat. */
    @JsonProperty("is_hazmat")
    private String isHazmat;
    
    /** The max order qty. */
    @JsonProperty("max_order_qty")
    private Integer maxOrderQty;
    
    /** The street date. */
    @JsonProperty("street_date")
    private String streetDate;
    
    /** The media format. */
    @JsonProperty("media_format")
    private String mediaFormat;
    
    /** The merch class. */
    @JsonProperty("merch_class")
    private String merchClass;
    
    /** The merch subclass. */
    @JsonProperty("merch_subclass")
    private Integer merchSubclass;
    
    /** The return method. */
    @JsonProperty("return_method")
    private String returnMethod;
    
    /** The additional properties. */
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Gets the gift wrapable.
     *
     * @return the gift wrapable
     */
    @JsonProperty("gift_wrapable")
    public String getGiftWrapable() {
        return giftWrapable;
    }

    /**
     * Sets the gift wrapable.
     *
     * @param giftWrapable the new gift wrapable
     */
    @JsonProperty("gift_wrapable")
    public void setGiftWrapable(String giftWrapable) {
        this.giftWrapable = giftWrapable;
    }

    /**
     * Gets the checks for prop 65.
     *
     * @return the checks for prop 65
     */
    @JsonProperty("has_prop65")
    public String getHasProp65() {
        return hasProp65;
    }

    /**
     * Sets the checks for prop 65.
     *
     * @param hasProp65 the new checks for prop 65
     */
    @JsonProperty("has_prop65")
    public void setHasProp65(String hasProp65) {
        this.hasProp65 = hasProp65;
    }

    /**
     * Gets the checks if is hazmat.
     *
     * @return the checks if is hazmat
     */
    @JsonProperty("is_hazmat")
    public String getIsHazmat() {
        return isHazmat;
    }

    /**
     * Sets the checks if is hazmat.
     *
     * @param isHazmat the new checks if is hazmat
     */
    @JsonProperty("is_hazmat")
    public void setIsHazmat(String isHazmat) {
        this.isHazmat = isHazmat;
    }

    /**
     * Gets the max order qty.
     *
     * @return the max order qty
     */
    @JsonProperty("max_order_qty")
    public Integer getMaxOrderQty() {
        return maxOrderQty;
    }

    /**
     * Sets the max order qty.
     *
     * @param maxOrderQty the new max order qty
     */
    @JsonProperty("max_order_qty")
    public void setMaxOrderQty(Integer maxOrderQty) {
        this.maxOrderQty = maxOrderQty;
    }

    /**
     * Gets the street date.
     *
     * @return the street date
     */
    @JsonProperty("street_date")
    public String getStreetDate() {
        return streetDate;
    }

    /**
     * Sets the street date.
     *
     * @param streetDate the new street date
     */
    @JsonProperty("street_date")
    public void setStreetDate(String streetDate) {
        this.streetDate = streetDate;
    }

    /**
     * Gets the media format.
     *
     * @return the media format
     */
    @JsonProperty("media_format")
    public String getMediaFormat() {
        return mediaFormat;
    }

    /**
     * Sets the media format.
     *
     * @param mediaFormat the new media format
     */
    @JsonProperty("media_format")
    public void setMediaFormat(String mediaFormat) {
        this.mediaFormat = mediaFormat;
    }

    /**
     * Gets the merch class.
     *
     * @return the merch class
     */
    @JsonProperty("merch_class")
    public String getMerchClass() {
        return merchClass;
    }

    /**
     * Sets the merch class.
     *
     * @param merchClass the new merch class
     */
    @JsonProperty("merch_class")
    public void setMerchClass(String merchClass) {
        this.merchClass = merchClass;
    }

    /**
     * Gets the merch subclass.
     *
     * @return the merch subclass
     */
    @JsonProperty("merch_subclass")
    public Integer getMerchSubclass() {
        return merchSubclass;
    }

    /**
     * Sets the merch subclass.
     *
     * @param merchSubclass the new merch subclass
     */
    @JsonProperty("merch_subclass")
    public void setMerchSubclass(Integer merchSubclass) {
        this.merchSubclass = merchSubclass;
    }

    /**
     * Gets the return method.
     *
     * @return the return method
     */
    @JsonProperty("return_method")
    public String getReturnMethod() {
        return returnMethod;
    }

    /**
     * Sets the return method.
     *
     * @param returnMethod the new return method
     */
    @JsonProperty("return_method")
    public void setReturnMethod(String returnMethod) {
        this.returnMethod = returnMethod;
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
