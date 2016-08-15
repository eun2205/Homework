package example.tacademy.homework.widget;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.widget.FrameLayout;

import example.tacademy.homework.R;
import example.tacademy.homework.adapter.MyPagerAdapter;

/**
 * Created by Administrator on 2016-08-15.
 */
public class CityViewHolder extends FrameLayout {
    ViewPager pager;
    MyPagerAdapter mAdapter;
    int[] flag;

    public CityViewHolder(Context context) {
        super(context);
        init();
    }



    public CityViewHolder(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }


    private void init() {
        inflate(getContext(), R.layout.view_city, this);
        flag = new int[]{R.drawable.sample_seoul, R.drawable.sample_paris, R.drawable.sample_dubro};

        pager=(ViewPager)findViewById(R.id.pager);
        mAdapter = new MyPagerAdapter(null);
        pager.setAdapter(mAdapter);
    }
}
