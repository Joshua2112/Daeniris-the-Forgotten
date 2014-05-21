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
    
    @Test
    

    public void testAttackDamageCalc() {
        System.out.println("Calcualte Attack Damage");
        
    /**************************************************************************
     * Test #1
     **************************************************************************/
        
        System.out.println("\t TEST #1 Valid");
        int totalAttack = 20;
        int enemyDefense = 10;
        boolean hit = true;
        boolean critical = true;
        BattleControl instance = new BattleControl();
        int expResult = 20;
        int result = instance.attackDamageCalc(totalAttack, enemyDefense, hit, critical);
        assertEquals(expResult, result);
    

    /**************************************************************************
     * Test #2
     **************************************************************************/

        System.out.println("\t TEST #2 Valid");
        totalAttack = 20;
        enemyDefense = 10;
        hit = true;
        critical = false;
        expResult = 10;
        result = instance.attackDamageCalc(totalAttack, enemyDefense, hit, critical);
        assertEquals(expResult, result);

        
    /**************************************************************************
     * Test #3
     **************************************************************************/

        System.out.println("\t TEST #3 Lower Range");
        totalAttack = 20;
        enemyDefense = 10;
        hit = false;
        critical = false;
        expResult = 0;
        result = instance.attackDamageCalc(totalAttack, enemyDefense, hit, critical);
        assertEquals(expResult, result);
        
    /**************************************************************************
     * Test #4
     **************************************************************************/

        System.out.println("\t TEST #4 Lower Range");
        totalAttack = 20;
        enemyDefense = 10;
        hit = false;
        critical = true;
        expResult = 0;
        result = instance.attackDamageCalc(totalAttack, enemyDefense, hit, critical);
        assertEquals(expResult, result);
        
    /**************************************************************************
     * Test #5
     **************************************************************************/

        System.out.println("\t TEST #5 Invalid");
        totalAttack = -3;
        enemyDefense = 10;
        hit = true;
        critical = true;
        expResult = -1;
        result = instance.attackDamageCalc(totalAttack, enemyDefense, hit, critical);
        assertEquals(expResult, result);        
    
    /**************************************************************************
     * Test #6
     **************************************************************************/

        System.out.println("\t TEST #6 Upper Range");
        totalAttack = 20;
        enemyDefense = -3;
        hit = true;
        critical = true;
        expResult = 46;
        result = instance.attackDamageCalc(totalAttack, enemyDefense, hit, critical);
        assertEquals(expResult, result);

    /**************************************************************************
     * Test #7
     **************************************************************************/

        System.out.println("\t TEST #7 Valid");
        totalAttack = 20;
        enemyDefense = 30;
        hit = true;
        critical = true;
        expResult = 0;
        result = instance.attackDamageCalc(totalAttack, enemyDefense, hit, critical);
        assertEquals(expResult, result);    
    
    }        
}
