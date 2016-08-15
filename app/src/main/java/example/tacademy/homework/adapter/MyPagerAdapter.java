package example.tacademy.homework.adapter;

import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import example.tacademy.homework.R;

/**
 * Created by Administrator on 2016-08-15.
 */
public class MyPagerAdapter extends PagerAdapter {
//    int[] flag;
    ImageView flagView;
    LayoutInflater inflater;
    int[] flag;

    public MyPagerAdapter(ImageView flagView) {
        this.flagView = flagView;
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == ((RelativeLayout)object);
    }

    @Override
    public Object instantiateItem(View container, int position) {
        ImageView flagView;

      View view = inflater.inflate(R.layout.viewpager_item, (ViewGroup) container, false);
        flagView=(ImageView)view.findViewById(R.id.image_flag);
        flagView.setImageResource(flag[position]);
        ((ViewPager) container).addView(view);
        return view;
    }
}