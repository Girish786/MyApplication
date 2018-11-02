package com.voiceassitnat.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerViewAdapter recyclerViewAdapter;
    List<ProductModel> arrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recycler_view);
        arrayList=new ArrayList<ProductModel>();
        data();
        recyclerView.setHasFixedSize(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerViewAdapter=new RecyclerViewAdapter(this,arrayList);
        recyclerView.setAdapter(recyclerViewAdapter);
    }

    private void data() {
        arrayList.add(new ProductModel("Korean-Engineered","$55000","45","https://images.carscoops.com/2014/06/Spirra-0.jpg"));
        arrayList.add(new ProductModel("Korean-Engineered","$55000","45","https://www.japanbullet.com/images/thumbnails/images/2013/08/toyotasupraagu14-775x437.jpg"));
        arrayList.add(new ProductModel("Korean-Engineered","$55000","45","https://images.carscoops.com/2014/06/Spirra-0.jpg"));
        arrayList.add(new ProductModel("Korean-Engineered","$55000","45","https://images.carscoops.com/2014/06/Spirra-0.jpg"));
    }
}
