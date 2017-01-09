package com.razor.myprogressbar.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.razor.myprogressbar.Constants;
import com.razor.myprogressbar.R;
import com.razor.myprogressbar.fragments.FilterFragment;
import com.razor.myprogressbar.fragments.PropertyListFragment;

import java.util.ArrayList;

public class NoBrokerActivity extends AppCompatActivity implements PropertyListFragment.OnFragmentInteraction,FilterFragment.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_no_broker);
        setPropertyListFragment();
    }

    private void setPropertyListFragment() {
        PropertyListFragment propertyFrag = (PropertyListFragment)getFragmentManager().findFragmentByTag(PropertyListFragment.TAG);
        if (propertyFrag==null){
            propertyFrag = PropertyListFragment.newInstance();
        }
        getFragmentManager().beginTransaction().addToBackStack(null).replace(R.id.main_container, propertyFrag, PropertyListFragment.TAG).commit();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        if (getFragmentManager().getBackStackEntryCount()<1){
            finish();
        }
    }

    @Override
    public void onFilterClicked(ArrayList<String> propertyType, ArrayList<String> buildingType, ArrayList<String> furnishingType) {
        FilterFragment filterFrag = (FilterFragment) getFragmentManager().findFragmentByTag(FilterFragment.TAG);
        if (filterFrag==null){
            filterFrag = FilterFragment.newInstance();
            Bundle bundle = new Bundle();
            bundle.putStringArrayList(Constants.PropertyType,propertyType);
            bundle.putStringArrayList(Constants.BuildingType,buildingType);
            bundle.putStringArrayList(Constants.FurnishingType,furnishingType);
            filterFrag.setArguments(bundle);
        }
        getFragmentManager().beginTransaction().addToBackStack(null).add(R.id.main_container, filterFrag, FilterFragment.TAG).commit();
    }

    @Override
    public void applyFilters(ArrayList<String> propertyType, ArrayList<String> buildingType, ArrayList<String> furnishingType) {
        onBackPressed();
        PropertyListFragment propertyFrag = (PropertyListFragment)getFragmentManager().findFragmentByTag(PropertyListFragment.TAG);
        if (propertyFrag != null) {
            // If article frag is available, we're in two-pane layout...
            // Call a method in the PropertyListFragment to update its content
            propertyFrag.applyFilters(propertyType,buildingType,furnishingType);
        }
    }
}
