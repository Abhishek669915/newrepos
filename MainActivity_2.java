package com.example.deepa.collegefinder;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;



public class MainActivity_2 extends AppCompatActivity {
    ImageButton eng, med, mana, hotel, arch, law;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_2);
        eng = (ImageButton) findViewById(R.id.engineering);
        eng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainEngineering.class);
                startActivity(intent);
            }
        });
    }
}
