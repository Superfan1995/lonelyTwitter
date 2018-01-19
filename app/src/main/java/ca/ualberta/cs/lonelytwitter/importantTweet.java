package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by superfan1995 on 18/1/18.
 */

public class importantTweet extends Tweet {

    public importantTweet(String message) {
        super(message);
    }

    public importantTweet(String message, Date date) {
        super(message, date);
    }

    @Override
    public Boolean isImportant() {
        return Boolean.TRUE;
    }

}
