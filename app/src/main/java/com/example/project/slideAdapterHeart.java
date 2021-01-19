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

public class slideAdapterHeart extends PagerAdapter {
    Context context;
    LayoutInflater inflater;

    public int[] list_images={
            R.drawable.kalp1,
            R.drawable.kalp2,
            R.drawable.kalp3,
            R.drawable.kalp4,
            R.drawable.kalp5
    };

    //list of titles
    public String[] list_title={
            "STEP 1",
            "STEP 2",
            "STEP 3",
            "STEP 4",
            "STEP 5"
    };

    public String[] list_description={
            "Check for a response. Gently shake the casualty’s shoulders,and talk to him. Assess breathing;if casualty is not breathing or only gasping, go to the next step.",
            "Kneel level with the casualty's chest. Put one hand on the center of the chest and the heel of your other hand on top; interlock your fingers. Depress chest at least 2 in(5 cm), and release but keep your hands in place. Do compressions at a rate of 100 per minute.",
            "Give chest compressions until emergency help arrives; the casualty shows signs of regaining consciousness, such as coughing, opening his eyes, speaking, or moving purposefully, and starts to breathe normally; or you are too exhausted to continue.",
            "Maintaining head tilt and chin lift,take your mouth away from the casualty’s. Look along the chest and watch it fall. Repeat to give TWO rescue breaths. Repeat 30 chest compressions followed by TWO rescue breaths.",
            "Continue CPR until emergency help arrives, the casualty starts to breathe normally, or you are too exhausted to continue. If you are unwilling or unable to give rescue breaths, you can give chest compressions alone (below)."
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
            R.drawable.mavi6,
            R.drawable.mavi6

    };

    public slideAdapterHeart(Context context){
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
