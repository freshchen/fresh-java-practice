package chain;

/**
 * @program: fresh-design-pattern
 * @Date: 2019/5/26 14:28
 * @Author: Ling Chen
 * @Description:
 */
public class MoneyRequest {

    private String requestType;
    private String requestContent;
    private int number;

    public String getRequestType() {
        return requestType;
    }

    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }

    public String getRequestContent() {
        return requestContent;
    }

    public void setRequestContent(String requestContent) {
        this.requestContent = requestContent;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "MoneyRequest{" +
                "requestType='" + requestType + '\'' +
                ", requestContent='" + requestContent + '\'' +
                ", number=" + number +
                '}';
    }
}
