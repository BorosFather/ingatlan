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
            "|%17s |%17s |%17s | %9.0f |\n",
            pro.getCity(),
            pro.getAddress(),
            pro.getSize(),
            pro.getPrice()
            );
        }
    }
    
}

