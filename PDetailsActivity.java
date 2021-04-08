package com.javatpoint.dietsqlite;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class PDetailsActivity extends AppCompatActivity {
    DatabaseHelper db;
    Button _btnreg;
    EditText  _txtlname, _txtpass, _txtemail, _txtphone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p_details);

        _btnreg = (Button) findViewById(R.id.btn);

        _txtlname = (EditText) findViewById(R.id.lName);
        _txtpass = (EditText) findViewById(R.id.Pwdd);
        _txtemail = (EditText) findViewById(R.id.Email);
        _txtphone = (EditText) findViewById(R.id.Phone);

        db = new DatabaseHelper(this);

        _btnreg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String lname = _txtlname.getText().toString();
                String pass = _txtpass.getText().toString();
                String email = _txtemail.getText().toString();
                String phone = _txtphone.getText().toString();
                db.Data(lname,pass,email,phone);
                Toast.makeText(getApplicationContext(), "register successfully", Toast.LENGTH_SHORT).show();
                Intent int1=new Intent(getApplicationContext(),HWidthActivity.class);
                startActivity(int1);

            }
        });

    }

}