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
public class BattleControlTest {
    
    public BattleControlTest() {
    }

    /**
     * Test of attackDamageCalc method, of class BattleControl.
     */
    @Test
    public void testAttackDamageCalc() {
        System.out.println("attackDamageCalc");
        int totalAttack = 20;
        int enemyDefense = 10;
        boolean hit = true;
        boolean critical = true;
        BattleControl instance = new BattleControl();
        int expResult = 20;
        int result = instance.attackDamageCalc(totalAttack, enemyDefense, hit, critical);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
