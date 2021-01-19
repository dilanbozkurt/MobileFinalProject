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

public class slideAdapterBurning extends PagerAdapter {
    Context context;
    LayoutInflater inflater;

    public int[] list_images={
            R.drawable.burning1,
            R.drawable.burning1,
            R.drawable.burning2,
            R.drawable.burning3
    };

    //list of titles
    public String[] list_title={
            "STEP 1",
            "STEP 2",
            "STEP 3",
            "STEP 4"
    };

    public String[] list_description={
            "Start cooling the burn as soon as possible after the injury occurred. Flood the burn with plenty of cool tap water, but do not delay removal of the casualty to the hospital. Help the casualty sit or lie down. If possible, try to prevent the burned area from coming into contact with the ground.Call 112.",
            "Continue cooling the affected area for at least ten minutes, or\n" +
                    "until the pain is relieved. Watch for signs of breathing difficulty.\n" +
                    "Do not overcool the casualty because you may lower the body\n" +
                    "temperature to a dangerous level. This is a particular hazard for babies\n" +
                    "and elderly people.",
            "Do not touch or otherwise interfere with the burn. Gently\n" +
                    "remove rings, watches, belts, shoes, and burned or or smoldering\n" +
                    "clothing before the tissues begin to swell. A helper can do this while\n" +
                    "you are cooling the burn. Do not remove clothing that is stuck to\n" +
                    "the burn.",
            "When the burn is cooled, cover the injured area with plastic wrap to protect it from infection. Discard the first two turns from the roll and then wrap it lengthwise over the burn. A clean plastic bag or a sterile nonstick dressing can be used to cover a hand or foot ; secure it with a bandage or adhesive tape applied over the plastic."
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
            R.drawable.mavi6,
            R.drawable.mavi6,
            R.drawable.mavi6
    };

    public slideAdapterBurning(Context context){
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
