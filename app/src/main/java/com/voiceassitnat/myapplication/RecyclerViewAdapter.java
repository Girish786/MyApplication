package com.voiceassitnat.myapplication;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.smarteist.autoimageslider.SliderLayout;
import com.smarteist.autoimageslider.SliderView;

import java.util.List;

import me.zhanghai.android.materialratingbar.MaterialRatingBar;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewAdapter> {
    private Context context;
    public List<ProductModel> arrayList;

    public RecyclerViewAdapter(Context context, List<ProductModel> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }


    @NonNull
    @Override
    public ViewAdapter onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.row_layout, viewGroup, false);
        return new ViewAdapter(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewAdapter viewAdapter, int i) {
        setSliderViews(viewAdapter.sliderLayout);

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }


    public class ViewAdapter extends RecyclerView.ViewHolder {
        SliderLayout sliderLayout;
        TextView tv_title,tv_price,tv_rating_point;
        SliderView sliderView;
        MaterialRatingBar mRatingBar;
        public ViewAdapter(@NonNull View itemView) {
            super(itemView);
            sliderView = new SliderView(context);
            sliderLayout = itemView.findViewById(R.id.imageSlider);
            tv_title = itemView.findViewById(R.id.tv_title);
            tv_price = itemView.findViewById(R.id.tv_price);
            mRatingBar = itemView.findViewById(R.id.mRatingBar);
            tv_rating_point = itemView.findViewById(R.id.tv_rating_point);
           // sliderLayout.setIndicatorAnimation(SliderLayout.Animations.FILL); //set indicator animation by using SliderLayout.Animations. :WORM or THIN_WORM or COLOR or DROP or FILL or NONE or SCALE or SCALE_DOWN or SLIDE and SWAP!!
            sliderLayout.setScrollTimeInSec(1); //set scroll delay in seconds :
            sliderLayout.setIndicatorAnimation(SliderLayout.Animations.SCALE);
        }

        }

    private void setSliderViews(SliderLayout sliderLayout) {

        for (int i = 0; i <= 3; i++) {

            SliderView sliderView = new SliderView(context);

            switch (i) {
                case 0:
                    sliderView.setImageUrl("https://images.pexels.com/photos/547114/pexels-photo-547114.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=750&w=1260");
                    break;
                case 1:
                    sliderView.setImageUrl("https://images.pexels.com/photos/218983/pexels-photo-218983.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=750&w=1260");
                    break;
                case 2:
                    sliderView.setImageUrl("https://images.pexels.com/photos/747964/pexels-photo-747964.jpeg?auto=compress&cs=tinysrgb&h=750&w=1260");
                    break;
                case 3:
                    sliderView.setImageUrl("https://images.pexels.com/photos/929778/pexels-photo-929778.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=750&w=1260");
                    break;
            }

            sliderView.setImageScaleType(ImageView.ScaleType.CENTER_CROP);

            final int finalI = i;
            sliderView.setOnSliderClickListener(new SliderView.OnSliderClickListener() {
                @Override
                public void onSliderClick(SliderView sliderView) {
                    Toast.makeText(context, "This is slider " + (finalI + 1), Toast.LENGTH_SHORT).show();
                }
            });

            //at last add this view in your layout :
            sliderLayout.addSliderView(sliderView);
        }
    }
}
