package com.vdudnyk.shopifyapi.admin.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class Order {

    @JsonProperty("id")
    private Long id;
    @JsonProperty("email")
    private String email;
    @JsonProperty("closed_at")
    private Object closedAt;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("updated_at")
    private String updatedAt;
    @JsonProperty("number")
    private Long number;
    @JsonProperty("note")
    private Object note;
    @JsonProperty("token")
    private String token;
    @JsonProperty("gateway")
    private String gateway;
    @JsonProperty("test")
    private Boolean test;
    @JsonProperty("total_price")
    private String totalPrice;
    @JsonProperty("subtotal_price")
    private String subtotalPrice;
    @JsonProperty("total_weight")
    private Object totalWeight;
    @JsonProperty("total_tax")
    private String totalTax;
    @JsonProperty("taxes_included")
    private Boolean taxesIncluded;
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("financial_status")
    private String financialStatus;
    @JsonProperty("confirmed")
    private Boolean confirmed;
    @JsonProperty("total_discounts")
    private String totalDiscounts;
    @JsonProperty("total_line_items_price")
    private String totalLineItemsPrice;
    @JsonProperty("cart_token")
    private Object cartToken;
    @JsonProperty("buyer_accepts_marketing")
    private Boolean buyerAcceptsMarketing;
    @JsonProperty("name")
    private String name;
    @JsonProperty("referring_site")
    private Object referringSite;
    @JsonProperty("landing_site")
    private Object landingSite;
    @JsonProperty("cancelled_at")
    private Object cancelledAt;
    @JsonProperty("cancel_reason")
    private Object cancelReason;
    @JsonProperty("total_price_usd")
    private String totalPriceUsd;
    @JsonProperty("checkout_token")
    private Object checkoutToken;
    @JsonProperty("reference")
    private Object reference;
    @JsonProperty("user_id")
    private Object userId;
    @JsonProperty("location_id")
    private Object locationId;
    @JsonProperty("source_identifier")
    private Object sourceIdentifier;
    @JsonProperty("source_url")
    private Object sourceUrl;
    @JsonProperty("processed_at")
    private String processedAt;
    @JsonProperty("device_id")
    private Object deviceId;
    @JsonProperty("phone")
    private Object phone;
    @JsonProperty("customer_locale")
    private Object customerLocale;
    @JsonProperty("app_id")
    private Long appId;
    @JsonProperty("browser_ip")
    private Object browserIp;
    @JsonProperty("landing_site_ref")
    private Object landingSiteRef;
    @JsonProperty("order_number")
    private Long orderNumber;
    @JsonProperty("discount_codes")
    private List<Object> discountCodes = null;
    @JsonProperty("note_attributes")
    private List<Object> noteAttributes = null;
    @JsonProperty("payment_gateway_names")
    private List<Object> paymentGatewayNames = null;
    @JsonProperty("processing_method")
    private String processingMethod;
    @JsonProperty("checkout_id")
    private Object checkoutId;
    @JsonProperty("source_name")
    private String sourceName;
    @JsonProperty("fulfillment_status")
    private String fulfillmentStatus;
    @JsonProperty("tax_lines")
    private List<Object> taxLines = null;
    @JsonProperty("tags")
    private String tags;
    @JsonProperty("contact_email")
    private String contactEmail;
    @JsonProperty("order_status_url")
    private String orderStatusUrl;
    @JsonProperty("line_items")
    private List<LineItem> lineItems = null;
    @JsonProperty("shipping_lines")
    private List<Object> shippingLines = null;
    @JsonProperty("fulfillments")
    private List<Object> fulfillments = null;
    @JsonProperty("refunds")
    private List<Object> refunds = null;
    @JsonProperty("customer")
    private Customer customer;
}