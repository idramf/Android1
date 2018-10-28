package com.example.com.shoppinglist;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
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

    //* Al tocar alguna imagen se cambia a la vista de los productos (activity_main)*//
    public void addProduct(View view) {
        //Button button;
        //button = (Button) findViewById(R.id.button);
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        //String message = button.getText().toString();
        //intent.putExtra("EXTRA_MESSAGE", message);
        //finish();
    }

    //*Al tocar el nombre del producto aparece una pequeña descripcion**//
    public void onClickShowAlert (View view){
        AlertDialog.Builder alerta = new AlertDialog.Builder(ProductsActivity.this);
        //Titulo de la alerta
        alerta.setTitle("Description");
        //Descripcion de la alerta
        alerta.setMessage("Buuuuuueno, esto va a mejorar");
        //Agregamos en boton ok
        alerta.setPositiveButton("Ok", new DialogInterface.OnClickListener(){
            public void onClick (DialogInterface dialog, int which){
            }
        });
        alerta.show();
    }
}
