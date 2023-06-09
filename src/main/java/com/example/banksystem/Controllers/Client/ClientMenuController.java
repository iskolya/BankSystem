package com.example.banksystem.Controllers.Client;

import com.example.banksystem.Models.Models;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ResourceBundle;

public class ClientMenuController implements Initializable {
    public Button dashboard_btn;
    public Button transaction_btn;
    public Button account_btn;
    public Button profile_btn;
    public Button logout_btn;
    public Button report_btn;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        addListener();
    }
    private void addListener() {
        dashboard_btn.setOnAction(event -> onDashboard());
    }
    private void onDashboard(){
        Models.getInstance().getViewFactory().getClientSelectedMenuItem().set("Dashboard");
    }
    private void onTransaction() {
        Models.getInstance().getViewFactory().getClientSelectedMenuItem().set("Transactions");
    }
}
