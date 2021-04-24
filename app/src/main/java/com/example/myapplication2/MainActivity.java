package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText et1,et2;
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1=findViewById(R.id.edit1);
        et2=findViewById(R.id.edit2);
        t1=findViewById(R.id.text1);
    }

    public void Addition(View view) {
        int a,b,c;
        a=Integer.parseInt(et1.getText().toString());
        b=Integer.parseInt(et2.getText().toString());
        c=a+b;
        t1.setText(""+c);

    }

    public void Subtraction(View view) {
        int a,b,c;
        a=Integer.parseInt(et1.getText().toString());
        b=Integer.parseInt(et2.getText().toString());
        c=a-b;
        t1.setText(""+c);
    }

    public void Multiplication(View view) {
        int a,b,c;
        a=Integer.parseInt(et1.getText().toString());
        b=Integer.parseInt(et2.getText().toString());
        c=a*b;
        t1.setText(""+c);

    }

    public void Division(View view) {
        int a,b,c;
        a=Integer.parseInt(et1.getText().toString());
        b=Integer.parseInt(et2.getText().toString());
        c=a/b;
        t1.setText(""+c);

    }
}