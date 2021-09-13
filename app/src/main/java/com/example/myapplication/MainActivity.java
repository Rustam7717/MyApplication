package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btnReplace;
    private TextView txtTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnReplace = findViewById(R.id.btn_replace_to_text);
        txtTitle = findViewById(R.id.txt_title);
        txtTitle.setText("Hello");

        btnReplace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txtTitle.getText().equals("Hello")){
                    txtTitle.setText("Rustam");
                }else {
                    txtTitle.setText("Hello");
                }
            }
        });
    }
}