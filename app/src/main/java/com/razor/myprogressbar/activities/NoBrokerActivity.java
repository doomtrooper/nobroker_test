package com.razor.myprogressbar.activities;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.razor.myprogressbar.Constants;
import com.razor.myprogressbar.R;
import com.razor.myprogressbar.fragments.BlankFragment;
import com.razor.myprogressbar.fragments.FilterFragment;
import com.razor.myprogressbar.fragments.PropertyListFragment;

import java.util.ArrayList;

public class NoBrokerActivity extends AppCompatActivity implements FragmentManager.OnBackStackChangedListener,PropertyListFragment.OnFragmentInteraction,FilterFragment.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_no_broker);
        //setPropertyListFragment();
        getFragmentManager().addOnBackStackChangedListener(this);
        FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
        /*getFragmentManager().beginTransaction().add(R.id.main_container,PropertyListFragment.newInstance()).addToBackStack(null)
                            .add(R.id.main_container, BlankFragment.newInstance("dfghj","fghj")).addToBackStack(null)
                            .add(R.id.main_container,PropertyListFragment.newInstance()).addToBackStack(null)
                            .add(R.id.main_container, BlankFragment.newInstance("dfghj","fghj")).addToBackStack(null)
                            .commit();*/
        Log.d("activity","Back Stack count: "+getFragmentManager().getBackStackEntryCount());
        getFragmentManager().beginTransaction().add(R.id.main_container,PropertyListFragment.newInstance()).addToBackStack(null).commit();
        getFragmentManager().beginTransaction().add(R.id.main_container, BlankFragment.newInstance("asdf3","qwer3")).addToBackStack(null).commit();
        getFragmentManager().beginTransaction().add(R.id.main_container,PropertyListFragment.newInstance()).addToBackStack(null).commit();
        getFragmentManager().beginTransaction().add(R.id.main_container, BlankFragment.newInstance("asdf4","qwer4")).addToBackStack(null).commit();
        getFragmentManager().beginTransaction().add(R.id.main_container,BlankFragment.newInstance("asdf5","qwer5")).addToBackStack(null).commit();
    }

    private void setPropertyListFragment() {
        PropertyListFragment propertyFrag = (PropertyListFragment)getFragmentManager().findFragmentByTag(PropertyListFragment.TAG);
        if (propertyFrag==null){
            propertyFrag = PropertyListFragment.newInstance();
        }
        getFragmentManager().beginTransaction().addToBackStack(null).replace(R.id.main_container, propertyFrag, PropertyListFragment.TAG).commit();
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Log.d("asdfghj","cancel clicked");
        PropertyListFragment propertyFrag = (PropertyListFragment)getFragmentManager().findFragmentByTag(PropertyListFragment.TAG);
        if (propertyFrag!=null){
            propertyFrag.cancelApiCall();
        }
    }

    @Override
    public void onBackPressed() {
        Log.d("activity","Back Stack count: "+getFragmentManager().getBackStackEntryCount());
        super.onBackPressed();
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

    @Override
    public void onBackStackChanged() {
        Log.d("activity","Back Stack count listener: "+getFragmentManager().getBackStackEntryCount());
    }
}
