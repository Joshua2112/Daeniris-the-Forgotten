/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.CIT260.DaenirisTheForgotten.View;

import byui.CIT260.DaenirisTheForgotten.Control.ProgramControl;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Joshua
 */
public class ProgramStartTest {
    
    public ProgramStartTest() {
    }

    /**
     * Test of displayBanner method, of class ProgramStart.
     */
    @Test
    public void testDisplayBanner() {
        System.out.println("displayBanner");
        ProgramStart instance = new ProgramStart();
        instance.displayBanner();
        
        
    }

    /**
     * Test of getPlayersName method, of class ProgramStart.
     */
    @Test
    public void testGetPlayersName() {
        System.out.println("getPlayersName");
        ProgramStart instance = new ProgramStart();
        String expResult = "";
        String result = instance.getPlayersName();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of startProgram method, of class ProgramStart.
     */
    @Test
    public void testStartProgram() {
        System.out.println("startProgram");
        ProgramStart instance = new ProgramStart();
        instance.startProgram();
        
    }

    /**
     * Test of displayWelcomeMessage method, of class ProgramStart.
     */
    @Test
    public void testDisplayWelcomeMessage() {
        System.out.println("displayWelcomeMessage");
        ProgramControl.Player player = null;
        ProgramStart instance = new ProgramStart();
        instance.displayWelcomeMessage(player);
        
    }
    
}
