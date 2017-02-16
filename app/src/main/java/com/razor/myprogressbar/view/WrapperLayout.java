package com.razor.myprogressbar.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

import com.razor.myprogressbar.R;

import java.util.ArrayList;

/**
 * Created by kuliza-265 on 14/1/17.
 */

public class WrapperLayout extends ViewGroup {
    private ArrayList<String> tags;

    private void initTags(ArrayList<String> tags){
        this.tags = tags;
    }

    public WrapperLayout(Context context) {
        super(context);
    }

    public WrapperLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public WrapperLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int widthMode = MeasureSpec.getMode(widthMeasureSpec);
        int widthSize = MeasureSpec.getSize(widthMeasureSpec);
        int heightMode = MeasureSpec.getMode(heightMeasureSpec);
        int heightSize = MeasureSpec.getSize(heightMeasureSpec);
        tags = new ArrayList<>();
        tags.add("asdf");
        tags.add("asssdf");
        tags.add("ert");
        tags.add("zxsdcv");
        tags.add("zxcv");
        tags.add("asdf2");
        tags.add("asssdf2");
        tags.add("ert2");
        tags.add("zxsdcv2");
        tags.add("zxcv2");
        int height = 0;
        int remainingWidth = widthSize;
        for (String tag:tags){
            TextView tagView;
            LayoutInflater inflater = (LayoutInflater)   getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            tagView = (TextView) inflater.inflate(R.layout.tagview_layout,null);
            // Measure the child.
            //measureChildWithMargins(tagView, widthMeasureSpec, 0, heightMeasureSpec, 0);
            tagView.measure(0,0);
            if (remainingWidth<=tagView.getWidth()){
                height += tagView.getMeasuredHeight();
                remainingWidth = widthSize;
            }else {
                remainingWidth -= tagView.getMeasuredWidth();
            }
        }
        setMeasuredDimension(widthSize,height);

    }

    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {

    }
}
