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
public class ShoppingTest {
    
    public ShoppingTest() {
    }

    /**
     * Test of purchaseItem method, of class ShopControl.
     */
    @Test
    public void testPurchaseItem() {
        System.out.println("purchaseItem");
        /*test 1 */
        
        System.out.println("/ttest 1");
        boolean itemAvailable = true;
        int result;
        int playerGold = 30;
        int itemCost = 20;
        int quantityOfItem = 0;
        ShopControl instance = new ShopControl();
        int expResult = 1;
        result = instance.purchaseItem(itemAvailable, playerGold, itemCost, quantityOfItem);
        assertEquals(expResult, result);
        
        
        
        System.out.println("/ttest 2");
        itemAvailable = false;
        playerGold = 30;
        itemCost = 20;
        quantityOfItem = 0;
        expResult = -1;
        result = instance.purchaseItem(itemAvailable, playerGold, itemCost, quantityOfItem);
        assertEquals(expResult, result);
        
        System.out.println("/ttest 3");
        itemAvailable = true;
        playerGold = 10;
        itemCost = 20;
        quantityOfItem = 0;
        expResult = -1;
        result = instance.purchaseItem(itemAvailable, playerGold, itemCost, quantityOfItem);
        assertEquals(expResult, result);
        
        System.out.println("/ttest 4");
        itemAvailable = true;
        playerGold = 30;
        itemCost = 0;
        quantityOfItem = 0;
        expResult = 1;
        result = instance.purchaseItem(itemAvailable, playerGold, itemCost, quantityOfItem);
        assertEquals(expResult, result);
        
        

        

        
    }
    
}
