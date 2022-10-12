package com.company;

public class DeluxBurger extends Hamburger {

    public DeluxBurger(){
        super("deluxBurger", "chicken keema", "cheap white bread", 19.10);

        super.addition1("chips", 5);
        super.addition2("coke", 5);
    }

    @Override
    public void addition1(String name, double price){
        System.out.println("cannot add any items in delux birger");
    }

    @Override
    public void addition2(String name, double price){
        System.out.println("cannot add any items in delux birger");
    }

    @Override
    public void addition3(String name, double price){
        System.out.println("cannot add any items in delux birger");
    }

    @Override
    public void addition4(String name, double price){
        System.out.println("cannot add any items in delux birger");
    }
}
