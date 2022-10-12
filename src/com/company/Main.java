package com.company;

public class Main {

    public static void main(String[] args) {

        String customer1 = "swopnil";

        Hamburger swopnilBurger = new Hamburger("hamburger", "sausage", "white", 100);

        swopnilBurger.addition1("Extra Cheese", 20);

        swopnilBurger.addition2("Extra Tomato", 5);

        swopnilBurger.addition3("extra myo", 10);

        swopnilBurger.addition4("extra sauce", 5);
        double price = swopnilBurger.itemizeHamburger();

        System.out.println("The Total Burger Price for " +customer1+ " is " +price );

        System.out.println();
        System.out.println();

        String customer2 = "Ram";
        //Ram
        DeluxBurger ramBurger = new DeluxBurger();

        ramBurger.addition1("extra cheese", 10);
        ramBurger.addition2("extra cheese", 10);
        ramBurger.addition3("extra cheese", 10);
        ramBurger.addition4("extra cheese", 10);

        double price2 = ramBurger.itemizeHamburger();

        System.out.println("The Total Burger Price for " +customer2+ " is " +price2 );


        System.out.println();
        System.out.println();

        String customer3 = "Shyam";

        HealthyBurger shyamBurger = new HealthyBurger("Chicken Breast", 250);
        shyamBurger.addition1("Extra Cheese", 20);

        shyamBurger.addition2("Extra Tomato", 5);

        shyamBurger.addition3("extra myo", 10);

        shyamBurger.addition4("extra sauce", 5);

        shyamBurger.addHealthyAddition1("Egg", 10);
        shyamBurger.addHealthyAddition2("Protein Shake", 20);

        double price3 =  shyamBurger.itemizeHealthyBurger();

        System.out.println("The Total Burger Price for " +customer3+ " is " +price3 );


    }
}
