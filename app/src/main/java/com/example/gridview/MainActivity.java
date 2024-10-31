package com.example.gridview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    GridView gridview;
    int[] gridelements={R.drawable.lg1,R.drawable.lg2,R.drawable.lg3,R.drawable.lg4,R.drawable.lg5,R.drawable.lg6,R.drawable.lg1,R.drawable.lg2,R.drawable.lg3,R.drawable.lg4,R.drawable.lg5,R.drawable.lg6};
    String [] gridtexts={"C++","PHP","PYTHON","HTML","JAVA SCRIPT","JAVA","C++","PHP","PYTHON","HTML","JAVA SCRIPT","JAVA"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridview=(GridView) findViewById(R.id.grid);

        CustomAdapter Adapter=new CustomAdapter();

        gridview.setAdapter(Adapter);

        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "position "+ gridtexts[position], Toast.LENGTH_SHORT).show();
            }
        });





        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "Grid position ="+position, Toast.LENGTH_SHORT).show();

                Intent intent=new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("imagesent",gridelements[position]);
                intent.putExtra("textsent",gridtexts[position]);
                startActivity(intent);
            }
        });
    }



    private class CustomAdapter extends BaseAdapter {
        @Override
        public int getCount() {
            return gridelements.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }


        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View view=getLayoutInflater().inflate(R.layout.grid_element,null);
            ImageView images=view.findViewById(R.id.gridimage);
            TextView texts=view.findViewById(R.id.text);
            images.setImageResource(gridelements[position]);
            texts.setText(gridtexts[position]);
            return view;
        }
    }
}