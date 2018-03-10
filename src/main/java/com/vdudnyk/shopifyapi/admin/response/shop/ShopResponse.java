package com.vdudnyk.shopifyapi.admin.response.shop;

import com.vdudnyk.shopifyapi.admin.BaseResponse;
import com.vdudnyk.shopifyapi.admin.model.Shop;
import lombok.Data;

@Data
public class ShopResponse extends BaseResponse{
    private Shop shop;
}
