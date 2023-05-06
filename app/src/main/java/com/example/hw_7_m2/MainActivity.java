package com.example.hw_7_m2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private Integer first, second, sum;
    private Boolean isOperationClick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.text_view);
    }

    private void setNumber(String number) {
        if (textView.getText().toString().equals("0") || isOperationClick) {
            textView.setText(number);
        } else {
            textView.append(number);
        }
    }

    @SuppressLint("NonConstantResourceId")
    public void onNumberClick(View view) {
        switch (view.getId()) {
            case R.id.btn_one:
//                if (textView.getText().toString().equals("0")) {
//                    textView.setText("1");
//                } else {
//                    textView.append("1");
//                }
                setNumber("1");
                break;

            case R.id.btn_two:
                setNumber("2");
                break;

            case R.id.btn_clear:
                textView.setText("0");
                first = 0;
                second = 0;
                sum = 0;
                break;

            case R.id.btn_three:
                setNumber("3");
                break;

            case R.id.btn_four:
                setNumber("4");
                break;

            case R.id.btn_five:
                setNumber("5");
                break;

            case R.id.btn_six:
                setNumber("6");
                break;

            case R.id.btn_seven:
                setNumber("7");
                break;

            case R.id.btn_eight:
                setNumber("8");
                break;

            case R.id.btn_nine:
                setNumber("9");
                break;
        }
        isOperationClick = false;
    }

    @SuppressLint({"NonConstantResourceId", "SetTextI18n"})
    public void onOperationClick(View view) {
        switch (view.getId()) {
            case R.id.btn_plus: // нажали на плюс
                first = Integer.valueOf(textView.getText().toString());
                break;

            case R.id.btn_equals:
                second = Integer.valueOf(textView.getText().toString());
                sum = first + second;
                textView.setText(sum.toString());
                break;

            case R.id.btn_minus: // нажали на минус
                first = Integer.valueOf(textView.getText().toString());
                break;
        }
        isOperationClick = true;
    }
}