package com.example.qrscanejava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class select extends AppCompatActivity {
ImageView btnScn;
EditText edId;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select);

        edId = findViewById(R.id.edIdUser);
        Intent intent = new Intent(getIntent());
        String id = intent.getStringExtra("id");
        edId.setText(id);
        btnScn = findViewById(R.id.btnScane);
        btnScn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(select.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
