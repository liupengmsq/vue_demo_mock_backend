package pengliu.me.forfrontend;

import java.util.ArrayList;
import java.util.List;

public class ShopHotList {
    private Integer errorno;
    private String message;
    private List<ShopInfo> data = new ArrayList<>();

    public List<ShopInfo> getData() {
        return data;
    }

    public void setData(List<ShopInfo> data) {
        this.data = data;
    }

    public Integer getErrorno() {
        return errorno;
    }

    public void setErrorno(Integer errorno) {
        this.errorno = errorno;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void addShopInfo(ShopInfo shopInfo) {
        data.add(shopInfo);
    }


}
