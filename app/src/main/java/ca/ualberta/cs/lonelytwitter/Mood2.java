package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by superfan1995 on 18/1/18.
 */

public class Mood2 extends Mood {

    private String message;

    public Mood2() {
        super();
    }

    public Mood2(Date date) {
        super(date);
    }

    @Override
    public String MoodString() {
        message = "Angry";
        return message;
    }

}