package com.example.register2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity  {

    Button submitButton;
    EditText Code,Password, address, mobileNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Code =(EditText) findViewById(R.id.storeid);
        Password = (EditText) findViewById(R.id.passwordid);
        address = (EditText) findViewById(R.id.address);
        mobileNumber = (EditText) findViewById(R.id.mobileNumber);
        submitButton = (Button) findViewById(R.id.submitt);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                if (validate(Code)&&validate(address)
                        &&validate(Password)&&validate(mobileNumber))
                {
                    Toast.makeText(getApplicationContext(),"SuccessFully Register",Toast.LENGTH_LONG).show();
                    if(v.getId()==R.id.submitt){
                        Intent intent= new Intent(MainActivity.this,MainActivity2.class);
                        startActivity(intent);
                    }
                }
            }
        });
    }

    private boolean validate(EditText editText) {
        if (editText.getText().toString().trim().length() < 1) {
            editText.setError("Please Fill This.!!!");
            editText.requestFocus();
            return false;
        }
        return true;
    }

}