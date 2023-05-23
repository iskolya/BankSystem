package com.example.banksystem.Controllers.Client;

import com.example.banksystem.Models.Models;
import javafx.fxml.Initializable;
import javafx.scene.layout.BorderPane;

import java.net.URL;
import java.util.ResourceBundle;

public class ClientController implements Initializable {
    public BorderPane client_parent;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Models.getInstance().getViewFactory().getClientSelectedMenuItem().addListener((observableValue, oldVal, newVal) -> {
            switch (newVal){
                case "Transactions" -> client_parent.setCenter(Models.getInstance().getViewFactory().getTransactionsView());
                default -> client_parent.setCenter(Models.getInstance().getViewFactory().getDashboardView());
            }
        });
    }
}
