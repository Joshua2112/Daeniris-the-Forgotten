/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.CIT260.DaenirisTheForgotten.View;

import byui.CIT260.DaenirisTheForgotten.Control.Constants;
import byui.CIT260.DaenirisTheForgotten.Control.GameControl;
import byui.CIT260.DaenirisTheForgotten.Model.CraftRecipe;
import byui.CIT260.DaenirisTheForgotten.Model.Game;
import daeniristheforgotten.DaenirisTheForgotten;

/**
 *
 * @author Nathan
 */
public class CraftMenuView extends View{

    public CraftMenuView() {
        super("Type name to select");
    }
   

        
    public int doAction(String str){
        
        int column = 0;
        int row = 0;
        
        Game game = DaenirisTheForgotten.getCurrentGame();
        CraftRecipe[][] crafts = game.getCraftRecipe();
        
        for (int i = 0; i < Constants.CRAFT_COL_COUNT; i++){
            row = GameControl.stringSearch(crafts, str, i);
            column = i;
        }
        
        //System.out.println(crafts[column][row].getCraftName());
        System.out.println(crafts[column][row].toString());
        
        return 0;
              
    }
}
