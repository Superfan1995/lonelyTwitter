package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by superfan1995 on 18/1/18.
 */

public class Mood1 extends Mood {

    private String message;

    public Mood1() {
        super();
    }

    public Mood1(Date date) {
        super(date);
    }

    @Override
    public String MoodString() {
        message = "Happy";
        return message;
    }

}
