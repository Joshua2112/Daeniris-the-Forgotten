/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.CIT260.DaenirisTheForgotten.Control;

/**
 *
 * @author Nathan
 */
public class stringNotFoundException extends Exception{

    public stringNotFoundException() {
    }

    public stringNotFoundException(String message) {
        super(message);
    }

    public stringNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public stringNotFoundException(Throwable cause) {
        super(cause);
    }

    public stringNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
    
}
