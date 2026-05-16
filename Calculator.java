package com.example.calculator;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
 EditText editTextNumber1, editTextNumber2;
 Button buttonAdd, buttonSub, buttonMul, buttonDiv;
 TextView textViewResult;
 @Override
 protected void onCreate(Bundle savedInstanceState) {
 super.onCreate(savedInstanceState);
 setContentView(R.layout.activity_main);
 editTextNumber1 = findViewById(R.id.editTextNumber1);
 editTextNumber2 = findViewById(R.id.editTextNumber2);
 buttonAdd = findViewById(R.id.buttonAdd);
 buttonSub = findViewById(R.id.buttonSub);
 buttonMul = findViewById(R.id.buttonMul);
 buttonDiv = findViewById(R.id.buttonDiv);
 textViewResult = findViewById(R.id.textViewResult);
 View.OnClickListener listener = new View.OnClickListener() {
 @Override
 public void onClick(View view) {
 String num1 = editTextNumber1.getText().toString().trim();
 String num2 = editTextNumber2.getText().toString().trim();
 if (num1.isEmpty() || num2.isEmpty()) {
 Toast.makeText(MainActivity.this,
 "Please enter both numbers",
 Toast.LENGTH_SHORT).show();
 return;
 }
 double n1 = Double.parseDouble(num1);
 double n2 = Double.parseDouble(num2);
 double result = 0;
 if (view.getId() == R.id.buttonAdd) {
 result = n1 + n2;
 }
 else if (view.getId() == R.id.buttonSub) {
 result = n1 - n2;
 }
 else if (view.getId() == R.id.buttonMul) {
 result = n1 * n2;
 }
 else if (view.getId() == R.id.buttonDiv) {
 if (n2 == 0) {
 Toast.makeText(MainActivity.this,
 "Cannot divide by zero",
 Toast.LENGTH_SHORT).show();
 return;
 }
 result = n1 / n2;
 }
 textViewResult.setText("Result: " + result);
 }
 };
 buttonAdd.setOnClickListener(listener);
 buttonSub.setOnClickListener(listener);
 buttonMul.setOnClickListener(listener);
 buttonDiv.setOnClickListener(listener);
 }
}
