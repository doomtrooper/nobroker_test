package com.razor.myprogressbar.listeners;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

/**
 * Created by kuliza-265 on 19/10/16.
 */

public class RecyclerSearchOnScrollListener extends RecyclerView.OnScrollListener {

    private LoaderHelper mListener;
    private LinearLayoutManager mLayoutManager;

    public RecyclerSearchOnScrollListener(LoaderHelper fragment, LinearLayoutManager layoutManager) {
        this.mListener = fragment;
        this.mLayoutManager = layoutManager;
    }

    @Override
    public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
        super.onScrolled(recyclerView, dx, dy);
        int totalItemCount = mLayoutManager.getItemCount();
        int lastVisibleItem = mLayoutManager.findLastVisibleItemPosition();
        int visibleThreshold = 3;
        if (totalItemCount <= (lastVisibleItem + visibleThreshold)) mListener.loadMoreOutlets();
    }
}




