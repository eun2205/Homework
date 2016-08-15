package example.tacademy.homework.widget;

import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import example.tacademy.homework.R;

/**
 * Created by Administrator on 2016-08-15.
 */
public class LatelySearchViewHolder extends RecyclerView.ViewHolder{
    TextView textView;
    ViewPager pager;

    public LatelySearchViewHolder(View itemView) {
        super(itemView);
        textView = (TextView)itemView.findViewById(R.id.textView9);
        pager=(ViewPager)itemView.findViewById(R.id.pager);
    }
}
