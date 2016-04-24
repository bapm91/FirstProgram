package com.example.user.fragment;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.support.v4.app.Fragment;
import android.view.View;

public class AbstractTabFragment extends Fragment {

    protected String title;
    protected Context context;
    protected View mView;

    public void setTitle(String title) {
        this.title = title;
    }

    public class CardsModel extends Drawable {
        public String header;
        public String adress;
        public String date;
        public String days;
        public String likes;
        public int cardIcon;

        CardsModel(String header, String adress, String date, String days, String likes, int cardIcon) {
            this.header = header;
            this.adress = adress;
            this.date = date;
            this.days = days;
            this.likes = likes;
            this.cardIcon = cardIcon;
        }

        @Override
        public void draw(Canvas canvas) {

        }

        @Override
        public void setAlpha(int alpha) {

        }

        @Override
        public void setColorFilter(ColorFilter colorFilter) {

        }

        @Override
        public int getOpacity() {
            return 0;
        }
    }

    public String getTitle() {
        return title;
    }
}
