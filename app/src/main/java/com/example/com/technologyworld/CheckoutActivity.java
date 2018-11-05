package com.example.com.technologyworld;

import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class CheckoutActivity extends AppCompatActivity {


    public boolean LISTA_LLENA = false;
    public List<Integer> textViewId = new ArrayList<>();
    public List<Integer> imageViewId = new ArrayList<>();
    private List<Bitmap> img = Singleton.getInstance().imageList;
    private List<String> txt = Singleton.getInstance().textList;
    private TextView text_contador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkout);
        Bundle extras = getIntent().getExtras();
        text_contador = findViewById(R.id.text_contador);
        //Verifica si la lista esta vacia y luego la llena
        if (!this.LISTA_LLENA) {
            llenarListaTextView();
            llenarListaImageView();
            this.LISTA_LLENA = true;
        }

        asignarDescripcion(txt);

        asignarImagen(img);
    }

    /**
     * Recorre la lista donde estan almacenados los id's de los ImageView,
     * busca el ImageView que tenga asignado el id seleccionado, verifica si el
     * ImageView esta vacio y, si esta vacio, asigna la imagen enviada en el
     * Intent al ImageView correspondiente, sino continua el ciclo "for" hasta
     * que encuentre un ImageView vacio y asigne la imagen.
     * @param bmp Imagen enviada
     */
    private void asignarImagen(List<Bitmap> bmp) {
        int contador = 0;
        ImageView imageView;
        for (int i = 0; i < bmp.size(); i++) {
            for (int id : imageViewId) {

                imageView = findViewById(id);

                if (imageView.getDrawable() == null) {

                    imageView.setImageBitmap(bmp.get(i));
                    contador++;
                    break;
                }
            }
            if (text_contador != null)
                text_contador.setText(Integer.toString(contador));

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

    public void returnCheck(View view) {
        finish();
    }
}
