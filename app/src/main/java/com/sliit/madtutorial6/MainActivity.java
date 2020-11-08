package com.sliit.madtutorial6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button save = (Button) findViewById(R.id.btn_save);
        Button show = (Button) findViewById(R.id.btn_show);
        Button update = (Button) findViewById(R.id.btn_update);
        Button delete = (Button) findViewById(R.id.btn_delete);
        EditText id = (EditText) findViewById(R.id.input_id);
        EditText name = (EditText) findViewById(R.id.input_name);
        EditText address = (EditText) findViewById(R.id.input_address);
        EditText contact = (EditText) findViewById(R.id.input_contact);
    }
}