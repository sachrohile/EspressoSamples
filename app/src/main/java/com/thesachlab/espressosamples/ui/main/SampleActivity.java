package com.thesachlab.espressosamples.ui.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.thesachlab.espressosamples.R;
import com.thesachlab.espressosamples.datasource.SampleData;

import java.util.ArrayList;

public class SampleActivity extends AppCompatActivity {

   private SampleRecyclerAdapter sampleRecyclerAdapter;
   private RecyclerView recyclerView;
   private RecyclerView.LayoutManager mLayoutManager;
   private ArrayList<String> dataList;
   private SampleRecyclerAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample);
        init();
        loadAndSetData();


    }

    private void loadAndSetData() {
        dataList= SampleData.getData();
        mAdapter=new SampleRecyclerAdapter(dataList);
        mLayoutManager=new LinearLayoutManager(getApplicationContext());
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(recyclerView.getContext(),
                DividerItemDecoration.VERTICAL);
        recyclerView.addItemDecoration(dividerItemDecoration);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);


    }

    private void init() {
        dataList=new ArrayList<String>();
        recyclerView=findViewById(R.id.recycler_view);
    }
}
