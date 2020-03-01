package com.example.taskmanager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView tasks;
    private RecyclerView.Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Task> tasks= initCities();

        this.tasks = (RecyclerView) findViewById(R.id.tasks);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(this);
        this.tasks.setLayoutManager(mLayoutManager);

        adapter = new TaskAdapter(tasks);
        this.tasks.setAdapter(adapter);
    }
    private ArrayList<Task> initCities() {
        ArrayList<Task> list = new ArrayList<>();

        list.add(new Task("nice", "The coastline, the five villages in Italy."));
        list.add(new Task("Paris", "Paris is the capital city of France"));
        list.add(new Task("Rio de Janeiro", "Rio has been one of Brazil's most popular destinations."));
        list.add(new Task("Sydney", "Sydney is the state capital of New South Wales."));

        return list;
    }
}

