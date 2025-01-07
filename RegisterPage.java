package com.example.techclubiitp; // Replace with your app's package name

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import com.example.techclubiitp.R;

public class RegisterPage extends AppCompatActivity {

    private EditText emailInput, usernameInput, passwordInput;
    private Button signUpButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registerpage);

        // Initializing views
        emailInput = findViewById(R.id.editEmailAddress);
        usernameInput = findViewById(R.id.editUsername);
        passwordInput = findViewById(R.id.editPassword);
        signUpButton = findViewById(R.id.button4);

        // Handle the Sign-Up button click event
        signUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = emailInput.getText().toString();
                String username = usernameInput.getText().toString();
                String password = passwordInput.getText().toString();

                // Simple validation (make sure fields are not empty)
                if (email.isEmpty() || username.isEmpty() || password.isEmpty()) {
                    Toast.makeText(RegisterPage.this, "Please fill all fields", Toast.LENGTH_SHORT).show();
                } else {
                    // You can add logic to save or process registration data here
                    // For example, you can send the data to a backend or local database

                    // Show a success message
                    Toast.makeText(RegisterPage.this, "Registered Successfully for " + username, Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
