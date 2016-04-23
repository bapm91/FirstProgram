package com.example.user.adapter;

import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.user.firstprogram.OnePageActivity;
import com.example.user.firstprogram.R;

import java.util.List;

public class RecyclerTabAdapter extends RecyclerView.Adapter<RecyclerTabAdapter.ViewHolder> {
    private List<String> mDataset;

    public RecyclerTabAdapter(List<String> mDataset){
        this.mDataset = mDataset;
    }

    @Override
    public RecyclerTabAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recycler_layout_demo, parent, false);

        ViewHolder viewHolder = new ViewHolder(view);
        viewHolder.mCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), OnePageActivity.class);
                intent.putExtra("position", (int) view.getTag());
                view.getContext().startActivity(intent);
            }
        });
        return viewHolder;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        CardView mCardView;
        TextView mTextView;
        public ViewHolder(View itemView) {
            super(itemView);
            mCardView = (CardView) itemView.findViewById(R.id.card_view);
            mTextView = (TextView) itemView.findViewById(R.id.title);
        }
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.mTextView.setText(mDataset.get(position));
        holder.mCardView.setTag(position);
    }

    @Override
    public int getItemCount() {
        return mDataset.size();
    }
}
