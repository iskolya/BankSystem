package com.example.banksystem.Models;

import com.example.banksystem.Views.ViewFactory;

public class Models {
    private static Models models;
    private final ViewFactory viewFactory;

    private Models(){
        this.viewFactory= new ViewFactory();
    }
    public static synchronized Models getInstance() {
        if(models==null){
            models = new Models();
        }
        return models;
    }

    public ViewFactory getViewFactory() {
        return viewFactory;
    }
}
