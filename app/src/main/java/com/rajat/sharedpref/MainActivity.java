package com.rajat.sharedpref;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity  {
    EditText editTextFname, editTextLname, editTextEmail, editTextPass;
    Button buttonSubmit;
    SharedPreferences prefs;
    SharedPreferences.Editor edits;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextFname = (EditText) findViewById(R.id.editTextFname);
        editTextLname = (EditText) findViewById(R.id.editTextLname);
        editTextEmail = (EditText) findViewById(R.id.editTextEmail);
        editTextPass = (EditText) findViewById(R.id.editTextPass);
        buttonSubmit = (Button) findViewById(R.id.buttonSubmit);
        prefs = getSharedPreferences(getString(R.string.app_name), Context.MODE_PRIVATE);
        buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edits.putString("fName",editTextFname.getText().toString());
                edits.putString("lName",editTextLname.getText().toString());
                edits.putString("Email", editTextEmail.getText().toString());
                edits.putString("Pass", editTextPass.getText().toString());
                edits.commit();


            }
        });
    }


}
