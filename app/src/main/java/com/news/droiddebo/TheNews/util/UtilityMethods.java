package com.news.droiddebo.TheNews.util;

import android.content.Context;
import android.net.ConnectivityManager;

import com.news.droiddebo.TheNews.TheNews;

public class UtilityMethods {
    /**
     * Method to detect network connection on the device
     */
    public static boolean isNetworkAvailable() {

        ConnectivityManager connectivityManager = (ConnectivityManager) TheNews.getTheNewsInstance()
                        .getSystemService(Context.CONNECTIVITY_SERVICE);

        return connectivityManager.getActiveNetworkInfo() != null
                && connectivityManager.getActiveNetworkInfo().isConnectedOrConnecting();
    }
}
