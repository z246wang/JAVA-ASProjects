package com.example.caps;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Game game; //(to hold the Game instance)
    private String question; //(to hold the last-posed question)
    private String answer; //(to hold the answer of the last-posed question)
    private int score; //(to hold the current score)
    private int qNum; //(to hold the number of the last-posed question)
    private String resultLog = " ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        qNum = 1;
        ask();
    }

    private void ask() {
        game = new Game();
        String qa = game.qa();
        question = qa.substring(0 , qa.indexOf("\n"));
        answer = qa.substring(qa.indexOf("\n") + 1);
        ((TextView)findViewById(R.id.question)).setText(question);
    }

    public void onDone(View v) {
        if (qNum == 10) {
            finish();
        }

        String userAnswer = ((EditText)findViewById(R.id.answer)).getText().toString();
        if (userAnswer.equalsIgnoreCase(answer)) {
            score++;
            ((TextView) findViewById(R.id.score)).setText("SCORE " + score);
        }

        resultLog = "Q# " + qNum + ": " + question + "\n" + "Your answer: " + userAnswer.toUpperCase() + "\n" + "Correct answer: " + answer + "\n" + "\n" + resultLog;
        ((TextView)findViewById(R.id.log)).setText(resultLog);

        qNum++;
        if (qNum == 10) {
            ((TextView)findViewById(R.id.qNum)).setText("Game Over!");
            findViewById(R.id.done).setEnabled(false);
        }else {
            ((TextView) findViewById(R.id.qNum)).setText("Q# " + qNum);
        }

        ask();
        ((TextView) findViewById(R.id.answer)).setText("");
    }
}