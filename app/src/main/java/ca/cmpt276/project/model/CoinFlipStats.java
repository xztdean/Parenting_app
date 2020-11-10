package ca.cmpt276.project.model;

import android.util.Log;

import java.util.Calendar;
import java.util.Date;
import java.util.Random;

import ca.cmpt276.project.R;

/**
 * Stores data of coin flips.
 * Used to display in History screen.
 * Has functionality of determining if coin toss was a win or loss
 */
public class CoinFlipStats {
    private String timeDate;
    private String childName;
    private int choice;
    private int result;
    private int iconID;



    public CoinFlipStats(String timeDate, String childName, int choice, int result,int iconID) {
        this.timeDate = timeDate;
        this.childName = childName;
        this.choice = choice;
        this.result = result; //for choice and result, 1---head, 2---tail.
        this.iconID = iconID;
    }

    // 1 - win, 2 - lose
    public int winOrLose(){
        return (choice == result)? 1 : 0;
    }

    public String getFlipTime() {
        return timeDate;
    }

    public String getChildName(){
        return childName;
    }

    public int getChoice() {
        return choice;
    }

    public int getResult() {
        return result;
    }

    public int getIconID() { return iconID; }
    //flip the coin generating a new set of flipCoinStats with random result.
    public void flipCoin(String childname, int choice1){
        String timedate = java.text.DateFormat.getDateTimeInstance().format(new Date());
        Random rand = new Random();
        int result1 = rand.nextInt(2)+1;
        timeDate = timedate;
        childName = childname;
        choice = choice1;
        result = result1;
        if(choice == result){
            iconID = R.drawable.check_icon;
        }
        else{
            iconID = R.drawable.cross_icon;
        }



    }










}
