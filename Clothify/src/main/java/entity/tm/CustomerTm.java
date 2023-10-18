package entity.tm;


import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.datamodels.treetable.RecursiveTreeObject;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class CustomerTm extends RecursiveTreeObject<CustomerTm> {

    private String id;
    private String Name;
    private String address;

    private JFXButton btn;



}
