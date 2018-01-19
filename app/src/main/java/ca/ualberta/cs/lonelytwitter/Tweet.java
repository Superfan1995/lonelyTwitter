package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by superfan1995 on 18/1/18.
 */

public abstract class Tweet implements Tweetable {
    private String message;
    private Date date;

    // list of mood
    private ArrayList<Mood> moods = new ArrayList<Mood>();

    public Tweet(String message) {
        this.message = message;
        this.date = new Date();
    }

    public Tweet(String message, Date date) {
        this.message = message;
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) throws TweetTooLongException {
        if (message.length() > 140) {
            throw new TweetTooLongException();
        }
        else {
            this.message = message;
        }
    }

    public abstract Boolean isImportant();

    // add new mood in the list
    public void addMood(Mood mood) {
        moods.add(mood);
    }

}
