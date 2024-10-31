package com.example.gridview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class MainActivity3 extends AppCompatActivity {

    GridView grid;
    int[] griditems={R.drawable.lg1,R.drawable.lg2,R.drawable.lg3,R.drawable.lg4};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        grid =(GridView) findViewById(R.id.grid);

        CustomAdapter adapter = new CustomAdapter();
        grid.setAdapter(adapter);

    }

    private class CustomAdapter extends BaseAdapter {
        @Override
        public int getCount() {
            return griditems.length;
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
            View view = getLayoutInflater().inflate(R.layout.grid_element,null);
            ImageView img=view.findViewById(R.id.gridimage);
            img.setImageResource(griditems[position]);
            return view;
        }
    }
}