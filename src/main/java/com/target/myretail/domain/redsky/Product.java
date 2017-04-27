
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
 * The Class Product.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "deep_red_labels",
    "available_to_promise_network",
    "item"
})
public class Product {

    /** The deep red labels. */
    @JsonProperty("deep_red_labels")
    private DeepRedLabels deepRedLabels;
    
    /** The available to promise network. */
    @JsonProperty("available_to_promise_network")
    private AvailableToPromiseNetwork availableToPromiseNetwork;
    
    /** The item. */
    @JsonProperty("item")
    private Item item;
    
    /** The additional properties. */
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Gets the deep red labels.
     *
     * @return the deep red labels
     */
    @JsonProperty("deep_red_labels")
    public DeepRedLabels getDeepRedLabels() {
        return deepRedLabels;
    }

    /**
     * Sets the deep red labels.
     *
     * @param deepRedLabels the new deep red labels
     */
    @JsonProperty("deep_red_labels")
    public void setDeepRedLabels(DeepRedLabels deepRedLabels) {
        this.deepRedLabels = deepRedLabels;
    }

    /**
     * Gets the available to promise network.
     *
     * @return the available to promise network
     */
    @JsonProperty("available_to_promise_network")
    public AvailableToPromiseNetwork getAvailableToPromiseNetwork() {
        return availableToPromiseNetwork;
    }

    /**
     * Sets the available to promise network.
     *
     * @param availableToPromiseNetwork the new available to promise network
     */
    @JsonProperty("available_to_promise_network")
    public void setAvailableToPromiseNetwork(AvailableToPromiseNetwork availableToPromiseNetwork) {
        this.availableToPromiseNetwork = availableToPromiseNetwork;
    }

    /**
     * Gets the item.
     *
     * @return the item
     */
    @JsonProperty("item")
    public Item getItem() {
        return item;
    }

    /**
     * Sets the item.
     *
     * @param item the new item
     */
    @JsonProperty("item")
    public void setItem(Item item) {
        this.item = item;
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
