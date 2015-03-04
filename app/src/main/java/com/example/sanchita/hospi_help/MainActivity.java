package com.example.sanchita.hospi_help;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends ActionBarActivity {
    private Button btnClick;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnClick = (Button) findViewById(R.id.b1);


        View.OnClickListener list = new View.OnClickListener() {
            @Override
            public void onClick(View arg0){
				/* ********Explicit intent****** */
                Intent intent = new Intent(getApplicationContext(),
                        welcome.class);

                startActivity(intent);
            }

        };


        btnClick.setOnClickListener(list);
    }

 }


