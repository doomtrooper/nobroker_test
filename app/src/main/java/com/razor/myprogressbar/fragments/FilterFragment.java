package com.razor.myprogressbar.fragments;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.razor.myprogressbar.Constants;
import com.razor.myprogressbar.R;
import com.razor.myprogressbar.view.PredicateLayout;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link OnFragmentInteractionListener} interface
 * to handle interaction events.
 */
public class FilterFragment extends Fragment {

    public static final String TAG = FilterFragment.class.getSimpleName();
    @Bind(R.id.apartment_container)
    PredicateLayout apartmentContainer;
    @Bind(R.id.property_container)
    PredicateLayout propertyContainer;
    @Bind(R.id.furnished_container)
    PredicateLayout furnishedContainer;
    private OnFragmentInteractionListener mListener;
    private ArrayList<String> propertyType;
    private ArrayList<String> buildingType;
    private ArrayList<String> furnishingType;

    public FilterFragment() {
        // Required empty public constructor
    }

    @OnClick(R.id.clear_filter)
    void onClearClick(){
        propertyType.clear();
        buildingType.clear();
        furnishingType.clear();
        setFilterView();
    }

    @OnClick({R.id.bhk2, R.id.bhk3, R.id.bhk4})
    public void onPropertyTypeClicked(TextView textView) {
        textView.setTextColor(propertyType.contains((String) textView.getTag()) ? getResources().getColor(R.color.grey) : getResources().getColor(R.color.colorPrimary));
        addOrRemoveItem(propertyType, (String) textView.getTag());

    }

    @OnClick({R.id.furnished_full, R.id.furnished_semi})
    public void onFurnishingTypeClicked(TextView textView) {
        textView.setTextColor(furnishingType.contains((String) textView.getTag()) ? getResources().getColor(R.color.grey) : getResources().getColor(R.color.colorPrimary));
        addOrRemoveItem(furnishingType, (String) textView.getTag());
    }

    @OnClick({R.id.ap, R.id.ih, R.id.ifh})
    public void onBuildingTypeClicked(TextView textView) {
        textView.setTextColor(buildingType.contains((String) textView.getTag()) ? getResources().getColor(R.color.grey) : getResources().getColor(R.color.colorPrimary));
        addOrRemoveItem(buildingType, (String) textView.getTag());
    }

    private void addOrRemoveItem(ArrayList<String> list, String key) {
        if (list.contains(key)) {
            list.remove(key);
        } else {
            list.add(key);
        }
    }

    @OnClick(R.id.apply_filter)
    public void onFilterAppplied() {
        mListener.applyFilters(propertyType, buildingType, furnishingType);
    }

    public static FilterFragment newInstance() {
        return new FilterFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            propertyType = getArguments().getStringArrayList(Constants.PropertyType);
            buildingType = getArguments().getStringArrayList(Constants.BuildingType);
            furnishingType = getArguments().getStringArrayList(Constants.FurnishingType);
        }
        if (propertyType == null) propertyType = new ArrayList<>();
        if (buildingType == null) buildingType = new ArrayList<>();
        if (furnishingType == null) furnishingType = new ArrayList<>();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.filter_dialgue_layout, container, false);
        ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setFilterView();
    }

    private void setFilterView() {
        for (int i=0;i<apartmentContainer.getChildCount();i++){
            if (propertyType.contains(((TextView)apartmentContainer.getChildAt(i)).getTag())){
                ((TextView)apartmentContainer.getChildAt(i)).setTextColor(getResources().getColor(R.color.colorPrimary));
            }else {
                ((TextView)apartmentContainer.getChildAt(i)).setTextColor(getResources().getColor(R.color.grey));
            }
        }
        for (int i=0;i<propertyContainer.getChildCount();i++){
            if (buildingType.contains(((TextView)propertyContainer.getChildAt(i)).getTag())){
                ((TextView)propertyContainer.getChildAt(i)).setTextColor(getResources().getColor(R.color.colorPrimary));
            }else {
                ((TextView)propertyContainer.getChildAt(i)).setTextColor(getResources().getColor(R.color.grey));
            }
        }
        for (int i=0;i<furnishedContainer.getChildCount();i++){
            if (furnishingType.contains(((TextView)furnishedContainer.getChildAt(i)).getTag())){
                ((TextView)furnishedContainer.getChildAt(i)).setTextColor(getResources().getColor(R.color.colorPrimary));
            }else {
                ((TextView)furnishedContainer.getChildAt(i)).setTextColor(getResources().getColor(R.color.grey));
            }
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }

    public interface OnFragmentInteractionListener {
        void applyFilters(ArrayList<String> propertyType, ArrayList<String> buildingType, ArrayList<String> furnishingType);
    }
}
