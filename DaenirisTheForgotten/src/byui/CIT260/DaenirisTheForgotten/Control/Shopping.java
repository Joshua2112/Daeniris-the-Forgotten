/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.CIT260.DaenirisTheForgotten.Control;

/**
 *
 * @author Joshua
 */
public class Shopping {
    
    public int purchaseItem(boolean itemAvailable, int playerGold, int itemCost, int quantityOfItem){
        if (itemAvailable){
            if (playerGold > itemCost){
            playerGold -= itemCost;
            quantityOfItem = quantityOfItem + 1;
            return 1; }           
            else{
            return -1;
            }
        }
    else{
    return -1;
        }
    }
}