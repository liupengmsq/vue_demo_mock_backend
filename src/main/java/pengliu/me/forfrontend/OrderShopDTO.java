package pengliu.me.forfrontend;

import java.util.ArrayList;
import java.util.List;

public class OrderShopDTO {
    private String shopId;
    private String shopName;
    private List<OrderProductDTO> productList = new ArrayList<>();

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public List<OrderProductDTO> getProductList() {
        return productList;
    }

    public void setProductList(List<OrderProductDTO> productList) {
        this.productList = productList;
    }

    public void addProductList(OrderProductDTO productDTO) {
        this.productList.add(productDTO);
    }

    @Override
    public String toString() {
        return "OrderShopDTO{" +
                "shopId=" + shopId +
                ", shopName='" + shopName + '\'' +
                ", productList=" + productList +
                '}';
    }
}
