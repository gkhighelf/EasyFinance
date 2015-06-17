package com.androidcollider.easyfin.utils;

import android.content.Context;
import android.content.SharedPreferences;



public class SharedPref {

    private SharedPreferences sharedPreferences;
    private final static String APP_PREFERENCES = "FinUPref";

    public SharedPref(Context context) {
        this.sharedPreferences = context.getSharedPreferences(APP_PREFERENCES, Context.MODE_PRIVATE);
    }


    public void disableSnackBarAccount() {
        sharedPreferences.edit().putBoolean("snackAccountDisabled", true).apply();
    }

    public boolean isSnackBarAccountDisable() {
        return sharedPreferences.contains("snackAccountDisabled");
    }
}