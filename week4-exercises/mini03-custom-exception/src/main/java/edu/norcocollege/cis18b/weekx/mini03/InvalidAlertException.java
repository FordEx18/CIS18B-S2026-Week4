package edu.norcocollege.cis18b.weekx.mini03;

//invalid alert exception class that extends Exception
public class InvalidAlertException extends Exception {
    //constructor that accepts a message and passes it to super(...).
    public InvalidAlertException(String message) {
        super(message);
    }
}
