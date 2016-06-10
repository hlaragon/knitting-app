package com.aragon.hazel.recount;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

public class CounterActivity extends AppCompatActivity {

    Button btnNewProj, btnViewProj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE); // disables title
        setContentView(R.layout.activity_counter);

        btnNewProj = (Button)findViewById(R.id.newProjButton);
        btnViewProj = (Button)findViewById(R.id.viewProjbutton);

        btnNewProj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), AddNewProjectActivity.class);
                startActivity(i);
            }
        });

        btnViewProj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(getApplicationContext(), ViewAllActivity.class);
                startActivity(i);
            }
        });
    }

}
