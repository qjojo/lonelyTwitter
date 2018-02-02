package ca.ualberta.cs.lonelytwitter;

/*
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

/**
 * Interface for tweet classes and subclasses
 */
public interface Tweetable {
    /**
     * Getter for message
     * @return tweet text
     */
    public String getMessage();

    /**
     * Setter for message
     * @param message tweet text
     * @throws TweetTooLongException thrown if tweet text is too long
     */
    public void setMessage(String message) throws TweetTooLongException;
}
