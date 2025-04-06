package edu.kathford.dialogueexample;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private Button logoutButton, dialogFragmentButton, customDialogButton, calculationButton;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        logoutButton = findViewById(R.id.logoutButton);
        dialogFragmentButton = findViewById(R.id.dialogFragmentButton);
        customDialogButton = findViewById(R.id.customDialogButton);

        logoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("Logout")
                       .setMessage("Are you sure you want to logout?")
                       .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(MainActivity.this, "Logged Out Successfully", Toast.LENGTH_SHORT).show();
                                dialogInterface.dismiss();
                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                dialogInterface.dismiss();
                            }
                        });

                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });

        dialogFragmentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LogoutDialogFragment logoutDialogFragment = new LogoutDialogFragment();
                logoutDialogFragment.show(getSupportFragmentManager(), "LogoutDialog");
            }
        });

        customDialogButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                View view = getLayoutInflater().inflate(R.layout.dialog_calculation, null);
                EditText firstNumberEditText = view.findViewById(R.id.firstNumber);
                EditText secondNumberEditText = view.findViewById(R.id.secondNumber);
                TextView resultTextView = view.findViewById(R.id.resultTextView);
                Button calculationButton = view.findViewById(R.id.calculationButton);

                calculationButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        int firstNumber = Integer.parseInt(firstNumberEditText.getText().toString());
                        int secondNumber = Integer.parseInt(secondNumberEditText.getText().toString());
                        int result;
                        result = firstNumber + secondNumber;
                        resultTextView.setText(result);
                    }
                });
            }
        });
    }
}
