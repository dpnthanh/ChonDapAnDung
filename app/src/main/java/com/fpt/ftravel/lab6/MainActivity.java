package com.fpt.ftravel.lab6;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView txtName, txtKQ, txtScore;
    Button btn1, btn2, btn3, btn4, btn5, btn6;
    int diem = 0;
    byte kq;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AnhXa();



        Intent intent = getIntent();

        String name = "Người chơi: " + intent.getStringExtra("username");
        txtName.setText(name);

        startGame();

        trueButton();

    }

    private void trueButton() {

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                KetQua(1);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                KetQua(2);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                KetQua(3);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                KetQua(4);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                KetQua(5);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                KetQua(6);
            }
        });
    }

    private void KetQua(int i) {
        if (i == kq) {
            startGame();
            diem ++;
            txtScore.setText("SCORE: " + diem);
        } else {
            Toast.makeText(MainActivity.this, "Bạn đã chọn sai", Toast.LENGTH_SHORT).show();
            startGame();
            diem = 0;
            txtScore.setText("SCORE: " + diem);
        }
    }

    private void startGame() {

        Data data = new Data();
        txtKQ.setText(data.Question());

        data.setButton(btn1, btn2, btn3, btn4, btn5, btn6);
        kq = data.trueKQ;

    }



    private void AnhXa() {

        txtName = (TextView) findViewById(R.id.textViewName);
        txtKQ = (TextView) findViewById(R.id.textViewQuestion);
        txtScore = (TextView) findViewById(R.id.textViewScore);

        btn1 = (Button) findViewById(R.id.button1);
        btn2 = (Button) findViewById(R.id.button2);
        btn3 = (Button) findViewById(R.id.button3);
        btn4 = (Button) findViewById(R.id.button4);
        btn5 = (Button) findViewById(R.id.button5);
        btn6 = (Button) findViewById(R.id.button6);

    }
}
