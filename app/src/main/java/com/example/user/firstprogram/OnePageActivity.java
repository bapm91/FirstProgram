package com.example.user.firstprogram;

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

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        ButterKnife.bind(this);
        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(R.string.app_name);
            getSupportActionBar().setHomeButtonEnabled(true);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        if (toolbar != null) {
            toolbar.setNavigationOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    finish();
                }
            });
        }

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(
                this, RecyclerView.HORIZONTAL, false);
        OnePageRecyclerViewAdapter adapter = new OnePageRecyclerViewAdapter(
                Arrays.asList(getResources().getStringArray(R.array.image_urls)), this);

        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            recyclerView.setFocusable(false);
            recyclerView.setLayoutManager(layoutManager);
            recyclerView.setAdapter(adapter);
            recyclerView.setItemAnimator(new DefaultItemAnimator());
        }
    }
}
