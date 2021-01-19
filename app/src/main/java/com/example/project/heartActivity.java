package com.example.project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.text.Html;
import android.widget.LinearLayout;
import android.widget.TextView;
///ÇİLEM EMRE///

public class heartActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private slideAdapterHeart myAdapter;
    private TextView[] mDots;
    private LinearLayout dotsLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heart);

        viewPager=findViewById(R.id.viewPages);
        myAdapter=new slideAdapterHeart(this);
        viewPager.setAdapter(myAdapter);
        dotsLayout=(LinearLayout) findViewById(R.id.dotsLayout);
        addDotsIndicator(0);
        viewPager.addOnPageChangeListener(viewListener);
    }

    public void addDotsIndicator(int position){
        mDots=new TextView[5];
        dotsLayout.removeAllViews();


        for(int i=0;i<mDots.length;i++){
            mDots[i]=new TextView(this);
            mDots[i].setText(Html.fromHtml("&#8226;"));
            mDots[i].setTextSize(35);
            mDots[i].setTextColor(getResources().getColor(R.color.transparentWhite));

            dotsLayout.addView(mDots[i]);
        }
        if(mDots.length>0){
            mDots[position].setTextColor(getResources().getColor(R.color.White));
        }
    }
    ViewPager.OnPageChangeListener viewListener=new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

        }

        @Override
        public void onPageSelected(int i) {
            addDotsIndicator(i);
        }

        @Override
        public void onPageScrollStateChanged(int state) {

        }
    };

}
