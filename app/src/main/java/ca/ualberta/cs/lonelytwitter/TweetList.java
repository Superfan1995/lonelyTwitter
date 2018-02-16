package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;

/**
 * Created by superfan1995 on 2018-02-15.
 */

public class TweetList {

    private ArrayList<Tweet> tweets = new ArrayList<Tweet>();

    public void add(Tweet tweet) throws IllegalArgumentException {

        if ( hasTweet(tweet) ) {
            throw new IllegalArgumentException();
        }
        else {
            tweets.add(tweet);
        }
    }

    public void delete(Tweet tweet){

        tweets.remove(tweet);
    }

    public boolean hasTweet(Tweet tweet){

        return tweets.contains(tweet);
    }

    public Tweet getTweet(int index){

        return tweets.get(index);
    }

    public int getCount() {
        return tweets.size();
    }
}
