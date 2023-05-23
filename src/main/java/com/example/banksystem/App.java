package com.example.banksystem;

import com.example.banksystem.Models.Models;
import com.example.banksystem.Views.ViewFactory;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
    public void start(Stage stage) {
        Models.getInstance().getViewFactory().showLoginWindow();
    }
}
