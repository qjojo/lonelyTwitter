package ca.ualberta.cs.lonelytwitter;

/**
 * Created by sajediba on 1/17/18.
 */

import java.util.ArrayList;
import java.util.Date;

public abstract class Tweet implements Tweetable{

    private String message;
    private Date date;
    private ArrayList<Mood> moods;

    Tweet(){

    }
    public Tweet(String message){
        this.message = message;
    }

    public Tweet(String message, Date date){
        this.message = message;
        this.date = date;
    }

    public Date getDate(){
        return date;

    }

    public String getMessage(){
        return message;
    }

    public void setMessage(String message) throws TweetTooLongException{
        if(message.length() > 160){
            // throw an error
            throw new TweetTooLongException();
        }

        this.message = message;
    }

    public void addMood(Mood mood) {
        moods.add(mood);
    }

    public void setDate(Date date){
        this.date = date;
    }

    public abstract boolean isImportant();
}
