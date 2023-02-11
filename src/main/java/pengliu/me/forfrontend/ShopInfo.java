package pengliu.me.forfrontend;

import java.util.ArrayList;
import java.util.List;

public class ShopInfo {
    private String id;
    private String name;
    private String imageUrl;
    private Integer sales;
    private Integer expressLimit;
    private Integer expressPrice;
    private String slogan;
    private List<ShopTag> tags = new ArrayList<>();
    private List<ProductInfo> products = new ArrayList<>();

    @Override
    public String toString() {
        return "ShopInfo{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", sales='" + sales + '\'' +
                ", expressLimit=" + expressLimit +
                ", expressPrice=" + expressPrice +
                ", slogan='" + slogan + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Integer getSales() {
        return sales;
    }

    public void setSales(Integer sales) {
        this.sales = sales;
    }

    public Integer getExpressLimit() {
        return expressLimit;
    }

    public void setExpressLimit(Integer expressLimit) {
        this.expressLimit = expressLimit;
    }

    public Integer getExpressPrice() {
        return expressPrice;
    }

    public void setExpressPrice(Integer expressPrice) {
        this.expressPrice = expressPrice;
    }

    public String getSlogan() {
        return slogan;
    }

    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }

    public List<ShopTag> getTags() {
        return tags;
    }

    public void setTags(List<ShopTag> tags) {
        this.tags = tags;
    }

    public void addTag(ShopTag tag) {
        this.tags.add(tag);
    }

    public List<ProductInfo> getProducts() {
        return products;
    }

    public void setProducts(List<ProductInfo> products) {
        this.products = products;
    }

    public void addProdInfo(ProductInfo productInfo) {
        this.products.add(productInfo);
    }

}
