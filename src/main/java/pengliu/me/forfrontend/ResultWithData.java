package pengliu.me.forfrontend;

public class ResultWithData<T> extends Result {
    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
