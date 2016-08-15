package example.tacademy.homework.widget;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import example.tacademy.homework.R;

/**
 * Created by Administrator on 2016-08-15.
 */
public class HelloViewHolder extends RecyclerView.ViewHolder {
    private static final String TAG = "HelloViewHolder";
    TextView nameView, nextView;
    public HelloViewHolder(View itemView) {
        super(itemView);
        nameView = (TextView)itemView.findViewById(R.id.text_name);
        nextView = (TextView)itemView.findViewById(R.id.text_next);
    }
}
