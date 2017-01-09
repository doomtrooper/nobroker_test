package com.razor.myprogressbar.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.razor.myprogressbar.R;
import com.razor.myprogressbar.Utility;
import com.razor.myprogressbar.holders.PropertyHolder;
import com.razor.myprogressbar.models.Datum;

import java.util.ArrayList;

/**
 * Created by kuliza-265 on 8/1/17.
 */

public class PropertyAdapter extends RecyclerView.Adapter<PropertyHolder> {

    private ArrayList<Datum> propertyList;
    private Context mContext;

    public PropertyAdapter(ArrayList<Datum> propertyList, Context context) {
        this.propertyList = propertyList;
        this.mContext = context;
    }

    @Override
    public PropertyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View restaurantView = LayoutInflater.from(parent.getContext()).inflate(R.layout.nobroker_row_layout, parent, false);
        return new PropertyHolder(restaurantView,mContext);
    }

    @Override
    public void onBindViewHolder(PropertyHolder holder, int position) {
        holder.setPropertyTitle(propertyList.get(position).getPropertyTitle());
        holder.setPropertyAddress("at "+propertyList.get(position).getLocality()+", "+propertyList.get(position).getStreet());
        holder.setPropertyPriceTv(mContext.getString(R.string.rupee_symbol)+String.valueOf(propertyList.get(position).getRent()));
        holder.setPropertyFurnishedTv(propertyList.get(position).getFurnishingDesc()+" Furnished");
        holder.setBathroomTv(propertyList.get(position).getBathroom()+" Bathrooms");
        holder.setPropertyImage(Utility.parseImageUrl(propertyList.get(position).getPhotos()));
    }

    @Override
    public int getItemCount() {
        return propertyList==null?0:propertyList.size();
    }

    public void addItems(ArrayList<Datum> propertyList){
        for (Datum datum:propertyList){
            this.propertyList.add(datum);
            notifyItemInserted(propertyList.size()-1);
        }
    }

    public void addItems(Datum datum){
        propertyList.add(datum);
        notifyItemInserted(propertyList.size()-1);
    }

    public ArrayList<Datum> getItems() {
        return propertyList;
    }

    public void setData(ArrayList<Datum> propertyList) {
        this.propertyList = propertyList;
        notifyDataSetChanged();
    }
}
