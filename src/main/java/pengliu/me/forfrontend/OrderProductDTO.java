package pengliu.me.forfrontend;

public class OrderProductDTO {
    private String id;
    private Integer count;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "OrderProductDTO{" +
                "id=" + id +
                ", count=" + count +
                '}';
    }
}
