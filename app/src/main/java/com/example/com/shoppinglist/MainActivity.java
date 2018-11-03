package com.example.com.shoppinglist;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.TestLooperManager;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int CONTADOR_ID = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            Bundle extras = getIntent().getExtras();

            byte[] byteArray = extras.getByteArray("array imagen");
            Bitmap bmp = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
            String descripcion = extras.getString("descripción del producto");

            //createImageView(bmp, this);
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

            //createTextView(extras.getString("descripción del producto"), this);
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

/*    public void createTextView(String sText, Context con){
        TextView textView = new TextView (con);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.WRAP_CONTENT);

        layoutParams.addRule(RelativeLayout.RIGHT_OF, CONTADOR_ID);
        layoutParams.addRule(RelativeLayout.END_OF, CONTADOR_ID);

        textView.setId(CONTADOR_ID);
        textView.setPadding(35, 35, 35, 35);
        textView.setLayoutParams(layoutParams);
        textView.setText(sText);

    }*/

/*    private void createImageView(Bitmap bmp, Context con) {
        CONTADOR_ID = CONTADOR_ID +1;

        RelativeLayout relativeLayout = new RelativeLayout(this);
        relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.MATCH_PARENT));

        ImageView imageView = new ImageView(this);
        imageView.setId(CONTADOR_ID);
        imageView.setImageBitmap(bmp);
        imageView.setLayoutParams(new RelativeLayout.LayoutParams(300, 300));
        relativeLayout.addView(imageView);

        setContentView(relativeLayout);

    }*/
}
