package entity.tm;

public class Order {
    private String id;
    private String date;
    private String customerId;

    public Order(String id, String date, String customerId) {
        this.id = id;
        this.date = date;
        this.customerId = customerId;
    }

    public Order() {
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getId() {
        return this.id;
    }

    public String getDate() {
        return this.date;
    }

    public String getCustomerId() {
        return this.customerId;
    }

    public String toString() {
        String var10000 = this.getId();
        return "Order(id=" + var10000 + ", date=" + this.getDate() + ", customerId=" + this.getCustomerId() + ")";
    }
}
