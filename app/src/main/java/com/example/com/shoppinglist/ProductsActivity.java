package com.example.com.shoppinglist;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.ByteArrayOutputStream;

public class ProductsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_products);
    }

    /*@Override
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
*/
    /** Al tocar alguna imagen se cambia a la vista de los productos (activity_main)
     * @param view
     */
    public void addProduct(View view) {
        //Button button;
        //int id = view.getId();
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

    /**Los siguientes procedimientos sirven para mostrar una pequeña descripcion
    * del producto que se desea comprar, mostrando el titulo, la descripcion y un boton
    * ok para volver a la vista con todos los productos
    */
    public void onClickShowAlert1 (View view){
        AlertDialog.Builder alerta = new AlertDialog.Builder(ProductsActivity.this);
        alerta.setTitle("Description");
        alerta.setMessage("Thickness 11.6 mm, weight 1.22 kilograms, 13.3-inch screen with three IPS panels, 1080p resolution, multitouch of 3840 x 2160 pixels. Price $ 2000");
        alerta.setPositiveButton("Ok", new DialogInterface.OnClickListener(){public void onClick (DialogInterface dialog, int which){}});
        alerta.show();
    }
    public void onClickShowAlert2 (View view){
        AlertDialog.Builder alerta = new AlertDialog.Builder(ProductsActivity.this);
        alerta.setTitle("Description");
        alerta.setMessage("Height: 143.6 mm, Width: 70.9 mm, Thickness: 7.7 mm, Weight: 177 g, Water / dust resistance, Fingerprint reader, Colors: Space gray and silver. Price $ 1100");
        alerta.setPositiveButton("Ok", new DialogInterface.OnClickListener(){public void onClick (DialogInterface dialog, int which){}});
        alerta.show();
    }
    public void onClickShowAlert3 (View view){
        AlertDialog.Builder alerta = new AlertDialog.Builder(ProductsActivity.this);
        alerta.setTitle("Description");
        alerta.setMessage("Intel Core i5 microprocessor of eighth generation with 4 cores and capable of simultaneously processing 8 threads that works at a base clock frequency of 1.6 GHz. Price $ 2100");
        alerta.setPositiveButton("Ok", new DialogInterface.OnClickListener(){public void onClick (DialogInterface dialog, int which){}});
        alerta.show();
    }
    public void onClickShowAlert4 (View view){
        AlertDialog.Builder alerta = new AlertDialog.Builder(ProductsActivity.this);
        alerta.setTitle("Description");
        alerta.setMessage("It can reach 70km / h and withstand winds of up to 35km / h and 4K camera. Price $ 800");
        alerta.setPositiveButton("Ok", new DialogInterface.OnClickListener(){public void onClick (DialogInterface dialog, int which){}});
        alerta.show();
    }
    public void onClickShowAlert5 (View view){
        AlertDialog.Builder alerta = new AlertDialog.Builder(ProductsActivity.this);
        alerta.setTitle("Description");
        alerta.setMessage("Sensor Exmor CMOS de 1/2,88p and 6,1, its 96 Gigabytes of integrated Flash memory provide up to 40 hours of storage. Price $ 1000");
        alerta.setPositiveButton("Ok", new DialogInterface.OnClickListener(){public void onClick (DialogInterface dialog, int which){}});
        alerta.show();
    }
    public void onClickShowAlert6 (View view){
        AlertDialog.Builder alerta = new AlertDialog.Builder(ProductsActivity.this);
        alerta.setTitle("Description");
        alerta.setMessage("It offers a resolution of 45.7 megapixels, 493 focus points and an ISO window between 64 and 25600. Price $ 700");
        alerta.setPositiveButton("Ok", new DialogInterface.OnClickListener(){public void onClick (DialogInterface dialog, int which){}});
        alerta.show();
    }
    public void onClickShowAlert7 (View view){
        AlertDialog.Builder alerta = new AlertDialog.Builder(ProductsActivity.this);
        alerta.setTitle("Description");
        alerta.setMessage("Professional 4K30, 2.7K60 and 1080p120 video, 720p240 video for super slow-motion playback and 12MP photos at up to 30 frames per second. Price $ 700");
        alerta.setPositiveButton("Ok", new DialogInterface.OnClickListener(){public void onClick (DialogInterface dialog, int which){}});
        alerta.show();
    }
    public void onClickShowAlert8 (View view){
        AlertDialog.Builder alerta = new AlertDialog.Builder(ProductsActivity.this);
        alerta.setTitle("Description");
        alerta.setMessage("Boxes 40 mm. and 44 mm. Price $1000");
        alerta.setPositiveButton("Ok", new DialogInterface.OnClickListener(){public void onClick (DialogInterface dialog, int which){}});
        alerta.show();
    }
    public void onClickShowAlert9 (View view){
        AlertDialog.Builder alerta = new AlertDialog.Builder(ProductsActivity.this);
        alerta.setTitle("Description");
        alerta.setMessage("It incorporates Direct Full Array technology, with LED mesh lighting across the entire surface of the panel instead of just on the sides. Price $ 3000");
        alerta.setPositiveButton("Ok", new DialogInterface.OnClickListener(){public void onClick (DialogInterface dialog, int which){}});
        alerta.show();
    }
    public void onClickShowAlert10 (View view){
        AlertDialog.Builder alerta = new AlertDialog.Builder(ProductsActivity.this);
        alerta.setTitle("Description");
        alerta.setMessage("Weight: 1Kg, HDMI Output: 1, Dimensions: 290x37x2. Price $ 5000");
        alerta.setPositiveButton("Ok", new DialogInterface.OnClickListener(){public void onClick (DialogInterface dialog, int which){}});
        alerta.show();
    }
    public void onClickShowAlert11 (View view){
        AlertDialog.Builder alerta = new AlertDialog.Builder(ProductsActivity.this);
        alerta.setTitle("Description");
        alerta.setMessage("Released: November 2017 | Hashrate: 14Th / s | Consumption: 1372W | Noise: 85db | Algorithm: SHA-256. Price $ 2000");
        alerta.setPositiveButton("Ok", new DialogInterface.OnClickListener(){public void onClick (DialogInterface dialog, int which){}});
        alerta.show();
    }
    public void onClickShowAlert12 (View view){
        AlertDialog.Builder alerta = new AlertDialog.Builder(ProductsActivity.this);
        alerta.setTitle("Description");
        alerta.setMessage("Maximum security, Ease of use: works on Windows, OS X and Linux, Connect the supplied USB cable, modern cryptography, Powered by free community software. Price $ 800");
        alerta.setPositiveButton("Ok", new DialogInterface.OnClickListener(){public void onClick (DialogInterface dialog, int which){}});
        alerta.show();
    }
    public void onClickShowAlert13 (View view){
        AlertDialog.Builder alerta = new AlertDialog.Builder(ProductsActivity.this);
        alerta.setTitle("Description");
        alerta.setMessage("SCREEN: 10.5-inch Super AMOLED WQXGA 16:10, RESOLUTION: 2,560 pixels x 1,600 pixels, PROCESSOR: Qualcomm Snapdragon 835 Octa Core (4 x 2.35 Ghz + 4 x 1.9 Ghz), RAM: 4 GB RAM, MEMORY: 64 / 256 GB (up to 400 GB per microSD). Price $ 1000");
        alerta.setPositiveButton("Ok", new DialogInterface.OnClickListener(){public void onClick (DialogInterface dialog, int which){}});
        alerta.show();
    }
    public void onClickShowAlert14 (View view){
        AlertDialog.Builder alerta = new AlertDialog.Builder(ProductsActivity.this);
        alerta.setTitle("Description");
        alerta.setMessage("It has a better positioned fingerprint reader, a very good camera with variable aperture, good performance, a beautiful design and now brings a double horn that offers a better sound experience. Price $ 1000");
        alerta.setPositiveButton("Ok", new DialogInterface.OnClickListener(){public void onClick (DialogInterface dialog, int which){}});
        alerta.show();
    }
    public void onClickShowAlert15 (View view){
        AlertDialog.Builder alerta = new AlertDialog.Builder(ProductsActivity.this);
        alerta.setTitle("Description");
        alerta.setMessage("Compatible with high resolution audio, 70 mm HD diaphragm unit with aluminum coated LCP, upgradeable cable and balanced audio support. Price $ 300");
        alerta.setPositiveButton("Ok", new DialogInterface.OnClickListener(){public void onClick (DialogInterface dialog, int which){}});
        alerta.show();
    }
    public void onClickShowAlert16 (View view){
        AlertDialog.Builder alerta = new AlertDialog.Builder(ProductsActivity.this);
        alerta.setTitle("Description");
        alerta.setMessage("This Limited Edition Marvel’s Spider-Man PS4™ Pro bundle includes a fully customized Amazing Red PS4 Pro console featuring the Spider icon, DUALSHOCK®4 wireless controller, Marvel’s Spider-Man game, and digital content. Precio $2000");
        alerta.setPositiveButton("Ok", new DialogInterface.OnClickListener(){public void onClick (DialogInterface dialog, int which){}});
        alerta.show();
    }
    public void onClickShowAlert17 (View view){
        AlertDialog.Builder alerta = new AlertDialog.Builder(ProductsActivity.this);
        alerta.setTitle("Description");
        alerta.setMessage("Compatible with: Xbox One X, Xbox One S, Xbox One, Windows 10. Price $500");
        alerta.setPositiveButton("Ok", new DialogInterface.OnClickListener(){public void onClick (DialogInterface dialog, int which){}});
        alerta.show();
    }
    public void onClickShowAlert18 (View view){
        AlertDialog.Builder alerta = new AlertDialog.Builder(ProductsActivity.this);
        alerta.setTitle("Description");
        alerta.setMessage("With Bluetooth connection, a digital optical input, an analog input, a subwoofer output and a USB port for charging devices. Price $ 700\n");
        alerta.setPositiveButton("Ok", new DialogInterface.OnClickListener(){public void onClick (DialogInterface dialog, int which){}});
        alerta.show();
    }
    public void onClickShowAlert19 (View view){
        AlertDialog.Builder alerta = new AlertDialog.Builder(ProductsActivity.this);
        alerta.setTitle("Description");
        alerta.setMessage("It incorporates the latest generation of the HERO (High Efficiency Rated Optical) sensor for maximum speed, accuracy and responsiveness. Price $ 1200");
        alerta.setPositiveButton("Ok", new DialogInterface.OnClickListener(){public void onClick (DialogInterface dialog, int which){}});
        alerta.show();
    }
    public void onClickShowAlert20 (View view){
        AlertDialog.Builder alerta = new AlertDialog.Builder(ProductsActivity.this);
        alerta.setTitle("Description");
        alerta.setMessage("Power de 5.1V / 2.4A, 9V / 2A, o 12V / 1.5A. Price $700");
        alerta.setPositiveButton("Ok", new DialogInterface.OnClickListener(){public void onClick (DialogInterface dialog, int which){}});
        alerta.show();
    }
}
