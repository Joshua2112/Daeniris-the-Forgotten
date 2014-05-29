/*********************************************************************
 * SpellControlTest Class
 * Author: Nathan Wittmann
 * Test for weakenSpell
 *********************************************************************/

package byui.CIT260.DaenirisTheForgotten.Control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Nathan
 */
public class SpellControlTest {
    
    public SpellControlTest() {
    }

    @Test
    
    /************************************************************************
     * Test #1
     ************************************************************************/    
    public void testWeakenSpell() {

        System.out.println("weaken Spell Test #1");
        double specialEffect = 0.8;
        int enemyDefense = 10;
        SpellControl instance = new SpellControl();
        int expResult = 8;
        int result = instance.weakenSpell(specialEffect, enemyDefense);
        assertEquals(expResult, result);
        
    /************************************************************************
     * Test #2
     ************************************************************************/        
        System.out.println("weaken Spell Test #2");
        specialEffect = 0.7;
        enemyDefense = 10;
        expResult = 7;
        result = instance.weakenSpell(specialEffect, enemyDefense);
        assertEquals(expResult, result);
        
    /************************************************************************
     * Test #3
     ************************************************************************/        
        System.out.println("weaken Spell Test #3");
        specialEffect = 0.6;
        enemyDefense = 10;
        expResult = 6;
        result = instance.weakenSpell(specialEffect, enemyDefense);
        assertEquals(expResult, result);    

    /************************************************************************
     * Test #4
     ************************************************************************/        
        System.out.println("weaken Spell Test #4");
        specialEffect = -0.1;
        enemyDefense = 10;
        expResult = -1;
        result = instance.weakenSpell(specialEffect, enemyDefense);
        assertEquals(expResult, result);    

    /************************************************************************
     * Test #5
     ************************************************************************/        
        System.out.println("weaken Spell Test #5");
        specialEffect = 0;
        enemyDefense = 10;
        expResult = -1;
        result = instance.weakenSpell(specialEffect, enemyDefense);
        assertEquals(expResult, result); 
    
    /************************************************************************
     * Test #6
     ************************************************************************/        
        System.out.println("weaken Spell Test #6");
        specialEffect = .9;
        enemyDefense = 10;
        expResult = 9;
        result = instance.weakenSpell(specialEffect, enemyDefense);
        assertEquals(expResult, result); 
    
    /************************************************************************
     * Test #7
     ************************************************************************/        
        System.out.println("weaken Spell Test #7");
        specialEffect = .5;
        enemyDefense = 10;
        expResult = 5;
        result = instance.weakenSpell(specialEffect, enemyDefense);
        assertEquals(expResult, result); 

    }
    
}