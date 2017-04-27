
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
 * The Class Item.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "tcin",
    "bundle_components",
    "dpci",
    "upc",
    "product_description",
    "parent_items",
    "buy_url",
    "enrichment",
    "return_method",
    "handling",
    "recall_compliance",
    "tax_category",
    "display_option",
    "fulfillment",
    "package_dimensions",
    "environmental_segmentation",
    "manufacturer",
    "product_classification",
    "product_brand",
    "item_state",
    "specifications",
    "attributes",
    "country_of_origin",
    "relationship_type_code",
    "subscription_eligible",
    "estore_item_status_code",
    "return_policies"
})
public class Item {

    /** The tcin. */
    @JsonProperty("tcin")
    private String tcin;
    
    /** The bundle components. */
    @JsonProperty("bundle_components")
    private BundleComponents bundleComponents;
    
    /** The dpci. */
    @JsonProperty("dpci")
    private String dpci;
    
    /** The upc. */
    @JsonProperty("upc")
    private String upc;
    
    /** The product description. */
    @JsonProperty("product_description")
    private ProductDescription productDescription;
    
    /** The parent items. */
    @JsonProperty("parent_items")
    private String parentItems;
    
    /** The buy url. */
    @JsonProperty("buy_url")
    private String buyUrl;
    
    /** The enrichment. */
    @JsonProperty("enrichment")
    private Enrichment enrichment;
    
    /** The return method. */
    @JsonProperty("return_method")
    private String returnMethod;
    
    /** The handling. */
    @JsonProperty("handling")
    private Handling handling;
    
    /** The recall compliance. */
    @JsonProperty("recall_compliance")
    private RecallCompliance recallCompliance;
    
    /** The tax category. */
    @JsonProperty("tax_category")
    private TaxCategory taxCategory;
    
    /** The display option. */
    @JsonProperty("display_option")
    private DisplayOption displayOption;
    
    /** The fulfillment. */
    @JsonProperty("fulfillment")
    private Fulfillment fulfillment;
    
    /** The package dimensions. */
    @JsonProperty("package_dimensions")
    private PackageDimensions packageDimensions;
    
    /** The environmental segmentation. */
    @JsonProperty("environmental_segmentation")
    private EnvironmentalSegmentation environmentalSegmentation;
    
    /** The manufacturer. */
    @JsonProperty("manufacturer")
    private Manufacturer manufacturer;
    
    /** The product classification. */
    @JsonProperty("product_classification")
    private ProductClassification productClassification;
    
    /** The product brand. */
    @JsonProperty("product_brand")
    private ProductBrand productBrand;
    
    /** The item state. */
    @JsonProperty("item_state")
    private String itemState;
    
    /** The specifications. */
    @JsonProperty("specifications")
    private List<Object> specifications = null;
    
    /** The attributes. */
    @JsonProperty("attributes")
    private Attributes attributes;
    
    /** The country of origin. */
    @JsonProperty("country_of_origin")
    private String countryOfOrigin;
    
    /** The relationship type code. */
    @JsonProperty("relationship_type_code")
    private String relationshipTypeCode;
    
    /** The subscription eligible. */
    @JsonProperty("subscription_eligible")
    private Boolean subscriptionEligible;
    
    /** The estore item status code. */
    @JsonProperty("estore_item_status_code")
    private String estoreItemStatusCode;
    
    /** The return policies. */
    @JsonProperty("return_policies")
    private ReturnPolicies returnPolicies;
    
    /** The additional properties. */
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Gets the tcin.
     *
     * @return the tcin
     */
    @JsonProperty("tcin")
    public String getTcin() {
        return tcin;
    }

    /**
     * Sets the tcin.
     *
     * @param tcin the new tcin
     */
    @JsonProperty("tcin")
    public void setTcin(String tcin) {
        this.tcin = tcin;
    }

    /**
     * Gets the bundle components.
     *
     * @return the bundle components
     */
    @JsonProperty("bundle_components")
    public BundleComponents getBundleComponents() {
        return bundleComponents;
    }

    /**
     * Sets the bundle components.
     *
     * @param bundleComponents the new bundle components
     */
    @JsonProperty("bundle_components")
    public void setBundleComponents(BundleComponents bundleComponents) {
        this.bundleComponents = bundleComponents;
    }

    /**
     * Gets the dpci.
     *
     * @return the dpci
     */
    @JsonProperty("dpci")
    public String getDpci() {
        return dpci;
    }

    /**
     * Sets the dpci.
     *
     * @param dpci the new dpci
     */
    @JsonProperty("dpci")
    public void setDpci(String dpci) {
        this.dpci = dpci;
    }

    /**
     * Gets the upc.
     *
     * @return the upc
     */
    @JsonProperty("upc")
    public String getUpc() {
        return upc;
    }

