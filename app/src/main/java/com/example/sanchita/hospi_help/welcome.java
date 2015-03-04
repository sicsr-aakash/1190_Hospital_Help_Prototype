package com.example.sanchita.hospi_help;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class welcome extends ActionBarActivity {

    protected Button btnclick;
    protected Button btn;
    protected Button click;
    protected Button bclick;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        btnclick = (Button) findViewById(R.id.b2);
        btn = (Button) findViewById(R.id.b3);
        click = (Button) findViewById(R.id.b5);
        bclick = (Button) findViewById(R.id.b4);


        View.OnClickListener list = new View.OnClickListener() {
            @Override
            public void onClick(View arg0){
				/* ********Explicit intent****** */
                Intent intent = new Intent(getApplicationContext(),
                        personal.class);

                startActivity(intent);
            }

        };


        View.OnClickListener listner = new View.OnClickListener() {
            @Override
            public void onClick(View arg0){
				/* ********Explicit intent****** */
                Intent intent = new Intent(getApplicationContext(),
                        schedule.class);

                startActivity(intent);
            }

        };
        View.OnClickListener listn = new View.OnClickListener() {
            @Override
            public void onClick(View arg0){
				/* ********Explicit intent****** */
                Intent intent = new Intent(getApplicationContext(),
                        firstaid.class);

                startActivity(intent);
            }

        };
        View.OnClickListener lis = new View.OnClickListener() {
            @Override
            public void onClick(View arg0){
				/* ********Explicit intent****** */
                Intent intent = new Intent(getApplicationContext(),
                        habits.class);

                startActivity(intent);
            }

        };





        btnclick.setOnClickListener(list);
        btn.setOnClickListener(listner);
        click.setOnClickListener(listn);
        bclick.setOnClickListener(lis);
    }



}
