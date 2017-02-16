package com.razor.myprogressbar;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.v4.app.NotificationCompat;

import com.razor.myprogressbar.listeners.Predicate;
import com.razor.myprogressbar.models.Photo;

import java.util.ArrayList;
import java.util.List;

import static android.content.Context.NOTIFICATION_SERVICE;

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

    public static int createNotifacation(Context ctx, Class cls){
        Intent intent = new Intent(ctx,cls);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);
        PendingIntent contentIntent = PendingIntent.getActivity(ctx, 0, intent, 0);
        NotificationCompat.Builder mBuilder =  new NotificationCompat.Builder(ctx)
                .setSmallIcon(R.mipmap.ic_launcher)
                .setContentTitle("Api Call")
                .setContentText("Fetching apartment List")
                .addAction(R.drawable.ic_check,"Cancel",contentIntent);
        NotificationManager notificationManager =
            (NotificationManager) ctx.getSystemService(NOTIFICATION_SERVICE);
        notificationManager.notify(0, mBuilder.build());
        return 0;
    }
}
