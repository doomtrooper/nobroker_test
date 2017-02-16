package com.razor.myprogressbar.fragments;


import android.app.Fragment;
import android.app.NotificationManager;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;

import com.razor.myprogressbar.Constants;
import com.razor.myprogressbar.R;
import com.razor.myprogressbar.Utility;
import com.razor.myprogressbar.activities.NoBrokerActivity;
import com.razor.myprogressbar.adapter.PropertyAdapter;
import com.razor.myprogressbar.api.ApiClient;
import com.razor.myprogressbar.listeners.LoaderHelper;
import com.razor.myprogressbar.listeners.Predicate;
import com.razor.myprogressbar.listeners.RecyclerSearchOnScrollListener;
import com.razor.myprogressbar.models.Datum;
import com.razor.myprogressbar.models.NoBrokerResponse;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import retrofit.Call;
import retrofit.Callback;
import retrofit.Retrofit;

/**
 * A simple {@link Fragment} subclass.
 */
public class PropertyListFragment extends Fragment implements LoaderHelper{

    @Bind(R.id.my_recycler_view)
    RecyclerView mRecyclerView;
    @Bind(R.id.progress_bar)
    ProgressBar mProgressBar;
    private int mPageNumber = 1;
    private boolean isLoading;
    private Call<NoBrokerResponse> call;
    private String PAGE_NUMBER = "page_number";
    private PropertyAdapter mAdapter;

    private ArrayList<String> propertyType;
    private ArrayList<String> buildingType;
    private ArrayList<String> furnishingType;
    private ArrayList<Datum> mPropertyList;

    private int NOTIFICATION_ID;

    public static final String TAG = PropertyListFragment.class.getSimpleName();
    private OnFragmentInteraction mListener;

    public static PropertyListFragment newInstance() {
        return new PropertyListFragment();
    }

    @OnClick(R.id.fab)
    public void filterClick(){
        mListener.onFilterClicked(propertyType,buildingType,furnishingType);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPropertyList = new ArrayList<>();
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(Constants.PAGE_NUMBER,mPageNumber);
    }

    public void applyFilters(final ArrayList<String> propertyType, final ArrayList<String> buildingType, final ArrayList<String> furnishingType){
        this.propertyType = propertyType;
        this.buildingType = buildingType;
        this.furnishingType = furnishingType;
        if (furnishingType.isEmpty() && propertyType.isEmpty() && buildingType.isEmpty()) {
            mAdapter.setData(mPropertyList);
            return;
        }
        ArrayList<Datum> tempPropertyList = mPropertyList;
        if (!propertyType.isEmpty()){
            Predicate<Datum> propertyTypePredicate = new Predicate<Datum>() {
                @Override
                public boolean apply(Datum datum) {
                    return propertyType.contains(datum.getType());
                }
            };
            tempPropertyList = Utility.filter(tempPropertyList,propertyTypePredicate);
        }
        if (!buildingType.isEmpty()){
            Predicate<Datum> buildingTypePredicate = new Predicate<Datum>() {
                @Override
                public boolean apply(Datum datum) {
                    return buildingType.contains(datum.getBuildingType());
                }
            };
            tempPropertyList = Utility.filter(tempPropertyList,buildingTypePredicate);
        }
        if (!furnishingType.isEmpty()){
            Predicate<Datum> furnishingTypePredicate = new Predicate<Datum>() {
                @Override
                public boolean apply(Datum datum) {
                    return furnishingType.contains(datum.getFurnishing());
                }
            };
            tempPropertyList = Utility.filter(tempPropertyList,furnishingTypePredicate);
        }
        mAdapter.setData(tempPropertyList);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_property_list, container, false);
        ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        callApi();
    }

    private void callApi() {
        if (Utility.isNetworkAvailable(getActivity())) {
            getPropertyList();
        } else {
            showError(getString(R.string.no_network));
        }
    }

    private void initRecyclerView() {
        mAdapter = new PropertyAdapter(new ArrayList<Datum>(), getActivity());
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        mRecyclerView.setLayoutManager(layoutManager);
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.addOnScrollListener(new RecyclerSearchOnScrollListener(this, layoutManager));
    }

    private void showError(String error) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setPositiveButton(R.string.retry, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                dialog.dismiss();
                callApi();
            }
        });
        builder.setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                dialog.dismiss();
                getActivity().onBackPressed();
            }
        });
        builder.setMessage(error);
        AlertDialog dialog = builder.create();
        dialog.show();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }

    @Override
    public void loadMoreOutlets() {
        callApi();
    }

    public void getPropertyList(){
        NOTIFICATION_ID = Utility.createNotifacation(getActivity().getApplicationContext(), NoBrokerActivity.class);
        if (isLoading) return;
        isLoading = true;
        call = ApiClient.getInstance(getActivity()).getmApiService().fetchRestaurantsDetails(String.valueOf(mPageNumber));
        call.enqueue(new Callback<NoBrokerResponse>() {
            @Override
            public void onResponse(retrofit.Response<NoBrokerResponse> response, Retrofit retrofit) {
                isLoading = false;
                removeNotification(NOTIFICATION_ID);
                if (response.isSuccess()){
                    if (mPageNumber==1){
                        mProgressBar.setVisibility(View.GONE);
                        mRecyclerView.setVisibility(View.VISIBLE);
                    }
                    if (mAdapter==null){
                        initRecyclerView();
                    }
                    mAdapter.addItems(response.body().getData());
                    mPropertyList.addAll(response.body().getData());
                    mPageNumber++;
                }
            }

            @Override
            public void onFailure(Throwable t) {
                isLoading = false;
                showError(t.getMessage());
                removeNotification(NOTIFICATION_ID);
            }
        });
    }

    public void cancelApiCall(){
        Log.d(PropertyListFragment.class.getSimpleName(),"Cancelling API call....");
        call.cancel();
        removeNotification(NOTIFICATION_ID);
    }

    private void removeNotification(int notificationId) {
        NotificationManager nMgr = (NotificationManager) getActivity().getApplicationContext().getSystemService(Context.NOTIFICATION_SERVICE);
        nMgr.cancel(notificationId);
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof PropertyListFragment.OnFragmentInteraction) {
            mListener = (PropertyListFragment.OnFragmentInteraction) context;
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

    public interface OnFragmentInteraction{
        void onFilterClicked(ArrayList<String> propertyType, ArrayList<String> buildingType, ArrayList<String> furnishingType);
    }
}
