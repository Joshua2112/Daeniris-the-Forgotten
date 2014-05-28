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
        double specialEffect = 0.5;
        int enemyDefense = 8;
        SpellControl instance = new SpellControl();
        int expResult = 4;
        int result = instance.weakenSpell(specialEffect, enemyDefense);
        assertEquals(expResult, result);
        
    }
    
}
