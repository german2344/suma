package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText ca1,ca2;
    private TextView texmen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ca1=findViewById(R.id.ca1);
        ca2=findViewById(R.id.ca2);
        texmen=findViewById(R.id.texmen);
    }
    public void presion(View V){
        String res1=ca1.getText().toString();
        String res2=ca2.getText().toString();
        int res3=Integer.parseInt(res1);
        int res4=Integer.parseInt(res2);
        int suma=res3+res4;
     //   texmen.setText("la suma es"+suma);
        Toast.makeText(this,"suma"+suma,Toast.LENGTH_SHORT).show();
    }

}