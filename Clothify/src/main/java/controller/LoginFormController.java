//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package controller;

import java.io.IOException;

import com.jfoenix.controls.JFXCheckBox;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

public class LoginFormController {

    @FXML
    private JFXCheckBox showHideCheckBox;

    @FXML
    private JFXTextField txtPassword;

    @FXML
    private JFXTextField txtUserName;

    @FXML
    void forgetButtonOnAction(ActionEvent event) {

    }

    @FXML
    void passwordOnAction(ActionEvent event) {

    }

    @FXML
    void userNameOnAction(ActionEvent event) {

    }

    public Button btnLogin;
    private String userName = "clothify";
    private String password = "1234";
    private Parent parent;
    private Stage stage;
    private Scene scene;

    public LoginFormController() {
    }

    public void btnLoginOnAction(ActionEvent actionEvent) throws IOException {
        if (this.txtUserName.getText().equals(this.userName) & this.txtPassword.getText().equals(this.password)) {
            this.parent = (Parent) FXMLLoader.load(this.getClass().getResource("../view/DashBoardForm.fxml"));
            this.stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            this.scene = new Scene(this.parent);
            this.stage.setScene(this.scene);
            this.stage.show();
        } else {
            (new Alert(AlertType.ERROR, "Invalid Username or Password!", new ButtonType[0])).show();
        }

        this.txtUserName.setText("");
        this.txtPassword.setText("");
    }

    public void txtPasswordOnAction(ActionEvent actionEvent) throws IOException {
        this.btnLoginOnAction(actionEvent);
    }

    public void btnSignInAction(ActionEvent actionEvent) {


    }
}
