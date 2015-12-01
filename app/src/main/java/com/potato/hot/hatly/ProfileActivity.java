package com.potato.hot.hatly;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ProfileActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

    }

    public void followClick(View view) {
        Button follow_btn = (Button) findViewById(R.id.follow_button);
        follow_btn.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
    }

}
