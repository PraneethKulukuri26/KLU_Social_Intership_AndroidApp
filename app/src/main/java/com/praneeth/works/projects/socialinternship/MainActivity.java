package com.praneeth.works.projects.socialinternship;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.praneeth.works.projects.socialinternship.Forms.HouseServeyForm;
import com.praneeth.works.projects.socialinternship.ReportsActivity.SavedReports;
import com.praneeth.works.projects.socialinternship.Test.RenderXml;

public class MainActivity extends AppCompatActivity {

    CardView newForm,saved_forms;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        newForm=findViewById(R.id.click_new_form);
        saved_forms=findViewById(R.id.saved_forms);

        newForm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), HouseServeyForm.class));
            }
        });

        saved_forms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), SavedReports.class));
            }
        });


    }

}