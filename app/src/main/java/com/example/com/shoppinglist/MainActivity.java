package com.example.com.shoppinglist;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    
    public boolean LISTA_LLENA = false;
    public List<Integer> textViewId = new ArrayList<>();
    public List<Integer> imageViewId = new ArrayList<>();

    /**
     * Inicia el activity, llama a los metodos para llenar las listas de los id's, si estos ya
     * se ecuentran llenos entonces se pasa a la siguente actividad (recepcion de la informacion
     * a traves de un intent. 
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Verifica si la lista esta vacia y luego la llena
        if (!this.LISTA_LLENA) {
            llenarListaTextView();
            llenarListaImageView();
            this.LISTA_LLENA = true;
        }

        //RelativeLayout layout = (RelativeLayout)findViewById(R.id.relative_layout_2);
        //Recepcion de informacion enviada a traves del intent
        Bundle extras = getIntent().getExtras();
        //Asignacion del array de imagen a un byteArray
        byte[] byteArray = extras.getByteArray("array imagen");
        //Transformacion del byteArray a imagen bmp
        Bitmap bmp = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
        //Asignacion de la descripcion del producto a una variable
        String descripcion = extras.getString("descripción del producto");

        //Creacion de variable que indica que la informacion no a sido asignada
        boolean info_asignada = false;
        //int prevTextViewId = 0;

        asignarDescripcion(descripcion);

        asignarImagen(bmp);
    }

    /**
     * Recorre la lista donde estan almacenados los id's de los ImageView,
     * busca el ImageView que tenga asignado el id seleccionado, verifica si el
     * ImageView esta vacio y, si esta vacio, asigna la imagen enviada en el
     * Intent al ImageView correspondiente, sino continua el ciclo "for" hasta
     * que encuentre un ImageView vacio y asigne la imagen.
     * @param bmp Imagen enviada
     */
    private void asignarImagen(Bitmap bmp) {

        ImageView imageView;

        for (int id: imageViewId) {

            imageView = findViewById(id);

            if (imageView.getDrawable() == null){

                imageView.setImageBitmap(bmp);
                break;
            }
        }
    }

    /**
     * Recorre la lista donde estan almacenados los id's de los TextView,
     * busca el TextView que tenga asignado el id seleccionado, verifica si el
     * TextView esta vacio y, si esta vacio, asigna la descripcion enviada en el
     * Intent al TextView correspondiente, sino continua el ciclo "for" hasta
     * que encuentre un TextView vacio y asigne la descripcion.
     * @param descripcion Descripcion enviada
     */
    private void asignarDescripcion(String descripcion) {

        TextView textView;

        for (int id: textViewId) {

            textView = findViewById(id);

            if (textView.getText().toString().matches("")){

                textView.setText(descripcion);
                break;
            }
        }
    }

    /**
     * Llena la lista imageViewId con cada uno de los id's de los ImageView existentes.
     */
    private void llenarListaImageView() {
        this.imageViewId.add(findViewById(R.id.image_product_1).getId());
        this.imageViewId.add(findViewById(R.id.image_product_2).getId());
        this.imageViewId.add(findViewById(R.id.image_product_3).getId());
        this.imageViewId.add(findViewById(R.id.image_product_4).getId());
        this.imageViewId.add(findViewById(R.id.image_product_5).getId());
        this.imageViewId.add(findViewById(R.id.image_product_6).getId());
        this.imageViewId.add(findViewById(R.id.image_product_7).getId());
        this.imageViewId.add(findViewById(R.id.image_product_8).getId());
        this.imageViewId.add(findViewById(R.id.image_product_9).getId());
        this.imageViewId.add(findViewById(R.id.image_product_10).getId());
    }

    /**
     * Llena la lista textViewId con cada uno de los id's de los TextView existentes.
     */
    private void llenarListaTextView() {
        this.textViewId.add(findViewById(R.id.text_product_1).getId());
        this.textViewId.add(findViewById(R.id.text_product_2).getId());
        this.textViewId.add(findViewById(R.id.text_product_3).getId());
        this.textViewId.add(findViewById(R.id.text_product_4).getId());
        this.textViewId.add(findViewById(R.id.text_product_5).getId());
        this.textViewId.add(findViewById(R.id.text_product_6).getId());
        this.textViewId.add(findViewById(R.id.text_product_7).getId());
        this.textViewId.add(findViewById(R.id.text_product_8).getId());
        this.textViewId.add(findViewById(R.id.text_product_9).getId());
        this.textViewId.add(findViewById(R.id.text_product_10).getId());
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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void newProduct(View view) {
        Intent intent = new Intent(this, ProductsActivity.class);
        startActivity(intent);
    }

}
