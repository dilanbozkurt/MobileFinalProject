package com.example.project;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;
///ÇİLEM EMRE///

public class slideAdapterBroken extends PagerAdapter {
    Context context;
    LayoutInflater inflater;

    public int[] list_images={
            R.drawable.broken1,
            R.drawable.broken2
    };

    //list of titles
    public String[] list_title={
            "STEP 1",
            "STEP 2"
    };

    public String[] list_description={
            "Help the casualty support the\n" +
                    "affected part at the joints above\n" +
                    "and below the injury, in the most\n" +
                    "comfortable position.\n",
            "Place padding, such as towels\n" +
                    "or cushions, around the affected\n" +
                    "part to support it.\n"
    };


    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view=inflater.inflate(R.layout.slide,container,false);
        LinearLayout layoutSlide=view.findViewById(R.id.slideLinearLayout);
        ImageView imgSlide=(ImageView) view.findViewById(R.id.slideImg);
        TextView textTitle=view.findViewById(R.id.textTitle);
        TextView description=view.findViewById(R.id.description);
        //layoutSlide.setBackgroundColor(list_background[position]);
        imgSlide.setImageResource(list_images[position]);
        textTitle.setText(list_title[position]);
        description.setText((list_description[position]));
        container.addView(view);
        return view;

    }

    public int[] list_background={
            R.drawable.mavi6,
            R.drawable.mavi6
    };

    public slideAdapterBroken(Context context){
        this.context=context;
    }
    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((LinearLayout)object);
    }

    @Override
    public int getCount() {
        return list_title.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return (view==(LinearLayout)object);
    }
}
