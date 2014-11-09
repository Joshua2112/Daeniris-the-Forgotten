/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.CIT260.DaenirisTheForgotten.Exception;

/**
 *
 * @author Nathan
 */
public class illegalActionException extends Exception{

    public illegalActionException() {
    }

    public illegalActionException(String message) {
        super(message);
    }

    public illegalActionException(String message, Throwable cause) {
        super(message, cause);
    }

    public illegalActionException(Throwable cause) {
        super(cause);
    }

    public illegalActionException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
