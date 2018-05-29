package com.ameed.hellouser;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class UserDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_details);

        final Intent intent = getIntent();
        final User user = (User) intent.getExtras().getSerializable("user");

        TextView welcomeTextView = findViewById(R.id.welcomeTextView);
        welcomeTextView.setText(user.toString());

    }
}
