package com.example.coffeestory;

public class Drink {
    private String name;
    private String description;
    private int imageResourceID;

    public static final Drink[] drinks ={
        new Drink("Latte", "A couple of espresso shots with steamed milk", R.drawable.latte),
            new Drink("Cappuccino", "Espresso, hot milk, and a steamed milk foam", R.drawable.cappuccino),
            new Drink("Filter", "Highest quality beans roasted and brewed fresh", R.drawable.filter)
    };

    private Drink(String name, String description, int imageResourceID){
        this.name= name;
        this.description = description;
        this.imageResourceID = imageResourceID;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getImageResourceID() {
        return imageResourceID;
    }

    public String toString(){
        return this.name;
    }
}
