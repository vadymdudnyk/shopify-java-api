package com.vdudnyk.shopifyapi.admin.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Customer {
    @JsonProperty("id")
    private Long id;
    @JsonProperty("email")
    private String email;
    @JsonProperty("accepts_marketing")
    private Boolean acceptsMarketing;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("updated_at")
    private String updatedAt;
    @JsonProperty("first_name")
    private String firstName;
    @JsonProperty("last_name")
    private String lastName;
    @JsonProperty("orders_count")
    private Long ordersCount;
    @JsonProperty("state")
    private String state;
    @JsonProperty("total_spent")
    private String totalSpent;
    @JsonProperty("last_order_id")
    private Long lastOrderId;
    @JsonProperty("note")
    private Object note;
    @JsonProperty("verified_email")
    private Boolean verifiedEmail;
    @JsonProperty("multipass_identifier")
    private Object multipassIdentifier;
    @JsonProperty("tax_exempt")
    private Boolean taxExempt;
    @JsonProperty("phone")
    private Object phone;
    @JsonProperty("tags")
    private String tags;
    @JsonProperty("last_order_name")
    private String lastOrderName;
}