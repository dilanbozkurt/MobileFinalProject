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

public class slideAdapterShock extends PagerAdapter {
    Context context;
    LayoutInflater inflater;

    public int[] list_images={
            R.drawable.shock1,
            R.drawable.shock2,
            R.drawable.shock3,
            R.drawable.shock4

    };

    //list of titles
    public String[] list_title={
            "STEP 1",
            "STEP 2",
            "STEP 3",
            "STEP 4"
    };

    public String[] list_description={
            "Treat any possible cause of shock that you can detect, such as severe bleeding or serious burns. Reassure the casualty. Help the casualty lie down—on a rug or blanket if there is one, because this will protect him from the cold. Raise and support his legs above the level of his heart to improve blood supply to the vital organs.",
            "Call 112 for emergency help. Tell the dispatcher that you suspect shock. Loosen tight clothing to reduce constriction at the neck, chest, and waist.",
            "Keep the casualty warm by covering his body and legs with coats or blankets. ",
            "Monitor and record vital signs—level of response, breathing, and pulse while waiting for help to arrive."
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

    public slideAdapterShock(Context context){
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
