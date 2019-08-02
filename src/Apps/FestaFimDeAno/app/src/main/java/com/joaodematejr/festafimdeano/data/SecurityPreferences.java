package com.joaodematejr.festafimdeano.data;

import android.content.Context;
import android.content.SharedPreferences;

public class SecurityPreferences {

    private SharedPreferences mSharedPreferences;

    //  CONSTRUTOR
    public SecurityPreferences(Context mContext) {
        this.mSharedPreferences = mContext.getSharedPreferences("festaFimAno", Context.MODE_PRIVATE);

    }

    public void storeString(String key, String value){
        this.mSharedPreferences.edit().putString(key, value).apply();
    }

    public String getStoreString(String key){
        return this.mSharedPreferences.getString(key, "");
    }
}
