package com.example.user.firstprogram;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.user.adapter.OnePageRecyclerViewAdapter;

import java.util.Arrays;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class OnePageActivity extends AppCompatActivity {
    private RecyclerView.LayoutManager mLayoutManager;
    private RecyclerView mRecyclerView;

    @OnClick({R.id.create,
            R.id.createDate,
            R.id.header,
            R.id.status,
            R.id.registered,
            R.id.registered_date,
            R.id.deadline,
            R.id.deadline_date,
            R.id.responsible,
            R.id.responsible_name,
            R.id.text})
    public void mShowToast(View view) {
        Toast.makeText(this,
                ((TextView) view).getText(), Toast.LENGTH_SHORT)
                .show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.one_page_activity);

        Toolbar mToolbar = (Toolbar) findViewById(R.id.toolbar);
        ButterKnife.bind(this);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setTitle(R.string.app_name);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        assert mToolbar != null;
        mToolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OnePageActivity.this.finish();
            }
        });

        mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setFocusable(false);
        mLayoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        mRecyclerView.setLayoutManager(mLayoutManager);
        OnePageRecyclerViewAdapter Adapter = new OnePageRecyclerViewAdapter(Arrays.asList(getResources().getStringArray(R.array.image_urls)), this);
        mRecyclerView.setAdapter(Adapter);
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());

        Intent intent = getIntent();
        int value = intent.getIntExtra("position", 0);
    }
}
