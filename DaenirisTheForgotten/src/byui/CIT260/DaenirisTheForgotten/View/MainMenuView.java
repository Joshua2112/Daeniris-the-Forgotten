/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.CIT260.DaenirisTheForgotten.View;

/**
 *
 * @author Joshua
 */
public class MainMenuView {
    
        private final String MENU ="\n\tEnter \'s\' to start new game"
                                  +"\n\tEnter \'l\' to load previously saved game"
                                  +"\n\tEnter \'q\' to quit to the desktop";
    
        
    public void displayMenu(){

        char selection = ' ';
        do {
            
            System.out.println(MENU);

            String input = this.getInput();
            selection = input.charAt(0);

            this.doAction(selection);

        }while (selection != 'E');

}    

    private String getInput() {
        System.out.println("getInput function called");
            return null;
    }

    private void doAction(char selection) {
        System.out.println("doAction function called");
    }
}
