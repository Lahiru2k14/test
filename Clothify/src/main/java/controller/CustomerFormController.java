package controller;


import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import com.jfoenix.controls.JFXTreeTableView;
import com.jfoenix.controls.RecursiveTreeItem;
import com.jfoenix.controls.datamodels.treetable.RecursiveTreeObject;
import db.DBConnection;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeTableColumn;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import entity.tm.Customer;
import entity.tm.CustomerTm;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class CustomerFormController implements Initializable {

    @FXML
    private TreeTableColumn<?, ?> colAddress;

    @FXML
    private TreeTableColumn<?, ?> colCustId;

    @FXML
    private TreeTableColumn<?, ?> colCustomer;

    @FXML
    private TreeTableColumn<?, ?> colName;

    @FXML
    private TreeTableColumn<?, ?> colOption;

    @FXML
    private TreeTableColumn<?, ?> colSalary;

    @FXML
    private AnchorPane customerPane;

    @FXML
    private Label lblCustId;

    @FXML
    private JFXTreeTableView<CustomerTm> tblCustomer;

    @FXML
    private JFXTextField txtAddress;

    @FXML
    private JFXTextField txtName;








    @FXML
    void backBtnOnAction(ActionEvent event) {
        Stage stage = (Stage) customerPane.getScene().getWindow();
        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/DashBoardForm.fxml"))));
        } catch (IOException e) {
            e.printStackTrace();
        }
        stage.show();
    }

    @FXML
    void clearBtnOnAction(ActionEvent event) {

    }

    @FXML
    void saveBtnOnAction(ActionEvent event) {
        Customer customer = new Customer(
                lblCustId.getText(),
                txtName.getText(),
                txtAddress.getText()

        );
        try {
            Connection connection = DBConnection.getInstance().getConnection();
            String sql = "INSERT INTO customer VALUES(?,?,?)";
            PreparedStatement pstm = connection.prepareStatement(sql);
            pstm.setString(1,customer.getId());
            pstm.setString(2,customer.getName());
            pstm.setString(3,customer.getAddress());


            if (pstm.executeUpdate()>0) {
                new Alert(Alert.AlertType.INFORMATION,"Customer Saved..!").show();
//                loadTable();
//                clearFields();
            }else{
                new Alert(Alert.AlertType.ERROR,"Something went wrong..!").show();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void updateBtnOnAction(ActionEvent event) {
        Customer customer = new Customer(
                lblCustId.getText(),
                txtName.getText(),
                txtAddress.getText()

        );
        try {
            Connection connection = DBConnection.getInstance().getConnection();
            String sql = "INSERT INTO customer VALUES(?,?,?)";
            PreparedStatement pstm = connection.prepareStatement(sql);
            pstm.setString(1,customer.getName());
            pstm.setString(2,customer.getAddress());
            pstm.setString(3,customer.getId());


            if (pstm.executeUpdate()>0) {
                new Alert(Alert.AlertType.INFORMATION,"Customer Saved..!").show();
//                loadTable();
//                clearFields();
            }else{
                new Alert(Alert.AlertType.ERROR,"Something went wrong..!").show();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        generateId();
        loadTable();

    }

    private void loadTable() {
        ObservableList<CustomerTm> tmList = FXCollections.observableArrayList();
        try {
            List<Customer> list =new ArrayList<>();
            Connection connection = DBConnection.getInstance().getConnection();
            PreparedStatement pstm = connection.prepareStatement("SELECT * FROM customer");
            ResultSet resultSet = pstm.executeQuery();

            while (resultSet.next()) {
                list.add(new Customer(
                resultSet.getString(1),
                        resultSet.getString(2),
                        resultSet.getString(3)
                        ));
            }

            for (Customer customer:list) {
                JFXButton btn = new JFXButton("Delete");
                btn.setBackground(Background.fill(Color.rgb(227,92,92)));

                tmList.add(new CustomerTm(
                    customer.getId(),
                        customer.getName(),
                    customer.getAddress(),
                        btn

                ));

            }

      TreeItem<CustomerTm> treeItem = new RecursiveTreeItem<>(tmList, RecursiveTreeObject::getChildren);
            tblCustomer.setRoot(treeItem);
            tblCustomer.setShowRoot(false);


        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }



    private void generateId() {
        try {
            Connection connection = DBConnection.getInstance().getConnection();
            PreparedStatement pstm = connection.prepareStatement("SELECT id FROM customer ORDER BY id DESC LIMIT 1");
            ResultSet resultSet = pstm.executeQuery();
            if (resultSet.next()){
                int num = Integer.parseInt(resultSet.getString(1).split("[C]")[1]);
                num++;
                lblCustId.setText(String.format("C%03d",num));
            }else {
                lblCustId.setText("C001");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

