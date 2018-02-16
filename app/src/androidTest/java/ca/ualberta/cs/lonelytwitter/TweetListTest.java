package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;

/**
 * Created by superfan1995 on 2018-02-15.
 */

public class TweetListTest extends ActivityInstrumentationTestCase2 {

    public TweetListTest(){
        super(LonelyTwitterActivity.class);
    }

    public void testAddTweet() throws IllegalArgumentException{
        TweetList tweets = new TweetList();
        Tweet tweet = new normalTweet("adding a normal tweet");
        tweets.add(tweet);
        assertTrue(tweets.hasTweet(tweet));
    }

    public void testGetTweet() throws IllegalArgumentException {
        TweetList tweets = new TweetList();
        Tweet tweet = new normalTweet("adding a normal tweet");
        tweets.add(tweet);
        assertTrue(tweets.hasTweet(tweet));
    }

    public void testHasTweet() throws IllegalArgumentException {
        TweetList tweets = new TweetList();
        Tweet tweet = new normalTweet("adding a normal tweet");
        tweets.add(tweet);
        Tweet returnedTweet = tweets.getTweet(0);
        assertEquals(returnedTweet.getDate(), tweet.getDate());
    }

    public void testDeleteTweet() throws IllegalArgumentException {
        TweetList tweets = new TweetList();
        Tweet tweet = new normalTweet("adding a normal tweet");
        tweets.add(tweet);
        tweets.delete(tweet);
        assertFalse(tweets.hasTweet(tweet));
    }

    public void testAddException() throws IllegalArgumentException {

        TweetList tweets = new TweetList();
        Tweet tweet = new normalTweet("adding a normal tweet");
        tweets.add(tweet);

        try {
            tweets.add(tweet);
            assertTrue(Boolean.FALSE);
        }
        catch (IllegalArgumentException e) {
            assertTrue(Boolean.TRUE);
        }
    }

    public void testGetCount() throws IllegalArgumentException {

        TweetList tweets = new TweetList();

        Tweet tweet1 = new normalTweet("tweet1");
        Tweet tweet2 = new normalTweet("tweet2");
        Tweet tweet3 = new normalTweet("tweet3");

        tweets.add(tweet1);
        tweets.add(tweet2);
        tweets.add(tweet3);

        int count = tweets.getCount();

        assertTrue(count == 3);
    }

}
