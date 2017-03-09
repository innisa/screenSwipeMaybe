package com.example.kinnis.magiceightball2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class scrnGame extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrn_game);

        //ititiate
        ImageView imgBall= (ImageView) findViewById(R.id.imgBall);
        final TextView txtAnswer= (TextView) findViewById(R.id.txtAnswer);

        //create a list of answers
        final ArrayList<String> lstAnswer= new ArrayList<String>();
        lstAnswer.add("No");
        lstAnswer.add("Yes");
        lstAnswer.add("Maybe");

        //onclick for imgBall
        //when click generate random phrase
        imgBall.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
               // startActivity(new Intent(MainActivity.this,StandingsActivity.class));
                int randInt= (int) (Math.random()*lstAnswer.size());
                txtAnswer.setText(lstAnswer.get(randInt));
            }
        });
    }
    }
}


/*
Button button= (Button) findViewById(R.id.standingsButton);
        imgBall.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,StandingsActivity.class));
            }
        });
        }
 */