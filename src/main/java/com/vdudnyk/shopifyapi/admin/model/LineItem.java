package com.vdudnyk.shopifyapi.admin.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.List;

public class LineItem {

    @JsonProperty("id")
    private Long id;
    @JsonProperty("variant_id")
    private Long variantId;
    @JsonProperty("title")
    private String title;
    @JsonProperty("quantity")
    private Long quantity;
    @JsonProperty("price")
    private String price;
    @JsonProperty("sku")
    private String sku;
    @JsonProperty("variant_title")
    private String variantTitle;
    @JsonProperty("vendor")
    private String vendor;
    @JsonProperty("fulfillment_service")
    private String fulfillmentService;
    @JsonProperty("product_id")
    private Long productId;
    @JsonProperty("requires_shipping")
    private Boolean requiresShipping;
    @JsonProperty("taxable")
    private Boolean taxable;
    @JsonProperty("gift_card")
    private Boolean giftCard;
    @JsonProperty("name")
    private String name;
    @JsonProperty("variant_inventory_management")
    private String variantInventoryManagement;
    @JsonProperty("properties")
    private List<Object> properties = null;
    @JsonProperty("product_exists")
    private Boolean productExists;
    @JsonProperty("fulfillable_quantity")
    private Long fulfillableQuantity;
    @JsonProperty("grams")
    private Long grams;
    @JsonProperty("total_discount")
    private String totalDiscount;
    @JsonProperty("fulfillment_status")
    private Object fulfillmentStatus;
    @JsonProperty("tax_lines")
    private List<Object> taxLines = null;
}