package com.brilicaservices.recyclerviewsample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
        implements RecyclerAdapter.ListItemClickListener{

    RecyclerView recyclerView;

    StudentModel studentModel;

    RecyclerAdapter recyclerAdapter;

    ArrayList<StudentModel> studentModelArrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view_sample);

        studentModelArrayList.add(new StudentModel("Mahima"));
        studentModelArrayList.add(new StudentModel("Sheetal"));
        studentModelArrayList.add(new StudentModel("Jhilmil"));
        studentModelArrayList.add(new StudentModel("Ritu"));
        studentModelArrayList.add(new StudentModel("Avisha"));
        studentModelArrayList.add(new StudentModel("Pragati"));
        studentModelArrayList.add(new StudentModel("Anjali"));
        studentModelArrayList.add(new StudentModel("Reshu"));
        studentModelArrayList.add(new StudentModel("Maanas"));
        studentModelArrayList.add(new StudentModel("Dev"));
        studentModelArrayList.add(new StudentModel("Peehu"));
        studentModelArrayList.add(new StudentModel("Suhani"));
        studentModelArrayList.add(new StudentModel("Shatak"));
        studentModelArrayList.add(new StudentModel("Sakshi"));
        studentModelArrayList.add(new StudentModel("Misty"));


        LinearLayoutManager linearLayoutManager =
                new LinearLayoutManager(this);
        recyclerView.setLayoutManager( linearLayoutManager);

        recyclerView.setHasFixedSize(true);
        recyclerAdapter = new
                RecyclerAdapter(studentModelArrayList,
                this);

        recyclerView.setAdapter(recyclerAdapter);
    }


    @Override
    public void onListItemClickListener(int clickedItemIndex) {
        Toast.makeText(getApplicationContext(), studentModelArrayList.get(clickedItemIndex).studentName, Toast.LENGTH_SHORT).show();
    }
}


