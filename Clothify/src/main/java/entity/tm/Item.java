package entity.tm;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Item {
    private String itemCode;
    private String supplierId;
    private String description;
    private int qtyOnHand;
    private double sellingPrice;
    private double buyingPrice;
    private String categoryId;

    public void setSellingPrice(double price){
        sellingPrice = price>=0 ? price :0;
    }

    public void setBuyingPrice(double price){
        buyingPrice = price>=0 ? price :0;
    }
}
