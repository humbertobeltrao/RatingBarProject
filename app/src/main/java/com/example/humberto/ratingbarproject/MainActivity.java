package com.example.humberto.ratingbarproject;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);

        final RatingBar ratingBar = findViewById(R.id.rating_bar);
        Button btnSubmit = findViewById(R.id.btn_submit);
        final TextView textViewDisplayRating = findViewById(R.id.rating_display_text);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewDisplayRating.setText("" +
                        "Sua nota foi: "+ratingBar.getRating());
            }
        });
    }
}
