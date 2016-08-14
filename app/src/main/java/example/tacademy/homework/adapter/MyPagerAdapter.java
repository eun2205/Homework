package example.tacademy.homework.adapter;

import android.support.v4.view.PagerAdapter;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016-08-15.
 */
public class MyPagerAdapter extends PagerAdapter {
    List<String > items = new ArrayList<>();



    public MyPagerAdapter(List<String> items) {
        this.items = items;
    }


    public void add(String text) {
        items.add(text);
        notifyDataSetChanged();
    }


    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return false;
    }
}
