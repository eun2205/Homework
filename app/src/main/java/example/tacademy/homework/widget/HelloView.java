package example.tacademy.homework.widget;

import android.content.Context;
import android.widget.FrameLayout;

import example.tacademy.homework.R;

/**
 * Created by Administrator on 2016-08-15.
 */
public class HelloView extends FrameLayout {
    public HelloView(Context context) {
        super(context);
        init();
    }

    private void init() {
        inflate(getContext(), R.layout.view_hello, this);
    }

//    public HelloView(Context context, AttributeSet attrs) {
//        super(context, attrs);
//    }


}
