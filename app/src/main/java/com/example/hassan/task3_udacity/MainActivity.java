package com.example.hassan.task3_udacity;

import android.graphics.RadialGradient;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioGroup radioGroup1, radioGroup2;
    CheckBox checkBox1, checkBox2, checkBox3;
    Button submit;
    EditText edittext;
   private  int i = 0;
   private int j = 0;
   private  int z=0;
   String txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radioGroup1 = findViewById(R.id.radiogroub1);
        radioGroup2 = findViewById(R.id.radiogroub2);
        checkBox1 = findViewById(R.id.checbox1);
        checkBox2 = findViewById(R.id.checbox2);
        checkBox3 = findViewById(R.id.checbox3);
        edittext = findViewById(R.id.edittext1);
        submit = findViewById(R.id.submit);

        radioGroup1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                switch (checkedId) {
                    case R.id.radioButton1:
                        i += 0;
                        break;
                    case R.id.radioButton2:
                        i += 0;
                        break;
                    case R.id.radioButton3:
                        i += 4;
                        break;

                }

            }
        });
        radioGroup2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.radioButton4:
                        i += 0;
                        break;
                    case R.id.radioButton5:
                        i += 0;
                        break;
                    case R.id.radioButton6:
                        i += 4;
                        break;
                }

            }
        });
        checkBox1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkBox1.isChecked() && !(checkBox2.isChecked()) &&checkBox3.isChecked()) {
                    j += 4;
                }
                else{
                    j+=0;
                }
            }
        });
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                gettext();
                restartvalue();
            }


        });
    }

    public void gettext()
    {
        txt = edittext.getText().toString();
        if (txt.equalsIgnoreCase("Ahmed")) {
            z=z+4;

        }
        else {
            z+= 0;

        }
        Toast.makeText(MainActivity.this, "the result is"+(i+j+z), Toast.LENGTH_LONG).show();
    }
    public void restartvalue()
    {
        i=0;
        j=0;
        z=0;

    }
}
