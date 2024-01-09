package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.myapplication.model.User;
import com.example.myapplication.retrofit.RetrofitService;
import com.example.myapplication.retrofit.UserApi;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;

import java.util.logging.Level;
import java.util.logging.Logger;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

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

        RetrofitService retrofitService=new RetrofitService();
        UserApi userApi=retrofitService.getRetrofit().create(UserApi.class);
        button.setOnClickListener(
                v->{
                    String username=String.valueOf(inputEditText.getText());
                    String email=String.valueOf(inputEditEmail.getText());
                    String password=String.valueOf(inputEditPassword.getText());
                    User user=new User();
                    user.setUsername(username);
                    user.setEmail(email);
                    user.setPassword(password);

                    userApi.save(user).enqueue(new Callback<User>() {
                        @Override
                        public void onResponse(Call<User> call, Response<User> response) {
                            Toast.makeText(MainActivity.this, "User saved", Toast.LENGTH_SHORT).show();
                        }

                        @Override
                        public void onFailure(Call<User> call, Throwable t) {
                            Toast.makeText(MainActivity.this, "User not saved", Toast.LENGTH_SHORT).show();
                            Logger.getLogger(MainActivity.class.getName()).log(Level.SEVERE , "User not saved", t);
                        }
                    });
                });
    }
}