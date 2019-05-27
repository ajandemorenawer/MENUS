package com.example.menus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class pantalla2 extends AppCompatActivity {

    private int kcal=0;
    private double pvp=0;
    private TextView p2et3;
    private TextView p2et4;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla2);

        p2et3 = (TextView)findViewById(R.id.p2et3);
        p2et4 = (TextView)findViewById(R.id.p2et4);

        kcal = getIntent().getIntExtra("kcal",0);
        pvp  = getIntent().getDoubleExtra("pvp",0);

        String kcal_string = String.valueOf(kcal);
        String pvp_string  = String.valueOf(pvp);

        p2et3.setText(kcal_string);
        p2et4.setText(pvp_string);

    }


}
