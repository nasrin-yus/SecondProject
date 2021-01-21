package com.example.secondproject;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;

public class VazirTextView extends AppCompatTextView {
    public VazirTextView(Context context) {
        super(context);
    }

    public VazirTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        Typeface typeface=Typeface.createFromAsset(context.getAssets(),"Vazir.ttf");
        this.setTypeface(typeface);
    }
}
