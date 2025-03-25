package com.example.usingrecyclerview;

import android.os.Bundle;
import android.widget.Adapter;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
LanScapeAdapter lanScapeAdapter;
ArrayList<LandScape> recyclerViewDatas;
RecyclerView recyclerViewLanScape;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        //b3
        recyclerViewDatas = getDataForRecyclerView();
        //b4
        recyclerViewLanScape = findViewById(R.id.RecyclerLand);
        //b5
        RecyclerView.LayoutManager layoutLinear = new LinearLayoutManager(this);
        recyclerViewLanScape.setLayoutManager(layoutLinear);
        //b6
        lanScapeAdapter = new LanScapeAdapter(this, recyclerViewDatas);
        //b7
        recyclerViewLanScape.setAdapter(lanScapeAdapter);
    }

    ArrayList<LandScape> getDataForRecyclerView() {
        ArrayList<LandScape> dsDuLieu  = new ArrayList<LandScape>();
        LandScape landScape1 = new LandScape("De01_Img_01", "Cây 1");
        dsDuLieu.add(landScape1);
        dsDuLieu.add(new LandScape("De01_Img_02", "Cây 2"));
        dsDuLieu.add(new LandScape("De01_Img_03", "Cây 3"));
        dsDuLieu.add(new LandScape("De01_Img_04", "Cây 4"));
        return  dsDuLieu;
    }

}