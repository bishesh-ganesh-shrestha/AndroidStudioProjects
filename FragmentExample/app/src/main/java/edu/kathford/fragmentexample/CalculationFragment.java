package edu.kathford.fragmentexample;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class CalculationFragment extends Fragment {
    private EditText firstNumberEditText;
    private EditText secondNumberEditText;
    private TextView actionResultTextView;
    private Button calculationButton;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.calculation_fragment, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        firstNumberEditText = view.findViewById(R.id.firstNumberEditText);
        secondNumberEditText = view.findViewById(R.id.secondNumberEditText);
        actionResultTextView = view.findViewById(R.id.resultTextView);
        calculationButton = view.findViewById(R.id.calculationButton);

        calculationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int firstNumber = Integer.parseInt(firstNumberEditText.getText().toString().trim());
                int secondNumber = Integer.parseInt(secondNumberEditText.getText().toString().trim());
                int sum = firstNumber + secondNumber;
                actionResultTextView.setText("Result is " + sum);
            }
        });
    }
}
