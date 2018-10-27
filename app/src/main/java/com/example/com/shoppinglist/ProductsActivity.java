package com.example.com.shoppinglist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ProductsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_products);
    }


    public void addProduct(View view) {

        Button button;
        //button = (Button) findViewById(R.id.button);
        Intent intent = new Intent(this, MainActivity.class);
        //String message = button.getText().toString();
        //intent.putExtra("EXTRA_MESSAGE", message);
        finish();

    }
}
