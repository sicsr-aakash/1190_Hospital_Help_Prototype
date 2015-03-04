package com.example.sanchita.hospi_help;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class personal extends ActionBarActivity {

    protected Button button;
    protected EditText ed;
    protected EditText edt;
    private EditText editString;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal);


        ed=(EditText) findViewById(R.id.wt);
        editString = (EditText) findViewById(R.id.editText1);
        button = (Button) findViewById(R.id.k);
        edt=(EditText) findViewById(R.id.ht);


        View.OnClickListener list = new View.OnClickListener() {
            @Override
            public void onClick(View arg0){



                Toast.makeText(getApplicationContext(), "BMI is 18.5 kg/cm^2", Toast.LENGTH_LONG).show();


            }
            };
        button.setOnClickListener(list);
    }
}


