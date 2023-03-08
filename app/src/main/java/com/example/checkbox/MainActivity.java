package com.example.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    protected CheckBox cb1, cb2, cb3, cb4, cb5, cb6, cb7, cb8, cb9, cb10;
    protected TextView tv1, tv2, tv3;
    int intentos=0, bien, mal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cb1 = findViewById(R.id.cbCptMarVell);
        cb2 = findViewById(R.id.cbCptMarvel);
        cb3 = findViewById(R.id.cbManthing);
        cb4 = findViewById(R.id.cbSwampthing);
        cb5 = findViewById(R.id.cbDrStrange);
        cb6 = findViewById(R.id.cbDoctorStrange);
        cb7 = findViewById(R.id.cbUltraman);
        cb8 = findViewById(R.id.cbWonderMan);
        cb9 = findViewById(R.id.cbDeadpool);
        cb10 = findViewById(R.id.cbDeathStroke);

        tv1 = findViewById(R.id.txtAcertado);
        tv2 = findViewById(R.id.txtMal);
        tv3 = findViewById(R.id.txtIntentos);
    }

    public void comprobar(View view) {
        bien = 0;
        mal = 0;
        intentos++;
        tv3.setText(String.valueOf(intentos));
        if(cb1.isChecked()) { bien++; }
        if(cb2.isChecked()) { mal++; }
        if(cb3.isChecked()) { bien++; }
        if(cb4.isChecked()) { mal++; }
        if(cb5.isChecked()) { mal++;}
        if(cb6.isChecked()) { bien++; }
        if(cb7.isChecked()) { mal++; }
        if(cb8.isChecked()) { bien++; }
        if(cb9.isChecked()) { bien++; }
        if(cb10.isChecked()) { mal++; }

        if(cb1.isChecked() && cb3.isChecked() && cb6.isChecked() && cb8.isChecked() && cb9.isChecked() ) {
            tv1.setText("ENHORRABUENA!!!");
            tv2.setText("ENHORRABUENA!!!");
        } else {
            tv1.setText("Has acertado: " + String.valueOf(bien));
            tv2.setText("Has puesto mal: " + String.valueOf(mal));
        }
    }
}