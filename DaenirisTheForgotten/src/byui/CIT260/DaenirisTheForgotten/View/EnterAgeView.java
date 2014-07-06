/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.CIT260.DaenirisTheForgotten.View;

import static byui.CIT260.DaenirisTheForgotten.Control.GameControl.game;
import byui.CIT260.DaenirisTheForgotten.Exception.illegalActionException;
import byui.CIT260.DaenirisTheForgotten.Model.Actor;
import byui.CIT260.DaenirisTheForgotten.Model.Game;
import byui.CIT260.DaenirisTheForgotten.Model.PlayerCharacter;
import daeniristheforgotten.DaenirisTheForgotten;
import java.util.Scanner;

/**
 *
 * @author Joshua
 */
class EnterAgeView extends View{
    
    Actor[][] actors = game.getActor();
    PlayerCharacter player = ((PlayerCharacter) actors[0][0]);

    public EnterAgeView(){
        super("\n\tPlease enter character's age (in numeric format[i.e. 18, 23, etc.])");
    }

    @Override
    public int doAction(String value)throws illegalActionException{
        try{
        int age = Integer.parseInt(value);
        player.setAge(age);
        }catch(NumberFormatException nf){
        throw new illegalActionException("\n\tMust be a number");
        }
        return 1;
            }
    }