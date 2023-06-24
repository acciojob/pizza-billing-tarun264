package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private boolean addExtraCheese;
    private boolean addExtraToppings;
    private boolean paperbag;
    private boolean billGenerated;

    private int basePrice;
    private int chesseAdded;
    private int vegtoppingsAdded;
    private int nonvegToppings;
    private int Paperbag;


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(isVeg){
            basePrice=300;
        }
        else{
            basePrice=400;
        }
        this.chesseAdded=80;
        this.vegtoppingsAdded=70;
        this.nonvegToppings=120;
        this.Paperbag=20;

        this.price=basePrice;
        bill="Base Price Of The Pizza: "+ basePrice+ "\n";

    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Boolean getVeg() {
        return isVeg;
    }

    public void setVeg(Boolean veg) {
        isVeg = veg;
    }

    public void setBill(String bill) {
        this.bill = bill;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese() {
        if (!addExtraCheese) {
            addExtraCheese = true;
            price += chesseAdded;
            bill = bill + "Extra Cheese Added: " + chesseAdded + "\n";
        }
    }

    public void addExtraToppings(){
       if (!addExtraToppings) {
           addExtraToppings=true;
           if (isVeg) {
               price += vegtoppingsAdded;
               bill = bill + "Extra Toppings Added: " + vegtoppingsAdded + "\n";
           } else {
               price += nonvegToppings;
               bill = bill + "Extra Toppings Added: " + nonvegToppings + "\n";
           }
       }
    }

    public void addTakeaway() {
        if (!paperbag) {
            paperbag = true;
            price += Paperbag;
            bill = bill +"Paperbag Added: " + Paperbag + "\n";
        }
    }
    public String getBill(){
       if(!billGenerated){
           billGenerated=true;
           bill=bill+ "Total Price: "+price+ "\n";
       }
       return bill;
    }
}
