package com.example.japanapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

public class QuizResults extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_results);

        final AppCompatButton startNewBtn = findViewById(R.id.startNewQuizBtn);
        final TextView correctAnswer = findViewById(R.id.correctAnswers);
        final TextView incorrectAnswer = findViewById(R.id.inCorrectAnswer);
        final ImageView endQuizImage = findViewById(R.id.congrats);
        final TextView successOrFailure = findViewById(R.id.success);

        final int getCorrectAnswers = getIntent().getIntExtra("correct", 0);
        final int getIncorrectAnswers = getIntent().getIntExtra("incorrect", 0);

        correctAnswer.setText("Jawaban Benar : "+getCorrectAnswers);
        incorrectAnswer.setText("Jawaban Salah : "+getIncorrectAnswers);

        if (getIncorrectAnswers > getCorrectAnswers) {
            endQuizImage.setImageResource(R.drawable.emotsedih);
            successOrFailure.setText("Ayo Belajar Lebih Semangat  Lagi");
        } else {
            endQuizImage.setImageResource(R.drawable.emothebat);
            successOrFailure.setText("Mantep Nih, Gas Belajar Lagi");
        }

        startNewBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(QuizResults.this, MainActivity.class));
                finish();
            }
        });
    }


}