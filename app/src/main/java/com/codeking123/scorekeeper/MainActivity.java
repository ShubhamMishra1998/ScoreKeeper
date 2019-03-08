package com.codeking123.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int teamAScore=0,teamBScore=0;
    private int wA=0,wB=0;
    TextView teamA,teamB;
    TextView teamAWicket,teamBWicket;
    Button teamAButtonOne,teamBButtonOne;
    Button teamAButtonTwo,teamBButtonTwo;
    Button teamAButtonFour,teamBButtonFour;
    Button teamAButtonSix,teamBButtonSix;
    Button teamAButtonWicket,teamBButtonWicket;
    Button Reset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        teamA=findViewById(R.id.teamAScore);
        teamB=findViewById(R.id.teamBScore);
        teamAWicket=findViewById(R.id.wA);
        teamBWicket=findViewById(R.id.wB);
        teamAButtonOne=findViewById(R.id.teamAPlusOne);
        teamBButtonOne=findViewById(R.id.teamBPlusOne);
        teamAButtonTwo=findViewById(R.id.teamAPlusTwo);
        teamBButtonTwo=findViewById(R.id.teamBPlusTwo);
        teamAButtonFour=findViewById(R.id.teamAPlusFour);
        teamBButtonFour=findViewById(R.id.teamBPlusFour);
        teamAButtonSix=findViewById(R.id.teamAPlusSix);
        teamBButtonSix=findViewById(R.id.teamBPlusSix);
       teamAButtonWicket=findViewById(R.id.teamAWicket);
       teamBButtonWicket=findViewById(R.id.teamBWicket);
       Reset=findViewById(R.id.reset);

       //Managing Team A Score
       teamAButtonOne.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               teamAScore+=1;
               teamA.setText(Integer.toString(teamAScore));
           }
       });

        teamAButtonTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                teamAScore+=2;
                teamA.setText(Integer.toString(teamAScore));
            }
        });

        teamAButtonFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                teamAScore+=4;
                teamA.setText(Integer.toString(teamAScore));
            }
        });

        teamAButtonSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                teamAScore+=6;
                teamA.setText(Integer.toString(teamAScore));
            }
        });

        teamAButtonWicket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                wA+=1;
                teamAWicket.setText(Integer.toString(wA));
            }
        });

        //Managing Team B Score Card

        teamBButtonOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                teamBScore+=1;
                teamB.setText(Integer.toString(teamBScore));
            }
        });

        teamBButtonTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                teamBScore+=2;
                teamB.setText(Integer.toString(teamBScore));
            }
        });

        teamBButtonFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                teamBScore+=4;
                teamB.setText(Integer.toString(teamBScore));
            }
        });

        teamBButtonSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                teamBScore+=6;
                teamB.setText(Integer.toString(teamBScore));
            }
        });

        teamBButtonWicket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                wB+=1;
                teamBWicket.setText(Integer.toString(wB));
            }
        });

        Reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                teamAScore=0;
                teamBScore=0;
                teamA.setText(Integer.toString(teamAScore));
                teamB.setText(Integer.toString(teamBScore));
            }
        });

    }

}
