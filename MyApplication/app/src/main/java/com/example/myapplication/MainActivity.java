package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        initializeComponents();
    }

    private void initializeComponents() {
        TextInputEditText inputEditText=findViewById(R.id.form_textFieldName);
        TextInputEditText inputEditEmail=findViewById(R.id.form_textFieldEmail);
        TextInputEditText inputEditPassword=findViewById(R.id.form_textFieldPassword);
        MaterialButton button=findViewById(R.id.form_buttonSaveUser);

        button.setOnClickListener(
                v->{
                    String username=String.valueOf(inputEditText.getText());
                    String email=String.valueOf(inputEditEmail.getText());
                    String password=String.valueOf(inputEditPassword.getText());
                });
    }
}