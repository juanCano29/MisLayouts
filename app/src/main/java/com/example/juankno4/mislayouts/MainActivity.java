package com.example.juankno4.mislayouts;
/*Que es una metria*/

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;



public class MainActivity extends AppCompatActivity {

    Button btn1;
    TextView lbl1;
     int contador = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = findViewById(R.id.btn);
        lbl1 = findViewById(R.id.lbl1);

        View.OnClickListener clickbtn = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contador++;
                lbl1.setText(String.valueOf(contador));
            }
        };
       btn1.setOnClickListener(clickbtn);

       /*Otra Forma*/
/*      btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });*/

        /*Objeto para hacer contador*/

        new CountDownTimer(20000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                FrameLayout.LayoutParams lp = new FrameLayout.LayoutParams(-2, -2);
                Random aleatorio = new Random();
                int a = aleatorio.nextInt(5) + 1;

                Log.d("num", String.valueOf(a));

                switch (a) {
                    case 1:
                        lp.gravity = Gravity.CENTER;
                        break;
                    case 2:
                        lp.gravity = Gravity.LEFT | Gravity.BOTTOM;
                        break;
                    case 3:
                        lp.gravity = Gravity.TOP | Gravity.RIGHT;
                        break;
                    case 4:
                        lp.gravity = Gravity.TOP | Gravity.LEFT;
                        break;
                    case 5:
                        lp.gravity = Gravity.BOTTOM | Gravity.RIGHT;
                        break;
                }
                btn1.setLayoutParams(lp);
            }

            @Override
            public void onFinish() {
                Toast.makeText(MainActivity.this,"Se termino", Toast.LENGTH_SHORT).show();
            }
        }.start();


   /*     btn1 = findViewById(R.id.btn1);
        tex = findViewById(R.id.textv);
        tex.setText(R.string.nom1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                tex.setText(String.valueOf(count));
            }
        });
        new CountDownTimer(10000000, 500) {
            @Override
            *//* accion que se ejecuta en cada brinco*//*
            public void onTick(long millisUntilFinished) {
                *//*buscar sobre el layout parametros especificar el top el left teniendolo se lo paso al boton (layout parameters) como construir un parametros de layout y asignarlos para hacer la funcion
         * *//*
         *//*random del 1 al 5 nos metemos al switch y lo ponemos top y ponemos gravity y se lo asignamos al boton*//*
         *//*formas de dear evento*//*
                Random rnd = new Random();
                int rando = rnd.nextInt(5);
                FrameLayout.LayoutParams lp = new FrameLayout.LayoutParams(-2, -2);

                switch (rando) {
                    case 0:
                        lp.gravity = Gravity.RIGHT;
                        break;
                    case 1:
                        lp.gravity = Gravity.LEFT;
                        break;
                    case 2:
                        lp.gravity = Gravity.RIGHT | Gravity.BOTTOM;
                        break;
                    case 3:
                        lp.gravity = Gravity.LEFT | Gravity.BOTTOM;
                        break;
                    case 4:
                        lp.gravity = Gravity.CENTER;

                        break;
                }
                btn1.setLayoutParams(lp);
            }
            @Override
            *//*cuando termina ese timer *//*
            public void onFinish() {
            }
        }.start();*/
    }
}
