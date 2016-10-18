package edu.tecii.android.calcular_interes;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private EditText txtCap,txtInt,txtPer;
    private TextView Tvmonto,TvInte;
    Button action;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtCap=(EditText)findViewById(R.id.txtCantCap);
        txtInt=(EditText)findViewById(R.id.txtIngInt);
        txtPer=(EditText)findViewById(R.id.txtINP);
        action=(Button)findViewById(R.id.button);
        Tvmonto=(TextView)findViewById(R.id.viewM);
        TvInte=(TextView)findViewById(R.id.viewI);

        action.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
            String capi=txtCap.getText().toString();
                String inte=txtInt.getText().toString();
                String per=txtPer.getText().toString();
                double cap1=Double.parseDouble(capi);
                double inte1=Double.parseDouble(inte);
                double per1=Double.parseDouble(per);
                double monto =cap1+ Math.pow((1+inte1/100),per1);
                //en esta parse se calcula los intereses
                double interes = monto-cap1;
                String resu,resultado="";
                resu="El monto total es: " + String.format("%8.2f\n",monto);
                resultado="El interes a pagar es: " + String.format("%8.2f\n",interes);

                Tvmonto.setText(resu);
                TvInte.setText(resultado);
            }

        });

    }

}
