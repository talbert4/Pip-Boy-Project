package com.example.pip_boy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class personal_info extends AppCompatActivity {
    /**
     * Personal information the user inputs.

    private final String firstName;
    private final String lastName;
    private final int age;
    private final String gender;
    private final String species;
    private final String classType;
    */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_info);
        Button generate = (Button)findViewById(R.id.buttonGenerate);
        generate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(personal_info.this, main_screen.class));
            }
        });
    }

}
