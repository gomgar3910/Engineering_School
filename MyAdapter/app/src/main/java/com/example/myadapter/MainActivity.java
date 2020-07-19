package com.example.myadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    ArrayAdapter<CharSequence> myAdapter = null;
    ListView listview = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myAdapter = ArrayAdapter.createFromResource(this,R.array.Call_Number,android.R.layout.simple_expandable_list_item_1);

        listview =(ListView) findViewById(R.id.listview1);
        listview.setAdapter(myAdapter);
    }
}
