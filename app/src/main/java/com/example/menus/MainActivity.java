package com.example.menus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private TextView p1tv;
    private ImageButton p1b1;
    private ImageButton p1b2;
    private ImageButton p1b3;
    private ImageButton p1b4;
    private Button boton_aceptar;

    private int kcal=0;
    private double pvp=0;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        p1tv=(TextView)findViewById(R.id.p1tv);
        p1b1=(ImageButton)findViewById(R.id.p1b1);
        p1b2=(ImageButton)findViewById(R.id.p1b2);
        p1b3=(ImageButton)findViewById(R.id.p1b3);
        p1b4=(ImageButton)findViewById(R.id.p1b4);
        boton_aceptar=(Button)findViewById(R.id.boton_aceptar);

        p1b3.setVisibility(View.VISIBLE);
        p1b4.setVisibility(View.VISIBLE);
        boton_aceptar.setVisibility(View.VISIBLE);



    }

    public void clickp1(View view){
        kcal+=100;
        pvp+=3.5;
        p1b1.setSelected(true);
    }

    public void clickp2(View view){
        kcal+=100;
        pvp+=3.5;
        p1b2.setSelected(true);
    }

    public void clickp3(View view){
        kcal+=100;
        pvp+=3.5;
        p1b3.setSelected(true);
    }

    public void clickp4(View view){
        // Si es medio menu, no suma kcal ni pvp
        p1b4.setSelected(true);
    }

    public void click_aceptar(View view){
       Intent intent = new Intent(MainActivity.this,pantalla2.class);
       intent.putExtra("kcal",kcal);
       intent.putExtra("pvp",pvp);
       startActivity(intent);

    }


}
