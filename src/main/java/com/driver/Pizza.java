package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private boolean extraCheeseAdded;
    private boolean extraToppingsAdded;
    private boolean takeawayAdded;
    private String bill;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.price = isVeg ? 300 : 400;
        this.extraCheeseAdded = false;
        this.extraToppingsAdded = false;
        this.takeawayAdded = false;
        this.bill = "";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        if (!extraCheeseAdded) {
            this.price += 80;
            this.extraCheeseAdded = true;
            this.bill += "Extra Cheese Added: 80\n";
        }
    }

    public void addExtraToppings(){
        if (!extraToppingsAdded) {
            this.price += (isVeg ? 70 : 120);
            this.extraToppingsAdded = true;
            this.bill += "Extra Toppings Added: " + (isVeg ? 70 : 120) + "\n";
        }
    }

    public void addTakeaway(){
        if (!takeawayAdded) {
            this.price += 20;
            this.takeawayAdded = true;
            this.bill += "Paperbag Added: 20\n";
        }
    }

    public String getBill(){
        this.bill = "Base Price Of The Pizza: " + getPrice() + "\n" + this.bill;
        this.bill += "Total Price: " + getPrice() + "\n";
        return this.bill;
    }
}
