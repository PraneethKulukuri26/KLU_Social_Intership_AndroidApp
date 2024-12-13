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
import android.os.Bundle;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.util.Log;
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
import android.widget.Toast;

import com.praneeth.works.projects.socialinternship.Forms.Entity.HouseServeyEntity;
import com.praneeth.works.projects.socialinternship.R;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class HouseServeyForm extends AppCompatActivity {

    CardView baseCard;

    HouseServeyEntity serveyEntity;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_house_servey_form);
        serveyEntity=new HouseServeyEntity();
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

        Spinner genderSpinner[]={findViewById(R.id.gender_spinner),findViewById(R.id.gender_spinner2)};


        String[] genderOptions = {"Select Gender", "Male", "Female", "Other"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_spinner_item,
                genderOptions
        );

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        for(int i=0;i<genderSpinner.length;i++){
            genderSpinner[i].setAdapter(adapter);

            genderSpinner[i].setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
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
                findViewById(R.id.BioGasPlant_Spinner),

                findViewById(R.id.energy_spinner2),//7.Source Of Energy
                findViewById(R.id.energy_spinner3),//7.Source of Energy
                findViewById(R.id.energy_spinner4),//7.Source of Energy

                findViewById(R.id.irrigation_spinner1),//9.Agricultural Inputs
                findViewById(R.id.irrigation_spinner2),//9.Agricultural Inputs

                findViewById(R.id.liveStock_spinner1),//10.Livestock Numbers
        };

        ArrayAdapter<?> adapterObj[] = {
                new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, new String[]{"Selected Category", "Gen", "SC", "ST", "OBC"}),
                new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, new String[]{"Select Poverty Status", "Active", "Inactive", "Pending"}),
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

                findViewById(R.id.energy_spinner1)//7.Source Of energy
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
        };

        EditText inputDataAgri[]={
                findViewById(R.id.enterDataIfYes1),
                findViewById(R.id.enterDataIfYes2)
        };

        for(int i=0;i<radioBtns.length;i++){
            final int iFinal=i;
            radioBtns[i].setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int i) {
                    RadioButton radioButton=radioGroup.findViewById(i);

                    if(radioButton.getText().equals("Yes")){
                        inputDataAgri[iFinal].setVisibility(View.VISIBLE);
                    }else{
                        inputDataAgri[iFinal].setVisibility(View.GONE);
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
        public void onBindViewHolder(@NonNull adapterMember.viewHolder holder, int position) {

            Log.v("refe","came");

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


            public viewHolder(@NonNull View itemView) {
                super(itemView);
                spinnerList=new ArrayList<>();
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

        }

        @Override
        public int getItemCount() {
            return serveyEntity.getSource_of_energy().getAppliances().size();
        }

        public class viewHolder extends RecyclerView.ViewHolder {
            public viewHolder(@NonNull View itemView) {
                super(itemView);
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

        }

        @Override
        public int getItemCount() {
            return serveyEntity.getAgricultural_produce_in_a_normal_year().size();
        }

        public class viewHolder extends RecyclerView.ViewHolder {
            public viewHolder(@NonNull View itemView) {
                super(itemView);
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
        public void onBindViewHolder(@NonNull adapterProblem.viewHolder holder, int position) {

        }

        @Override
        public int getItemCount() {
            return serveyEntity.getMajor_problem_in_village().size();
        }

        public class viewHolder extends RecyclerView.ViewHolder {
            public viewHolder(@NonNull View itemView) {
                super(itemView);
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