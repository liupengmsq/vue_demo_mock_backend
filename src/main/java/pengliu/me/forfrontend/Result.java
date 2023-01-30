package pengliu.me.forfrontend;

public class Result {
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

    private Integer errorno;
    private String message;
}
