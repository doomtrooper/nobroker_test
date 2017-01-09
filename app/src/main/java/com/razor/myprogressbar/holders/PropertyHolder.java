package com.razor.myprogressbar.holders;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.razor.myprogressbar.R;
import com.squareup.picasso.Picasso;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by kuliza-265 on 8/1/17.
 */

public class PropertyHolder extends RecyclerView.ViewHolder {


    @Bind(R.id.property_title)
    TextView propertyTitleTv;
    @Bind(R.id.property_address)
    TextView propertyAddressTv;
    @Bind(R.id.property_price)
    TextView propertyPriceTv;
    @Bind(R.id.funished)
    TextView funishedTv;
    @Bind(R.id.bathrooms)
    TextView bathroomsTv;
    @Bind(R.id.property_area)
    TextView propertyAreaTv;
    @Bind(R.id.property_image)
    ImageView propertyImage;

    private Context mContext;

    public PropertyHolder(View restaurantView, Context context) {
        super(restaurantView);
        ButterKnife.bind(this,restaurantView);
        mContext = context;
    }
    public void setPropertyTitle(String propertyTitle){
        propertyTitleTv.setText(propertyTitle);
    }

    public void setPropertyAddress(String propertyAddress){
        propertyAddressTv.setText(propertyAddress);
    }

    public void setPropertyPriceTv(String propertyPrice){
        propertyPriceTv.setText(propertyPrice);
    }

    public void setPropertyFurnishedTv(String furnished){
        funishedTv.setText(furnished);
    }

    public void setBathroomTv(String bathroom){
        bathroomsTv.setText(bathroom);
    }

    public void setPropertyAreaTv(String area){
        propertyAreaTv.setText(area);
    }

    public void setPropertyImage(String imageurl){
        Picasso.with(mContext).load(imageurl).placeholder(R.drawable.ic_live_tv_black_48dp).error(R.drawable.ic_terrain_red_300_48dp).into(propertyImage);
    }
}
