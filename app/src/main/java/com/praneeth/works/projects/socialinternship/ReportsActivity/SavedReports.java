package com.praneeth.works.projects.socialinternship.ReportsActivity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.praneeth.works.projects.socialinternship.Forms.Entity.ReportDetails;
import com.praneeth.works.projects.socialinternship.Forms.Entity.ReportVillageDetails;
import com.praneeth.works.projects.socialinternship.Information.LocalStorage;
import com.praneeth.works.projects.socialinternship.R;
import com.praneeth.works.projects.socialinternship.Server.CallBack.LoginCallBack;
import com.praneeth.works.projects.socialinternship.Server.CallBack.ServerCallBack;
import com.praneeth.works.projects.socialinternship.Server.Login.VerifyUser;
import com.praneeth.works.projects.socialinternship.Server.SubmitReports.SubmitIntoFireStore;
import com.praneeth.works.projects.socialinternship.Server.Test.TestingFirestore;

import java.util.ArrayList;

public class SavedReports extends AppCompatActivity {

    LocalStorage laLocalStorage;
    ArrayList<ReportDetails> list;
    ArrayList<ReportVillageDetails> list2;

    ProgressBar progressBar;

    RecyclerView recyclerView,recyclerView2;
    adapter adap;
    Button submit;
    SubmitIntoFireStore storeData;

    private String id;

