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
     * Set the tweet to not important
     * @return
     */

    @Override
    public Boolean isImportant() {
        return Boolean.FALSE;
    }
}
