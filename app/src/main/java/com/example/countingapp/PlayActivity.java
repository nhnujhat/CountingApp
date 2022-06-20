package com.example.countingapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class PlayActivity extends AppCompatActivity {

    ImageView img;
    Button one, two, three, four, five, six, seven, eight, nine, ten, again;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);
        getSupportActionBar().hide();

        Random rand = new Random();
        int n = rand.nextInt(10) + 1;

        img = findViewById(R.id.countimg);
        one = findViewById(R.id.countone);
        two = findViewById(R.id.counttwo);
        three = findViewById(R.id.countthree);
        four = findViewById(R.id.countfour);
        five = findViewById(R.id.countfive);
        six = findViewById(R.id.countsix);
        seven = findViewById(R.id.countseven);
        eight = findViewById(R.id.counteight);
        nine = findViewById(R.id.countnine);
        ten = findViewById(R.id.countten);
        again = findViewById(R.id.again);

        if(n==1) img.setImageResource(R.drawable.star_1);
        else if(n==2) img.setImageResource(R.drawable.star_2);
        else if(n==3) img.setImageResource(R.drawable.star_3);
        else if(n==4) img.setImageResource(R.drawable.star_4);
        else if(n==5) img.setImageResource(R.drawable.star_5);
        else if(n==6) img.setImageResource(R.drawable.star_6);
        else if(n==7) img.setImageResource(R.drawable.star_7);
        else if(n==8) img.setImageResource(R.drawable.star_8);
        else if(n==9) img.setImageResource(R.drawable.star_9);
        else if(n==10) img.setImageResource(R.drawable.star_10);

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(n==1) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(PlayActivity.this);
                    final View customLayout = getLayoutInflater().inflate(R.layout.right_dialog,null);
                    builder.setView(customLayout);
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                    final Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            finish();
                            overridePendingTransition( 0, 0);
                            startActivity(getIntent());
                            overridePendingTransition( 0, 0);
                        }
                    }, 1000);
                }
                else {
                    AlertDialog.Builder builder = new AlertDialog.Builder(PlayActivity.this);
                    final View customLayout = getLayoutInflater().inflate(R.layout.wrong_dialog,null);
                    builder.setView(customLayout);
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                }
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(n==2) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(PlayActivity.this);
                    final View customLayout = getLayoutInflater().inflate(R.layout.right_dialog,null);
                    builder.setView(customLayout);
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                    final Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            finish();
                            overridePendingTransition( 0, 0);
                            startActivity(getIntent());
                            overridePendingTransition( 0, 0);
                        }
                    }, 1000);
                }
                else {
                    AlertDialog.Builder builder = new AlertDialog.Builder(PlayActivity.this);
                    final View customLayout = getLayoutInflater().inflate(R.layout.wrong_dialog,null);
                    builder.setView(customLayout);
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                }
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(n==3) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(PlayActivity.this);
                    final View customLayout = getLayoutInflater().inflate(R.layout.right_dialog,null);
                    builder.setView(customLayout);
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                    final Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            finish();
                            overridePendingTransition( 0, 0);
                            startActivity(getIntent());
                            overridePendingTransition( 0, 0);
                        }
                    }, 1000);
                }
                else {
                    AlertDialog.Builder builder = new AlertDialog.Builder(PlayActivity.this);
                    final View customLayout = getLayoutInflater().inflate(R.layout.wrong_dialog,null);
                    builder.setView(customLayout);
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                }
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(n==4) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(PlayActivity.this);
                    final View customLayout = getLayoutInflater().inflate(R.layout.right_dialog,null);
                    builder.setView(customLayout);
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                    final Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            finish();
                            overridePendingTransition( 0, 0);
                            startActivity(getIntent());
                            overridePendingTransition( 0, 0);
                        }
                    }, 1000);
                }
                else {
                    AlertDialog.Builder builder = new AlertDialog.Builder(PlayActivity.this);
                    final View customLayout = getLayoutInflater().inflate(R.layout.wrong_dialog,null);
                    builder.setView(customLayout);
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                }
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(n==5) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(PlayActivity.this);
                    final View customLayout = getLayoutInflater().inflate(R.layout.right_dialog,null);
                    builder.setView(customLayout);
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                    final Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            finish();
                            overridePendingTransition( 0, 0);
                            startActivity(getIntent());
                            overridePendingTransition( 0, 0);
                        }
                    }, 1000);
                }
                else {
                    AlertDialog.Builder builder = new AlertDialog.Builder(PlayActivity.this);
                    final View customLayout = getLayoutInflater().inflate(R.layout.wrong_dialog,null);
                    builder.setView(customLayout);
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                }
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(n==6) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(PlayActivity.this);
                    final View customLayout = getLayoutInflater().inflate(R.layout.right_dialog,null);
                    builder.setView(customLayout);
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                    final Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            finish();
                            overridePendingTransition( 0, 0);
                            startActivity(getIntent());
                            overridePendingTransition( 0, 0);
                        }
                    }, 1000);
                }
                else {
                    AlertDialog.Builder builder = new AlertDialog.Builder(PlayActivity.this);
                    final View customLayout = getLayoutInflater().inflate(R.layout.wrong_dialog,null);
                    builder.setView(customLayout);
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                }
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(n==7) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(PlayActivity.this);
                    final View customLayout = getLayoutInflater().inflate(R.layout.right_dialog,null);
                    builder.setView(customLayout);
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                    final Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            finish();
                            overridePendingTransition( 0, 0);
                            startActivity(getIntent());
                            overridePendingTransition( 0, 0);
                        }
                    }, 1000);
                }
                else {
                    AlertDialog.Builder builder = new AlertDialog.Builder(PlayActivity.this);
                    final View customLayout = getLayoutInflater().inflate(R.layout.wrong_dialog,null);
                    builder.setView(customLayout);
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                }
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(n==8) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(PlayActivity.this);
                    final View customLayout = getLayoutInflater().inflate(R.layout.right_dialog,null);
                    builder.setView(customLayout);
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                    final Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            finish();
                            overridePendingTransition( 0, 0);
                            startActivity(getIntent());
                            overridePendingTransition( 0, 0);
                        }
                    }, 1000);
                }
                else {
                    AlertDialog.Builder builder = new AlertDialog.Builder(PlayActivity.this);
                    final View customLayout = getLayoutInflater().inflate(R.layout.wrong_dialog,null);
                    builder.setView(customLayout);
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                }
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(n==9) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(PlayActivity.this);
                    final View customLayout = getLayoutInflater().inflate(R.layout.right_dialog,null);
                    builder.setView(customLayout);
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                    final Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            finish();
                            overridePendingTransition( 0, 0);
                            startActivity(getIntent());
                            overridePendingTransition( 0, 0);
                        }
                    }, 1000);
                }
                else {
                    AlertDialog.Builder builder = new AlertDialog.Builder(PlayActivity.this);
                    final View customLayout = getLayoutInflater().inflate(R.layout.wrong_dialog,null);
                    builder.setView(customLayout);
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                }
            }
        });

        ten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(n==10) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(PlayActivity.this);
                    final View customLayout = getLayoutInflater().inflate(R.layout.right_dialog,null);
                    builder.setView(customLayout);
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                    final Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            finish();
                            overridePendingTransition( 0, 0);
                            startActivity(getIntent());
                            overridePendingTransition( 0, 0);
                        }
                    }, 1000);
                }
                else {
                    AlertDialog.Builder builder = new AlertDialog.Builder(PlayActivity.this);
                    final View customLayout = getLayoutInflater().inflate(R.layout.wrong_dialog,null);
                    builder.setView(customLayout);
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                }
            }
        });

        again.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                overridePendingTransition( 0, 0);
                startActivity(getIntent());
                overridePendingTransition( 0, 0);
            }
        });
    }
}