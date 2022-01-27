package com.gb.first_lesson;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void onclick(View view) {
        EditText editText = findViewById(R.id.etFirst);
        String textToInsert = editText.getText().toString();
        TextView textView = findViewById(R.id.textview);
        textView.setText("Hello " + textToInsert);
    }
}
