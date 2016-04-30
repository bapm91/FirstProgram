package com.example.user.adapter;

import android.content.Intent;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.user.firstprogram.OnePageActivity;
import com.example.user.firstprogram.R;
import com.example.user.cardsModel.CardsModel;

import java.util.List;

public class ListViewAdapter extends BaseAdapter {
    private List<CardsModel> mCardsModelList;

    public ListViewAdapter(List<CardsModel> mCardsModelList) {
        this.mCardsModelList = mCardsModelList;
    }

    static class ViewHolder {
        TextView mTextViewHeader;
        TextView mTextViewLikes;
        TextView mTextViewDate;
        TextView mTextViewDays;
        TextView mTextViewAddress;
        ImageView mCardIcon;
    }

    @Override
    public CardsModel getItem(int position) {
        return mCardsModelList.get(position);
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        View view = convertView;
        if (view == null) {
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_layout, parent, false);
            viewHolder = new ViewHolder();
            viewHolder.mTextViewHeader = (TextView) view.findViewById(R.id.mTitle);
            viewHolder.mTextViewLikes = (TextView) view.findViewById(R.id.card_likes);
            viewHolder.mTextViewDays = (TextView) view.findViewById(R.id.card_days);
            viewHolder.mTextViewDate = (TextView) view.findViewById(R.id.card_date);
            viewHolder.mTextViewAddress = (TextView) view.findViewById(R.id.card_street);
            viewHolder.mCardIcon = (ImageView) view.findViewById(R.id.card_icon);
            view.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) view.getTag();
        }

        CardsModel cardsModel = getCardModel(position);

        viewHolder.mTextViewHeader.setText(cardsModel.getHeader());
        viewHolder.mTextViewDate.setText(cardsModel.getDate());
        viewHolder.mTextViewDays.setText(cardsModel.getDays());
        viewHolder.mTextViewAddress.setText(cardsModel.getAddress());
        viewHolder.mTextViewLikes.setText(cardsModel.getLikes());
        viewHolder.mCardIcon.setImageResource(cardsModel.getCardIcon());

        CardView cardView = (CardView) view.findViewById(R.id.card_view);

        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), OnePageActivity.class);
                intent.putExtra("position", position);
                view.getContext().startActivity(intent);
            }
        });
        return view;
    }

    private CardsModel getCardModel(int position) {
        return getItem(position);
    }

    @Override
    public int getCount() {
        return mCardsModelList.size();
    }

    @Override
    public long getItemId(int position) {
        return position;
    }
}
