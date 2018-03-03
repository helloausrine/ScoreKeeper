package com.example.ausrine.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.ausrine.scorekeeper.R;

public class MainActivity extends AppCompatActivity {

    int goalScoreTeamA = 0;
    int goalScoreTeamB = 0;
    int foulScoreTeamA = 0;
    int foulScoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Increase the goal score for Team A by 1 point.
     */
    public void addGoalForTeamA(View v) {
        goalScoreTeamA = goalScoreTeamA + 1;
        displayGoalForTeamA(goalScoreTeamA);
    }

    /**
     * Increase the foul score for Team A by 1 points.
     */
    public void addFoulForTeamA(View v) {
        foulScoreTeamA = foulScoreTeamA + 1;
        displayFoulForTeamA(foulScoreTeamA);
    }

    /**
     * Increase the goal score for Team B by 1 point.
     */
    public void addGoalForTeamB(View v) {
        goalScoreTeamB = goalScoreTeamB + 1;
        displayGoalForTeamB(goalScoreTeamB);
    }

    /**
     * Increase the foul score for Team B by 1 points.
     */
    public void addFoulForTeamB(View v) {
        foulScoreTeamB = foulScoreTeamB + 1;
        displayFoulForTeamB(foulScoreTeamB);
    }

    /**
     * Resets goal score
     */
    public void resetScore(View v) {
        goalScoreTeamA = 0;
        goalScoreTeamB = 0;
        displayGoalForTeamA(goalScoreTeamA);
        displayGoalForTeamB(goalScoreTeamB);
        foulScoreTeamA = 0;
        foulScoreTeamB = 0;
        displayFoulForTeamA(foulScoreTeamA);
        displayFoulForTeamB(foulScoreTeamB);
    }

    /**
     * Displays the goal score for Team A.
     */
    public void displayGoalForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_goal_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the goal score for Team B.
     */
    public void displayGoalForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_goal_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the foul score for Team A.
     */
    public void displayFoulForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_foul_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the foul score for Team B.
     */
    public void displayFoulForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_foul_score);
        scoreView.setText(String.valueOf(score));
    }
}

