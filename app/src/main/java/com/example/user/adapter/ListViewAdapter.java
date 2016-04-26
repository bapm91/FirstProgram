package com.example.user.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.user.firstprogram.R;
import com.example.user.fragment.AbstractTabFragment;

import java.util.List;

public class ListViewAdapter extends BaseAdapter{
    private List<AbstractTabFragment.CardsModel> mList;

    public ListViewAdapter( List<AbstractTabFragment.CardsModel> mList) {
        this.mList = mList;
    }

    @Override
    public int getCount() {
        return mList.size();
    }

    @Override
    public Object getItem(int position) {
        return mList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        if (view == null){
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_layout,parent, false);
        }

        AbstractTabFragment.CardsModel cardsModel = getCardModel(position);

        ((TextView) view.findViewById(R.id.title)).setText(cardsModel.header);
        ((TextView) view.findViewById(R.id.card_date)).setText(cardsModel.date);
        ((TextView) view.findViewById(R.id.card_days)).setText(cardsModel.days);
        ((TextView) view.findViewById(R.id.card_street)).setText(cardsModel.adress);
        ((TextView) view.findViewById(R.id.card_likes)).setText(cardsModel.likes);
        ((ImageView) view.findViewById(R.id.card_icon)).setImageResource(cardsModel.cardIcon);

        //CardView cardView = (CardView) view.findViewById(R.id.card_view);


        return view;
    }

    private AbstractTabFragment.CardsModel getCardModel(int position) {
        return ((AbstractTabFragment.CardsModel) getItem(position));
    }
}
