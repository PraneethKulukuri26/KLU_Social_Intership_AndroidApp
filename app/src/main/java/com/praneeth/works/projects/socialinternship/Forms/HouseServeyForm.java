package com.praneeth.works.projects.socialinternship.Forms;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.IInterface;
import android.text.Editable;
import android.text.TextWatcher;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.praneeth.works.projects.socialinternship.Forms.Entity.HouseServeyEntity;
import com.praneeth.works.projects.socialinternship.Forms.Entity.ReportDetails;
import com.praneeth.works.projects.socialinternship.Information.LocalStorage;
import com.praneeth.works.projects.socialinternship.R;
import com.praneeth.works.projects.socialinternship.ReportsActivity.SavedReports;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class HouseServeyForm extends AppCompatActivity {

    CardView baseCard;

    HouseServeyEntity serveyEntity;

    LocalStorage localStorage;

    View BasicInfo[],ResProfile[],generalInfo[],migrationInfo[],schmeesInfo[],energyInfo,landInfo[],livestock[];

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_house_servey_form);
        localStorage=new LocalStorage(getApplicationContext());
        serveyEntity=new HouseServeyEntity();
        Log.v("datav",localStorage.loadHouseHoldReports());
        //localStorage.saveHouseHoldReports("trdd");

        BasicInfo=new View[]{
                findViewById(R.id.servey_form_input_1),//Village
                findViewById(R.id.servey_form_input_2),//Gram Panchayat
                findViewById(R.id.servey_form_input_3),//Ward No
                findViewById(R.id.servey_form_input_4),//Block
                findViewById(R.id.servey_form_input_5),//District
                findViewById(R.id.servey_form_input_6),//State
        };

        ResProfile=new View[]{
                findViewById(R.id.servey_form_input_7),
                findViewById(R.id.servey_form_input_8),
                findViewById(R.id.servey_form_input_9),
                findViewById(R.id.servey_form_input_10),
        };

        generalInfo=new View[]{
                findViewById(R.id.servey_form_input_11),
                findViewById(R.id.servey_form_input_12)
        };

        migrationInfo=new View[]{
                findViewById(R.id.servey_form_input_13),
                findViewById(R.id.servey_form_input_14),
                findViewById(R.id.servey_form_input_15),
        };

        schmeesInfo=new View[]{
                findViewById(R.id.servey_form_input_16),
                findViewById(R.id.servey_form_input_17),
                findViewById(R.id.servey_form_input_18),
                findViewById(R.id.servey_form_input_19),
                findViewById(R.id.servey_form_input_20),
                findViewById(R.id.servey_form_input_21),
                findViewById(R.id.servey_form_input_22),
                findViewById(R.id.servey_form_input_23),
        };

        energyInfo=findViewById(R.id.servey_form_input_24);

        landInfo=new View[]{
                findViewById(R.id.servey_form_input_25),
                findViewById(R.id.servey_form_input_26),
                findViewById(R.id.servey_form_input_27),
                findViewById(R.id.servey_form_input_28),
                findViewById(R.id.servey_form_input_29),
                findViewById(R.id.servey_form_input_30),
        };

        livestock=new View[]{
                findViewById(R.id.servey_form_input_31),
                findViewById(R.id.servey_form_input_32),
                findViewById(R.id.servey_form_input_33),
                findViewById(R.id.servey_form_input_34),
                findViewById(R.id.servey_form_input_35),
                findViewById(R.id.servey_form_input_36),
                findViewById(R.id.servey_form_input_38),
                findViewById(R.id.servey_form_input_39),
                findViewById(R.id.servey_form_input_37),
        };



        //expandLayout=new RelativeLayout[10];
        RelativeLayout expandLayout[]={
                findViewById(R.id.expand_layout_1),
                findViewById(R.id.expand_layout_2),
                findViewById(R.id.expand_layout_3),
                findViewById(R.id.expand_layout_4),
                findViewById(R.id.expand_layout_5),
                findViewById(R.id.expand_layout_6),
                findViewById(R.id.expand_layout_7),
                findViewById(R.id.expand_layout_8),
                findViewById(R.id.expand_layout_9),
                findViewById(R.id.expand_layout_10),
                findViewById(R.id.expand_layout_11),
                findViewById(R.id.expand_layout_12),
        };

        LinearLayout layoutLinear[]={
                findViewById(R.id.expand_layout_main_1),
                findViewById(R.id.expand_layout_main_2),
                findViewById(R.id.expand_layout_main_3),
                findViewById(R.id.expand_layout_main_4),
                findViewById(R.id.expand_layout_main_5),
                findViewById(R.id.expand_layout_main_6),
                findViewById(R.id.expand_layout_main_7),
                findViewById(R.id.expand_layout_main_8),
                findViewById(R.id.expand_layout_main_9),
                findViewById(R.id.expand_layout_main_10),
                findViewById(R.id.expand_layout_main_11),
                findViewById(R.id.expand_layout_main_12),
        };

        CardView baseCard[]={
                findViewById(R.id.base_cardView1),
                findViewById(R.id.base_cardView2),
                findViewById(R.id.base_cardView3),
                findViewById(R.id.base_cardView4),
                findViewById(R.id.base_cardView5),
                findViewById(R.id.base_cardView6),
                findViewById(R.id.base_cardView7),
                findViewById(R.id.base_cardView8),
                findViewById(R.id.base_cardView9),
                findViewById(R.id.base_cardView10),
                findViewById(R.id.base_cardView11),
                findViewById(R.id.base_cardView12),
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

//        Spinner genderSpinner = findViewById(R.id.gender_spinner);

        EditText waterInput[]=new EditText[]{
                findViewById(R.id.servey_form_input_40),
                findViewById(R.id.servey_form_input_41),
                findViewById(R.id.servey_form_input_42),
                findViewById(R.id.servey_form_input_43),

                findViewById(R.id.servey_form_input_45),
                findViewById(R.id.servey_form_input_46),

        };

        RelativeLayout layoutWater[]=new RelativeLayout[]{
                findViewById(R.id.relativeWater1),
                findViewById(R.id.relativeWater2),
                findViewById(R.id.relativeWater3),
                findViewById(R.id.relativeWater4),
        };

        RadioGroup waterRadioBtn[]=new RadioGroup[]{
                findViewById(R.id.waterRadioGroup1),
                findViewById(R.id.waterRadioGroup2),
                findViewById(R.id.waterRadioGroup3),
                findViewById(R.id.waterRadioGroup4),
        };

        for(int i=0;i<waterRadioBtn.length;i++){

            final int finalI=i;
            waterRadioBtn[i].setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int i) {
                    RadioButton radioButton=radioGroup.findViewById(i);

                    String instanceData=radioButton.getText().toString();

                    if(instanceData.equals("Yes")){
                        layoutWater[finalI].setVisibility(View.GONE);
                    }else{
                        layoutWater[finalI].setVisibility(View.VISIBLE);
                    }

                    switch (finalI+1){
                        case 1:serveyEntity.getSource_of_Water().getPiped_Water_at_Home().setAnswer(instanceData);break;
                        case 2:serveyEntity.getSource_of_Water().getCommunity_Water_Tap().setAnswer(instanceData);break;
                        case 3:serveyEntity.getSource_of_Water().getHand_Pump().setAnswer(instanceData);break;
                        case 4:serveyEntity.getSource_of_Water().getOpen_Well().setAnswer(instanceData);break;
                    }
                }
            });
        }

        Spinner genderSpinner[]={findViewById(R.id.gender_spinner),findViewById(R.id.gender_spinner2)};


        String[] genderOptions = {"Select", "Male", "Female", "Other"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_spinner_item,
                genderOptions
        );

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        for(int i=0;i<genderSpinner.length;i++){
            genderSpinner[i].setAdapter(adapter);

//            genderSpinner[i].setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//                @Override
//                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//                    String selectedGender = parent.getItemAtPosition(position).toString();
//
//                    // Show a Toast message for the selected item
//                    if (!selectedGender.equals("Select Gender")) {
//                        Toast.makeText(HouseServeyForm.this, "Selected: " + selectedGender, Toast.LENGTH_SHORT).show();
//                    }
//                }
//
//                @Override
//                public void onNothingSelected(AdapterView<?> parent) {
//                    // Handle the case where no item is selected (optional)
//                }
//            });
        }


        //General Household information

        Spinner spinnerObj[]={
                findViewById(R.id.category_spinner),
                findViewById(R.id.status_spinner),
                findViewById(R.id.house_spinner),
                findViewById(R.id.Type_of_house_spinner),
                findViewById(R.id.Toilet_spinner),
                findViewById(R.id.Drainage_spinner),
                findViewById(R.id.Waste_spinner),
                findViewById(R.id.Composite_spinner),
                findViewById(R.id.BioGasPlant_Spinner),//count 0-8

                findViewById(R.id.energy_spinner2),//7.Source Of Energy
                findViewById(R.id.energy_spinner3),//7.Source of Energy
                findViewById(R.id.energy_spinner4),//7.Source of Energy 9-11

                findViewById(R.id.irrigation_spinner1),//9.Agricultural Inputs 12
                findViewById(R.id.irrigation_spinner2),//9.Agricultural Inputs 13

                findViewById(R.id.liveStock_spinner1),//10.Livestock Numbers 14
        };

        ArrayAdapter<?> adapterObj[] = {
                new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, new String[]{"Select", "Gen", "SC", "ST", "OBC"}),
                new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, new String[]{"Select", "Active", "Inactive", "Pending"}),
                new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, new String[]{"Select", "Owned", "Rented", "Others"}),
                new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, new String[]{"Select", "Kutcha", "Semi Pucca", "Pucca","Homeless"}),
                new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, new String[]{"Select", "Private", "Community", "Open Defecation"}),
                new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, new String[]{"Select", "Covered", "Open", "None"}),
                new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, new String[]{"Select", "Door Step", "Common Point", "No Collection System"}),
                new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, new String[]{"Select", "Individual", "Group", "None"}),
                new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, new String[]{"Select", "Individual", "Group","Community", "None"}),

                new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, new String[]{"Select", "Electricity", "Kerosene","Solar Power","Coal"}),//7.Source of Energy
                new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, new String[]{"Select", "LPG", "Biogas","Kerosene","Wood","Cow Dung","Agro-Residues","Electricity"}),//7.Source of Energy
                new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, new String[]{"Select", "Normal", "Smokeless"}),//7.Source of Energy

                new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, new String[]{"Select", "Canal", "Tank","Borewell","River","Other","None"}),//9.Agricultural Inputs
                new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, new String[]{"Select", "Drip", "Sprinkler","Flooding","None"}),//9.Agricultural Inputs

                new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, new String[]{"Select", "Pucca", "Kutcha","Open"  }),//10.Livestock Numbers
        };

        for (int i = 0; i < spinnerObj.length; i++) {
            if (spinnerObj[i] != null) {
                adapterObj[i].setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                spinnerObj[i].setAdapter(adapterObj[i]);
            } else {
                Log.e("SpinnerSetup", "Spinner object at index " + i + " is null.");
            }
        }

        //5. Information of Government Schemes

        Spinner schemes[]={
                findViewById(R.id.schemes_spinner1),
                findViewById(R.id.schemes_spinner2),
                findViewById(R.id.schemes_spinner3),
                findViewById(R.id.schemes_spinner4),
                findViewById(R.id.schemes_spinner5),
                findViewById(R.id.schemes_spinner6),
                findViewById(R.id.schemes_spinner7),

                findViewById(R.id.energy_spinner1)//7.Source Of energy 7
        };

        ArrayAdapter<String> schemesAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_spinner_item,
                new String[]{"Select", "Yes", "No"}
        );

        schemesAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        for(int i=0;i<schemes.length;i++){
            schemes[i].setAdapter(schemesAdapter);
        }


        //member list


        serveyEntity.setFamily_member_information(new ArrayList<>());
        RecyclerView memberRecycler=findViewById(R.id.activity_house_servey_recyclerView);
        adapterMember adapter_member=new adapterMember();
        memberRecycler.setLayoutManager(new LinearLayoutManager(this));
        memberRecycler.setAdapter(adapter_member);

        Button add_member_btn=findViewById(R.id.add_member_btn);

        add_member_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                serveyEntity.addMember(new HouseServeyEntity().new family_info());
                adapter_member.update(serveyEntity.getFamily_member_information().size()-1);
            }
        });


        //Sources of Energy

        serveyEntity.setSource_of_energy(new HouseServeyEntity().new energy());
        RecyclerView AppliancesRecycler=findViewById(R.id.activity_house_servey_recyclerView2);
        adapterAppliances appliances=new adapterAppliances();
        AppliancesRecycler.setLayoutManager(new LinearLayoutManager(this));
        AppliancesRecycler.setAdapter(appliances);

        Button addAppliances=findViewById(R.id.add_member_btn_appliances);

        addAppliances.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                serveyEntity.getSource_of_energy().addAppliances(new HouseServeyEntity().new energy().new Appliances());
                appliances.update(serveyEntity.getSource_of_energy().getAppliances().size());
            }
        });


        //Agricultural Inputs
        RadioGroup radioBtns[]={
                findViewById(R.id.radioGroup_1),
                findViewById(R.id.radioGroup_2),
                findViewById(R.id.radioGroup_3),
                findViewById(R.id.radioGroup_4),
        };

        EditText inputDataAgri[]={
                findViewById(R.id.enterDataIfYes1),
                findViewById(R.id.enterDataIfYes2),
                findViewById(R.id.enterDataIfYes3),
                findViewById(R.id.enterDataIfYes4),
        };

        for(int i=0;i<radioBtns.length;i++){
            final int iFinal=i;
            radioBtns[i].setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int i) {
                    RadioButton radioButton=radioGroup.findViewById(i);

                    String val=radioButton.getText().toString();
                    if(val.equals("Yes")){
                        inputDataAgri[iFinal].setVisibility(View.VISIBLE);
                    }else{
                        inputDataAgri[iFinal].setVisibility(View.GONE);
                    }

                    switch (iFinal+1){
                        case 1:serveyEntity.getAgricultural_inputs().getDo_you_use_chemical_fertilisers().setAnswer(val);break;
                        case 2:serveyEntity.getAgricultural_inputs().getDo_you_use_chemical_insecticides().setAnswer(val);break;
                        case 3:serveyEntity.getAgricultural_inputs().getDo_you_use_Chemical_Weedicide().setAnswer(val);break;
                        case 4:serveyEntity.getAgricultural_inputs().getDo_you_organic_manures().setAnswer(val);break;
                    }
                }
            });
        }


        //Agricultural Produce

        serveyEntity.setAgricultural_produce_in_a_normal_year(new ArrayList<>());
        RecyclerView recyclerProduce_agri=findViewById(R.id.activity_house_servey_recyclerView3);
        recyclerProduce_agri.setLayoutManager(new LinearLayoutManager(this));
        adapterAdriProd adriProd=new adapterAdriProd();
        recyclerProduce_agri.setAdapter(adriProd);

        Button addAgriPro=findViewById(R.id.add_agriProdu_btn);

        addAgriPro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                serveyEntity.addAgricultural_produce_in_a_normal_year(new HouseServeyEntity().new agri_produce());
                adriProd.update(serveyEntity.getAgricultural_produce_in_a_normal_year().size());
            }
        });


        //Problem

        serveyEntity.setMajor_problem_in_village(new ArrayList<>());
        RecyclerView recyclerProblem=findViewById(R.id.activity_house_servey_recyclerView4);
        recyclerProblem.setLayoutManager(new LinearLayoutManager(this));
        adapterProblem adapter_Problem=new adapterProblem();
        recyclerProblem.setAdapter(adapter_Problem);

        Button problemBtn=findViewById(R.id.add_problem_btn);

        problemBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                serveyEntity.addProblem(new HouseServeyEntity().new problem());
                adapter_Problem.update(serveyEntity.getMajor_problem_in_village().size());
            }
        });

        //Migration Data

        RadioGroup migrationGroup=findViewById(R.id.migration_radio_group);
        LinearLayout migrationDataLinear=findViewById(R.id.activity_house_append_linear);

        migrationGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton radioButton=radioGroup.findViewById(i);

                if(radioButton.getText().equals("Yes")){
                    migrationDataLinear.setVisibility(View.VISIBLE);
                    serveyEntity.getMigration_status_in_a_family().setDid_any_of_them_migrate("Yes");
                }else{
                    migrationDataLinear.setVisibility(View.GONE);
                    serveyEntity.getMigration_status_in_a_family().setDid_any_of_them_migrate("No");
                }
            }
        });

        //saving Data

        Button saveData=findViewById(R.id.save_form_house_hold);

        saveData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean cou=true;
                String instanceData=null;

                //Basic info
                for(int i=0;i<BasicInfo.length;i++){

                    instanceData=((EditText)BasicInfo[i]).getText().toString();
                    if(instanceData.isEmpty()){
                        cou=false;
                        Toast.makeText(getApplicationContext(),"Please provide basic information.",Toast.LENGTH_SHORT).show();
                        break;
                    }

                    switch (i+1){
                        case 1:serveyEntity.setVillage(instanceData);break;
                        case 2:serveyEntity.setGram_Panchayat(instanceData);break;
                        case 3:serveyEntity.setWard_No(instanceData);break;
                        case 4:serveyEntity.setBlock(instanceData);break;
                        case 5:serveyEntity.setDistrict(instanceData);break;
                        case 6:serveyEntity.setState(instanceData);break;
                        default:
                            Log.v("Saving","Something went wrong");
                            cou=false;
                            Toast.makeText(getApplicationContext(),"Something went wrong.",Toast.LENGTH_SHORT).show();
                    }
                }

                if(cou){

                    //1. Respondent’s Profile
                    HouseServeyEntity.Profile obj=new HouseServeyEntity().new Profile();

                    for(int i=0;i<ResProfile.length;i++){
                        instanceData=((EditText)ResProfile[i]).getText().toString();

                        if(instanceData.isEmpty()){
                            cou=false;
                            break;
                        }

                        switch (i+1){
                            case 1:obj.setName(instanceData);break;
                            case 2:obj.setAge(Integer.parseInt(instanceData));break;
                            case 3:obj.setRelationship_with_Head_of_Household(instanceData);break;
                            case 4:obj.setContact_Number(instanceData);break;
                        }
                    }

                    instanceData=genderSpinner[0].getSelectedItem().toString();
                    if(!cou || instanceData.equals("Select")){
                        Toast.makeText(getApplicationContext(),"Incomplete Respondent’s Profile information.",Toast.LENGTH_SHORT).show();
                    }else{
                        obj.setGender(instanceData);
                        serveyEntity.setRespondent_Profile(obj);

                        //2. General Household Information

                        HouseServeyEntity.general generalObj=new HouseServeyEntity().new general();

                        for(int i=0;i<9;i++){
                            instanceData=spinnerObj[i].getSelectedItem().toString();

                            if(instanceData.equals("Select")){
                                cou=false;
                                break;
                            }

                            switch (i+1){
                                case 1:generalObj.setCategory(instanceData);break;
                                case 2:generalObj.setPoverty_Status(instanceData);break;
                                case 3:generalObj.setOwn_House(instanceData);break;
                                case 4:generalObj.setTypes_of_House(instanceData);break;
                                case 5:generalObj.setToliet(instanceData);break;
                                case 6:generalObj.setDrainage_linked_to_House(instanceData);break;
                                case 7:generalObj.setWaste_Collection_System(instanceData);break;
                                case 8:generalObj.setCompost_Pit(instanceData);break;
                                case 9:generalObj.setBiogas_plant(instanceData);break;
                            }
                        }

                        instanceData=((EditText)generalInfo[0]).getText().toString();
                        if(instanceData==null || instanceData.isEmpty()){
                            cou=false;
                        }
                        generalObj.setName_of_the_head(instanceData);
                        instanceData=((EditText)generalInfo[1]).getText().toString();
                        if(instanceData==null || instanceData.isEmpty()){
                            cou=false;
                        }else{
                            generalObj.setNo_of_family_members(Integer.parseInt(instanceData));
                        }
                        //Toast.makeText(getApplicationContext(),instanceData,Toast.LENGTH_SHORT).show();

                        instanceData=genderSpinner[1].getSelectedItem().toString();
                        if(instanceData.equals("Select")){
                            cou=false;
                        }
                        generalObj.setGender(instanceData);
                        if(!cou){
                            Toast.makeText(getApplicationContext(),"Incomplete General Household Information",Toast.LENGTH_SHORT).show();
                        }else{
                            serveyEntity.setGeneral_Household_information(generalObj);

                            //3. Family Member Information
                            if(serveyEntity.getFamily_member_information().size()==0){
                                Toast.makeText(getApplicationContext(),"Incomplete family members Information",Toast.LENGTH_SHORT).show();
                            }else{
                                //Log.v("DataShow",new Gson().toJson(serveyEntity));
                                //Log.v("DataShow",serveyEntity.getFamily_member_information().get(0).getComputer_Literate());

                                //4. Migration status
                                instanceData=serveyEntity.getMigration_status_in_a_family().getDid_any_of_them_migrate();
                                if(instanceData==null || instanceData.isEmpty()){
                                    cou=false;
                                }

                                if(cou){
                                    if(instanceData.equals("Yes")){
                                        for(int i=0;i<migrationInfo.length;i++){
                                            instanceData=((EditText)migrationInfo[i]).getText().toString();

                                            if(instanceData==null || instanceData.isEmpty()){
                                                cou=false;
                                                break;
                                            }

                                            switch (i+1){
                                                case 1:serveyEntity.getMigration_status_in_a_family().setHow_many_members(Integer.parseInt(instanceData));break;
                                                case 2:serveyEntity.getMigration_status_in_a_family().setHow_many_days_months(Double.parseDouble(instanceData));break;
                                                case 3:serveyEntity.getMigration_status_in_a_family().setMigration_is_taking(Double.parseDouble(instanceData));break;
                                            }
                                        }
                                    }
                                }

                                if(!cou){
                                    Toast.makeText(getApplicationContext(),"Incomplete family Migration Data",Toast.LENGTH_SHORT).show();
                                }else{
                                    //Log.v("DataShow",new Gson().toJson(serveyEntity));

                                    //Government Schemes

                                    for(int i=0;i<schmeesInfo.length;i++){
                                        instanceData=((EditText)schmeesInfo[i]).getText().toString();

                                        if(instanceData==null || instanceData.isEmpty()){
                                            cou=false;
                                            break;
                                        }

                                        switch (i+1){
                                            case 1:serveyEntity.getInformation_of_Government_Schemes().setPM_jan_dhan_yojana(Integer.parseInt(instanceData));break;
                                            case 2:serveyEntity.getInformation_of_Government_Schemes().setSukanya_samridhi_yojana(Integer.parseInt(instanceData));break;
                                            case 3:serveyEntity.getInformation_of_Government_Schemes().setMudra_yojana(Integer.parseInt(instanceData));break;
                                            case 4:serveyEntity.getInformation_of_Government_Schemes().setPm_jivan_jyoti_bima_yojana(Integer.parseInt(instanceData));break;
                                            case 5:serveyEntity.getInformation_of_Government_Schemes().setPm_sutaksha_Bima_Yojana(Integer.parseInt(instanceData));break;
                                            case 6:serveyEntity.getInformation_of_Government_Schemes().setAtal_pension_Yojana(Integer.parseInt(instanceData));break;
                                            case 7:serveyEntity.getInformation_of_Government_Schemes().setKaushal_Vikas_Yojana(Integer.parseInt(instanceData));break;
                                            case 8:serveyEntity.getInformation_of_Government_Schemes().setJanani_Suraksha_Yojana(Integer.parseInt(instanceData));break;
                                        }
                                    }

                                    if(cou){
                                        for(int i=0;i<7;i++){
                                            instanceData=schemes[i].getSelectedItem().toString();
                                            if(instanceData.equals("Select")){
                                                cou=false;
                                                break;
                                            }
                                            switch (i+1){
                                                case 1:serveyEntity.getInformation_of_Government_Schemes().setFasal_Bima_Yojana(instanceData);break;
                                                case 2:serveyEntity.getInformation_of_Government_Schemes().setKisan_Credit_Card(instanceData);break;
                                                case 3:serveyEntity.getInformation_of_Government_Schemes().setKrishi_Sinchai_Yojana(instanceData);break;
                                                case 4:serveyEntity.getInformation_of_Government_Schemes().setSwachh_Bharat_Mission_Toilet(instanceData);break;
                                                case 5:serveyEntity.getInformation_of_Government_Schemes().setSoil_Health_Card(instanceData);break;
                                                case 6:serveyEntity.getInformation_of_Government_Schemes().setPM_Ujjwala_yojana(instanceData);break;
                                                case 7:serveyEntity.getInformation_of_Government_Schemes().setPM_Awas_Yojana(instanceData);break;
                                            }
                                        }
                                    }

                                    if(!cou){
                                        Toast.makeText(getApplicationContext(),"Incomplete Government Schemes Data",Toast.LENGTH_SHORT).show();
                                    }else{
                                        instanceData=schemes[7].getSelectedItem().toString();

                                        if(instanceData.equals("Select")){
                                            cou=false;
                                        }

                                        if(cou){
                                            serveyEntity.getSource_of_energy().setElectricity_Connection_to_Household(instanceData);

                                            for(int i=9;i<=11;i++){
                                                instanceData=spinnerObj[i].getSelectedItem().toString();

                                                if(instanceData.equals("Select")){
                                                    cou=false;
                                                    break;
                                                }

                                                switch (i){
                                                    case 9:serveyEntity.getSource_of_energy().setLighting(instanceData);break;
                                                    case 10:serveyEntity.getSource_of_energy().setCooking(instanceData);break;
                                                    case 11:serveyEntity.getSource_of_energy().setIf_cooking_in_chullah(instanceData);break;
                                                }
                                            }

                                            instanceData=((EditText)energyInfo).getText().toString();
                                            if(!cou || instanceData.isEmpty() || instanceData==null || serveyEntity.getSource_of_energy().getAppliances().size()==0){
                                                Toast.makeText(getApplicationContext(),"Incomplete information Source of Energy ",Toast.LENGTH_SHORT).show();
                                            }else{
                                                serveyEntity.getSource_of_energy().setElectricity_Availability(Integer.parseInt(instanceData));

                                                for(int i=0;i<landInfo.length;i++){
                                                    instanceData=((EditText)landInfo[i]).getText().toString();

                                                    if(instanceData==null || instanceData.isEmpty()){
                                                        cou=false;
                                                        break;
                                                    }

                                                    switch (i+1){
                                                        case 1:serveyEntity.getLandholding_information().setTotal(Double.parseDouble(instanceData));break;
                                                        case 2:serveyEntity.getLandholding_information().setCultivable(Double.parseDouble(instanceData));break;
                                                        case 3:serveyEntity.getLandholding_information().setIrrigated_Area(Double.parseDouble(instanceData));break;
                                                        case 4:serveyEntity.getLandholding_information().setUn_irrigated_Area(Double.parseDouble(instanceData));break;
                                                        case 5:serveyEntity.getLandholding_information().setBarren_Area(Double.parseDouble(instanceData));break;
                                                        case 6:serveyEntity.getLandholding_information().setUncultivable_Area(Double.parseDouble(instanceData));break;
                                                    }
                                                }

                                                if(!cou){
                                                    Toast.makeText(getApplicationContext(),"Incomplete Landholding Information",Toast.LENGTH_SHORT).show();
                                                }else{

                                                    //Agrisultural inputs

                                                    HouseServeyEntity.Agricultural aObj=serveyEntity.getAgricultural_inputs();
                                                    if(aObj.getDo_you_organic_manures().getAnswer()==null || aObj.getDo_you_use_Chemical_Weedicide().getAnswer()==null || aObj.getDo_you_use_chemical_insecticides().getAnswer()==null || aObj.getDo_you_use_chemical_fertilisers().getAnswer()==null){
                                                        cou=false;
                                                    }

                                                    if(cou){

                                                        instanceData=inputDataAgri[0].getText().toString();
                                                        if(aObj.getDo_you_use_chemical_fertilisers().getAnswer().equals("Yes") && !instanceData.isEmpty()){
                                                            aObj.getDo_you_use_chemical_fertilisers().setIf_yes(instanceData);
                                                        }else if(!aObj.getDo_you_use_chemical_fertilisers().getAnswer().equals("No")){
                                                            cou=false;
                                                        }

                                                        instanceData=inputDataAgri[1].getText().toString();
                                                        if(cou && aObj.getDo_you_use_chemical_insecticides().getAnswer().equals("Yes") && !instanceData.isEmpty()){
                                                            aObj.getDo_you_use_chemical_insecticides().setIf_yes(instanceData);
                                                        }else if(cou && !aObj.getDo_you_use_chemical_insecticides().getAnswer().equals("No")){
                                                            cou=false;
                                                        }

                                                        instanceData=inputDataAgri[2].getText().toString();
                                                        if(cou && aObj.getDo_you_use_Chemical_Weedicide().getAnswer().equals("Yes") && !instanceData.isEmpty()){
                                                            aObj.getDo_you_use_Chemical_Weedicide().setIf_yes(instanceData);
                                                        }else if(cou && !aObj.getDo_you_use_Chemical_Weedicide().getAnswer().equals("No")){
                                                            cou=false;
                                                        }

                                                        instanceData=inputDataAgri[3].getText().toString();
                                                        if(cou && aObj.getDo_you_organic_manures().getAnswer().equals("Yes") && !instanceData.isEmpty()){
                                                            aObj.getDo_you_organic_manures().setIf_yes(instanceData);
                                                        }else if(cou && !aObj.getDo_you_organic_manures().getAnswer().equals("No")){
                                                            cou=false;
                                                        }

                                                        if(cou){

                                                            if(spinnerObj[12].getSelectedItem().toString().equals("Select") || spinnerObj[13].getSelectedItem().toString().equals("Select")){
                                                                cou=false;
                                                            }

                                                            if(!cou){
                                                                Toast.makeText(getApplicationContext(),"Incomplete Agricultural Data",Toast.LENGTH_SHORT).show();
                                                            }else{
                                                                aObj.setIrrigation(spinnerObj[12].getSelectedItem().toString());
                                                                aObj.setIrrigation_System(spinnerObj[13].getSelectedItem().toString());

                                                                serveyEntity.setAgricultural_inputs(aObj);

                                                                //Agricultural Produce in a normal year
                                                                if(serveyEntity.getAgricultural_produce_in_a_normal_year().isEmpty()){
                                                                    cou=false;
                                                                    Toast.makeText(getApplicationContext(),"Incomplete data about \"Agricultural Produce in a normal year\".",Toast.LENGTH_SHORT).show();
                                                                }

                                                                if(cou){
                                                                    //Livestock Numbers

                                                                    for(int i=0;i<livestock.length-1;i++){
                                                                        instanceData=((EditText)livestock[i]).getText().toString();

                                                                        if(instanceData.isEmpty() || instanceData==null){
                                                                            cou=false;
                                                                            break;
                                                                        }

                                                                        switch (i+1){
                                                                            case 1:serveyEntity.getLivestock_number().setCows(Integer.parseInt(instanceData));break;
                                                                            case 2:serveyEntity.getLivestock_number().setBuffalo(Integer.parseInt(instanceData));break;
                                                                            case 3:serveyEntity.getLivestock_number().setSheep(Integer.parseInt(instanceData));break;
                                                                            case 4:serveyEntity.getLivestock_number().setCalves(Integer.parseInt(instanceData));break;
                                                                            case 5:serveyEntity.getLivestock_number().setBullocks(Integer.parseInt(instanceData));break;
                                                                            case 6:serveyEntity.getLivestock_number().setPoultry(Integer.parseInt(instanceData));break;
                                                                            case 7:serveyEntity.getLivestock_number().setAverage_Daily_Production_Milk(Double.parseDouble(instanceData));break;
                                                                            case 8:serveyEntity.getLivestock_number().setAnimal_waste(Double.parseDouble(instanceData));break;
                                                                        }
                                                                    }

                                                                    instanceData=((EditText)livestock[livestock.length-1]).getText().toString();
                                                                    if(!cou || instanceData.isEmpty() || spinnerObj[14].getSelectedItem().toString().equals("Select")){
                                                                        Toast.makeText(getApplicationContext(),"Incomplete information about Livestock",Toast.LENGTH_SHORT).show();
                                                                    }else{
                                                                        //Log.v("DataShow",new Gson().toJson(serveyEntity));


                                                                        for(int i=0;i<waterInput.length;i++){
                                                                            instanceData=waterInput[i].getText().toString();

                                                                            switch (i+1){
                                                                                case 1:serveyEntity.getSource_of_Water().getPiped_Water_at_Home().setDistance(instanceData);break;
                                                                                case 2:serveyEntity.getSource_of_Water().getCommunity_Water_Tap().setDistance(instanceData);break;
                                                                                case 3:serveyEntity.getSource_of_Water().getHand_Pump().setDistance(instanceData);break;
                                                                                case 4:serveyEntity.getSource_of_Water().getOpen_Well().setDistance(instanceData);break;
                                                                                case 5:serveyEntity.getSource_of_Water().setMode_of_Water_Storage(instanceData);break;
                                                                                case 6:serveyEntity.getSource_of_Water().setAny_other_source(instanceData);break;
                                                                            }
                                                                        }

                                                                        AlertDialog.Builder builder=new AlertDialog.Builder(HouseServeyForm.this);
                                                                        builder.setTitle("Confirmation")
                                                                                .setMessage("Confirm before you save.\nYou Can not edit after words.")
                                                                                .setPositiveButton("Save", new DialogInterface.OnClickListener() {
                                                                                    @Override
                                                                                    public void onClick(DialogInterface dialogInterface, int i) {
                                                                                        String data=localStorage.loadHouseHoldReports();
                                                                                        ArrayList<ReportDetails> list;
                                                                                        if(data==null || data.isEmpty()){
                                                                                            list=new ArrayList<>();
                                                                                        }else{
                                                                                            Log.v("dataStored",data);
                                                                                            try {
                                                                                                list = new Gson().fromJson(data, new TypeToken<ArrayList<ReportDetails>>() {
                                                                                                }.getType());
                                                                                            }catch (Exception e){
                                                                                                list=new ArrayList<>();
                                                                                            }
                                                                                        }

                                                                                        try {
                                                                                            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                                                                                                serveyEntity.setDate_of_Survey(LocalDate.now().toString());
                                                                                            }
                                                                                        }catch (Exception e){
                                                                                            Toast.makeText(getApplicationContext(),e.getMessage(),Toast.LENGTH_SHORT).show();
                                                                                        }
                                                                                        ReportDetails reportDetails=new ReportDetails();
                                                                                        reportDetails.setHouseServeyEntity(serveyEntity);
                                                                                        reportDetails.setName("House Hold Survey - "+serveyEntity.getBlock());
                                                                                        /*if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                                                                                            reportDetails.setDate(LocalDate.now().toString());
                                                                                        }*/

                                                                                        reportDetails.setStatus("Pending");
                                                                                        list.add(reportDetails);
                                                                                        localStorage.saveHouseHoldReports(new Gson().toJson(list));

                                                                                        finish();
                                                                                    }
                                                                                }).setNegativeButton("No", new DialogInterface.OnClickListener() {
                                                                                    @Override
                                                                                    public void onClick(DialogInterface dialogInterface, int i) {
                                                                                        dialogInterface.dismiss();
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
                                }

                            }

                        }

                    }

                    //Toast.makeText(getApplicationContext(),obj.getGender(),Toast.LENGTH_SHORT).show();
                }
            }
        });








        /*genderSpinner.setAdapter(adapter);

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
        });*/

    }

    class adapterMember extends RecyclerView.Adapter<adapterMember.viewHolder> {

        ArrayAdapter<?> spinnerAdapter[];

        public adapterMember(){
            spinnerAdapter=new ArrayAdapter[]{
                    new ArrayAdapter<>(getApplicationContext(),android.R.layout.simple_spinner_item, new String[]{"Select", "Male", "Female", "Other"}),
                    new ArrayAdapter<>(getApplicationContext(),android.R.layout.simple_spinner_item, new String[]{"Select", "Not Literate", "Literate", "Completed class 5","Completed class 8","Completed class 10","Completed class 12","ITI Diploma","Graduate","Post Graduate/Professional"}),
                    new ArrayAdapter<>(getApplicationContext(),android.R.layout.simple_spinner_item, new String[]{"Select", "Going To AWS", "School", "College","Not Going","Not Applicable"}),
                    new ArrayAdapter<>(getApplicationContext(),android.R.layout.simple_spinner_item, new String[]{"Select", "No Pension", "Old Age Pension", "Widow Pension","Disability Pension","Other Pension"}),
                    new ArrayAdapter<>(getApplicationContext(),android.R.layout.simple_spinner_item, new String[]{"Select", "Farming On Own Land", "Sharecropping/Farming Leased Land","Animal Husbandry","Pisci-culture/Poultry","Fishing","Skilled Wage Worker","Unskilled Wage Worker","Salaried Employment in Government","Salaried Employment in private","Weaving","Other Artisan","Other Trade & Business"}),

                    new ArrayAdapter<>(getApplicationContext(),android.R.layout.simple_spinner_item, new String[]{"Select", "Yes", "No"}),
            };

            for(int i=0;i<spinnerAdapter.length;i++){
                spinnerAdapter[i].setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            }
        }


        public void update(int x){
            notifyItemInserted(x);
        }

        @NonNull
        @Override
        public adapterMember.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            return new viewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_member_data, parent, false));
        }

        @Override
        public void onBindViewHolder(@NonNull adapterMember.viewHolder holder, @SuppressLint("RecyclerView") int position) {


            holder.clickView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(holder.expandLayout.getVisibility()==View.VISIBLE){
                        TransitionManager.beginDelayedTransition(holder.baseView, new AutoTransition());
                        holder.expandLayout.setVisibility(View.GONE);
                    }else{
                        TransitionManager.beginDelayedTransition(holder.baseView, new AutoTransition());
                        holder.expandLayout.setVisibility(View.VISIBLE);
                    }
                }
            });

            for(int i=0;i<holder.spinnerList.size();i++){
                if(i<=4){
                    holder.spinnerList.get(i).setAdapter(spinnerAdapter[i]);
                }else{
                    holder.spinnerList.get(i).setAdapter(spinnerAdapter[5]);
                }

                final int finalI=i;

                holder.spinnerList.get(i).setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> adapterView, View view, int j, long l) {
                        String data=adapterView.getItemAtPosition(j).toString();

                        switch (finalI+1){
                            case 1:serveyEntity.getFamily_member_information().get(position).setSex(data);break;
                            case 2:serveyEntity.getFamily_member_information().get(position).setLevel_of_Education(data);break;
                            case 3:serveyEntity.getFamily_member_information().get(position).setGoing_to_AWS_or_School_or_College(data);break;
                            case 4:serveyEntity.getFamily_member_information().get(position).setSocial_Security(data);break;
                            case 5:serveyEntity.getFamily_member_information().get(position).setOccupations(data);break;
                            case 6:serveyEntity.getFamily_member_information().get(position).setAadhaar_Card(data);break;
                            case 7:serveyEntity.getFamily_member_information().get(position).setBank_Account(data);break;
                            case 8:serveyEntity.getFamily_member_information().get(position).setComputer_Literate(data);break;
                            case 9:serveyEntity.getFamily_member_information().get(position).setMNREGA_Job_Card(data);break;
                        }
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> adapterView) {

                    }
                });
            }

            final int finalPosition=position;
            for(int i=0;i<holder.editTextsList.size();i++){

                final int finalI=i;
                holder.editTextsList.get(i).addTextChangedListener(new TextWatcher() {
                    @Override
                    public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                    }

                    @Override
                    public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                    }

                    @Override
                    public void afterTextChanged(Editable editable) {
                        String dataInsta=editable.toString();


                        switch (finalI+1){
                            case 1:serveyEntity.getFamily_member_information().get(finalPosition).setName(dataInsta);break;
                            case 2:serveyEntity.getFamily_member_information().get(finalPosition).setAge(Integer.parseInt(dataInsta));break;
                            case 3:serveyEntity.getFamily_member_information().get(finalPosition).setMajor_Health_problem(dataInsta);break;
                        }
                    }
                });
            }

        }

        @Override
        public int getItemCount() {
            return serveyEntity.getFamily_member_information().size();
        }

        public class viewHolder extends RecyclerView.ViewHolder {

            CardView baseView;
            RelativeLayout clickView;
            LinearLayout expandLayout;

            ArrayList<Spinner> spinnerList;

            ArrayList<EditText> editTextsList;


            public viewHolder(@NonNull View itemView) {
                super(itemView);
                spinnerList=new ArrayList<>();
                editTextsList=new ArrayList<>();
                baseView=itemView.findViewById(R.id.base_item_member);
                clickView=itemView.findViewById(R.id.click_item_member);
                expandLayout=itemView.findViewById(R.id.expand_item_member);
                //spinner
                spinnerList.add(itemView.findViewById(R.id.gender_spinner_item_member));
                spinnerList.add(itemView.findViewById(R.id.education_spinner_item_member));
                spinnerList.add(itemView.findViewById(R.id.aws_spinner_item_member));
                spinnerList.add(itemView.findViewById(R.id.pension_spinner_item_member));
                spinnerList.add(itemView.findViewById(R.id.occupation_spinner_item_member));

                spinnerList.add(itemView.findViewById(R.id.Aadhaar_spinner_item_member));
                spinnerList.add(itemView.findViewById(R.id.Bank_spinner_item_member));
                spinnerList.add(itemView.findViewById(R.id.Computer_spinner_item_member));
                spinnerList.add(itemView.findViewById(R.id.MNGRE_spinner_item_member));

                //EditText
                editTextsList.add(itemView.findViewById(R.id.item_member_data_input_1));
                editTextsList.add(itemView.findViewById(R.id.item_member_data_input_2));
                editTextsList.add(itemView.findViewById(R.id.item_member_data_input_3));
            }
        }
    }

    class adapterAppliances extends RecyclerView.Adapter<adapterAppliances.viewHolder>{

        public void update(int x){
            notifyItemInserted(x);
        }

        @NonNull
        @Override
        public adapterAppliances.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            return new adapterAppliances.viewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_appliance_data, parent, false));
        }

        @Override
        public void onBindViewHolder(@NonNull adapterAppliances.viewHolder holder, int position) {

            final int finalPosition=position;

            for(int i=0;i<holder.dataApp.length;i++){
                int finalI = i;
                holder.dataApp[i].addTextChangedListener(new TextWatcher() {
                    @Override
                    public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                    }

                    @Override
                    public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                    }

                    @Override
                    public void afterTextChanged(Editable editable) {
                        String data=editable.toString();

                        switch (finalI +1){
                            case 1:serveyEntity.getSource_of_energy().getAppliances().get(finalPosition).setName(data);break;
                            case 2:serveyEntity.getSource_of_energy().getAppliances().get(finalPosition).setNos(Integer.parseInt(data));break;
                            case 3:serveyEntity.getSource_of_energy().getAppliances().get(finalPosition).setDuration(Integer.parseInt(data));break;
                        }
                    }
                });
            }
        }

        @Override
        public int getItemCount() {
            return serveyEntity.getSource_of_energy().getAppliances().size();
        }

        public class viewHolder extends RecyclerView.ViewHolder {

            EditText dataApp[];

            public viewHolder(@NonNull View itemView) {
                super(itemView);
                dataApp=new EditText[]{
                        itemView.findViewById(R.id.item_appliance_data_1),
                        itemView.findViewById(R.id.item_appliance_data_2),
                        itemView.findViewById(R.id.item_appliance_data_3),
                };
            }
        }
    }

    class adapterAdriProd extends RecyclerView.Adapter<adapterAdriProd.viewHolder>{

        public void update(int x){
            notifyItemInserted(x);
        }

        @NonNull
        @Override
        public adapterAdriProd.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            return new viewHolder(LayoutInflater.from(getApplicationContext()).inflate(R.layout.item_agri_produce,parent,false));
        }

        @Override
        public void onBindViewHolder(@NonNull adapterAdriProd.viewHolder holder, int position) {
            final int finalPosition=position;

            for(int i=0;i<holder.inputData.length;i++){

                final int finalI=i;
                holder.inputData[i].addTextChangedListener(new TextWatcher() {
                    @Override
                    public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                    }

                    @Override
                    public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                    }

                    @Override
                    public void afterTextChanged(Editable editable) {
                        String st=editable.toString();

                        switch (finalI+1){
                            case 1:serveyEntity.getAgricultural_produce_in_a_normal_year().get(finalPosition).setCrop(st);break;
                            case 2:serveyEntity.getAgricultural_produce_in_a_normal_year().get(finalPosition).setArea(Double.parseDouble(st));break;
                            case 3:serveyEntity.getAgricultural_produce_in_a_normal_year().get(finalPosition).setProductivity(Double.parseDouble(st));break;
                        }
                    }
                });
            }
        }

        @Override
        public int getItemCount() {
            return serveyEntity.getAgricultural_produce_in_a_normal_year().size();
        }

        public class viewHolder extends RecyclerView.ViewHolder {

            EditText inputData[];

            public viewHolder(@NonNull View itemView) {
                super(itemView);

                inputData=new EditText[]{
                    itemView.findViewById(R.id.item_agri_produce_input_1),
                    itemView.findViewById(R.id.item_agri_produce_input_2),
                    itemView.findViewById(R.id.item_agri_produce_input_3),
                };
            }
        }
    }

    class adapterProblem extends RecyclerView.Adapter<adapterProblem.viewHolder>{

        public void update(int x){
            notifyItemInserted(x);
        }

        @NonNull
        @Override
        public adapterProblem.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            return new viewHolder(LayoutInflater.from(getApplicationContext()).inflate(R.layout.item_problem,parent,false));
        }

        @Override
        public void onBindViewHolder(@NonNull adapterProblem.viewHolder holder, @SuppressLint("RecyclerView") int position) {
            for(int i=0;i<holder.inputData.length;i++){

                final int finalI=i;
                holder.inputData[i].addTextChangedListener(new TextWatcher() {
                    @Override
                    public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                    }

                    @Override
                    public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                    }

                    @Override
                    public void afterTextChanged(Editable editable) {
                        String data=editable.toString();
                        switch (finalI+1){
                            case 1:serveyEntity.getMajor_problem_in_village().get(position).setProblem(data);break;
                            case 2:serveyEntity.getMajor_problem_in_village().get(position).setSolution(data);break;
                        }
                    }
                });
            }
        }

        @Override
        public int getItemCount() {
            return serveyEntity.getMajor_problem_in_village().size();
        }

        public class viewHolder extends RecyclerView.ViewHolder {

            EditText inputData[];

            public viewHolder(@NonNull View itemView) {
                super(itemView);
                inputData=new EditText[]{
                        itemView.findViewById(R.id.item_problem_input_1),
                        itemView.findViewById(R.id.item_problem_input_2),
                };
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