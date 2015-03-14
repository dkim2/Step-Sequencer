package edu.dkim2macalester.stepsequencer;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.GridView;

/**
 * Created by Austin_Kim on 3/7/2015.
 */
public class MyGridView  extends GridView {

    public MyGridView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyGridView(Context context) {
        super(context);
    }

    public MyGridView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, widthMeasureSpec);
    }
}