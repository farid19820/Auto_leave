package com.example.autoleave;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.res.ResourcesCompat;

public class MyTextView extends AppCompatTextView {
    private int myFont = R.font.cairoregular ;
    private int myColor = R.color.textColor;
    public MyTextView(@NonNull Context context) {
        super(context);
        init(context);
    }

    public MyTextView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        TypedArray typedArray = getContext().obtainStyledAttributes(attrs, R.styleable.MyTextView);
        myFont = typedArray.getResourceId(R.styleable.MyTextView_myFont, R.font.cairoregular);
        myColor = typedArray.getResourceId(R.styleable.MyTextView_myColor, R.color.textColor);

        typedArray.recycle();
        init(context);
    }

    public MyTextView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }
    private void init(Context context){
        setTextColor(context.getResources().getColor(myColor));
        Typeface typeface = ResourcesCompat.getFont(context , myFont);
        setTypeface(typeface);

    }
}
