package com.praneeth.works.projects.socialinternship.Information;

import android.content.Context;
import android.content.SharedPreferences;

public class LocalStorage {
    private SharedPreferences sharedPreferences;

    public LocalStorage(Context context){
        sharedPreferences=context.getSharedPreferences("Store_SAC_Social_intership_Data",Context.MODE_PRIVATE);
    }

    public void saveHouseHoldReports(String str){
        SharedPreferences.Editor editor=sharedPreferences.edit();
        editor.putString("HouseHoldReports",str);
        editor.apply();
    }

    public String loadHouseHoldReports(){
        return sharedPreferences.getString("HouseHoldReports","");
    }

    public void saveVillageSurveyForm(String str){
        SharedPreferences.Editor editor=sharedPreferences.edit();
        editor.putString("VillageSurveyForm",str);
        editor.apply();
    }

    public String loadVillageSurveyForm(){
        return sharedPreferences.getString("VillageSurveyForm","");
    }
}
