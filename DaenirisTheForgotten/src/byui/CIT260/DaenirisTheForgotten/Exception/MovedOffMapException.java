/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.CIT260.DaenirisTheForgotten.Exception;

/**
 *
 * @author Joshua
 */
public class MovedOffMapException extends Exception{

    public MovedOffMapException() {
    }

    public MovedOffMapException(String message) {
        super(message);
    }

    public MovedOffMapException(String message, Throwable cause) {
        super(message, cause);
    }

    public MovedOffMapException(Throwable cause) {
        super(cause);
    }

    public MovedOffMapException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
