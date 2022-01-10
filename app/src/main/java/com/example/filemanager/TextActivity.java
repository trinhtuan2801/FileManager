package com.example.filemanager;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class TextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text);

        TextView textView = findViewById(R.id.text_view);

        String text = getIntent().getStringExtra("textdata");
        if (text != null) {
            textView.setText(text);
        }

    }
}
