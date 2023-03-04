package pengliu.me.forfrontend;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

/* 对应的Request payload格式为：
{
    "addressId": 123,
    "isCanceled": false,
    "shopOrders": [
        {
            "shopId": 123,
            "shopName": "aaa",
            "productList": [
                {
                    "id": 123,
                    "count": 33
                },
                        {
                    "id": 123,
                    "count": 33
                }
            ]
        },
        {
            "shopId": 456,
            "shopName": "aaa",
            "productList": [
                {
                    "id": 123,
                    "count": 33
                },
                        {
                    "id": 123,
                    "count": 33
                }
            ]
        }
    ]
}
 */
public class OrderConfirmDTO {
    private Integer addressId;
    // 对于boolean类型，Jackson默认解析的是传入的是canceled，而不是isCanceled。
    // 这里需要使用JsonProperty明确指出使用Json字符串的isCanceled字段解析到此Java属性中。
    @JsonProperty("isCanceled")
    private Boolean isCanceled;
    private List<OrderShopDTO> shopOrders = new ArrayList<>();

    public List<OrderShopDTO> getShopOrders() {
        return shopOrders;
    }

    public void setShopOrders(List<OrderShopDTO> shopOrders) {
        this.shopOrders = shopOrders;
    }

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }


    public Boolean getCanceled() {
        return isCanceled;
    }

    public void setCanceled(Boolean canceled) {
        isCanceled = canceled;
    }

    @Override
    public String toString() {
        return "OrderConfirmDTO{" +
                "addressId=" + addressId +
                ", isCanceled=" + isCanceled +
                ", shopOrders=" + shopOrders +
                '}';
    }
}
