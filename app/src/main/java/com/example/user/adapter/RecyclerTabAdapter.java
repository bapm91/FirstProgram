package com.example.user.adapter;

import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.user.firstprogram.OnePageActivity;
import com.example.user.firstprogram.R;
import com.example.user.fragment.AbstractTabFragment;

import java.util.List;

public class RecyclerTabAdapter extends RecyclerView.Adapter<RecyclerTabAdapter.ViewHolder> {
    private List<AbstractTabFragment.CardsModel> mDataset;

    public RecyclerTabAdapter(List<AbstractTabFragment.CardsModel> mDataset){
        this.mDataset = mDataset;
    }

    @Override
    public RecyclerTabAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recycler_layout, parent, false);

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
        TextView mTextViewHeader;
        TextView mTextViewLikes;
        TextView mTextViewDate;
        TextView mTextViewDays;
        TextView mTextViewAdress;
        ImageView mCardIcon;
        public ViewHolder(View itemView) {
            super(itemView);
            mCardView = (CardView) itemView.findViewById(R.id.card_view);
            mTextViewHeader = (TextView) itemView.findViewById(R.id.title);
            mTextViewDate = (TextView) itemView.findViewById(R.id.card_date);
            mTextViewDays = (TextView) itemView.findViewById(R.id.card_days);
            mTextViewAdress = (TextView) itemView.findViewById(R.id.card_street);
            mTextViewLikes = (TextView) itemView.findViewById(R.id.card_likes);
            mCardIcon = (ImageView) itemView.findViewById(R.id.card_icon);
        }
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.mTextViewHeader.setText(mDataset.get(position).header);
        holder.mTextViewDate.setText(mDataset.get(position).date);
        holder.mTextViewDays.setText(mDataset.get(position).days);
        holder.mTextViewAdress.setText(mDataset.get(position).adress);
        holder.mTextViewLikes.setText(mDataset.get(position).likes);
        holder.mCardIcon.setImageResource(mDataset.get(position).cardIcon);
        holder.mCardView.setTag(position);
    }

    @Override
    public int getItemCount() {
        return mDataset.size();
    }
}
