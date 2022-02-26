package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button box1;
    private Button box2;
    private Button box3;
    private Button box4;
    private Button box5;
    private Button box6;
    private Button box7;
    private Button box8;
    private Button box9;

    private boolean click1;
    private boolean click2;
    private boolean click3;
    private boolean click4;
    private boolean click5;
    private boolean click6;
    private boolean click7;
    private boolean click8;
    private boolean click9;

    private boolean player = false;

    private void changePlayer () {
        player = !player;
    }

    private void setText () {

        TextView textView = findViewById(R.id.playersTurn);

        if (player) {
            textview.setText(R.string.player1);
        } else {
            textview.setText(R.string.player2);
        }
    }

    private void setButtons () {

        ImageView symbol = findViewById(R.id.symbol);
        Toast errorToast = Toast.makeText(MainActivity.this,
                R.string.errorToast,
                Toast.LENGTH_SHORT);
        errorToast.setGravity(Gravity.TOP, 0, 500);

        box1 = (Button) findViewById(R.id.box1);
        box1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (click1) {
                    if (player) {
                        symbol.setImageAlpha();
                        click1 = false;
                    } else {
                        symbol.setImageAlpha();
                        click1 = false;
                    }
                }
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setButtons ();
        setContentView(R.layout.activity_main);
    }
}