package com.example.coffeestory;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DrinkActivity extends AppCompatActivity {

    public static final String EXTRA_DRINKID = "drinkId";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink);

        //Get the drink from the intent
        int drinkId = (Integer)getIntent().getExtras().get(EXTRA_DRINKID);
        Drink drink = Drink.drinks[drinkId];

        //Set the drink name
        TextView name = findViewById(R.id.name);
        name.setText(drink.getName());

        //Set the drink description
        TextView description = findViewById(R.id.description);
        description.setText(drink.getDescription());

        //Set the drink image
        ImageView photo = findViewById(R.id.photo);
        photo.setImageResource(drink.getImageResourceID());
        photo.setContentDescription(drink.getName());
    }
}