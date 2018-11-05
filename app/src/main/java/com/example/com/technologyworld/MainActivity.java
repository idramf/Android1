package com.example.com.technologyworld;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Esta clase se encarga del manejo de la Activity 1, la cual muestra la lista de productos
 * seleccionados, asi como un botón para añadir mas productos y la opción de hacer la revisión
 * final antes de realizar la compra.
 * @author Isnere Hernández, Luis Machado y Sasha Stella
 */
public class MainActivity extends AppCompatActivity {
    
    public boolean lista_ids_llena = false;
    private List<Integer> textViewId = new ArrayList<>();
    private List<Integer> imageViewId = new ArrayList<>();
    private List<Bitmap> img = Singleton.getInstance().imageList;
    private List<String> txt = Singleton.getInstance().textList;

    /**
     * Inicia el activity, llama a los metodos para llenar las listas de los id's, si estos ya
     * se ecuentran llenos entonces se pasa a la siguente actividad (recepcion de la informacion
     * a traves de un intent, donde la imagen es asignada a la variable "bmp" y la descripción del
     * producto a la variable "descripcion"), seguidamente esta información se agrega a unas listas
     * y finalmente es asignada a un ImageView y TextView para su visualización.
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Verifica si la lista de los id's esta vacia y luego la llena
        if (!this.lista_ids_llena) {
            llenarListaTextView();
            llenarListaImageView();
            this.lista_ids_llena = true;
        }

        //Recepcion de informacion enviada a traves del intent
        Bundle extras = getIntent().getExtras();
        //Asignacion del array de imagen a un byteArray
        byte[] byteArray = extras.getByteArray("array imagen");
        //Transformacion del byteArray a imagen bmp
        Bitmap bmp = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
        //Asignacion de la descripcion del producto a una variable
        String descripcion = extras.getString("descripción del producto");

        txt.add(descripcion);
        img.add(bmp);

        asignarDescripcion(txt);
        asignarImagen(img);
    }

    /**
     * Recorre la lista donde estan almacenadas las imagenes que se han enviado a la Activity.
     * Teniendo una imagen seleccionada, recorre la lista donde estan almacenados los id's de los
     * ImageViews, busca el ImageView que tenga asignado el id seleccionado, verifica si el
     * ImageView esta vacio y, si esta vacio, asigna la imagen seleccionada y se termina el segundo
     * ciclo "for", seguidamente se selecciona la siguiente imagen de la lista de imagenes y se
     * repite lo anterior.
     * @param bmp lista donde estan almacenadas las imagenes recibidas
     */
    private void asignarImagen(List<Bitmap> bmp) {

        ImageView imageView;

        for (int i = 0; i < bmp.size(); i++) {

            for (int id : imageViewId) {

                imageView = findViewById(id);

                if (imageView.getDrawable() == null) {

                    imageView.setImageBitmap(bmp.get(i));
                    break;
                }
            }
        }
    }

    /**
     * Recorre la lista donde estan almacenadas las descripciones que se han enviado a la Activity.
     * Teniendo una descripcion seleccionada, recorre la lista donde estan almacenados los id's de
     * los TextViews, busca el TextView que tenga asignado el id seleccionado, verifica si el
     * TextView esta vacio y, si esta vacio, asigna la descripcion seleccionada y se termina el
     * segundo ciclo "for", seguidamente se selecciona la siguiente descripcion de la lista de
     * descripciones y se repite lo anterior.
     * @param descripcion lista donde estan almacenadas las descripciones recibidas
     */
    private void asignarDescripcion(List<String> descripcion) {

        TextView textView;

        for (int i = 0; i <descripcion.size(); i++) {

            for (int id : textViewId) {

                textView = findViewById(id);

                if (textView.getText().toString().matches("")) {
                    textView.setText(descripcion.get(i));
                    break;
                }
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

    /**
     * Inicia, a traves de un intent, la segunda Activity (donde se seleccionan los productos)
     * @param view
     */
    public void newProduct(View view) {
        Intent intent = new Intent(this, ProductsActivity.class);
        startActivity(intent);
    }

}
