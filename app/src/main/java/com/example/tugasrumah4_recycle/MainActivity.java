package com.example.tugasrumah4_recycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView recylerView;

    String s1[], s2[];
    int images[] = {R.drawable.drac,R.drawable.mavis,R.drawable.jonny,R.drawable.babydenis,
            R.drawable.frankenstain,R.drawable.wayne,};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recylerView = findViewById(R.id.recyclerView);

        s1 = getResources().getStringArray(R.array.character);
        s2 = getResources().getStringArray(R.array.deskripsi);

        ItemAdapter appAdapter = new ItemAdapter(this,s1,s2,images);
        recylerView.setAdapter(appAdapter);
        recylerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
