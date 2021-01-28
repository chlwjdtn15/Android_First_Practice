package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {


    ImageView imageV;
    ToggleButton tBttn;
    String radiButton;
    boolean green = false;
    boolean red = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        imageV = findViewById(R.id.imageView);
        tBttn = findViewById(R.id.toggleButton);
    }

    public void action(View view) {


        Toast.makeText(this, tBttn.getText().toString(), Toast.LENGTH_LONG).show();
        //Toast Message.

        if(tBttn.isChecked()) {
            imageV.setVisibility(View.VISIBLE);
        }
        else {
            imageV.setVisibility(View.INVISIBLE);
        }



    }

    public void radioButtonChecked(View view) {

        RadioButton radioButton = (RadioButton)view;
        int id = view.getId();
        switch (id) {

            case R.id.radioButton :
                if(radioButton.isChecked()) {
                    radiButton = "Yes";
                }
                break;
            case R.id.radioButton2 :
                if(radioButton.isChecked())
                {
                    radiButton = "No";
                }
                break;

            case R.id.radioButton3:
                if (radioButton.isChecked())
                {
                    radiButton = "Maybe";
                }
        }
        Toast.makeText(this, radiButton, Toast.LENGTH_LONG).show();
    }

    public void checkBoxSelected(View view) {


        CheckBox checkBox = (CheckBox) view;
        int id = checkBox.getId();

        switch (id){
            case R.id.green_cb :
                if(checkBox.isChecked()) {
                    // green is selected
                    green = true;
                }else {
                    // green is not selected
                    green = false;
                }
                break;
            case R.id.red_cb :
                if(checkBox.isChecked()) {
                    // green is selected
                    red = true;
                }else {
                    // green is not selected
                    red = false;
                }
                break;

        }


        displaySelection();

    }


    void  displaySelection(){

        String select = "";

        if(green){
            select += " Green ";
        }
        if(red){
            select += "  red " ;
        }
        Toast.makeText(this, select, Toast.LENGTH_LONG).show();
    }
}