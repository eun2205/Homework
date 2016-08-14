package example.tacademy.homework.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

import example.tacademy.homework.R;

/**
 * Created by Administrator on 2016-08-15.
 */
public class InvitationView extends FrameLayout {
    public InvitationView(Context context) {
        super(context);
        init();
    }

    public InvitationView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    private void init() {
        inflate(getContext(), R.layout.view_invitation, this);
    }
}
