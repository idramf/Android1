package com.example.com.technologyworld;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.io.ByteArrayOutputStream;

/**
 * Esta clase se encarga del manejo de la Activity 2, la cual muestra la lista de productos que
 * se pueden seleccionar. De estos productos se muestran la imagen y el nombre del producto; al
 * hacer clic en el nombre aparecerá una ventana con la descripción del producto y su precio. Así
 * mismo, al hacer clic en la imagen del producto, este se enviará a la pantalla principal.
 * @author Isnere Hernández, Luis Machado y Sasha Stella
 */
public class ProductsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_products);
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    /** Al seleccionar la imagen del producto, esta es convertida a Bitmap y guardada en la variable
     * "bmp" y seguidamente se convierte en un ByteArray y comprimida para s envio. Seguidamente se
     * envia como un extra a traves de un intent con nombre clave "array imagen". Así mismo se envía
     * la descripción de la imagen como un extra del intent con nombre clave "descripción del
     * producto".
     * @param view
     */
    public void addProduct(View view) {

        ImageView imageView = (ImageView) view;
        BitmapDrawable bmdp = (BitmapDrawable) imageView.getDrawable();
        Bitmap bmp = bmdp.getBitmap();
        ByteArrayOutputStream bs = new ByteArrayOutputStream();
        bmp.compress (Bitmap.CompressFormat.PNG, 50, bs);

        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("array imagen", bs.toByteArray());
        intent.putExtra("descripción del producto", view.getContentDescription().toString());
        startActivity(intent);
    }

    /** Los siguientes procedimientos sirven para mostrar una pequeña descripcion del producto que
     * se desea comprar, mostrando el titulo, la descripcion y un boton "ok" para volver a la vista
     * con todos los productos.
     * @param view
    */
    public void onClickShowAlert1 (View view){
        AlertDialog.Builder alerta = new AlertDialog.Builder(ProductsActivity.this);
        alerta.setTitle(R.string.tittle_description);
        alerta.setMessage(R.string.description_pc);
        alerta.setPositiveButton("Ok", new DialogInterface.OnClickListener(){public void onClick (DialogInterface dialog, int which){}});
        alerta.show();
    }
    public void onClickShowAlert2 (View view){
        AlertDialog.Builder alerta = new AlertDialog.Builder(ProductsActivity.this);
        alerta.setTitle(R.string.tittle_description);
        alerta.setMessage(R.string.description_phone);
        alerta.setPositiveButton("Ok", new DialogInterface.OnClickListener(){public void onClick (DialogInterface dialog, int which){}});
        alerta.show();
    }
    public void onClickShowAlert3 (View view){
        AlertDialog.Builder alerta = new AlertDialog.Builder(ProductsActivity.this);
        alerta.setTitle(R.string.tittle_description);
        alerta.setMessage(R.string.description_laptop);
        alerta.setPositiveButton("Ok", new DialogInterface.OnClickListener(){public void onClick (DialogInterface dialog, int which){}});
        alerta.show();
    }
    public void onClickShowAlert4 (View view){
        AlertDialog.Builder alerta = new AlertDialog.Builder(ProductsActivity.this);
        alerta.setTitle(R.string.tittle_description);
        alerta.setMessage(R.string.description_drone);
        alerta.setPositiveButton("Ok", new DialogInterface.OnClickListener(){public void onClick (DialogInterface dialog, int which){}});
        alerta.show();
    }
    public void onClickShowAlert5 (View view){
        AlertDialog.Builder alerta = new AlertDialog.Builder(ProductsActivity.this);
        alerta.setTitle(R.string.tittle_description);
        alerta.setMessage(R.string.description_film);
        alerta.setPositiveButton("Ok", new DialogInterface.OnClickListener(){public void onClick (DialogInterface dialog, int which){}});
        alerta.show();
    }
    public void onClickShowAlert6 (View view){
        AlertDialog.Builder alerta = new AlertDialog.Builder(ProductsActivity.this);
        alerta.setTitle(R.string.tittle_description);
        alerta.setMessage(R.string.description_camera);
        alerta.setPositiveButton("Ok", new DialogInterface.OnClickListener(){public void onClick (DialogInterface dialog, int which){}});
        alerta.show();
    }
    public void onClickShowAlert7 (View view){
        AlertDialog.Builder alerta = new AlertDialog.Builder(ProductsActivity.this);
        alerta.setTitle(R.string.tittle_description);
        alerta.setMessage(R.string.description_gopro);
        alerta.setPositiveButton("Ok", new DialogInterface.OnClickListener(){public void onClick (DialogInterface dialog, int which){}});
        alerta.show();
    }
    public void onClickShowAlert8 (View view){
        AlertDialog.Builder alerta = new AlertDialog.Builder(ProductsActivity.this);
        alerta.setTitle(R.string.tittle_description);
        alerta.setMessage(R.string.description_apple_watch);
        alerta.setPositiveButton("Ok", new DialogInterface.OnClickListener(){public void onClick (DialogInterface dialog, int which){}});
        alerta.show();
    }
    public void onClickShowAlert9 (View view){
        AlertDialog.Builder alerta = new AlertDialog.Builder(ProductsActivity.this);
        alerta.setTitle(R.string.tittle_description);
        alerta.setMessage(R.string.description_tv);
        alerta.setPositiveButton("Ok", new DialogInterface.OnClickListener(){public void onClick (DialogInterface dialog, int which){}});
        alerta.show();
    }
    public void onClickShowAlert10 (View view){
        AlertDialog.Builder alerta = new AlertDialog.Builder(ProductsActivity.this);
        alerta.setTitle(R.string.tittle_description);
        alerta.setMessage(R.string.description_bluray);
        alerta.setPositiveButton("Ok", new DialogInterface.OnClickListener(){public void onClick (DialogInterface dialog, int which){}});
        alerta.show();
    }
    public void onClickShowAlert11 (View view){
        AlertDialog.Builder alerta = new AlertDialog.Builder(ProductsActivity.this);
        alerta.setTitle(R.string.tittle_description);
        alerta.setMessage(R.string.description_miner);
        alerta.setPositiveButton("Ok", new DialogInterface.OnClickListener(){public void onClick (DialogInterface dialog, int which){}});
        alerta.show();
    }
    public void onClickShowAlert12 (View view){
        AlertDialog.Builder alerta = new AlertDialog.Builder(ProductsActivity.this);
        alerta.setTitle(R.string.tittle_description);
        alerta.setMessage(R.string.description_wallet);
        alerta.setPositiveButton("Ok", new DialogInterface.OnClickListener(){public void onClick (DialogInterface dialog, int which){}});
        alerta.show();
    }
    public void onClickShowAlert13 (View view){
        AlertDialog.Builder alerta = new AlertDialog.Builder(ProductsActivity.this);
        alerta.setTitle(R.string.tittle_description);
        alerta.setMessage(R.string.description_tablet);
        alerta.setPositiveButton("Ok", new DialogInterface.OnClickListener(){public void onClick (DialogInterface dialog, int which){}});
        alerta.show();
    }
    public void onClickShowAlert14 (View view){
        AlertDialog.Builder alerta = new AlertDialog.Builder(ProductsActivity.this);
        alerta.setTitle(R.string.tittle_description);
        alerta.setMessage(R.string.description_s9);
        alerta.setPositiveButton("Ok", new DialogInterface.OnClickListener(){public void onClick (DialogInterface dialog, int which){}});
        alerta.show();
    }
    public void onClickShowAlert15 (View view){
        AlertDialog.Builder alerta = new AlertDialog.Builder(ProductsActivity.this);
        alerta.setTitle(R.string.tittle_description);
        alerta.setMessage(R.string.description_headphones);
        alerta.setPositiveButton("Ok", new DialogInterface.OnClickListener(){public void onClick (DialogInterface dialog, int which){}});
        alerta.show();
    }
    public void onClickShowAlert16 (View view){
        AlertDialog.Builder alerta = new AlertDialog.Builder(ProductsActivity.this);
        alerta.setTitle(R.string.tittle_description);
        alerta.setMessage(R.string.description_ps4);
        alerta.setPositiveButton("Ok", new DialogInterface.OnClickListener(){public void onClick (DialogInterface dialog, int which){}});
        alerta.show();
    }
    public void onClickShowAlert17 (View view){
        AlertDialog.Builder alerta = new AlertDialog.Builder(ProductsActivity.this);
        alerta.setTitle(R.string.tittle_description);
        alerta.setMessage(R.string.description_xbox);
        alerta.setPositiveButton("Ok", new DialogInterface.OnClickListener(){public void onClick (DialogInterface dialog, int which){}});
        alerta.show();
    }
    public void onClickShowAlert18 (View view){
        AlertDialog.Builder alerta = new AlertDialog.Builder(ProductsActivity.this);
        alerta.setTitle(R.string.tittle_description);
        alerta.setMessage(R.string.description_corneta);
        alerta.setPositiveButton("Ok", new DialogInterface.OnClickListener(){public void onClick (DialogInterface dialog, int which){}});
        alerta.show();
    }
    public void onClickShowAlert19 (View view){
        AlertDialog.Builder alerta = new AlertDialog.Builder(ProductsActivity.this);
        alerta.setTitle(R.string.tittle_description);
        alerta.setMessage(R.string.description_mouse);
        alerta.setPositiveButton("Ok", new DialogInterface.OnClickListener(){public void onClick (DialogInterface dialog, int which){}});
        alerta.show();
    }
    public void onClickShowAlert20 (View view){
        AlertDialog.Builder alerta = new AlertDialog.Builder(ProductsActivity.this);
        alerta.setTitle(R.string.tittle_description);
        alerta.setMessage(R.string.description_power);
        alerta.setPositiveButton("Ok", new DialogInterface.OnClickListener(){public void onClick (DialogInterface dialog, int which){}});
        alerta.show();
    }
}
