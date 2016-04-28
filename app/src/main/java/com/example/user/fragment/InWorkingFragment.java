package com.example.user.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.user.adapter.RecyclerTabAdapter;
import com.example.user.cardsModel.CardsModel;
import com.example.user.firstprogram.R;
import com.melnykov.fab.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

public class InWorkingFragment extends Fragment {
    private View mView;

    public static InWorkingFragment getInstance(Context context) {
        Bundle args = new Bundle();
        InWorkingFragment fragment = new InWorkingFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mView = inflater.inflate(R.layout.fragment_in_working, container, false);
        List<CardsModel> dataset =  new ArrayList<>();
        dataset.add(new CardsModel("Комунальне господарство", "вул.Б.Кротова,22,Дніпропетровськ", "13.12.12", "7 днів", "1", R.mipmap.ic_flight_takeoff_black_24dp));
        dataset.add(new CardsModel("Благоустрій та будівництво", "Дніпропетровськ,вулиця Олеся Гончара", "25.06.13", "6 днів", "3", R.mipmap.ic_shopping_cart_black_24dp));
        dataset.add(new CardsModel("1Благоустрій та будівництво", "Дніпропетровськ,проспект Богдана Хмельницького", "11.09.91", "6 днів", "3", R.mipmap.ic_swap_horiz_black_24dp));
        dataset.add(new CardsModel("2Благоустрій та будівництво", "Дніпропетровськ,проспект Карла Маркса", "13.12.12", "5 днів", "6", R.mipmap.ic_timeline_black_24dp));
        dataset.add(new CardsModel("3Благоустрій та будівництво", "Дніпропетровськ,узвіз Крутогірний", "13.12.12", "5 днів", "2", R.mipmap.ic_warning_black_24dp));
        dataset.add(new CardsModel("Комунальне господарство", "вул.Б.Кротова,22,Дніпропетровськ", "13.12.12", "7 днів", "1", R.mipmap.ic_flight_takeoff_black_24dp));
        dataset.add(new CardsModel("Благоустрій та будівництво", "Дніпропетровськ,вулиця Олеся Гончара", "25.06.13", "6 днів", "3", R.mipmap.ic_shopping_cart_black_24dp));
        dataset.add(new CardsModel("1Благоустрій та будівництво", "Дніпропетровськ,проспект Богдана Хмельницького", "11.09.91", "6 днів", "3", R.mipmap.ic_swap_horiz_black_24dp));
        dataset.add(new CardsModel("2Благоустрій та будівництво", "Дніпропетровськ,проспект Карла Маркса", "13.12.12", "5 днів", "6", R.mipmap.ic_timeline_black_24dp));
        dataset.add(new CardsModel("3Благоустрій та будівництво", "Дніпропетровськ,узвіз Крутогірний", "13.12.12", "5 днів", "2", R.mipmap.ic_warning_black_24dp));
        dataset.add(new CardsModel("Комунальне господарство", "вул.Б.Кротова,22,Дніпропетровськ", "13.12.12", "7 днів", "1", R.mipmap.ic_flight_takeoff_black_24dp));
        dataset.add(new CardsModel("Благоустрій та будівництво", "Дніпропетровськ,вулиця Олеся Гончара", "25.06.13", "6 днів", "3", R.mipmap.ic_shopping_cart_black_24dp));
        dataset.add(new CardsModel("1Благоустрій та будівництво", "Дніпропетровськ,проспект Богдана Хмельницького", "11.09.91", "6 днів", "3", R.mipmap.ic_swap_horiz_black_24dp));
        dataset.add(new CardsModel("2Благоустрій та будівництво", "Дніпропетровськ,проспект Карла Маркса", "13.12.12", "5 днів", "6", R.mipmap.ic_timeline_black_24dp));
        dataset.add(new CardsModel("3Благоустрій та будівництво", "Дніпропетровськ,узвіз Крутогірний", "13.12.12", "5 днів", "2", R.mipmap.ic_warning_black_24dp));

        RecyclerView recyclerView  = (RecyclerView) mView.findViewById(R.id.recycler_tab_in_working);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(new RecyclerTabAdapter(dataset));
        recyclerView.setHasFixedSize(true);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        FloatingActionButton fab = (FloatingActionButton) mView.findViewById(R.id.fab);
        fab.attachToRecyclerView(recyclerView);

        return mView;
    }
}
