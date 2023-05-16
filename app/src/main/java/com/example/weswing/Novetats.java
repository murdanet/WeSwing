package com.example.weswing;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;

public class Novetats extends AppCompatActivity {

    TextView txtview1,txtview2,txtview3,txtview4,txtview5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_novetats);

        txtview1 = findViewById(R.id.txtview1);
        txtview2= findViewById(R.id.txtview2);

        SpannableString spannableString= new SpannableString("I'm beginning to see the light (0 assistents) avui a las 22:10");
        SpannableString spannableString1= new SpannableString("Angela Mena Also asistirà a Festa d'Inici de Trimestre i presentació de professors! (5 assistents).");


        ForegroundColorSpan colorSpan1= new ForegroundColorSpan(getResources().getColor(R.color.rojo));
        spannableString.setSpan(colorSpan1,0,30, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

        spannableString1.setSpan(colorSpan1,0,16,Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

        txtview1.setText(spannableString);
        txtview2.setText(spannableString1);






    }
}