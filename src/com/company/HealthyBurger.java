package com.company;

public class HealthyBurger extends Hamburger {

    private String healthyExtra1Name;
    private double healthyExtra1Price;

    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String meat, double price){
        super("healthyBurger", meat, "brownBread", price );
    }

    public void addHealthyAddition1(String name, double price){
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
    }

    public void addHealthyAddition2(String name, double price){
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
    }

    public double itemizeHealthyBurger(){

        System.out.println("basic " +this.getName()+ " on a "
                +this.getBreadRollType()+ " bread roll type with "
                +this.getMeat()+ " , price is "
                +this.getPrice());
        
        System.out.println("Added " +this.getName()+ " for an extra " +this.getAddition1Price());
        System.out.println("Added " +this.getAddition2Name()+ " for an extra " +this.getAddition2Price());
        System.out.println("Added " +this.getAddition3Name()+ " for an extra " +this.getAddition3Price());
        System.out.println("Added " +this.getAddition4Name()+ " for an extra " +this.getAddition4Price());

        System.out.println("Added " +this.healthyExtra1Name+ " for an extra " +this.healthyExtra1Price);
        System.out.println("Added " +this.healthyExtra1Name+ " for an extra " +this.healthyExtra1Price);

        double basePrice = super.itemizeHamburger();

        double totalPrice = basePrice + this.healthyExtra1Price + this.healthyExtra2Price;

        return totalPrice;
    }


}
