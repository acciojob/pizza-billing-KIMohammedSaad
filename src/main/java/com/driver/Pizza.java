package com.driver;

public class Pizza {

    protected int price;
    private Boolean isVeg;
    protected String bill;

    public Pizza(Boolean isVeg) {
        this.isVeg = isVeg;
        this.price = isVeg ? 300 : 400;
        this.bill = "Base Price Of The Pizza: " + this.price + "\n";
    }

    public int getPrice() {
        return this.price;
    }

    public void addExtraCheese() {
        if (!bill.contains("Extra Cheese Added")) {
            this.price += isVeg ? 80 : 0;
            this.bill += "Extra Cheese Added: " + (isVeg ? 80 : 0) + "\n";
        }
    }

    public void addExtraToppings() {
        if (!bill.contains("Extra Toppings Added")) {
            this.price += isVeg ? 70 : 120;
            this.bill += "Extra Toppings Added: " + (isVeg ? 70 : 120) + "\n";
        }
    }

    public void addTakeaway() {
        if (!bill.contains("Paperbag Added")) {
            this.price += 20;
            this.bill += "Paperbag Added: 20\n";
        }
    }

    public String getBill() {
        this.bill += "Total Price: " + this.price + "\n";
        return this.bill;
    }
}
