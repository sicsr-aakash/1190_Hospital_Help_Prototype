package com.example.sanchita.hospi_help;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;


public class schedule extends ActionBarActivity {

    private RadioButton ra0;
    private RadioButton ra1;
    private RadioButton ra2;
    private Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule);


        ra0 = (RadioButton) findViewById(R.id.ra0);
        ra1 = (RadioButton) findViewById(R.id.ra1);
        ra2 = (RadioButton) findViewById(R.id.ra2);
        btn=(Button)findViewById(R.id.b1);
        View.OnClickListener list = new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                if (ra0.isChecked()) {
                    Intent intent = new Intent(getApplicationContext(), room_one.class);
                    startActivity(intent);
                } else if (ra1.isChecked()) {
                    Intent intent = new Intent(getApplicationContext(), room_two.class);
                    startActivity(intent);
                } else if (ra2.isChecked()) {
                    Intent intent = new Intent(getApplicationContext(), room_three.class);
                    startActivity(intent);

                } else {
                    Toast.makeText(getApplicationContext(), "Select the radio button", Toast.LENGTH_LONG).show();
                }
            }



        };
        btn.setOnClickListener(list);
}


}
