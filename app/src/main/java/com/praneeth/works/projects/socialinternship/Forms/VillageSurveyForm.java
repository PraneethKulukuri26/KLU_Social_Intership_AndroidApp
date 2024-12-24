package com.praneeth.works.projects.socialinternship.Forms;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.praneeth.works.projects.socialinternship.Forms.Entity.ReportDetails;
import com.praneeth.works.projects.socialinternship.Forms.Entity.ReportVillageDetails;
import com.praneeth.works.projects.socialinternship.Forms.Entity.VillageSurveyEntity;
import com.praneeth.works.projects.socialinternship.Information.LocalStorage;
import com.praneeth.works.projects.socialinternship.R;

import java.time.LocalDate;
import java.util.ArrayList;

public class VillageSurveyForm extends AppCompatActivity {

    EditText villageId;

    VillageSurveyEntity form;

    Button saveBtn;

    View basicInfo[];
    EditText inputVillageInfra1[],inputVillageInfra2[],villageConnectInput[],sanitationData[],landInput[],wasteManage[],wasteWaterInput[];

    Spinner spinner_village[],sanitationSpinner[],wasteWater[];

    RadioGroup roadConnectivityRadio,roadCapacity[];

    RelativeLayout layoutappend[];

    LocalStorage localStorage;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_village_survey_form);
        form=new VillageSurveyEntity();

        localStorage=new LocalStorage(getApplicationContext());

        //village_survey_input_2-20
        basicInfo=new View[]{
                findViewById(R.id.village_survey_input_2),
                findViewById(R.id.village_survey_input_3),
                findViewById(R.id.village_survey_input_4),
                findViewById(R.id.village_survey_input_5),
                findViewById(R.id.village_survey_input_6),
                findViewById(R.id.village_survey_input_7),
                findViewById(R.id.village_survey_input_8),
                findViewById(R.id.village_survey_input_9),
                findViewById(R.id.village_survey_input_10),
                findViewById(R.id.village_survey_input_11),
                findViewById(R.id.village_survey_input_12),
                findViewById(R.id.village_survey_input_13),
                findViewById(R.id.village_survey_input_14),
                findViewById(R.id.village_survey_input_15),
                findViewById(R.id.village_survey_input_16),
                findViewById(R.id.village_survey_input_17),
                findViewById(R.id.village_survey_input_18),
                findViewById(R.id.village_survey_input_19),
                findViewById(R.id.village_survey_input_20),
        };

        villageConnectInput=new EditText[]{
                findViewById(R.id.village_survey_input_21),
                findViewById(R.id.village_survey_input_26),
                findViewById(R.id.village_survey_input_27),
                findViewById(R.id.village_survey_input_28),
                findViewById(R.id.village_survey_input_29),
                findViewById(R.id.village_survey_input_30),

                findViewById(R.id.village_survey_input_22),
                findViewById(R.id.village_survey_input_23),
                findViewById(R.id.village_survey_input_24),
                findViewById(R.id.village_survey_input_25),
        };

        String[] YesOrNoArray = {"Select", "Yes", "No"};
        ArrayAdapter<String> yesOrNoAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_spinner_item,
                YesOrNoArray
        );

        yesOrNoAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        wasteWater=new Spinner[]{
                findViewById(R.id.village_wasteWater_spinner_1),
                findViewById(R.id.village_wasteWater_spinner_2),
        };

        ArrayAdapter<String> wasteAdapter=new ArrayAdapter<>(
                this,
                android.R.layout.simple_spinner_item,
                new String[]{"Select","Waste stabilization pond (5 pond system)","soil biotechnology system","soak pit","leach pit","open pit","kaccha pit","other"}
        );
        wasteAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        wasteWater[0].setAdapter(yesOrNoAdapter);
        wasteWater[1].setAdapter(wasteAdapter);

        spinner_village = new Spinner[31];
        for (int i = 0; i < spinner_village.length; i++) {
            int resId = getResources().getIdentifier("village_infra_spinner_" + (i+1), "id", getPackageName());
            spinner_village[i] = findViewById(resId);
            spinner_village[i].setAdapter(yesOrNoAdapter);
        }

        inputVillageInfra1=new EditText[31];
        inputVillageInfra2=new EditText[31];
        for(int i=0;i<inputVillageInfra1.length;i++){
            int resId = getResources().getIdentifier("village_survey_input_inq_"+(i+1),"id",getPackageName());
            inputVillageInfra1[i]=findViewById(resId);

            resId=getResources().getIdentifier("village_survey_input_inr_"+(i+1),"id",getPackageName());
            inputVillageInfra2[i]=findViewById(resId);
        }


        saveBtn=findViewById(R.id.village_form_save_btn);
        villageId=findViewById(R.id.village_survey_input_1);

        RelativeLayout expandLayout[]={
                findViewById(R.id.village_expand_layout_1),
                findViewById(R.id.village_expand_layout_2),
                findViewById(R.id.village_expand_layout_3),
                findViewById(R.id.village_expand_layout_4),
                findViewById(R.id.village_expand_layout_5),
                findViewById(R.id.village_expand_layout_6),
                findViewById(R.id.village_expand_layout_7),
                findViewById(R.id.village_expand_layout_8),
        };

        LinearLayout layoutLinear[]={
                findViewById(R.id.Village_expand_layout_main_1),
                findViewById(R.id.Village_expand_layout_main_2),
                findViewById(R.id.Village_expand_layout_main_3),
                findViewById(R.id.Village_expand_layout_main_4),
                findViewById(R.id.Village_expand_layout_main_5),
                findViewById(R.id.Village_expand_layout_main_6),
                findViewById(R.id.Village_expand_layout_main_7),
                findViewById(R.id.Village_expand_layout_main_8),
        };

        CardView baseCard[]={
                findViewById(R.id.village_base_cardView1),
                findViewById(R.id.village_base_cardView2),
                findViewById(R.id.village_base_cardView3),
                findViewById(R.id.village_base_cardView4),
                findViewById(R.id.village_base_cardView5),
                findViewById(R.id.village_base_cardView6),
                findViewById(R.id.village_base_cardView7),
                findViewById(R.id.village_base_cardView8),
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

        roadConnectivityRadio=findViewById(R.id.Village_radioGroup_1);

        roadConnectivityRadio.setOnCheckedChangeListener((radioGroup, i) -> {
            RadioButton button = radioGroup.findViewById(i);
            if (button != null && "Yes".equals(button.getText().toString())) {
                findViewById(R.id.if_yes_ans).setVisibility(View.VISIBLE);
                form.getVillage_Connectivity().setIs_the_village_connected_to_the_above_by_a_pacca_road("Yes");
            } else {
                findViewById(R.id.if_yes_ans).setVisibility(View.GONE);
                form.getVillage_Connectivity().setIs_the_village_connected_to_the_above_by_a_pacca_road("No");
            }
        });

        sanitationData=new EditText[]{
                findViewById(R.id.village_survey_input_31),
                findViewById(R.id.village_survey_input_32),
        };

        sanitationSpinner=new Spinner[]{
                findViewById(R.id.village_Sanitation_spinner_1),
                findViewById(R.id.village_Sanitation_spinner_2),
                findViewById(R.id.village_Sanitation_spinner_3),
        };

        ArrayAdapter<String> sanitationAdapter[]=new ArrayAdapter[]{
                new ArrayAdapter<>(this,android.R.layout.simple_spinner_item,new String[]{"Select","Septic tank","Twin pit","single pit","Soak pit","leach pit","open pit","kaccha pit","other"}),
                new ArrayAdapter<>(this,android.R.layout.simple_spinner_item,new String[]{"Select","Pond","drain","soak pit","open pit","other"}),
                new ArrayAdapter<>(this,android.R.layout.simple_spinner_item,new String[]{"Select","Kitchen garden","soak pit","leach pit","other"}),
        };

        for(int i=0;i<sanitationSpinner.length;i++){
            sanitationAdapter[i].setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            sanitationSpinner[i].setAdapter(sanitationAdapter[i]);
        }

        Button addSpe=findViewById(R.id.village_add_btn_recycler);

        landAdapter adapLand=new landAdapter();
        RecyclerView landRecycler=findViewById(R.id.village_land_forst_recycler_1);
        landRecycler.setLayoutManager(new LinearLayoutManager(this));
        landRecycler.setAdapter(adapLand);

        addSpe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                form.getLand_forest().addEnergy_Plantation();
                adapLand.update(form.getLand_forest().getEnergy_Plantation().size());
            }
        });

        landInput=new EditText[]{
                findViewById(R.id.village_survey_input_33),
                findViewById(R.id.village_survey_input_34),
                findViewById(R.id.village_survey_input_35),
                findViewById(R.id.village_survey_input_36),
        };

        RecyclerView villageExpandRecycler=findViewById(R.id.village_expand_recyclerView);
        villageExpandRecycler.setLayoutManager(new LinearLayoutManager(this));
        villageExpandRecycler.setAdapter(new commonVillageRequirementsAdapter());


        wasteManage=new EditText[]{
                findViewById(R.id.village_survey_input_37),
                findViewById(R.id.village_survey_input_38),
                findViewById(R.id.village_survey_input_40),
                findViewById(R.id.village_survey_input_41),//0-3

                findViewById(R.id.village_survey_input_42),
                findViewById(R.id.village_survey_input_44),
                findViewById(R.id.village_survey_input_46),
                findViewById(R.id.village_survey_input_48),
                findViewById(R.id.village_survey_input_50),
                findViewById(R.id.village_survey_input_52),
                findViewById(R.id.village_survey_input_54),
                findViewById(R.id.village_survey_input_56),
                findViewById(R.id.village_survey_input_58),//4-12

                findViewById(R.id.village_survey_input_43),
                findViewById(R.id.village_survey_input_45),
                findViewById(R.id.village_survey_input_47),
                findViewById(R.id.village_survey_input_49),
                findViewById(R.id.village_survey_input_51),
                findViewById(R.id.village_survey_input_52),
                findViewById(R.id.village_survey_input_53),
                findViewById(R.id.village_survey_input_55),
                findViewById(R.id.village_survey_input_57),
                findViewById(R.id.village_survey_input_59),//13-
        };

        roadCapacity=new RadioGroup[]{
                findViewById(R.id.activity_village_radio_waste),
                findViewById(R.id.activity_village_radio_waste_1),
        };

        layoutappend=new RelativeLayout[]{
                findViewById(R.id.activity_village_waste_append_1),
                findViewById(R.id.activity_village_waste_append_2),
        };

        for(int i=0;i<2;i++){
            final int finalI=i;
//            roadCapacity[i].setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
//                @Override
//                public void onCheckedChanged(RadioGroup radioGroup, int i) {
//                    RadioButton button = radioGroup.findViewById(i);
//
//                    if(button!=null){
//                        if(button.getText().equals("Yes")){
//                            layoutappend[finalI].setVisibility(View.VISIBLE);
//                        }else{
//                            layoutappend[finalI].setVisibility(View.GONE);
//                        }
//
//                        switch (i+1){
//                            case 1:form.getWastewater_treatment_system().setCapacity_of_the_system(button.getText().toString());break;
//                            case 2:form.getWastewater_treatment_system().setIs_greywater_treated_in_the_same_system(button.getText().toString());break;
//                        }
//                    }
//                }
//            });
        }

        roadCapacity[0].setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton button = radioGroup.findViewById(i);

                if(button!=null){
                    if(button.getText().equals("Yes")){
                        layoutappend[0].setVisibility(View.VISIBLE);
                    }else{
                        layoutappend[0].setVisibility(View.GONE);
                    }

                    switch (i+1){
                        case 1:form.getWastewater_treatment_system().setCapacity_of_the_system(button.getText().toString());break;
                        case 2:form.getWastewater_treatment_system().setIs_greywater_treated_in_the_same_system(button.getText().toString());break;
                    }
                }
            }
        });

        roadCapacity[1].setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton button = radioGroup.findViewById(i);

                if(button!=null){
                    if(button.getText().equals("Yes")){
                        layoutappend[1].setVisibility(View.GONE);
                    }else{
                        layoutappend[1].setVisibility(View.VISIBLE);
                    }

                    switch (i+1){
                        case 1:form.getWastewater_treatment_system().setCapacity_of_the_system(button.getText().toString());break;
                        case 2:form.getWastewater_treatment_system().setIs_greywater_treated_in_the_same_system(button.getText().toString());break;
                    }
                }
            }
        });

        wasteWaterInput=new EditText[]{
                findViewById(R.id.village_survey_input_61),//0

                findViewById(R.id.village_survey_input_62),//1
                findViewById(R.id.village_survey_input_63),//2

                findViewById(R.id.village_survey_input_64),//3
        };


        saveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean cou=true;
                String instanceData=null;

                instanceData=villageId.getText().toString();
                if(instanceData==null || instanceData.isEmpty()){
                    cou=false;
                }

                if(!cou){
                    Toast.makeText(getApplicationContext(), "Village id is required. ", Toast.LENGTH_SHORT).show();
                }else{
                    form.setVillage_ID(instanceData);

                    VillageSurveyEntity.BasicInfo obj=new VillageSurveyEntity().new BasicInfo();

                    for(int i=0;i<basicInfo.length;i++){
                        instanceData=((EditText)basicInfo[i]).getText().toString();

                        if(instanceData==null || instanceData.isEmpty()){
                            cou=false;
                            Toast.makeText(getApplicationContext(), "Incomplete Basic Information.", Toast.LENGTH_SHORT).show();
                            break;
                        }

                        switch (i+1){
                            case 1:obj.setName_of_the_village(instanceData);break;
                            case 2:obj.setGram_Panchayat(instanceData);break;
                            case 3:obj.setNumber_of_Wards(instanceData);break;
                            case 4:obj.setNumber_of_Hamlets(instanceData);break;
                            case 5:obj.setBlock(instanceData);break;
                            case 6:obj.setDistrict(instanceData);break;
                            case 7:obj.setState(instanceData);break;
                            case 8:obj.setLok_Sabha_AND_Constituency(instanceData);break;
                            case 9:obj.setDistance_from_District_HQ(instanceData);break;
                            case 10:obj.setArea_of_village(instanceData);break;
                            case 11:obj.setArable_land_agriculture_Area(instanceData);break;
                            case 12:obj.setForest_Area(instanceData);break;
                            case 13:obj.setHousing_Abadi_Area(instanceData);break;
                            case 14:obj.setArea_Under_Water_bodies(instanceData);break;
                            case 15:obj.setCommon_Lands_Area(instanceData);break;
                            case 16:obj.setAverage_per_capita_Land_holding(instanceData);break;
                            case 17:obj.setWaste_land(instanceData);break;
                            case 18:obj.setWater_Table(instanceData);break;
                            case 19:obj.setSoil_type(instanceData);break;
                        }
                    }

                    if(cou){
                        form.setBasic_Information(obj);

                        Log.v("DataInput1",new Gson().toJson(form));

                        VillageSurveyEntity.Village_infra obj2=new VillageSurveyEntity().new Village_infra();
                        for(int i=0;i<spinner_village.length;i++){
                            instanceData=spinner_village[i].getSelectedItem().toString();

                            if(instanceData.equals("Select")){
                                cou=false;
                                Toast.makeText(getApplicationContext(), "Incomplete information Village Infrastructure", Toast.LENGTH_SHORT).show();
                                break;
                            }

                            switch (i+1){
                                case 1:obj2.setPrimary_School_Govt(new VillageSurveyEntity().new Village_infra().new ans(instanceData,inputVillageInfra1[i].getText().toString(),inputVillageInfra2[i].getText().toString()));break;
                                case 2:obj2.setPrimary_School_Private(new VillageSurveyEntity().new Village_infra().new ans(instanceData,inputVillageInfra1[i].getText().toString(),inputVillageInfra2[i].getText().toString()));break;
                                case 3:obj2.setMiddle_School_Govt(new VillageSurveyEntity().new Village_infra().new ans(instanceData,inputVillageInfra1[i].getText().toString(),inputVillageInfra2[i].getText().toString()));break;
                                case 4:obj2.setMiddle_School_Private(new VillageSurveyEntity().new Village_infra().new ans(instanceData,inputVillageInfra1[i].getText().toString(),inputVillageInfra2[i].getText().toString()));break;
                                case 5:obj2.setSecondary_School_Private(new VillageSurveyEntity().new Village_infra().new ans(instanceData,inputVillageInfra1[i].getText().toString(),inputVillageInfra2[i].getText().toString()));break;
                                case 6:obj2.setSecondary_School_Govt(new VillageSurveyEntity().new Village_infra().new ans(instanceData,inputVillageInfra1[i].getText().toString(),inputVillageInfra2[i].getText().toString()));break;
                                case 7:obj2.setITI_Diploma_institutes_Govt(new VillageSurveyEntity().new Village_infra().new ans(instanceData,inputVillageInfra1[i].getText().toString(),inputVillageInfra2[i].getText().toString()));break;
                                case 8:obj2.setITI_Diploma_institutes_Private(new VillageSurveyEntity().new Village_infra().new ans(instanceData,inputVillageInfra1[i].getText().toString(),inputVillageInfra2[i].getText().toString()));break;
                                case 9:obj2.setCollege_Govt(new VillageSurveyEntity().new Village_infra().new ans(instanceData,inputVillageInfra1[i].getText().toString(),inputVillageInfra2[i].getText().toString()));break;
                                case 10:obj2.setCollege_Private(new VillageSurveyEntity().new Village_infra().new ans(instanceData,inputVillageInfra1[i].getText().toString(),inputVillageInfra2[i].getText().toString()));break;
                                case 11:obj2.setBanks_ATM(new VillageSurveyEntity().new Village_infra().new ans(instanceData,inputVillageInfra1[i].getText().toString(),inputVillageInfra2[i].getText().toString()));break;
                                case 12:obj2.setPrimary_Health_Centers(new VillageSurveyEntity().new Village_infra().new ans(instanceData,inputVillageInfra1[i].getText().toString(),inputVillageInfra2[i].getText().toString()));break;
                                case 13:obj2.setCivil_Hospital(new VillageSurveyEntity().new Village_infra().new ans(instanceData,inputVillageInfra1[i].getText().toString(),inputVillageInfra2[i].getText().toString()));break;
                                case 14:obj2.setSHG(new VillageSurveyEntity().new Village_infra().new ans(instanceData,inputVillageInfra1[i].getText().toString(),inputVillageInfra2[i].getText().toString()));break;
                                case 15:obj2.setNGO(new VillageSurveyEntity().new Village_infra().new ans(instanceData,inputVillageInfra1[i].getText().toString(),inputVillageInfra2[i].getText().toString()));break;
                                case 16:obj2.setJan_Aushadhi_Yojana_Kendra(new VillageSurveyEntity().new Village_infra().new ans(instanceData,inputVillageInfra1[i].getText().toString(),inputVillageInfra2[i].getText().toString()));break;
                                case 17:obj2.setPost_Office(new VillageSurveyEntity().new Village_infra().new ans(instanceData,inputVillageInfra1[i].getText().toString(),inputVillageInfra2[i].getText().toString()));break;
                                case 18:obj2.setGas_agencies(new VillageSurveyEntity().new Village_infra().new ans(instanceData,inputVillageInfra1[i].getText().toString(),inputVillageInfra2[i].getText().toString()));break;
                                case 19:obj2.setTraining_Centres_and_specify_which(new VillageSurveyEntity().new Village_infra().new ans(instanceData,inputVillageInfra1[i].getText().toString(),inputVillageInfra2[i].getText().toString()));break;
                                case 20:obj2.setElectricity_Office(new VillageSurveyEntity().new Village_infra().new ans(instanceData,inputVillageInfra1[i].getText().toString(),inputVillageInfra2[i].getText().toString()));break;
                                case 21:obj2.setAnganwadi_Kendra(new VillageSurveyEntity().new Village_infra().new ans(instanceData,inputVillageInfra1[i].getText().toString(),inputVillageInfra2[i].getText().toString()));break;
                                case 22:obj2.setPetrol_Pumps_in_village(new VillageSurveyEntity().new Village_infra().new ans(instanceData,inputVillageInfra1[i].getText().toString(),inputVillageInfra2[i].getText().toString()));break;
                                case 23:obj2.setKisan_Sewa_Kendra(new VillageSurveyEntity().new Village_infra().new ans(instanceData,inputVillageInfra1[i].getText().toString(),inputVillageInfra2[i].getText().toString()));break;
                                case 24:obj2.setKrishi_Mandi(new VillageSurveyEntity().new Village_infra().new ans(instanceData,inputVillageInfra1[i].getText().toString(),inputVillageInfra2[i].getText().toString()));break;
                                case 25:obj2.setFare_Price_Shop(new VillageSurveyEntity().new Village_infra().new ans(instanceData,inputVillageInfra1[i].getText().toString(),inputVillageInfra2[i].getText().toString()));break;
                                case 26:obj2.setMilk_Cooperative(new VillageSurveyEntity().new Village_infra().new ans(instanceData,inputVillageInfra1[i].getText().toString(),inputVillageInfra2[i].getText().toString()));break;
                                case 27:obj2.setRailway_Station(new VillageSurveyEntity().new Village_infra().new ans(instanceData,inputVillageInfra1[i].getText().toString(),inputVillageInfra2[i].getText().toString()));break;
                                case 28:obj2.setBus_Stop(new VillageSurveyEntity().new Village_infra().new ans(instanceData,inputVillageInfra1[i].getText().toString(),inputVillageInfra2[i].getText().toString()));break;
                                case 29:obj2.setSports_Facility(new VillageSurveyEntity().new Village_infra().new ans(instanceData,inputVillageInfra1[i].getText().toString(),inputVillageInfra2[i].getText().toString()));break;
                                case 30:obj2.setNumber_Common_sanitation(new VillageSurveyEntity().new Village_infra().new ans(instanceData,inputVillageInfra1[i].getText().toString(),inputVillageInfra2[i].getText().toString()));break;
                                case 31:obj2.setVeterinary_Care_Centre(new VillageSurveyEntity().new Village_infra().new ans(instanceData,inputVillageInfra1[i].getText().toString(),inputVillageInfra2[i].getText().toString()));break;
                            }

                        }

                        if(cou){
                            form.setVillage_Infrastructure_and_Basic_Amenities(obj2);

                            for(int i=0;i<6;i++){
                                instanceData=villageConnectInput[i].getText().toString();

                                if(instanceData==null || instanceData.isEmpty()){
                                    cou=false;
                                    Toast.makeText(getApplicationContext(),"Incomplete Connectivity Information.",Toast.LENGTH_SHORT).show();
                                    break;
                                }

                                switch (i+1){
                                    case 1:form.getVillage_Connectivity().setDistance_of_the_village_from_nearest_Highway(instanceData);break;
                                    case 2:form.getVillage_Connectivity().getLength_of_internal_roads().setKachha(instanceData);break;
                                    case 3:form.getVillage_Connectivity().getLength_of_internal_roads().setPakkka(instanceData);break;
                                    case 4:form.getVillage_Connectivity().getLength_of_internal_roads().setTotal(instanceData);break;
                                    case 5:form.getVillage_Connectivity().setWhat_is_the_mode_of_transport_available(instanceData);break;
                                    case 6:form.getVillage_Connectivity().setFrequency_of_the_available_mode_of_transport(instanceData);break;
                                }
                            }

                            instanceData=form.getVillage_Connectivity().getIs_the_village_connected_to_the_above_by_a_pacca_road();
                            if(instanceData==null || instanceData.isEmpty()){
                                cou=false;
                                Toast.makeText(getApplicationContext(),"Incomplete Connectivity Information.",Toast.LENGTH_SHORT).show();
                            }

                            if(cou){

                                Log.v("DataInput2",new Gson().toJson(form));

                                if(instanceData.equals("Yes")){
                                    for(int i=6;i<villageConnectInput.length;i++){
                                        instanceData=villageConnectInput[i].getText().toString();

                                        if(instanceData==null || instanceData.isEmpty()){
                                            cou=false;
                                            Toast.makeText(getApplicationContext(),"Incomplete Connectivity Information.",Toast.LENGTH_SHORT).show();
                                        }

                                        switch (i+1){
                                            case 7:form.getVillage_Connectivity().getIf_yes_details_of_the_approach_road().setLength_of_the_Road(instanceData);break;
                                            case 8:form.getVillage_Connectivity().getIf_yes_details_of_the_approach_road().setYear_of_construction(instanceData);break;
                                            case 9:form.getVillage_Connectivity().getIf_yes_details_of_the_approach_road().setScheme_under_which_constructed(instanceData);break;
                                            case 10:form.getVillage_Connectivity().getIf_yes_details_of_the_approach_road().setPresent_Status(instanceData);break;
                                        }
                                    }
                                }

                                if(cou){
                                    VillageSurveyEntity.sanitation obj3=new VillageSurveyEntity().new sanitation();

                                    for(int i=0;i<sanitationData.length;i++){
                                        instanceData=sanitationData[i].getText().toString();
                                        if(instanceData==null || instanceData.isEmpty()){
                                            cou=false;
                                            Toast.makeText(getApplicationContext(),"Incomplete Sanitation Information.",Toast.LENGTH_SHORT);
                                            break;
                                        }

                                        switch (i+1){
                                            case 1:obj3.setDo_you_have_sanitation_system_in_your_area(instanceData);break;
                                            case 2:obj3.setHow_many_people_are_using_it(instanceData);break;
                                        }
                                    }

                                    if(cou){

                                        for(int i=0;i<sanitationSpinner.length;i++){
                                            instanceData=sanitationSpinner[i].getSelectedItem().toString();
                                            if(instanceData==null || instanceData.isEmpty()){
                                                cou=false;
                                                Toast.makeText(getApplicationContext(),"Incomplete Sanitation Information.",Toast.LENGTH_SHORT);
                                                break;
                                            }

                                            switch (i+1){
                                                case 1:obj3.setType_of_system(instanceData);break;
                                                case 2:obj3.setWhere_does_the_blackwater_discharge(instanceData);break;
                                                case 3:obj3.setWhere_do_they_discharge_the_greywater(instanceData);break;
                                            }
                                        }

                                        if(cou){
                                            form.setSanitation_system(obj3);

                                            for(int i=0;i<landInput.length;i++){
                                                instanceData=landInput[i].getText().toString();

                                                if(instanceData==null || instanceData.isEmpty()){
                                                    cou=false;
                                                    Toast.makeText(getApplicationContext(),"Incomplete information about Land information",Toast.LENGTH_SHORT).show();
                                                    break;
                                                }

                                                switch (i+1){
                                                    case 1:form.getLand_forest().setType_of_Forest(instanceData);break;
                                                    case 2:form.getLand_forest().setCommunity_Forest(instanceData);break;
                                                    case 3:form.getLand_forest().setGovernment_Forest(instanceData);break;
                                                    case 4:form.getLand_forest().setMain_Forest_Trees_and_Shrub_Species(instanceData);break;
                                                }
                                            }

                                            if(cou){
                                                for(int i=0;i<wasteManage.length;i++){
                                                    instanceData=wasteManage[i].getText().toString();

                                                    switch (i+1){
                                                        case 1:form.getSolid_waste_management().setSolid_Waste_management_facility(instanceData);break;
                                                        case 2:form.getSolid_waste_management().setCurrent_cost_of_management(instanceData);break;
                                                        case 3:form.getSolid_waste_management().setFunding_from_any_govt_other_schemes(instanceData);break;
                                                        case 4:form.getSolid_waste_management().setCurrent_mode_of_collection(instanceData);break;
                                                        case 6:form.getSolid_waste_management().getOrganics_from_Kitchen().setMode_of_collection(instanceData);break;
                                                        case 7:form.getSolid_waste_management().getPlastics().setMode_of_collection(instanceData);break;
                                                        case 8:form.getSolid_waste_management().getRecyclables().setMode_of_collection(instanceData);break;
                                                        case 9:form.getSolid_waste_management().getNon_Recyclables().setMode_of_collection(instanceData);break;
                                                        case 10:form.getSolid_waste_management().getClothes_Slippers_Bags().setMode_of_collection(instanceData);break;
                                                        case 11:form.getSolid_waste_management().getBio_medical_waste().setMode_of_collection(instanceData);break;
                                                        case 12:form.getSolid_waste_management().getSanitary_napkins().setMode_of_collection(instanceData);break;
                                                        case 13:form.getSolid_waste_management().getAgricultural_Biomass().setMode_of_collection(instanceData);break;
                                                        case 14:form.getSolid_waste_management().getOrganics_from_Kitchen().setCurrent_management_strategy(instanceData);break;
                                                        case 15:form.getSolid_waste_management().getPlastics().setCurrent_management_strategy(instanceData);break;
                                                        case 16:form.getSolid_waste_management().getRecyclables().setCurrent_management_strategy(instanceData);break;
                                                        case 17:form.getSolid_waste_management().getNon_Recyclables().setCurrent_management_strategy(instanceData);break;
                                                        case 18:form.getSolid_waste_management().getClothes_Slippers_Bags().setCurrent_management_strategy(instanceData);break;
                                                        case 19:form.getSolid_waste_management().getBio_medical_waste().setCurrent_management_strategy(instanceData);break;
                                                        case 20:form.getSolid_waste_management().getSanitary_napkins().setCurrent_management_strategy(instanceData);break;
                                                        case 21:form.getSolid_waste_management().getAgricultural_Biomass().setCurrent_management_strategy(instanceData);break;
                                                    }
                                                }

                                                form.setComments(((EditText)findViewById(R.id.village_survey_input_60)).getText().toString());

                                                VillageSurveyEntity.WasteTreatment obj4=new VillageSurveyEntity().new WasteTreatment();

                                                instanceData=wasteWater[0].getSelectedItem().toString();
                                                obj4.setDo_you_have_any_treatment_system_of_wastewater(instanceData);
                                                instanceData=wasteWater[1].getSelectedItem().toString();
                                                obj4.setType_of_system(instanceData);

                                                instanceData=wasteWaterInput[0].getText().toString();
                                                obj4.setCapacity_of_the_system(instanceData);

                                                instanceData=wasteWaterInput[1].getText().toString();
                                                obj4.setOperation_and_maintenance_cost(instanceData);
                                                instanceData=wasteWaterInput[2].getText().toString();
                                                obj4.setTotal_Cost_of_the_system(instanceData);

                                                instanceData=wasteWaterInput[3].getText().toString();
                                                obj4.setIf_no_then_where_do_they_discharge_the_greywater(instanceData);

                                                form.setWastewater_treatment_system(obj4);

                                                Log.v("DataInput",new Gson().toJson(form));

                                                AlertDialog.Builder builder=new AlertDialog.Builder(VillageSurveyForm.this);
                                                builder.setTitle("Confirmation")
                                                        .setMessage("Confirm before you save.\nYou Can not edit after words.")
                                                        .setPositiveButton("Save", new DialogInterface.OnClickListener() {
                                                            @Override
                                                            public void onClick(DialogInterface dialogInterface, int i) {
                                                                String data=localStorage.loadVillageSurveyForm();
                                                                ArrayList<ReportVillageDetails> list;
                                                                if(data==null || data.isEmpty()){
                                                                    list=new ArrayList<>();
                                                                }else{
                                                                    Log.v("dataStored",data);
                                                                    try {
                                                                        list = new Gson().fromJson(data, new TypeToken<ArrayList<ReportVillageDetails>>() {
                                                                        }.getType());
                                                                    }catch (Exception e){
                                                                        list=new ArrayList<>();
                                                                    }
                                                                }

                                                                try {
                                                                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                                                                        form.setVillage_Survey_date(LocalDate.now().toString());
                                                                    }
                                                                }catch (Exception e){
                                                                    Toast.makeText(getApplicationContext(),e.getMessage(),Toast.LENGTH_SHORT).show();
                                                                }
                                                                ReportVillageDetails reportDetails=new ReportVillageDetails();
                                                                reportDetails.setVillageSurveyEntity(form);
                                                                reportDetails.setName("Village Survey - "+form.getVillage_ID());
                                                                                        /*if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                                                                                            reportDetails.setDate(LocalDate.now().toString());
                                                                                        }*/

                                                                list.add(reportDetails);
                                                                localStorage.saveVillageSurveyForm(new Gson().toJson(list));

                                                                finish();
                                                            }
                                                        });

                                                AlertDialog dialog=builder.create();
                                                dialog.show();


                                            }
                                        }
                                    }
                                }


                            }

                        }
                    }


                }
            }
        });
    }

    class landAdapter extends RecyclerView.Adapter<landAdapter.viewHolder>{

        public void update(int x){
            notifyItemInserted(x);
        }

        @NonNull
        @Override
        public landAdapter.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            return new viewHolder(LinearLayout.inflate(getApplicationContext(),R.layout.item_house_servey1,null));
        }

        @Override
        public void onBindViewHolder(@NonNull landAdapter.viewHolder holder, @SuppressLint("RecyclerView") int position) {
            for(int i=0;i<holder.editText.length;i++){

                final int finalI=i;
                holder.editText[i].addTextChangedListener(new TextWatcher() {
                    @Override
                    public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                    }

                    @Override
                    public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                    }

                    @Override
                    public void afterTextChanged(Editable editable) {
                        switch (finalI+1){
                            case 1:form.getLand_forest().getEnergy_Plantation().get(position).setSpecies(editable.toString());break;
                            case 2:form.getLand_forest().getEnergy_Plantation().get(position).setArea(editable.toString());break;
                        }
                    }
                });
            }
        }

        @Override
        public int getItemCount() {
            return form.getLand_forest().getEnergy_Plantation().size();
        }

        public class viewHolder extends RecyclerView.ViewHolder {

            EditText editText[];
            public viewHolder(@NonNull View itemView) {
                super(itemView);
                editText=new EditText[]{
                    itemView.findViewById(R.id.item_house_servey_1_edit_1),
                    itemView.findViewById(R.id.item_house_servey_1_edit_2),
                };


            }
        }
    }

    class commonVillageRequirementsAdapter extends RecyclerView.Adapter<commonVillageRequirementsAdapter.viewHolder>{

        String title[];

        public commonVillageRequirementsAdapter(){
            title=new String[]{
                    "Panchayat Office",
                    "Dispensary",
                    "Community Halls",
                    "Street Lighting",
                    "Dharamashala",
                    "Social Organisations (Youth/Mahila Clubs)",
                    "Training cum Production Centres",
            };
        }

        @NonNull
        @Override
        public commonVillageRequirementsAdapter.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            return new viewHolder(LinearLayout.inflate(getApplicationContext(),R.layout.item_common_village_electricity,null));
        }

        @Override
        public void onBindViewHolder(@NonNull commonVillageRequirementsAdapter.viewHolder holder, @SuppressLint("RecyclerView") int position) {
            holder.title.setText(position+". "+title[position]);
            holder.recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
            adapterElectricity adapterElec=new adapterElectricity(position);
            holder.recyclerView.setAdapter(adapterElec);

            holder.add.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    switch (position+1){
                        case 1:form.getCommon_Village_Electricity_Requirements().AddPanchayat_Office();
                        adapterElec.update(form.getCommon_Village_Electricity_Requirements().getPanchayat_Office().size());
                        break;

                        case 2:form.getCommon_Village_Electricity_Requirements().AddDispensary();
                        adapterElec.update(form.getCommon_Village_Electricity_Requirements().getDispensary().size());
                        break;

                        case 3:form.getCommon_Village_Electricity_Requirements().AddCommunity_Halls();
                        adapterElec.update(form.getCommon_Village_Electricity_Requirements().getStreet_Lighting().size());
                        break;

                        case 4:form.getCommon_Village_Electricity_Requirements().AddStreet_Lighting();
                        adapterElec.update(form.getCommon_Village_Electricity_Requirements().getStreet_Lighting().size());
                        break;

                        case 5:form.getCommon_Village_Electricity_Requirements().AddDharamashala();
                        adapterElec.update(form.getCommon_Village_Electricity_Requirements().getDharamashala().size());
                        break;

                        case 6:form.getCommon_Village_Electricity_Requirements().AddSocial_Organisations();
                        adapterElec.update(form.getCommon_Village_Electricity_Requirements().getSocial_Organisations().size());
                        break;

                        case 7:form.getCommon_Village_Electricity_Requirements().AddTraining_cum_Production_Centres();
                        adapterElec.update(form.getCommon_Village_Electricity_Requirements().getTraining_cum_Production_Centres().size());
                        break;
                    }
                }
            });

        }

        @Override
        public int getItemCount() {
            return 7;
        }

        public class viewHolder extends RecyclerView.ViewHolder {

            TextView title;
            Button add;

            RecyclerView recyclerView;

            public viewHolder(@NonNull View itemView) {
                super(itemView);
                title=itemView.findViewById(R.id.item_common_village_text1);
                add=itemView.findViewById(R.id.item_common_village_add_btn);
                recyclerView=itemView.findViewById(R.id.item_common_village_RecyclerView);

            }
        }

        class adapterElectricity extends RecyclerView.Adapter<adapterElectricity.viewHolder2>{

            int n;

            public adapterElectricity(int n){
                this.n=n;
            }

            public void update(int x){
                notifyItemInserted(x);
            }

            @NonNull
            @Override
            public adapterElectricity.viewHolder2 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
                return new viewHolder2(LinearLayout.inflate(getApplicationContext(),R.layout.item_appliance,null));
            }

            @Override
            public void onBindViewHolder(@NonNull adapterElectricity.viewHolder2 holder, @SuppressLint("RecyclerView") int position) {
                for(int i=0;i<3;i++){

                    final int finalI=i;
                    holder.input[i].addTextChangedListener(new TextWatcher() {
                        @Override
                        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                        }

                        @Override
                        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                        }

                        @Override
                        public void afterTextChanged(Editable editable) {
                            switch (n+1){
                                case 1:
                                    switch (finalI+1){
                                        case 1:form.getCommon_Village_Electricity_Requirements().getPanchayat_Office().get(position).setElectrical_Appliances(editable.toString());break;
                                        case 2:form.getCommon_Village_Electricity_Requirements().getPanchayat_Office().get(position).setNumber_requred(Integer.parseInt(editable.toString()));break;
                                        case 3:form.getCommon_Village_Electricity_Requirements().getPanchayat_Office().get(position).setDuration(editable.toString());break;
                                    }
                                    break;
                                case 2:
                                    switch (finalI+1){
                                        case 1:form.getCommon_Village_Electricity_Requirements().getDispensary().get(position).setElectrical_Appliances(editable.toString());break;
                                        case 2:form.getCommon_Village_Electricity_Requirements().getDispensary().get(position).setNumber_requred(Integer.parseInt(editable.toString()));break;
                                        case 3:form.getCommon_Village_Electricity_Requirements().getDispensary().get(position).setDuration(editable.toString());break;
                                    }
                                    break;
                                case 3:
                                    switch (finalI+1){
                                        case 1:form.getCommon_Village_Electricity_Requirements().getCommunity_Halls().get(position).setElectrical_Appliances(editable.toString());break;
                                        case 2:form.getCommon_Village_Electricity_Requirements().getCommunity_Halls().get(position).setNumber_requred(Integer.parseInt(editable.toString()));break;
                                        case 3:form.getCommon_Village_Electricity_Requirements().getCommunity_Halls().get(position).setDuration(editable.toString());break;
                                    }
                                    break;
                                case 4:
                                    switch (finalI+1){
                                        case 1:form.getCommon_Village_Electricity_Requirements().getStreet_Lighting().get(position).setElectrical_Appliances(editable.toString());break;
                                        case 2:form.getCommon_Village_Electricity_Requirements().getStreet_Lighting().get(position).setNumber_requred(Integer.parseInt(editable.toString()));break;
                                        case 3:form.getCommon_Village_Electricity_Requirements().getStreet_Lighting().get(position).setDuration(editable.toString());break;
                                    }
                                    break;
                                case 5:
                                    switch (finalI+1){
                                        case 1:form.getCommon_Village_Electricity_Requirements().getDharamashala().get(position).setElectrical_Appliances(editable.toString());break;
                                        case 2:form.getCommon_Village_Electricity_Requirements().getDharamashala().get(position).setNumber_requred(Integer.parseInt(editable.toString()));break;
                                        case 3:form.getCommon_Village_Electricity_Requirements().getDharamashala().get(position).setDuration(editable.toString());break;
                                    }
                                    break;
                                case 6:
                                    switch (finalI+1){
                                        case 1:form.getCommon_Village_Electricity_Requirements().getSocial_Organisations().get(position).setElectrical_Appliances(editable.toString());break;
                                        case 2:form.getCommon_Village_Electricity_Requirements().getSocial_Organisations().get(position).setNumber_requred(Integer.parseInt(editable.toString()));break;
                                        case 3:form.getCommon_Village_Electricity_Requirements().getSocial_Organisations().get(position).setDuration(editable.toString());break;
                                    }
                                    break;
                                case 7:
                                    switch (finalI+1){
                                        case 1:form.getCommon_Village_Electricity_Requirements().getTraining_cum_Production_Centres().get(position).setElectrical_Appliances(editable.toString());break;
                                        case 2:form.getCommon_Village_Electricity_Requirements().getTraining_cum_Production_Centres().get(position).setNumber_requred(Integer.parseInt(editable.toString()));break;
                                        case 3:form.getCommon_Village_Electricity_Requirements().getTraining_cum_Production_Centres().get(position).setDuration(editable.toString());break;
                                    }
                                    break;
                            }
                        }
                    });
                }
            }

            @Override
            public int getItemCount() {
                switch (n+1){
                    case 1:return form.getCommon_Village_Electricity_Requirements().getPanchayat_Office().size();
                    case 2:return form.getCommon_Village_Electricity_Requirements().getDispensary().size();
                    case 3:return form.getCommon_Village_Electricity_Requirements().getCommunity_Halls().size();
                    case 4:return form.getCommon_Village_Electricity_Requirements().getStreet_Lighting().size();
                    case 5:return form.getCommon_Village_Electricity_Requirements().getDharamashala().size();
                    case 6:return form.getCommon_Village_Electricity_Requirements().getSocial_Organisations().size();
                    case 7:return form.getCommon_Village_Electricity_Requirements().getTraining_cum_Production_Centres().size();
                }

                return 0;
            }

            public class viewHolder2 extends RecyclerView.ViewHolder {

                EditText input[];

                public viewHolder2(@NonNull View itemView) {
                    super(itemView);
                    input=new EditText[]{
                            itemView.findViewById(R.id.item_appliance_input_1),
                            itemView.findViewById(R.id.item_appliance_input_2),
                            itemView.findViewById(R.id.item_appliance_input_3),
                    };
                }
            }
        }
    }

    @Override
    public void onBackPressed() {
        //super.onBackPressed();

        AlertDialog.Builder builder=new AlertDialog.Builder(this);

        builder.setTitle("Confirmation")
                .setMessage("Your data will be lost.")
                .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();
                    }
                }).setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                });

        AlertDialog dialog=builder.create();
        dialog.show();

    }

}