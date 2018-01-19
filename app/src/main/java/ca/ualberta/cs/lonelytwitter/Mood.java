package ca.ualberta.cs.lonelytwitter;
import java.util.Date;

/* created by jquist on 19/01/18 */

public abstract class Mood {
    private Date recordDate;

    public Mood() {
        recordDate = new Date();
    }

    public Mood(Date date) {
        recordDate = date;
    }

    public Date getDate() {
        return recordDate;
    }

    public void setDate(Date date) {
        recordDate = date;
    }

    public abstract String format();
}
