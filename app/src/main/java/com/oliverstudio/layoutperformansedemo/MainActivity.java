package com.oliverstudio.layoutperformansedemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = findViewById(R.id.recycler_view);

        List<String> textList = new ArrayList<>();
        textList.add("some line");
        textList.add("some line");
        textList.add("some line");
        textList.add("some line");
        textList.add("some line");
        textList.add("some line");
        textList.add("some line");
        textList.add("some line");
        textList.add("some line");
        textList.add("some line");
        textList.add("some line");
        textList.add("some line");
        textList.add("some line");
        textList.add("some line");
        textList.add("some line");
        textList.add("some line");
        textList.add("some line");
        textList.add("some line");

        mRecyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext(),
                LinearLayoutManager.VERTICAL, false));
        RecyclerAdapter recyclerAdapter = new RecyclerAdapter(textList, getApplicationContext());
        mRecyclerView.setAdapter(recyclerAdapter);
        recyclerAdapter.notifyDataSetChanged();

    }
}
