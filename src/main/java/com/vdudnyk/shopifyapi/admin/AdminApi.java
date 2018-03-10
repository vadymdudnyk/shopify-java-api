package com.vdudnyk.shopifyapi.admin;

import com.vdudnyk.shopifyapi.ShopifyClient;
import com.vdudnyk.shopifyapi.admin.response.orders.OrdersResponse;
import com.vdudnyk.shopifyapi.admin.response.shop.ShopResponse;

public class AdminApi {

    private ShopifyClient shopifyClient;

    public AdminApi(ShopifyClient shopifyClient) {
        this.shopifyClient = shopifyClient;
    }

    public ShopResponse getShop() {
        return shopifyClient.executeGet("admin/shop", ShopResponse.class);
    }

    public OrdersResponse getOrders() {
        return shopifyClient.executeGet("admin/orders", OrdersResponse.class);
    }
}
