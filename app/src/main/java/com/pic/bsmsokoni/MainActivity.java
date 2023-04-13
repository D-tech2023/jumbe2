package com.pic.bsmsokoni;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.BreakIterator;

public class MainActivity extends AppCompatActivity {
    EditText firstNumView,secondNumView;
    TextView Textview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstNumView=findViewById(R.id.firstNum);
        secondNumView=findViewById(R.id.secondNum);






    }
    public void Addition(View view){
sting firstNum=firstNumView.getText().toString();
        sting secondNum=secondNumView.getText().toString();
        int Msukuma=Integer.parsentInt(firstNum)+Integer.parsentInt(secondNum);
        BreakIterator MsukumaView;
        MsukumaView.setText("the Msukuma is "+Msukuma);
    }
}