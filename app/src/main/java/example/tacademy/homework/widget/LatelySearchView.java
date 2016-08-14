package example.tacademy.homework.widget;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.widget.FrameLayout;

import example.tacademy.homework.R;
import example.tacademy.homework.adapter.MyPagerAdapter;

/**
 * Created by Administrator on 2016-08-15.
 */
public class LatelySearchView extends FrameLayout{
    ViewPager pager;
    MyPagerAdapter mAdapter;

//    public ViewPager getPager() {
//        pager.setTe
//        return pager;
//    }
//
//    public void setPager(ViewPager pager) {
//        this.pager = pager;
//        pager.
//    }

    public LatelySearchView(Context context) {
        super(context);
        init();


        mAdapter = new MyPagerAdapter(null);
        pager.setAdapter(mAdapter);


        pager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        initData();

    }

    private void initData() {
        for (int i = 0; i < 2; i++) {
            mAdapter.add("item " + i);
        }
    }

    private void init() {
        inflate(getContext(), R.layout.view_lately_search, this);
        pager = (ViewPager)findViewById(R.id.pager);

    }
}
