# Shopify java api client
## Example usage:

### Create ShopifyClient: 
```java
    ShopifyClient shopifyClient = ShopifyClient.buildClient(apiKey, apiPassword, shopName);

```

### Get Shop info:
```java
    ShopResponse shopResponse = shopifyClient.admin().getShop();
```

### Get Orders:
```java
    OrdersResponse ordersResponse = shopifyClient.admin().getOrders();
```


## Other information:

Other libraries used: okhttp3, jackson, lombok