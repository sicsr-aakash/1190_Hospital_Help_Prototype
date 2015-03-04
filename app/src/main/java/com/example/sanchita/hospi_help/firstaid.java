package com.example.sanchita.hospi_help;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class firstaid extends ActionBarActivity {

    protected Button btnclick;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firstaid);

        btnclick = (Button) findViewById(R.id.b2);


        View.OnClickListener listener = new View.OnClickListener() {

            public void onClick(View arg0){
                /************implicit intent**************/
                Intent intentObj = new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.google.com"));
                startActivity(intentObj);
            }
        };

         btnclick.setOnClickListener(listener);
    }

    }




