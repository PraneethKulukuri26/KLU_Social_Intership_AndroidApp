package com.praneeth.works.projects.socialinternship.Information;

import android.content.Context;
import android.content.SharedPreferences;

public class LocalStorage {
    private SharedPreferences sharedPreferences;

    public LocalStorage(Context context){
        sharedPreferences=context.getSharedPreferences("Store_SAC_Social_intership_Data",Context.MODE_PRIVATE);
    }
}
