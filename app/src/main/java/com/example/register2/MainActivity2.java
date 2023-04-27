package com.example.register2;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public void onClick(View v){
        switch(v.getId()){

            case R.id.add:
                Intent intent= new Intent( MainActivity2.this,MainActivity4.class);
                startActivity(intent);
                break;
            case R.id.track:
                Intent inten= new Intent( MainActivity2.this,MainActivity3.class);
                startActivity(inten);
                break;

        }
    }
}