package com.indonesia.ridwan.edittextdanoutput;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText firstname, lastname;
    TextView displayname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstname = (EditText) findViewById(R.id.firstname);
        lastname = (EditText) findViewById(R.id.lastname);
        displayname = (TextView) findViewById(R.id.displayname);

    }

    public void display(View view){

        String getFirstname = firstname.getText().toString();
        String getLastname  = lastname.getText().toString();
        displayname.setText("Nama saya adalah " + getFirstname + " " +  getLastname);
    }
}