    /**
     * Sets the upc.
     *
     * @param upc the new upc
     */
    @JsonProperty("upc")
    public void setUpc(String upc) {
        this.upc = upc;
    }

    /**
     * Gets the product description.
     *
     * @return the product description
     */
    @JsonProperty("product_description")
    public ProductDescription getProductDescription() {
        return productDescription;
    }

    /**
     * Sets the product description.
     *
     * @param productDescription the new product description
     */
    @JsonProperty("product_description")
    public void setProductDescription(ProductDescription productDescription) {
        this.productDescription = productDescription;
    }

    /**
     * Gets the parent items.
     *
     * @return the parent items
     */
    @JsonProperty("parent_items")
    public String getParentItems() {
        return parentItems;
    }

    /**
     * Sets the parent items.
     *
     * @param parentItems the new parent items
     */
    @JsonProperty("parent_items")
    public void setParentItems(String parentItems) {
        this.parentItems = parentItems;
    }

    /**
     * Gets the buy url.
     *
     * @return the buy url
     */
    @JsonProperty("buy_url")
    public String getBuyUrl() {
        return buyUrl;
    }

    /**
     * Sets the buy url.
     *
     * @param buyUrl the new buy url
     */
    @JsonProperty("buy_url")
    public void setBuyUrl(String buyUrl) {
        this.buyUrl = buyUrl;
    }

    /**
     * Gets the enrichment.
     *
     * @return the enrichment
     */
    @JsonProperty("enrichment")
    public Enrichment getEnrichment() {
        return enrichment;
    }

