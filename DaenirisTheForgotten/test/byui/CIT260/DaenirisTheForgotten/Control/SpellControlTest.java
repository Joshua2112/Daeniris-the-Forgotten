/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.CIT260.DaenirisTheForgotten.Control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Joshua
 */
public class SpellControlTest {
    
    public SpellControlTest() {
    }

    /**
     * Test of weakenSpell method, of class SpellControl.
     */
    @Test
    public void testWeakenSpell() {
        System.out.println("weakenSpell");
        double specialEffect = 0.0;
        int enemyDefense = 0;
        SpellControl instance = new SpellControl();
        int expResult = 0;
        int result = instance.weakenSpell(specialEffect, enemyDefense);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
