package com.razor.myprogressbar;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

import com.razor.myprogressbar.listeners.Predicate;
import com.razor.myprogressbar.models.Photo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kuliza-265 on 19/10/16.
 */

public class Utility {
    /**
     * Is network available.
     *
     * @param ctx the context
     * @return the true if the network connection is there false otherwise.
     */
    public static boolean isNetworkAvailable(Context ctx) {
        ConnectivityManager connectivityManager = null;
        NetworkInfo activeNetworkInfo;
        try {
            connectivityManager = (ConnectivityManager) ctx.getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
            activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            // Toast.makeText(ctx, Constants.toastInternetError, Toast.LENGTH_SHORT).show();
            return activeNetworkInfo != null && activeNetworkInfo.isAvailable() && activeNetworkInfo.isConnected();
        } catch (NullPointerException e) {
            //Toast.makeText(ctx, Constants.toastInternetError, Toast.LENGTH_SHORT).show();
            return false;
        }
    }

    public static String parseImageUrl(List<Photo> photos) {
        for (Photo photo:photos){
            if (photo.getDisplayPic()) {
                String[] split = photo.getImagesMap().getOriginal().split("_");
                return Constants.Image_Base_Url+split[0]+"/"+photo.getImagesMap().getOriginal();
            }
        }
        return null;
    }

    public static <T> ArrayList<T> filter(ArrayList<T> col, Predicate<T> predicate) {
        ArrayList<T> result = new ArrayList<T>();
        for (T element: col) {
            if (predicate.apply(element)) {
                result.add(element);
            }
        }
        return result;
    }
}
