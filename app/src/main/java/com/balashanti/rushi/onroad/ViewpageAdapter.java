package com.balashanti.rushi.onroad;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by Rushikesh Kotule on 19-Feb-18.
 */

public class ViewpageAdapter extends PagerAdapter {

    Context context;
    LayoutInflater layoutInflater;
    Integer [] images = {R.drawable.bus1, R.drawable.bus2, R.drawable.bus3};

    public ViewpageAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.swipe_layout,container,false);
        ImageView imageView = (ImageView) view.findViewById(R.id.image_view);
        imageView.setImageResource(images[position]);

        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        ViewPager vp = (ViewPager) container;
        View view =(View)object;
        vp.removeView(view);
    }
}
