package com.praneeth.works.projects.socialinternship.ReportsActivity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.praneeth.works.projects.socialinternship.Forms.Entity.ReportDetails;
import com.praneeth.works.projects.socialinternship.Information.LocalStorage;
import com.praneeth.works.projects.socialinternship.R;

import java.util.ArrayList;

public class SavedReports extends AppCompatActivity {

    LocalStorage laLocalStorage;
    ArrayList<ReportDetails> list;


    RecyclerView recyclerView;
    adapter adap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saved_reports);
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


    }


    class adapter extends RecyclerView.Adapter<adapter.viewHolder>{

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