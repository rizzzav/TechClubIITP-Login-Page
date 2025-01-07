package com.example.techclubiitp;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.chip.Chip;

public class LoginPage extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loginpage);

        EditText usernameEditText = findViewById(R.id.editEmailAddress);
        EditText passwordEditText = findViewById(R.id.editPassword);

        Button button = findViewById(R.id.button3);
        Button button1 = findViewById(R.id.button4);
                // Get user input
                String username = usernameEditText.getText().toString().trim();
                String password = passwordEditText.getText().toString().trim();

                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(LoginPage.this, "Signed in", Toast.LENGTH_SHORT).show();
                    }
                });

                button1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(LoginPage.this, RegisterPage.class);
                        startActivity(intent);
                    }
                });

                // Validate input
                if (TextUtils.isEmpty(username)) {
                    Toast.makeText(LoginPage.this, "Please enter username", Toast.LENGTH_SHORT).show();
                } else if (TextUtils.isEmpty(password)) {
                    Toast.makeText(LoginPage.this, "Please enter password", Toast.LENGTH_SHORT).show();
                } else {
                    // Perform login logic (e.g., authentication)
                    if (username.equals("admin") && password.equals("password")) {
                        Toast.makeText(LoginPage.this, "Login Successful", Toast.LENGTH_SHORT).show();
                        // Navigate to another activity if needed
                    } else {
                        Toast.makeText(LoginPage.this, "Invalid credentials", Toast.LENGTH_SHORT).show();
                    }
                }
            }
}
