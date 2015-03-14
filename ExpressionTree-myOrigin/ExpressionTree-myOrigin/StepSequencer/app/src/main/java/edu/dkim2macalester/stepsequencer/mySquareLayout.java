package edu.dkim2macalester.stepsequencer;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;

/**
 * Created by Austin_Kim on 3/9/2015.
 */
public class mySquareLayout extends LinearLayout{
    private LinearLayout squareLayout;

    public mySquareLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public mySquareLayout(Context context) {
        super(context);
    }

    public mySquareLayout(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        LayoutInflater.from(context).inflate(R.layout.main_activity_layout,  this);
        squareLayout = (LinearLayout) findViewById(R.id.squareLayout);

    }

    @Override
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {

        super.onMeasure(heightMeasureSpec, heightMeasureSpec);
    }

}
