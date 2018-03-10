package com.vdudnyk.shopifyapi;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.vdudnyk.shopifyapi.admin.AdminApi;
import okhttp3.Credentials;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;


public class ShopifyClient {

    private String credential;
    private String baseUrl;

    private OkHttpClient client = new OkHttpClient();
    private ObjectMapper objectMapper = new ObjectMapper();


    private ShopifyClient(String apiKey, String password, String shopName) {
        credential = Credentials.basic(apiKey, password);
        baseUrl = "https://" + shopName + ".myshopify.com/";
    }

    public static ShopifyClient buildClient(String apiKey, String password, String shopName) {
        return new ShopifyClient(apiKey, password, shopName);
    }

    public AdminApi admin() {
        return new AdminApi(this);
    }

    public <T> T executeGet(String path, Class<T> responseType) {
        String url = baseUrl + path + ".json";
        Request request = new Request.Builder()
                .get()
                .url(url)
                .header("Authorization", credential)
                .build();

        try {
            Response response = client.newCall(request).execute();
            Object responseObject = objectMapper.readValue(response.body().byteStream(), responseType);
            return (responseType.cast(responseObject));
        } catch (Exception e) {
            throw new ShopifyClientException(e.getMessage());
        }
    }
}
