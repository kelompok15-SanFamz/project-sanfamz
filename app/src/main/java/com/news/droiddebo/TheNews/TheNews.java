package com.news.droiddebo.TheNews;

import android.app.Application;

/*
** Used for getting the application instance
**/
public class TheNews extends Application {
    private static TheNews theNewsInstance;
    @Override
    public void onCreate() {
        super.onCreate();
        theNewsInstance = this;
    }
    public static TheNews getTheNewsInstance(){
        return theNewsInstance;
    }
}
