package com.example.juankno4.mislayouts;

        import android.os.CountDownTimer;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.Gravity;
        import android.view.View;
        import android.widget.Button;
        import android.widget.FrameLayout;
        import android.widget.TextView;

        import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int count = 0;
    Button btn1;
    TextView tex;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         btn1 = findViewById(R.id.btn1);
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
            /* accion que se ejecuta en cada brinco*/
            public void onTick(long millisUntilFinished) {
                /*buscar sobre el layout parametros especificar el top el left teniendolo se lo paso al boton (layout parameters) como construir un parametros de layout y asignarlos para hacer la funcion
                * */
                /*random del 1 al 5 nos metemos al switch y lo ponemos top y ponemos gravity y se lo asignamos al boton*/
             /*formas de dear evento*/
                Random rnd = new Random();
                 int rando = rnd.nextInt(5);
                FrameLayout.LayoutParams lp = new FrameLayout.LayoutParams(-2,-2);

                switch (rando)
                {
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
            /*cuando termina ese timer */
            public void onFinish() {

            }
        }.start();
    }
}
