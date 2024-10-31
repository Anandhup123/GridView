package com.example.gridview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity2 extends AppCompatActivity {

    ImageView imgout;
    TextView textout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        imgout=(ImageView) findViewById(R.id.images);
        textout=(TextView) findViewById(R.id.texts);

 
        Bundle bundle=new Bundle(getIntent().getExtras());

        int image_collector=bundle.getInt("imagesent");
        String text_collector=bundle.getString("textsent");
        imgout.setImageResource(image_collector);
        textout.setText(text_collector);
    }
}