    /**
     * Sets the enrichment.
     *
     * @param enrichment the new enrichment
     */
    @JsonProperty("enrichment")
    public void setEnrichment(Enrichment enrichment) {
        this.enrichment = enrichment;
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
     * Gets the handling.
     *
     * @return the handling
     */
    @JsonProperty("handling")
    public Handling getHandling() {
        return handling;
    }

    /**
     * Sets the handling.
     *
     * @param handling the new handling
     */
    @JsonProperty("handling")
    public void setHandling(Handling handling) {
        this.handling = handling;
    }

    /**
     * Gets the recall compliance.
     *
     * @return the recall compliance
     */
    @JsonProperty("recall_compliance")
    public RecallCompliance getRecallCompliance() {
        return recallCompliance;
    }

    /**
     * Sets the recall compliance.
     *
     * @param recallCompliance the new recall compliance
     */
    @JsonProperty("recall_compliance")
    public void setRecallCompliance(RecallCompliance recallCompliance) {
        this.recallCompliance = recallCompliance;
    }

    /**
     * Gets the tax category.
     *
     * @return the tax category
     */
    @JsonProperty("tax_category")
    public TaxCategory getTaxCategory() {
        return taxCategory;
    }

    /**
     * Sets the tax category.
     *
     * @param taxCategory the new tax category
     */
    @JsonProperty("tax_category")
    public void setTaxCategory(TaxCategory taxCategory) {
        this.taxCategory = taxCategory;
    }

    /**
     * Gets the display option.
     *
     * @return the display option
     */
    @JsonProperty("display_option")
    public DisplayOption getDisplayOption() {
        return displayOption;
    }

    /**
     * Sets the display option.
     *
     * @param displayOption the new display option
     */
    @JsonProperty("display_option")
    public void setDisplayOption(DisplayOption displayOption) {
        this.displayOption = displayOption;
    }

    /**
     * Gets the fulfillment.
     *
     * @return the fulfillment
     */
    @JsonProperty("fulfillment")
    public Fulfillment getFulfillment() {
        return fulfillment;
    }

    /**
     * Sets the fulfillment.
     *
     * @param fulfillment the new fulfillment
     */
    @JsonProperty("fulfillment")
    public void setFulfillment(Fulfillment fulfillment) {
        this.fulfillment = fulfillment;
    }

    /**
     * Gets the package dimensions.
     *
     * @return the package dimensions
     */
    @JsonProperty("package_dimensions")
    public PackageDimensions getPackageDimensions() {
        return packageDimensions;
    }

    /**
     * Sets the package dimensions.
     *
     * @param packageDimensions the new package dimensions
     */
    @JsonProperty("package_dimensions")
    public void setPackageDimensions(PackageDimensions packageDimensions) {
        this.packageDimensions = packageDimensions;
    }

    /**
     * Gets the environmental segmentation.
     *
     * @return the environmental segmentation
     */
    @JsonProperty("environmental_segmentation")
    public EnvironmentalSegmentation getEnvironmentalSegmentation() {
        return environmentalSegmentation;
    }

    /**
     * Sets the environmental segmentation.
     *
     * @param environmentalSegmentation the new environmental segmentation
     */
    @JsonProperty("environmental_segmentation")
    public void setEnvironmentalSegmentation(EnvironmentalSegmentation environmentalSegmentation) {
        this.environmentalSegmentation = environmentalSegmentation;
    }

    /**
     * Gets the manufacturer.
     *
     * @return the manufacturer
     */
    @JsonProperty("manufacturer")
    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    /**
     * Sets the manufacturer.
     *
     * @param manufacturer the new manufacturer
     */
    @JsonProperty("manufacturer")
    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    /**
     * Gets the product classification.
     *
     * @return the product classification
     */
    @JsonProperty("product_classification")
    public ProductClassification getProductClassification() {
        return productClassification;
    }

    /**
     * Sets the product classification.
     *
     * @param productClassification the new product classification
     */
    @JsonProperty("product_classification")
    public void setProductClassification(ProductClassification productClassification) {
        this.productClassification = productClassification;
    }

    /**
     * Gets the product brand.
     *
     * @return the product brand
     */
    @JsonProperty("product_brand")
    public ProductBrand getProductBrand() {
        return productBrand;
    }

    /**
     * Sets the product brand.
     *
     * @param productBrand the new product brand
     */
    @JsonProperty("product_brand")
    public void setProductBrand(ProductBrand productBrand) {
        this.productBrand = productBrand;
    }

    /**
     * Gets the item state.
     *
     * @return the item state
     */
    @JsonProperty("item_state")
    public String getItemState() {
        return itemState;
    }

    /**
     * Sets the item state.
     *
     * @param itemState the new item state
     */
    @JsonProperty("item_state")
    public void setItemState(String itemState) {
        this.itemState = itemState;
    }

    /**
     * Gets the specifications.
     *
     * @return the specifications
     */
    @JsonProperty("specifications")
    public List<Object> getSpecifications() {
        return specifications;
    }

    /**
     * Sets the specifications.
     *
     * @param specifications the new specifications
     */
    @JsonProperty("specifications")
    public void setSpecifications(List<Object> specifications) {
        this.specifications = specifications;
    }

    /**
     * Gets the attributes.
     *
     * @return the attributes
     */
    @JsonProperty("attributes")
    public Attributes getAttributes() {
        return attributes;
    }

    /**
     * Sets the attributes.
     *
     * @param attributes the new attributes
     */
    @JsonProperty("attributes")
    public void setAttributes(Attributes attributes) {
        this.attributes = attributes;
    }

    /**
     * Gets the country of origin.
     *
     * @return the country of origin
     */
    @JsonProperty("country_of_origin")
    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    /**
     * Sets the country of origin.
     *
     * @param countryOfOrigin the new country of origin
     */
    @JsonProperty("country_of_origin")
    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    /**
     * Gets the relationship type code.
     *
     * @return the relationship type code
     */
    @JsonProperty("relationship_type_code")
    public String getRelationshipTypeCode() {
        return relationshipTypeCode;
    }

    /**
     * Sets the relationship type code.
     *
     * @param relationshipTypeCode the new relationship type code
     */
    @JsonProperty("relationship_type_code")
    public void setRelationshipTypeCode(String relationshipTypeCode) {
        this.relationshipTypeCode = relationshipTypeCode;
    }

    /**
     * Gets the subscription eligible.
     *
     * @return the subscription eligible
     */
    @JsonProperty("subscription_eligible")
    public Boolean getSubscriptionEligible() {
        return subscriptionEligible;
    }

    /**
     * Sets the subscription eligible.
     *
     * @param subscriptionEligible the new subscription eligible
     */
    @JsonProperty("subscription_eligible")
    public void setSubscriptionEligible(Boolean subscriptionEligible) {
        this.subscriptionEligible = subscriptionEligible;
    }

    /**
     * Gets the estore item status code.
     *
     * @return the estore item status code
     */
    @JsonProperty("estore_item_status_code")
    public String getEstoreItemStatusCode() {
        return estoreItemStatusCode;
    }

    /**
     * Sets the estore item status code.
     *
     * @param estoreItemStatusCode the new estore item status code
     */
    @JsonProperty("estore_item_status_code")
    public void setEstoreItemStatusCode(String estoreItemStatusCode) {
        this.estoreItemStatusCode = estoreItemStatusCode;
    }

    /**
     * Gets the return policies.
     *
     * @return the return policies
     */
    @JsonProperty("return_policies")
    public ReturnPolicies getReturnPolicies() {
        return returnPolicies;
    }

    /**
     * Sets the return policies.
     *
     * @param returnPolicies the new return policies
     */
    @JsonProperty("return_policies")
    public void setReturnPolicies(ReturnPolicies returnPolicies) {
        this.returnPolicies = returnPolicies;
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
