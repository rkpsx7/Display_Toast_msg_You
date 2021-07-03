package com.example.display_toast_msg_you;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button mBtnOne;
    private Button mBtnTwo;
    private Button mBtnThree;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBtnOne = findViewById(R.id.btnOne);
        mBtnTwo = findViewById(R.id.btnTwo);
        mBtnThree = findViewById(R.id.btnThree);

        mBtnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Button One Clicked",Toast.LENGTH_SHORT).show();
            }
        });
        mBtnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Button Two Clicked",Toast.LENGTH_SHORT).show();
            }
        });
        mBtnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Button Three Clicked",Toast.LENGTH_SHORT).show();
            }
        });
    }
}