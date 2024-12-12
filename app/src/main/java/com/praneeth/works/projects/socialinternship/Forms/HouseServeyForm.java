package com.praneeth.works.projects.socialinternship.Forms;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.Toast;

import com.praneeth.works.projects.socialinternship.R;

import java.lang.reflect.Array;

public class HouseServeyForm extends AppCompatActivity {

    CardView baseCard;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_house_servey_form);
        //expandLayout=new RelativeLayout[10];
        RelativeLayout expandLayout[]={
                findViewById(R.id.expand_layout_1),
                findViewById(R.id.expand_layout_2)
        };

        LinearLayout layoutLinear[]={
                findViewById(R.id.expand_layout_main_1),
                findViewById(R.id.expand_layout_main_2)
        };

        CardView baseCard[]={
                findViewById(R.id.base_cardView1),
                findViewById(R.id.base_cardView2)
        };

        for(int i=0;i<expandLayout.length;i++){
            int finalI = i;
            expandLayout[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(layoutLinear[finalI].getVisibility()==View.VISIBLE){
                        TransitionManager.beginDelayedTransition(baseCard[finalI], new AutoTransition());
                        layoutLinear[finalI].setVisibility(View.GONE);
                    }else{
                        TransitionManager.beginDelayedTransition(baseCard[finalI], new AutoTransition());
                        layoutLinear[finalI].setVisibility(View.VISIBLE);
                    }
                }
            });
        }

        /*expandLayout1=findViewById(R.id.expand_layout_1);
        layoutLinear1=findViewById(R.id.expand_layout_main_1);
        baseCard1=findViewById(R.id.base_cardView1);

        expandLayout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(layoutLinear1.getVisibility()==View.VISIBLE){
                    TransitionManager.beginDelayedTransition(baseCard1, new AutoTransition());
                    layoutLinear1.setVisibility(View.GONE);
                }else{
                    TransitionManager.beginDelayedTransition(baseCard1, new AutoTransition());
                    layoutLinear1.setVisibility(View.VISIBLE);
                }
            }
        });*/

        Spinner genderSpinner = findViewById(R.id.gender_spinner);

        String[] genderOptions = {"Select Gender", "Male", "Female", "Other"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_spinner_item,
                genderOptions
        );

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        genderSpinner.setAdapter(adapter);

        genderSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selectedGender = parent.getItemAtPosition(position).toString();

                // Show a Toast message for the selected item
                if (!selectedGender.equals("Select Gender")) {
                    Toast.makeText(HouseServeyForm.this, "Selected: " + selectedGender, Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // Handle the case where no item is selected (optional)
            }
        });

    }
}