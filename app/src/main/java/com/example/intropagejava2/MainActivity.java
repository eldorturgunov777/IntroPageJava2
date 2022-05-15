package com.example.intropagejava2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SnapHelper;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.google.android.material.tabs.TabLayout;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    SlideAdapter slideAdapter;
    List<ListData> list = new ArrayList<>();
    Button skip;
    Button getStarted;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        skip = findViewById(R.id.skip);
        getStarted = findViewById(R.id.getStarted);
        slideAdapter = new SlideAdapter(list, this);

        skip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                recyclerView.scrollToPosition(list.size());
                loadLastScreen();
            }
        });
        getStarted.setOnClickListener(view -> {
            Intent mainActivity = new Intent(getApplicationContext(), HomeActivity.class);
            startActivity(mainActivity);
            finish();
        });
        LinearLayoutManager layout = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(layout);
        SnapHelper snapHelper = new PagerSnapHelper();
        snapHelper.attachToRecyclerView(recyclerView);
        recyclerView.setAdapter(slideAdapter);

        loadData();
        initViews();
    }

    void loadData() {
        list.add(new ListData(R.raw.first, "Lorem Ipsum", "Lorem Ipsum is simply dummy text of the printing and typesetting\\nindustry. Lorem Ipsum has been the industry's"));
        list.add(new ListData(R.raw.second, "Lorem Ipsum", "Lorem Ipsum is simply dummy text of the printing and typesetting\\nindustry. Lorem Ipsum has been the industry's"));
        list.add(new ListData(R.raw.three, "Lorem Ipsum", "Lorem Ipsum is simply dummy text of the printing and typesetting\\nindustry. Lorem Ipsum has been the industry's"));
    }

    private void loadLastScreen() {
        skip.setVisibility(View.INVISIBLE);
        getStarted.setVisibility(View.VISIBLE);
    }

    void initViews() {

    }
}