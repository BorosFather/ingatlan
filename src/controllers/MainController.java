/*
* File: MainController.java
* Author: Boros Zoltán
* Copyright: 2023, BorosFather
* Group: Szoft II N
* Date: 2023-02-19
* Github: https://github.com/BorosFather
* Licenc: GNU GPL
*/
package controllers;

import java.util.ArrayList;
import java.util.Arrays;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import models.Property;
import models.Restapi;
import views.MainConsole;

public class MainController {
    MainConsole mainConsole;
    public MainController() {
        this.mainConsole = new MainConsole();
        this.showPro();
    }

    private void showPro()
    {
        Restapi restapi = new Restapi();
        String res = restapi.getPropertys();
        ArrayList<Property> proList = convertStringToArray(res);
        this.mainConsole.printPropertys(proList);
    }

    private ArrayList<Property> convertStringToArray(String text)
    {
        ArrayList<Property> proList = null;
        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();
        Property[] proArray = gson.fromJson(text, Property[].class);
        proList = new ArrayList<>(Arrays.asList(proArray));
        return proList;
    }

}