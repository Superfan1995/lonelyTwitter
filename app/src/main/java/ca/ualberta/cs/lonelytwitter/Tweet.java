/*
 *  Copyright  © 2018 Team X, CMPUT301, University of Alberta - All right REserved.
 *  You may use, distribute or modify this code under terms and conditions of Code of
 * Students  Behaviors at
 *  University of Alberta.
 *  You can find a cope of the license in this project. Otherwise, please contact
 * xf4@ualberta.ca
 * /
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Reoresebts a tweet
 *
 * @author xf4
 * @version 1.0
 */

public abstract class Tweet implements Tweetable {
    private String message;
    private Date date;

    /**
     * Constructs a tweet instance
     *
     * @param message the message of the tweet
     */

    Tweet(String message){

        this.message = message;
        date = new Date();
//        message = message;
    }

    Tweet(String message, Date date){
        this.message = message;
        this.date = date;
    }

    /**
     * Get the message in the sweet
     *
     * @return
     */

    public String getMessage(){
        return message;
    }

    /**
     * Change the message of tweet to a new message
     * @param message - the new message of the tweet
     * @throws TweetTooLongException - is thrown when the message is over 140 characters
     *
     * @see ImportantTweet
     * @see NormalTweet
     */

    public void setMessage(String message) throws TweetTooLongException{

        if (message.length() < 140){
            this.message = message;
        }
        else{
            throw new TweetTooLongException();
        }
    }

    /**
     * Get the date of the tweet
     *
     * @return
     */

    public Date getDate(){
        return date;
    }

    /**
     * Change the date of tweet to a new date
     *
     * @param date the new date of the tweet
     */

    public void setDate(Date date){
        this.date = date;
    }

    /**
     * If the tweet is an important tweet
     *
     * @return
     */

    public abstract Boolean isImportant();

    /**
     *  Add date and message together to create the output string of tweet
     *
     * @return
     */

    public String toString() {
        return date.toString() + " | " + message;
    }
}
