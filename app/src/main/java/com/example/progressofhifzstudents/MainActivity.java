package com.example.progressofhifzstudents;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button addStudentButton = findViewById(R.id.addStudent);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button addStudentRecordButton = findViewById(R.id.addStudentRecord);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button searchStudentButton = findViewById(R.id.searchStudent);
        Button gitHubButton = findViewById(R.id.gitHub);

        addStudentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, addStudents.class));
            }
        });


        gitHubButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://github.com/azibmuzammil/Progress-Of-Hifz-Students";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });
    }
}