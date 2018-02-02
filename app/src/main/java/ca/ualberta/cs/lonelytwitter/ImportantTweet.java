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

import java.util.Date;

public class ImportantTweet extends Tweet{

    ImportantTweet(String message){
        super(message);
    }

    ImportantTweet(String message, Date date){
       super(message,date);
    }


    @Override
    public boolean isImportant(){
        return true;
    }
}
