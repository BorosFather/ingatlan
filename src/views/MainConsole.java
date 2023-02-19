package views;

import java.util.ArrayList;

import models.Property;

public class MainConsole {

    public MainConsole() {
    }

    public void printPropertys(ArrayList<Property> pros)
    {
        for(Property pro : pros){
            System.out.printf(
            "|%15s |%15s | %8.0f |\n",
            pro.getCity(),
            pro.getAddress(),
            pro.getSize(),
            pro.getPrice()
            );
        }
    }
    
}