    adapterVillage adap2;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saved_reports);
        progressBar=findViewById(R.id.prograss_bar_saved_reports);
        submit=findViewById(R.id.submit_reports);
        laLocalStorage = new LocalStorage(getApplicationContext());
        recyclerView=findViewById(R.id.activity_saved_Recycler_viewed);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        recyclerView2=findViewById(R.id.activity_saved_reports_recycler_2);
        recyclerView2.setLayoutManager(new LinearLayoutManager(this));


        try{
            list = new Gson().fromJson(laLocalStorage.loadHouseHoldReports(), new TypeToken<ArrayList<ReportDetails>>() {
            }.getType());
        }catch (Exception e){
            Log.v("Errorrt",e.getMessage());
            list=new ArrayList<>();
        }

        if(list==null || list.isEmpty()){
            Log.v("Errorrt","Came inside.");
            findViewById(R.id.activity_saved_reports_text1).setVisibility(View.GONE);
        }

        adap=new adapter();
        recyclerView.setAdapter(adap);

        try{
            list2=new Gson().fromJson(laLocalStorage.loadVillageSurveyForm(),new TypeToken<ArrayList<ReportVillageDetails>>(){}.getType());
        }catch (Exception e){
            list2=new ArrayList<>();
        }

        if(list2==null || list2.isEmpty()){
            findViewById(R.id.activity_saved_reports_text2).setVisibility(View.GONE);
        }

        if((list==null || list.isEmpty()) && (list2==null || list2.isEmpty())){
            submit.setVisibility(View.GONE);
        }

        adap2=new adapterVillage();
        recyclerView2.setAdapter(adap2);


        TestingFirestore test=new TestingFirestore();
        //test.insert(list.get(0).getHouseServeyEntity());

        storeData=new SubmitIntoFireStore();
        /*store.saveReports("2300090274", list.get(0).getHouseServeyEntity(), new ServerCallBack() {
            @Override
            public void onSuccess() {

            }

            @Override
            public void onFailure(Exception e) {

            }
        });*/

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(id==null || id.isEmpty()){
                    loginDialog();
                }else{
                    submitList(0,id);
                }

                /*progressBar.setVisibility(View.VISIBLE);
                submit.setClickable(false);
                submit.setEnabled(false);

                submitList(0,"2300090274");*/

                /*for(int i=0;i<list.size();i++){

                    tes.setValue(list.get(i).getHouseServeyEntity(),new ServerCallBack() {
                        @Override
                        public void onSuccess() {

                        }

                        @Override
                        public void onFailure(Exception e) {

                        }
                    });
                }*/
            }
        });


    }

    @SuppressLint("MissingInflatedId")
    void loginDialog(){
        Dialog dialog=new Dialog(this);
        View view=LayoutInflater.from(this).inflate(R.layout.activity_login,null);
        dialog.setContentView(view);

        if(dialog.getWindow()!=null){
            dialog.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
        }

        EditText username=view.findViewById(R.id.login_username);
        EditText password=view.findViewById(R.id.login_password);
        Button loginBtn=view.findViewById(R.id.login_btn);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loginBtn.setEnabled(false);
                loginBtn.setClickable(false);

                String user_id=username.getText().toString();
                String pass=password.getText().toString();

                VerifyUser verifyUser=new VerifyUser();
                verifyUser.verify(Long.parseLong(user_id), pass, new LoginCallBack() {
                    @Override
                    public void success() {
                        id=""+user_id;
                        dialog.dismiss();
                        verifyUser.close();
                        submitList(0,id);
                    }

                    @Override
                    public void failure(String message) {
                        Toast.makeText(getApplicationContext(),message,Toast.LENGTH_SHORT).show();
                        verifyUser.close();

                        loginBtn.setEnabled(true);
                        loginBtn.setClickable(true);
                    }

                    @Override
                    public void error() {
                        Toast.makeText(getApplicationContext(),"Internal server error",Toast.LENGTH_SHORT).show();
                        verifyUser.close();

                        loginBtn.setEnabled(true);
                        loginBtn.setClickable(true);
                    }
                });
            }
        });

        dialog.show();
    }

    void submitList(int i,String id){

        if(list==null || i>=list.size()){
            //progressBar.setVisibility(View.GONE);

            laLocalStorage.saveVillageSurveyForm(new Gson().toJson((list==null || list.isEmpty())?"":list));
            submitList2(0,id);
            return;
        }
        /*store.saveReports(id, list.get(i).getHouseServeyEntity(), new ServerCallBack() {
            @Override
            public void onSuccess() {
                list.remove(i);
                submitList(i,id);

                adap.update();
            }

            @Override
            public void onFailure(Exception e) {
                submitList(i+1,id);
            }
        });*/

        storeData.submitHouseHold(id,list.get(i).getHouseServeyEntity().getDate_of_Survey(), list.get(i).getHouseServeyEntity(), new ServerCallBack() {
            @Override
            public void onSuccess() {
                list.remove(i);
                submitList(i,id);

                adap.update();
            }

            @Override
            public void onFailure(Exception e) {
                submitList(i+1,id);
            }
        });
    }

    void submitList2(int i,String id){
        if(list2==null || i>=list2.size()){
            progressBar.setVisibility(View.GONE);
            laLocalStorage.saveHouseHoldReports(new Gson().toJson((list2==null || list2.isEmpty())?"":list));
            if(list.isEmpty()){
                submit.setVisibility(View.GONE);
            }
            return;
        }

        storeData.submitVillage(id,list2.get(i).getVillageSurveyEntity().getVillage_Survey_date(), list2.get(i).getVillageSurveyEntity(), new ServerCallBack() {
            @Override
            public void onSuccess() {
                list2.remove(i);
                submitList2(i,id);

                adap2.update();
            }

            @Override
            public void onFailure(Exception e) {
                submitList2(i+1,id);
            }
        });
    }


    class adapter extends RecyclerView.Adapter<adapter.viewHolder>{

        public void update(){
            notifyDataSetChanged();
        }

        @NonNull
        @Override
        public adapter.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            return new viewHolder(LayoutInflater.from(getApplicationContext()).inflate(R.layout.item_reports1,parent,false));
        }

        @Override
        public void onBindViewHolder(@NonNull adapter.viewHolder holder, int position) {
            holder.textView1.setText(list.get(position).getName());
            holder.textView2.setText(list.get(position).getDate());

            holder.reportBox.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                }
            });
        }

        @Override
        public int getItemCount() {
            return (list==null)?0:list.size();
        }

        public class viewHolder extends RecyclerView.ViewHolder {

            TextView textView1,textView2;
            CheckBox reportBox;
            public viewHolder(@NonNull View itemView) {
                super(itemView);
                textView1=itemView.findViewById(R.id.item_reports1_text1);
                textView2=itemView.findViewById(R.id.item_reports1_text2);

                reportBox=itemView.findViewById(R.id.selected_box_report);
            }
        }
    }

    class adapterVillage extends RecyclerView.Adapter<adapterVillage.viewHolder>{

        public void update(){
            notifyDataSetChanged();
        }

        @NonNull
        @Override
        public adapterVillage.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            return new viewHolder(LayoutInflater.from(getApplicationContext()).inflate(R.layout.item_reports1,parent,false));
        }

        @Override
        public void onBindViewHolder(@NonNull adapterVillage.viewHolder holder, int position) {
            holder.textView1.setText(list2.get(position).getName());
            holder.textView2.setText(list2.get(position).getDate());
        }

        @Override
        public int getItemCount() {
            return (list2==null)?0:list2.size();
        }

        public class viewHolder extends RecyclerView.ViewHolder {

            TextView textView1,textView2;

            public viewHolder(@NonNull View itemView) {
                super(itemView);
                textView1=itemView.findViewById(R.id.item_reports1_text1);
                textView2=itemView.findViewById(R.id.item_reports1_text2);
            }
        }
    }


}