package com.example.user.adapter;

import android.content.Context;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.user.firstprogram.R;
import com.squareup.picasso.Picasso;

import java.util.List;


public class AdapterOnePageRecyclerView extends RecyclerView.Adapter<AdapterOnePageRecyclerView.ViewHolder> {
    private List<String> mItemsData;
    private Context mContext;
    private Picasso mPicasso;
    private static final int IMAGE_SIZE = 479;

    public AdapterOnePageRecyclerView(List<String> mItemsData, Context context) {
        this.mItemsData = mItemsData;
        mContext = context;
        mPicasso = new Picasso.Builder(context)
                .listener(new Picasso.Listener() {
                    @Override
                    public void onImageLoadFailed(Picasso picasso, Uri uri, Exception exception) {
                        System.out.printf("Yo %s\n", uri.toString());
                        exception.printStackTrace(System.out);
                    }
                })
                .build();
    }

    @Override
    public AdapterOnePageRecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemLayoutView = LayoutInflater
                .from(parent.getContext())
                .inflate(R.layout.one_page_recycler_item, parent, false);
        ViewHolder viewHolder = new ViewHolder(itemLayoutView);
        return viewHolder;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView imgViewIcon;
        private ViewHolder(View itemLayoutView) {
            super(itemLayoutView);
            imgViewIcon = (ImageView) itemLayoutView.findViewById(R.id.imageView);
        }
    }

    @Override
    public void onBindViewHolder(AdapterOnePageRecyclerView.ViewHolder viewHolder, final int position) {

        mPicasso.load(mItemsData.get(position))
                .noFade()
                .resize(IMAGE_SIZE, IMAGE_SIZE)
                .centerCrop()
                .into(viewHolder.imgViewIcon);
        viewHolder.imgViewIcon.setTag(position);
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
