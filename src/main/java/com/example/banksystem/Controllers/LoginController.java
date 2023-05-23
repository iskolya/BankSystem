package com.example.banksystem.Controllers;

import com.example.banksystem.Models.Models;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {

    public Label payee_address_lbl;
    public ChoiceBox acc_selector;
    public TextField payee_address_fld;
    public TextField password_fld;
    public Label error_lbl;
    public Button login_btn;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        login_btn.setOnAction(event -> Models.getInstance().getViewFactory().showClientWindow());
    }
    private void onLogin(){
        Stage stage = (Stage) error_lbl.getScene().getWindow();
        Models.getInstance().getViewFactory().closeStage(stage);
        Models.getInstance().getViewFactory().showLoginWindow();

    }
}
