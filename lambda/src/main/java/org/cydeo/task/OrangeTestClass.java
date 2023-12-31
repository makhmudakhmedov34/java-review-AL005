package org.cydeo.task;

import java.util.ArrayList;
import java.util.List;

public class OrangeTestClass {
    public static void main(String[] args) {

        List<Orange> inventory = new ArrayList<>();
        inventory.add(new Orange(300,Color.GREEN));
        inventory.add(Orange.builder().weight(200).color(Color.GREEN).build());
        inventory.add(Orange.builder().weight(500).color(Color.RED).build());
        inventory.add(Orange.builder().weight(300).color(Color.GREEN).build());
        inventory.add(Orange.builder().weight(100).color(Color.RED).build());

        OrangeFormatter simpleFormatter = orange -> "An orange of "+orange.getWeight()+"g";
        prettyPrintApple(inventory,simpleFormatter);

        System.out.println();

        prettyPrintApple(inventory,orange -> "An orange of "+orange.getWeight()+"g");

        OrangeFormatter fancyFormatter = orange -> {
            String characteristic = orange.getWeight()>150 ? "Heavy" : "Light";
            return "A "+characteristic+" "+orange.getColor()+" orange";
        };

        prettyPrintApple(inventory,fancyFormatter);

    }

    private static void prettyPrintApple(List<Orange> inventory,OrangeFormatter orangeFormatter){
        for(Orange o : inventory){
            String output = orangeFormatter.accept(o);
            System.out.println(output);
        }
    }
}
