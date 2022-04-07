package com.example.testapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView blockValueTextView = findViewById(R.id.blockValueTextView);
        blockValueTextView.setText("Включена");

        TextView musicNameTextView = findViewById(R.id.musicNameTextView);
        musicNameTextView.setText("Не выбран");

        TextView mapSourceNameTextView = findViewById(R.id.mapSourceNameTextView);
        mapSourceNameTextView.setText("Пользовательская карта");

        RelativeLayout relLayout = findViewById(R.id.relLayout);
        relLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Resources resources = getResources();
                int purpleColor = resources.getColor(R.color.purple_700);
                int color = Color.TRANSPARENT;
                Drawable background = view.getBackground();
                if (background instanceof ColorDrawable)
                    color = ((ColorDrawable) background).getColor();
                if (color == purpleColor) {
                    relLayout.setBackgroundColor(Color.parseColor("#000000"));
                }
                else
                {
                    relLayout.setBackgroundColor(purpleColor);
                }
            }
        });
        }
    }
