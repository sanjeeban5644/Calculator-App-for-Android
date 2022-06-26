package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    boolean newop = true;
    String op = "+";
    String oldnum;
    String currnum;
    EditText ed;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed = findViewById(R.id.edit);
    }

    public void numberevent(View view) {

        currnum = ed.getText().toString();

        if(newop){
            currnum = "";
        }
        newop=false;

        switch (view.getId()){
            case R.id.zerobutton:{
                currnum += "0";
                break;
            }
            case R.id.onebutton:{
                currnum += "1";
                break;
            }
            case R.id.twobutton:{
                currnum += "2";
                break;
            }
            case R.id.threebutton:{
                currnum += "3";
                break;
            }
            case R.id.fourbutton:{
                currnum += "4";
                break;
            }
            case R.id.fivebutton:{
                currnum+= "5";
                break;
            }
            case R.id.sixbutton:{
                currnum += "6";
                break;
            }
            case R.id.sevenbutton:{
                currnum += "7";
                break;
            }
            case R.id.eightbutton:{
                currnum += "8";
                break;
            }
            case R.id.ninebutton:{
                currnum += "9";
                break;
            }
            case R.id.decimalbutton:{
                currnum+=".";
                break;
            }
            case R.id.plusminusbutton:{
                currnum = "-"+currnum;
                break;
            }
        }
        ed.setText(currnum);
    }


    public void operatorevent(View view) {
        newop = true;
        oldnum = ed.getText().toString();
        switch(view.getId()){
            case R.id.plusbutton:{
                op = "+";
                break;
            }
            case R.id.minusbutton:{
                op = "-";
                break;
            }
            case R.id.multiplybutton:{
                op = "*";
                break;
            }
            case R.id.divisionbutton:{
                op = "/";
                break;
            }
            case R.id.perbutton:{
                op = "%";
                break;
            }
        }
    }


    public void equalevent(View view) {
        String newnum = ed.getText().toString();
        if(newnum==""){
            oldnum="0";
            newnum="0";
        }
        double res = 0.0f;
        switch(op){
            case "+": res = Double.parseDouble(oldnum) + Double.parseDouble(newnum); break;
            case "-": res = Double.parseDouble(oldnum) - Double.parseDouble(newnum); break;
            case "*": res = Double.parseDouble(oldnum) * Double.parseDouble(newnum); break;
            case "/": res = Double.parseDouble(oldnum) / Double.parseDouble(newnum); break;
            case "%": res = Double.parseDouble(oldnum)/100; break;
        }
        ed.setText(res+"");
    }

    public void acevent(View view){
        ed.setText("0");
        newop=true;
        currnum = "";
        oldnum = "";
    }


}