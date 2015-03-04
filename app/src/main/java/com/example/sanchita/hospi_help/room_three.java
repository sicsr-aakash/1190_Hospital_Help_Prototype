package com.example.sanchita.hospi_help;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;


public class room_three extends ActionBarActivity {
    protected CheckBox cb , cb1;
    protected Button Click;
    protected Button ck;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room_three);
        cb   = (CheckBox) findViewById(R.id.cb1);
        cb1   = (CheckBox) findViewById(R.id.cb2);
        Click = (Button) findViewById(R.id.Clickhere);
        ck = (Button) findViewById(R.id.Clickhere);
        Click.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                // Create string buffer to

                if (cb.isChecked())

                {
                    Toast.makeText(getApplicationContext(), "Medicine Taken",
                            Toast.LENGTH_LONG).show();
                }


                if (cb1.isChecked()) {

                    Toast.makeText(getApplicationContext(), "Take Your Medicine",
                            Toast.LENGTH_LONG).show();
                }


            }
        });

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View arg0){

                Toast.makeText(getApplicationContext(), "Nurse is coming!!1",
                        Toast.LENGTH_LONG).show();

            }

        };
        ck.setOnClickListener(listener);


    }
}






