package com.example.bernard5.channelmessaging;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends Activity implements View.OnClickListener {

        private Button btnValider ;
        private String Identifient ;
        private String MDP ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        btnValider = (Button) findViewById(R.id.buttonValider);
        btnValider.setOnClickListener(this) ;
    }

    @Override
    public void onClick(View v) {
        EditText readtextID = (EditText) findViewById(R.id.editTextID);
        Identifient = readtextID.getText().toString();
        EditText readtextMDP = (EditText) findViewById(R.id.editTextMDP);
        MDP = readtextMDP.getText().toString();


        Toast.makeText(getApplicationContext(),"Id = "+Identifient+"\nMDP = "+MDP,Toast.LENGTH_SHORT).show();

    }



    }

