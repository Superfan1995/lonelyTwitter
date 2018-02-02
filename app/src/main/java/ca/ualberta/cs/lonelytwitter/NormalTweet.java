package ca.ualberta.cs.lonelytwitter;

/**
 * Created by dezfuli on 1/16/18.
 */
import java.util.Date;

/**
 * Reoresebts a tweet
 *
 * @author xf4
 * @version 1.0
 */

public class NormalTweet extends Tweet {

    /**
     * construct a normal tweet instance
     *
     * @param message the message of the normal tweet
     *
     */

    NormalTweet(String message){
        super(message);
    }

    /**
     * construct a normal tweet instance
     *
     * @param message the message of the normal tweet
     * @param date the date of the normal tweet
     */

    NormalTweet(String message, Date date){
        super(message, date);
    }

    /**
     * Set the important of the normal tweet to fasle
     * @return
     */

    @Override
    public Boolean isImportant() {
        return Boolean.FALSE;
    }
}
