package com.example.poms1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout.LayoutParams;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static android.graphics.Color.rgb;

public class MainActivity extends AppCompatActivity {
    private EditText Name;
    private TextView Name1;
    private EditText Surname;
    private TextView Surname1;
    private TextView Result;
    private Button ResButton;
    private int i;
    private int j;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Name=(EditText)findViewById(R.id.Input1);
        Surname=(EditText)findViewById(R.id.Input2);
        Result=(TextView)findViewById(R.id.textResult);
        ResButton=(Button)findViewById(R.id.buttonColor);
        Name1=(TextView)findViewById(R.id.textView1);
        Surname1=(TextView)findViewById(R.id.textView2);
        i=0;
        j=0;
    }

    public void OnClickRes(View v){
        if (Name.getText().toString().equals("") || Surname.getText().toString().equals("")) {
            Result.setText("Данные не введены");
            Toast.makeText(MainActivity.this,Result.getText(),Toast.LENGTH_SHORT).show();
        }
        else {
            String username = Name.getText().toString();
            String usersurname = Surname.getText().toString();
            Result.setText("Здравствуйте, "+username+" "+usersurname+"!");
            Toast.makeText(MainActivity.this,Result.getText(),Toast.LENGTH_SHORT).show();
        }
    }

    public void OnClickColor(View v){
        if(i==0)
            Result.setTextColor(rgb(200,0,0));
        if(i==1)
            Result.setTextColor(rgb(0,200,0));
        if(i==2)
            Result.setTextColor(rgb(0,0,200));;
        i++;
        if(i>2) {
            i = 0;
        }
    }

    public void OnClickPlace(View v){
        LayoutParams layout1 = (LayoutParams) Name1.getLayoutParams();
        LayoutParams layout2 = (LayoutParams) Surname1.getLayoutParams();
        LayoutParams layout3 = (LayoutParams) Name.getLayoutParams();
        LayoutParams layout4 = (LayoutParams) Surname.getLayoutParams();

        if (j==0) {
            layout1.topMargin += 150;
            layout2.topMargin -= 150;
            layout3.topMargin += 150;
            layout4.topMargin -= 150;
            j = 1;
        }
        else {
            layout1.topMargin -= 150;
            layout2.topMargin += 150;
            layout3.topMargin -= 150;
            layout4.topMargin += 150;
            j = 0;
        }
        Name1.setLayoutParams(layout1);
        Surname1.setLayoutParams(layout2);
        Name.setLayoutParams(layout3);
        Surname.setLayoutParams(layout4);
    }
}