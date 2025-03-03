package edu.kathford.loginsignupexample;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {
    private EditText emailEditText;
    private EditText pwEditText;
    private Button signInButton;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);
        emailEditText = findViewById(R.id.emailEditText);
        pwEditText = findViewById(R.id.pwEditText);
        signInButton = findViewById(R.id.signInButton);

        signInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = emailEditText.getText().toString().trim();
                String password = pwEditText.getText().toString().trim();

//                emailValidation(email);
//                pwValidation(password);

                if(email.isEmpty()){
                    emailEditText.setError("Email missing");
                }else if(password.isEmpty()){
                    pwEditText.setError("Password missing");
                }else{
                    Toast.makeText(LoginActivity.this, "Login Success", Toast.LENGTH_LONG).show();
                }

                Log.d("Email", email);
                Log.d("Password", password);

            }
        });
    }

    private void emailValidation(String email){
        if(email.isEmpty()){
            Toast.makeText(LoginActivity.this, "Email is missing.", Toast.LENGTH_LONG).show();
        }
    }

    private void pwValidation(String password){
        if(password.isEmpty()){
            Toast.makeText(LoginActivity.this, "Password is missing.", Toast.LENGTH_LONG).show();
        }
    }
}
