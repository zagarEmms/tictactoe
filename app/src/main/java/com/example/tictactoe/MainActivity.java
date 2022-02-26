package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageButton;
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

    private boolean click1 = true;
    private boolean click2 = true;
    private boolean click3 = true;
    private boolean click4 = true;
    private boolean click5 = true;
    private boolean click6 = true;
    private boolean click7 = true;
    private boolean click8 = true;
    private boolean click9 = true;

    private boolean player = true;

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
                        box1.setBackgroundResource(R.drawable.circle);
                    } else {
                        //box1.setImageResource(R.drawable.cross);
                    }
                    click1 = false;
                    setText();
                    changePlayer();
                } else {
                    errorToast.show();
                }
            }
        });
        box2 = (ImageButton) findViewById(R.id.box2);
        box2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (click2) {
                    if (player) {
                        box2.setBackgroundResource(R.drawable.circle);
                    } else {
                        box2.setImageResource(R.drawable.cross);
                    }
                    click2 = false;
                    setText();
                    changePlayer();
                } else {
                    errorToast.show();
                }
            }
        });
        box3 = (ImageButton) findViewById(R.id.box3);
        box3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (click3) {
                    if (player) {
                        box3.setBackgroundResource(R.drawable.circle);
                    } else {
                        box3.setImageResource(R.drawable.cross);
                    }
                    click3 = false;
                    setText();
                    changePlayer();
                } else {
                    errorToast.show();
                }
            }
        });
        box4 = (ImageButton) findViewById(R.id.box4);
        box4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (click4) {
                    if (player) {
                        box4.setBackgroundResource(R.drawable.circle);
                    } else {
                        box4.setImageResource(R.drawable.cross);
                    }
                    click4 = false;
                    setText();
                    changePlayer();
                } else {
                    errorToast.show();
                }
            }
        });
        box5 = (ImageButton) findViewById(R.id.box5);
        box5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (click5) {
                    if (player) {
                        box5.setBackgroundResource(R.drawable.circle);
                    } else {
                        box5.setImageResource(R.drawable.cross);
                    }
                    click5 = false;
                    setText();
                    changePlayer();
                } else {
                    errorToast.show();
                }
            }
        });
        box6 = (ImageButton) findViewById(R.id.box6);
        box6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (click6) {
                    if (player) {
                        box6.setBackgroundResource(R.drawable.circle);
                    } else {
                        box6.setImageResource(R.drawable.cross);
                    }
                    click6 = false;
                    setText();
                    changePlayer();
                } else {
                    errorToast.show();
                }
            }
        });
        box7 = (ImageButton) findViewById(R.id.box7);
        box7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (click7) {
                    if (player) {
                        box7.setBackgroundResource(R.drawable.circle);
                    } else {
                        box7.setImageResource(R.drawable.cross);
                    }
                    click7 = false;
                    setText();
                    changePlayer();
                } else {
                    errorToast.show();
                }
            }
        });
        box8 = (ImageButton) findViewById(R.id.box8);
        box8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (click8) {
                    if (player) {
                        box8.setBackgroundResource(R.drawable.circle);
                    } else {
                        box8.setImageResource(R.drawable.cross);
                    }
                    click8 = false;
                    setText();
                    changePlayer();
                } else {
                    errorToast.show();
                }
            }
        });
        box9 = (ImageButton) findViewById(R.id.box9);
        box9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (click9) {
                    if (player) {
                        box9.setBackgroundResource(R.drawable.circle);
                    } else {
                        box9.setImageResource(R.drawable.cross);
                    }
                    click9 = false;
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

        setContentView(R.layout.activity_main);
        setText();
        setButtons();
    }
}