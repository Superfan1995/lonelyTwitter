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
 * Reoresebts a Important tweet
 *
 * @author xf4
 * @version 1.0
 */

public class ImportantTweet extends Tweet {

    /**
     * Create an important tweet instance
     */
    ImportantTweet(String message){
        super(message);
    }

    ImportantTweet(String message, Date date){
        super(message, date);
    }

    /**
     * Set the tweet to important
     *
     * @return
     */

    @Override
    public Boolean isImportant() {
        return Boolean.TRUE;
    }
}
