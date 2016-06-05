package com.example.hnk_1031.janken;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView player;
    TextView cpu;
    TextView result;
    int number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        player =(TextView)findViewById(R.id.player);
        cpu =(TextView)findViewById(R.id.cpu);
        result =(TextView)findViewById(R.id.result);
    }

    public void goo(View v) {
        player.setText("あなたの手はグーです");
        Random random = new Random();
        number = random.nextInt(3);

        if(number ==0) {
            cpu.setText("相手の手はグーです");
            result.setText("引き分けです");
        } else if(number ==1) {
            cpu.setText("相手の手はチョキです");
            result.setText("あなたの勝ちです");
        } else if(number ==2) {
            cpu.setText("相手の手はパーです");
            result.setText("あなたの負けです");
        }
    }

    public void cho(View v) {
        player.setText("あなたの手はチョキです");
        Random random = new Random();
        number = random.nextInt(3);

        if(number ==0) {
            cpu.setText("相手の手はグーです");
            result.setText("あなたの負けです");
        } else if(number ==1) {
            cpu.setText("相手の手はチョキです");
            result.setText("引き分けです");
        } else if(number ==2) {
            cpu.setText("相手の手はパーです");
            result.setText("あなたの勝ちです");
        }
    }

    public void paa(View v) {
        player.setText("あなたの手はパーです");
        Random random = new Random();
        number = random.nextInt(3);

        if(number ==0) {
            cpu.setText("相手の手はグーです");
            result.setText("あなたの勝ちです");
        } else if(number ==1) {
            cpu.setText("相手の手はチョキです");
            result.setText("あなたの負けです");
        } else if(number ==2) {
            cpu.setText("相手の手はパーです");
            result.setText("引き分けです");
        }

    }
}
