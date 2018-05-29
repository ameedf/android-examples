package com.ameed.hellouser;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button submitButton = findViewById(R.id.submitButton);
        submitButton.setOnClickListener(v -> {
            EditText first = findViewById(R.id.firstNameEditText);
            EditText last = findViewById(R.id.lastNameEditText);
            String firstName = first.getText().toString();
            String lastName = last.getText().toString();

            Intent detailsIntent = new Intent(this, UserDetailsActivity.class);
            final User user = new User(firstName, lastName);
            detailsIntent.putExtra("user", user);
            startActivity(detailsIntent);

//            Intent navigateIntent = new Intent(Intent.ACTION_VIEW);
//            navigateIntent.setData(Uri.parse("http://www.google.com"));
//            startActivity(navigateIntent);
        });
    }
}
