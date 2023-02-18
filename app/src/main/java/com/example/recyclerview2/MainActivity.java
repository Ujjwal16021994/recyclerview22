package com.example.recyclerview2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<SampleData> list = new ArrayList<>();
    RecyclerView recyclervw;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclervw = findViewById(R.id.idrecyclerview);
        recyclervw.setLayoutManager(new LinearLayoutManager(this));

        SampleData cap = new SampleData(R.drawable.ewq,"A sample animal image");
        list.add(cap);
        SampleData cap1 = new SampleData(R.drawable.fg,"A sample cat image");
        list.add(cap1);
        SampleData cap3 = new SampleData(R.drawable.fgg,"A sample fly image");
        list.add(cap3);
        SampleData cap4 = new SampleData(R.drawable.qwqwsq,"A sample ful image");
        list.add(cap4);
        list.add(new SampleData(R.drawable.sdde,"A sample bird image"));
        list.add(new SampleData(R.drawable.sdsd,"A sample Dawn image"));
        list.add(new SampleData(R.drawable.wew,"A sample teddy image"));
        list.add(new SampleData(R.drawable.wq,"A sample flower image"));

        Adapter recyclerAdapter = new Adapter(this,list);
        recyclervw.setAdapter(recyclerAdapter);
    }
}