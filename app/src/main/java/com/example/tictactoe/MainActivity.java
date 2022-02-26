package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ImageButton box1;
    private ImageButton box2;
    private ImageButton box3;
    private ImageButton box4;
    private ImageButton box5;
    private ImageButton box6;
    private ImageButton box7;
    private ImageButton box8;
    private ImageButton box9;

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
            textView.setText(R.string.player1);
        } else {
            textView.setText(R.string.player2);
        }
    }

    private void setButtons () {

        ImageView symbol = findViewById(R.id.symbol);
        Toast errorToast = Toast.makeText(MainActivity.this,
                R.string.errorToast,
                Toast.LENGTH_SHORT);
        errorToast.setGravity(Gravity.TOP, 0, 500);

        box1 = (ImageButton) findViewById(R.id.box1);
        box1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (click1) {
                    if (player) {
                        symbol.setImageResource(R.drawable.circle);
                    } else {
                        symbol.setImageResource(R.drawable.cross);
                    }
                    click1 = false;
                    setText();
                    changePlayer();
                } else {
                    errorToast.show();
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