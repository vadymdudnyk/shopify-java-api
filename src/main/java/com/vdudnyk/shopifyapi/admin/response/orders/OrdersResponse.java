package com.vdudnyk.shopifyapi.admin.response.orders;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.vdudnyk.shopifyapi.admin.BaseResponse;
import com.vdudnyk.shopifyapi.admin.model.Order;
import lombok.Data;

import java.util.List;

@Data
public class OrdersResponse extends BaseResponse {
    @JsonProperty("orders")
    private List<Order> orders = null;
}
