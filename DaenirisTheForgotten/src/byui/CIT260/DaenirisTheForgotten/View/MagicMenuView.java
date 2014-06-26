/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.CIT260.DaenirisTheForgotten.View;

import byui.CIT260.DaenirisTheForgotten.Control.SpellControl;

/**
 *
 * @author Joshua
 */
class MagicMenuView extends View{

    public MagicMenuView() {
        super("Enter corresponding letter to cast spell"
                +"\n\t\'f\' for fire spell"
                +"\n\t\'i\' for ice spell"
                +"\n\t\'w\' for water spell"
                +"\n\t\'a\' for attack boost spell"
                +"\n\t\'d\' for defense boost spell"
                +"\n\t\'l\' for lightning spell");
    }   
    
    @Override
    public void doAction(String choice){
        
         switch (choice){
            case "F":
                //SpellControl fire = new SpellControl();
                //fire.castFire();
                break;
            case "I":
                //SpellControl ice = new SpellControl();
                //ice.castIce();
                break;
            case "W":
                //SpellControl water = new SpellControl();
                //water.castWater();
                break;
            case "A":
                //SpellControl attackBoost = new SpellControl();
                //attackBoost.castAttackBoost();
                break;
            case "D":
                //SpellControl defenseBoost = new SpellControl();
                //defenseBoost.castDefenseBoost();
                break;
            case "L":
               // SpellControl lightning = new SpellControl();
                //lightning.castLightning();
            case "Q":
                return;
            default:
                System.out.println("Invalid selection, try again");
                break;
        }
               
    }
}
