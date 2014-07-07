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
class EnterAgeView{
    
    Actor[][] actors = game.getActor();
    PlayerCharacter player = ((PlayerCharacter) actors[0][0]);

    private final String AGE_MESSAGE = "Please enter character's age (in numeric format i.e. 33, 18, etc.";
    
    public void display() throws illegalActionException{
        int exit;
        String value;
        do {
            System.out.println(this.AGE_MESSAGE);
            value = this.getInput();
            exit = this.doAction(value);

        }while (!value.equals("Q") && exit != 1);
    }
    
    public String getInput() {
        
        boolean valid = false;
        String input = null;
        Scanner keyboard = new Scanner(System.in);
        
        while(!valid){
            
            //System.out.println("\n\tPlease choose option");
            
            input = keyboard.nextLine();
            input = input.trim();
            input = input.toUpperCase();
            
            if (input.equals("Q")){
                return input;
            }                           
            else{
                valid = true;
            }
        }
        return input;
        }

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