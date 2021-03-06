package com.example.user.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.user.firstprogram.R;
import com.squareup.picasso.Picasso;

import java.util.List;


public class OnePageRecyclerViewAdapter extends RecyclerView.Adapter<OnePageRecyclerViewAdapter.ViewHolder> {
    private List<String> mItemsData;
    private Context mContext;
    private static final int IMAGE_SIZE = 479;

    public OnePageRecyclerViewAdapter(List<String> mItemsData, Context context) {
        this.mItemsData = mItemsData;
        mContext = context;
    }

    @Override
    public OnePageRecyclerViewAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemLayoutView = LayoutInflater
                .from(parent.getContext())
                .inflate(R.layout.one_page_recycler_item, parent, false);
        return new ViewHolder(itemLayoutView);
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView imgViewIcon;

        private ViewHolder(View itemLayoutView) {
            super(itemLayoutView);
            imgViewIcon = (ImageView) itemLayoutView.findViewById(R.id.imageView);
        }
    }

    @Override
    public void onBindViewHolder(OnePageRecyclerViewAdapter.ViewHolder viewHolder, final int position) {
        Picasso.with(mContext)
                .load(mItemsData.get(position))
                .resize(IMAGE_SIZE, IMAGE_SIZE)
                .centerCrop()
                .into(viewHolder.imgViewIcon);

        viewHolder.imgViewIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext, "Images position " + (position + 1), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return mItemsData.size();
    }
}
