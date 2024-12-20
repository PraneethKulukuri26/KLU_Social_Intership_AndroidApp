package com.praneeth.works.projects.socialinternship.ReportsActivity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.os.Bundle;
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
import com.praneeth.works.projects.socialinternship.Information.LocalStorage;
import com.praneeth.works.projects.socialinternship.R;
import com.praneeth.works.projects.socialinternship.Server.CallBack.LoginCallBack;
import com.praneeth.works.projects.socialinternship.Server.CallBack.ServerCallBack;
import com.praneeth.works.projects.socialinternship.Server.Login.VerifyUser;
import com.praneeth.works.projects.socialinternship.Server.SubmitReports.SubmitIntoFireBase;
import com.praneeth.works.projects.socialinternship.Server.SubmitReports.SubmitIntoFireStore;
import com.praneeth.works.projects.socialinternship.Server.Test.TestingFirestore;

import java.util.ArrayList;

public class SavedReports extends AppCompatActivity {

    LocalStorage laLocalStorage;
    ArrayList<ReportDetails> list;

    ProgressBar progressBar;

    RecyclerView recyclerView;
    adapter adap;
    Button submit;
    SubmitIntoFireBase store;
    SubmitIntoFireStore storeData;

    private String id;


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
        adap=new adapter();
        recyclerView.setAdapter(adap);

        try{
            list = new Gson().fromJson(laLocalStorage.loadHouseHoldReports(), new TypeToken<ArrayList<ReportDetails>>() {
            }.getType());
        }catch (Exception e){
            list=new ArrayList<>();
        }


        TestingFirestore test=new TestingFirestore();
        //test.insert(list.get(0).getHouseServeyEntity());

        store=new SubmitIntoFireBase();
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

        if(i>=list.size()){
            progressBar.setVisibility(View.GONE);
            if(list.isEmpty()){
                submit.setVisibility(View.GONE);
            }
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

        storeData.submitHouseHold(id, list.get(i).getHouseServeyEntity(), new ServerCallBack() {
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
            holder.textView2.setText(list.get(position).getStatus());

            holder.reportBox.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                }
            });
        }

        @Override
        public int getItemCount() {
            return list.size();
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


}