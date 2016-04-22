package com.example.user.adapter;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.user.firstprogram.R;

import java.util.List;

/**
 * Created by User on 21.04.2016.
 */
public class AdapterRecyclerTab extends RecyclerView.Adapter<AdapterRecyclerTab.ViewHolder> {

    private List<String> mDataset;


    public AdapterRecyclerTab(List<String> mDataset){
        this.mDataset = mDataset;
    }

    @Override
    public AdapterRecyclerTab.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recycler_layout_demo, parent, false);

        ViewHolder viewHolder = new ViewHolder(view);


        return viewHolder;
    }



    public class ViewHolder extends RecyclerView.ViewHolder{
        public TextView mTextView;
        public ViewHolder(View itemView) {
            super(itemView);
            mTextView = (TextView) itemView.findViewById(R.id.text_recyclerview);
            Log.w("Kulynych" , "viewHolder");
        }
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.mTextView.setText(mDataset.get(position));
        Log.w("Kulynych", String.format("onBind %d", position));
    }

    @Override
    public int getItemCount() {
        return mDataset.size();
    }


}
