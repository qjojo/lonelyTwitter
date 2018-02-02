package ca.ualberta.cs.lonelytwitter;

/**
 Copyright 2018 Jonah Quist
 +
 + Permission is hereby granted, free of charge, to any person obtaining a copy of this software
 + and associated documentation files (the "Software"), to deal in the Software without restriction,
 + including without limitation the rights to use, copy, modify, merge, publish, distribute,
 + sublicense, and/or sell copies of the Software, and to permit persons to whom the Software
 + is furnished to do so, subject to the following conditions:
 +
 * Created by sajediba on 1/17/18.
 */

import java.util.ArrayList;
import java.util.Date;

/**
 * ABC for Tweet objects
 *
 * @author jquist
 * @version 1.5
 * @see NormalTweet
 * @see ImportantTweet
 * @see Tweetable
 */
public abstract class Tweet implements Tweetable{

    private String message;
    private Date date;
    private ArrayList<Mood> moods;

    /**
     * Generic constructor for tweets
     */
    Tweet(){

    }

    /**
     * Constructs a tweet object with message
     * @param message tweet text
     */
    public Tweet(String message){
        this.message = message;
    }

    /**
     * Constructs a tweet object with message and date
     * @param message tweet text
     * @param date tweet date
     */
    public Tweet(String message, Date date){
        this.message = message;
        this.date = date;
    }

    /**
     * Getter for date
     * @return date
     */
    public Date getDate(){
        return date;

    }

    /**
     * Getter for message
     * @return message
     */

    public String getMessage(){
        return message;
    }

    /**
     * Setter for message
     * @param message tweet text
     * @throws TweetTooLongException thrown if text is too long
     */
    public void setMessage(String message) throws TweetTooLongException{
        if(message.length() > 160){
            // throw an error
            throw new TweetTooLongException();
        }

        this.message = message;
    }

    /**
     * Appends mood to tweet
     * @param mood tweet mood
     */
    public void addMood(Mood mood) {
        moods.add(mood);
    }

    /**
     * Setter for date
     * @param date tweet date
     */

    public void setDate(Date date){
        this.date = date;
    }

    /**
     * Return true if tweet is important
     *
     * @return importance
     */
    public abstract boolean isImportant();
}
