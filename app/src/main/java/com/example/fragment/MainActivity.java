package com.example.fragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    Button fragmenta, fragmentb,fragmentc;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmenta = findViewById(R.id.fragmentA);
        fragmentb = findViewById(R.id.fragmentB);
        fragmentc = findViewById(R.id.fragmentC);

        fragmenta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                LoadFrag(new FragmentA());

            }
        });

        fragmentb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                LoadFrag(new FragmentB());

            }
        });

        fragmentc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                LoadFrag(new FragmentC());

            }
        });

    }
    public void LoadFrag(Fragment fragment) {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.add(R.id.container, fragment); // Use the 'fragment' parameter directly
        ft.commit();
    }

}
