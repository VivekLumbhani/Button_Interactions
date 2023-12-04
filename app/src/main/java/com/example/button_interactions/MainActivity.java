package com.example.button_interactions;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button tleft,tright,botleft,botright;
    ImageButton imgbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tleft=findViewById(R.id.button);
        tright=findViewById(R.id.button2);
        botleft=findViewById(R.id.button3);
        botright=findViewById(R.id.button4);
        imgbtn=findViewById(R.id.imageButton);

        tleft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(getApplicationContext(), "Top Left Button", Toast.LENGTH_SHORT);
                int screenHeight = getResources().getDisplayMetrics().heightPixels;
                int verticalOffset = (int) (0.36 * screenHeight);
                toast.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.TOP, 0, verticalOffset);
                toast.show();
            }
        });

        tright.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(getApplicationContext(), "Top Right Button", Toast.LENGTH_SHORT);
                int screenHeight = getResources().getDisplayMetrics().heightPixels;
                int verticalOffset = (int) (0.36 * screenHeight);
                toast.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.TOP, 0, verticalOffset);
                toast.show();
            }
        });
        botright.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(getApplicationContext(), "Bottom Left Button", Toast.LENGTH_SHORT);
                int screenHeight = getResources().getDisplayMetrics().heightPixels;
                int verticalOffset = (int) (0.52 * screenHeight);
                toast.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.TOP, 0, verticalOffset);
                toast.show();
            }
        });
        botleft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(getApplicationContext(), "Bottom Right Button", Toast.LENGTH_SHORT);
                int screenHeight = getResources().getDisplayMetrics().heightPixels;
                int verticalOffset = (int) (0.52 * screenHeight);
                toast.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.TOP, 0, verticalOffset);
                toast.show();
            }
        });
        imgbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(getApplicationContext(), "Center Button", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.CENTER_VERTICAL, 0, 0);

                toast.show();
            }
        });

    }
}