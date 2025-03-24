package edu.kathford.loginsignupexample;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SignUpActivity extends AppCompatActivity {
    private EditText fullname,phone,password;
    private RadioGroup genderRadioGroup;
    private Spinner country;
    private Button signupButton;
    private String gender;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup_activity);
        fullname = findViewById(R.id.fullNameEditText);
        phone = findViewById(R.id.mobileNumberEditText);
        password = findViewById(R.id.passwordEditText);
        genderRadioGroup = findViewById(R.id.genderRadioGroup);
        country = findViewById(R.id.countrySpinner);
        signupButton = findViewById(R.id.signupButton);

        signupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fullNameEditText = fullname.getText().toString().trim();
                String phoneEditText = phone.getText().toString().trim();
            }
        });

        genderRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId == R.id.maleRadioButton)
                    gender = "Male";
                else if(checkedId == R.id.femaleRadioButton)
                    gender = "Female";
                else
                    gender = "Others";
            }
        });

        country.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                String[] country = new String[]{getString()
            }
        };
    }
}
