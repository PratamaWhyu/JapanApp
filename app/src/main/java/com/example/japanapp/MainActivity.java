package com.example.japanapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String selectedTopicName = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final LinearLayout hira = findViewById(R.id.hiraLayout);
        final LinearLayout kana = findViewById(R.id.kanaLayout);
        final LinearLayout kanji = findViewById(R.id.kanjiLayout);
        final LinearLayout kosa = findViewById(R.id.kosaLayout);
        final ImageView backBtn = findViewById(R.id.backBtn);
        final Button startBtn = findViewById(R.id.startQuizButton);

        hira.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                selectedTopicName = "Hiragana";

                hira.setBackgroundResource(R.drawable.selection_background);
                kana.setBackgroundResource(R.drawable.initial_selections);
                kanji.setBackgroundResource(R.drawable.initial_selections);
                kosa.setBackgroundResource(R.drawable.initial_selections);

            }
        });

        kana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                selectedTopicName = "Katakana";

                kana.setBackgroundResource(R.drawable.selection_background);
                hira.setBackgroundResource(R.drawable.initial_selections);
                kanji.setBackgroundResource(R.drawable.initial_selections);
                kosa.setBackgroundResource(R.drawable.initial_selections);
            }
        });

        kanji.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                selectedTopicName = "Kanji";

                kanji.setBackgroundResource(R.drawable.selection_background);
                hira.setBackgroundResource(R.drawable.initial_selections);
                kana.setBackgroundResource(R.drawable.initial_selections);
                kosa.setBackgroundResource(R.drawable.initial_selections);
            }
        });

        kosa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                selectedTopicName = "Kosakata";

                kosa.setBackgroundResource(R.drawable.selection_background);
                hira.setBackgroundResource(R.drawable.initial_selections);
                kanji.setBackgroundResource(R.drawable.initial_selections);
                kana.setBackgroundResource(R.drawable.initial_selections);
            }
        });

        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (selectedTopicName.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Pilih Dulu dongg!", Toast.LENGTH_SHORT).show();
                } else {

                    Intent intent = new Intent(MainActivity.this, QuizActivity.class);
                    intent.putExtra("selectedTopic",selectedTopicName);
                    startActivity(intent);

                }
            }
        });

        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(MainActivity.this, MenuUtamaActivity.class));
                finish();
            }
        });
    }
}