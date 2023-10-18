package entity.tm;

public class OrderDetails {
    private String orderId;
    private String itemCode;
    private int qty;
    private double unitPrice;

    public OrderDetails(String orderId, String itemCode, int qty, double unitPrice) {
        this.orderId = orderId;
        this.itemCode = itemCode;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    public OrderDetails() {
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getOrderId() {
        return this.orderId;
    }

    public String getItemCode() {
        return this.itemCode;
    }

    public int getQty() {
        return this.qty;
    }

    public double getUnitPrice() {
        return this.unitPrice;
    }

    public String toString() {
        String var10000 = this.getOrderId();
        return "OrderDetails(orderId=" + var10000 + ", itemCode=" + this.getItemCode() + ", qty=" + this.getQty() + ", unitPrice=" + this.getUnitPrice() + ")";
    }
}
