package com.example.deepa.collegefinder;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by deepa on 07-11-2017.
 */

public class MainEngineering extends AppCompatActivity {
    ListView degr,diplo,cirte;
    String[] der={"BE/B.Tech","M.Phil/Ph.d in Engineering","ME/M.tech"};
    String[] dip={"Diploma in Engineering","Graduate Diploma in Engineering","PG Diploma in Engineering","UG Diploma in Engineering"};
    String[] cir={"Certifate in Engineering","Graduate Certifate in Engineering","UG Certifate in Engineering"};
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.engineering);
        degr=(ListView)findViewById(R.id.degree);
        diplo=(ListView)findViewById(R.id.diploma);
        cirte=(ListView)findViewById(R.id.cirtificate);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,der);
        degr.setAdapter(adapter);
        ArrayAdapter<String> adapter1=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,dip);
        ArrayAdapter<String> adapter2=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,cir);
        diplo.setAdapter(adapter1);
        cirte.setAdapter(adapter2);
        degr.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l)
            {
                Intent intent=new Intent(getApplicationContext(),PageSearching.class);
                intent.putExtra("Course",der[i]);
                startActivity(intent);
            }
        }) ;
        diplo.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView,View view,int i,long l)
            {
                Intent intent=new Intent(getApplicationContext(),PageSearching.class);
                intent.putExtra("Course",dip[i]);
                startActivity(intent);
            }
        });
        cirte.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView,View view,int i,long l)
            {
                Intent intent=new Intent(getApplicationContext(),PageSearching.class);
                intent.putExtra("Course",cir[i]);
                startActivity(intent);
            }
        });
    }

}
