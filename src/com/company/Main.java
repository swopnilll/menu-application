package com.company;

public class Main {

    public static void main(String[] args) {
        Hamburger swopnilBurger = new Hamburger("hamburger", "sausage", "white", 100);
        // price = 100

        // extra cheese
        swopnilBurger.addition1("Extra Cheese", 20);

        // extra tomato
        swopnilBurger.addition2("Extra Tomato", 5);

        // extra mayo
        swopnilBurger.addition3("extra myo", 10);

        // extra sauce
        swopnilBurger.addition4("extra sauce", 5);

        //        Total Burger price is (140)
        System.out.println("The Total Burger Price is " +swopnilBurger.itemizeHamburger());
    }
}
