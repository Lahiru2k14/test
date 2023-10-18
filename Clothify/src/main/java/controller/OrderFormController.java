package controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import com.jfoenix.controls.JFXTreeTableView;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TreeTableColumn;
import javafx.scene.layout.AnchorPane;

public class OrderFormController {

    @FXML
    private JFXButton btnPlaceOrder;

    @FXML
    private JFXButton btnUpdate;

    @FXML
    private CheckBox checkBoxCard;

    @FXML
    private CheckBox checkBoxCash;

    @FXML
    private JFXComboBox<?> cmbEmployerId;

    @FXML
    private JFXComboBox<?> cmbItemCode;

    @FXML
    private TreeTableColumn<?, ?> colAmount;

    @FXML
    private TreeTableColumn<?, ?> colDate;

    @FXML
    private TreeTableColumn<?, ?> colDescription;

    @FXML
    private TreeTableColumn<?, ?> colDiscount;

    @FXML
    private TreeTableColumn<?, ?> colItemCode;

    @FXML
    private TreeTableColumn<?, ?> colOption;

    @FXML
    private TreeTableColumn<?, ?> colQty;

    @FXML
    private TreeTableColumn<?, ?> colSize;

    @FXML
    private TreeTableColumn<?, ?> colType;

    @FXML
    private TreeTableColumn<?, ?> colUnitPrice;

    @FXML
    private DatePicker datePicker;

    @FXML
    private Label lblBalance;

    @FXML
    private Label lblCash;

    @FXML
    private Label lblDiscount;

    @FXML
    private Label lblTotal;

    @FXML
    private AnchorPane orderPane;

    @FXML
    private JFXTreeTableView<?> tblOrders;

    @FXML
    private JFXTextField txtBalance;

    @FXML
    private JFXTextField txtCash;

    @FXML
    private JFXTextField txtCustomerContact;

    @FXML
    private JFXTextField txtCustomerEmail;

    @FXML
    private JFXTextField txtCustomerName;

    @FXML
    private JFXTextField txtDescription;

    @FXML
    private JFXTextField txtDiscount;

    @FXML
    private JFXTextField txtDiscount2;

    @FXML
    private JFXTextField txtEmployerName;

    @FXML
    private JFXTextField txtItemCode;

    @FXML
    private JFXTextField txtOrderId;

    @FXML
    private JFXTextField txtOrderQuantitiy;

    @FXML
    private JFXTextField txtProfit;

    @FXML
    private JFXTextField txtQtyOnHand;

    @FXML
    private JFXTextField txtSellingPrice;

    @FXML
    private JFXTextField txtSize;

    @FXML
    private JFXTextField txtTotal;

    @FXML
    private JFXTextField txtType;

    @FXML
    void addToCartBtnOnAction(ActionEvent event) {

    }

    @FXML
    void backBtnOnAction(ActionEvent event) {

    }

    @FXML
    void clearBtnOnAction(ActionEvent event) {

    }

    @FXML
    void placeOrderBtnOnAction(ActionEvent event) {

    }

    @FXML
    void removeOrderBtnOnAction(ActionEvent event) {

    }

    @FXML
    void updateBtnOnAction(ActionEvent event) {

    }

}
