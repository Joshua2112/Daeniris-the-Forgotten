/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.CIT260.DaenirisTheForgotten.Control;

import byui.CIT260.DaenirisTheForgotten.Model.Actor;
import byui.CIT260.DaenirisTheForgotten.Model.CraftRecipe;
import byui.CIT260.DaenirisTheForgotten.Model.Enemy;
import byui.CIT260.DaenirisTheForgotten.Model.Game;
import byui.CIT260.DaenirisTheForgotten.Model.Gear;
import byui.CIT260.DaenirisTheForgotten.Model.Inventory;
import byui.CIT260.DaenirisTheForgotten.Model.Location;
import byui.CIT260.DaenirisTheForgotten.Model.PlayerCharacter;
import byui.CIT260.DaenirisTheForgotten.Model.RawMaterial;
import byui.CIT260.DaenirisTheForgotten.Model.SingleUseItems;
import byui.CIT260.DaenirisTheForgotten.Model.Spells;
import byui.CIT260.DaenirisTheForgotten.Model.World;
import daeniristheforgotten.DaenirisTheForgotten;
import static daeniristheforgotten.DaenirisTheForgotten.playerCharacter;

/**
 *
 * @author Joshua
 */
public class GameControl {
    public static Game game;
    
    public static void CreateNewGame(){
        //Create a new game instance
        GameControl.game = new Game();
        
        //Set new game as current game
        DaenirisTheForgotten.setCurrentGame(game);

        //Create game data
        game.setInventory(createInventory());
        game.setWorld(createWorld());
        game.setActor(createActor());
        GameControl.createCraftRecipe();
    }

    public static Inventory[][] createInventory() {
        Inventory[][] playerInventory =
                    new Inventory[Constants.INV_COL_COUNT][Constants.INV_COL_WIDTH];

        SingleUseItems blank = new SingleUseItems();
        blank.setName("");
        blank.setQuantity(0);
        
        for(int i = 0; i < (Constants.INV_COL_COUNT); i ++){
            for (int j = 0; j < (Constants.INV_COL_WIDTH); j++){
                playerInventory[i][j] = blank;
            }
        }
        
        // Single Use Items
        SingleUseItems potion = new SingleUseItems();
        potion.setName("Potion");
        potion.setDescription("A healing item");
        potion.setEffects("Heals 20 health points");
        potion.setQuantity(Constants.DEFAULT_INVENTORY_QUANTITY);
        playerInventory[0][0] = potion;
        
        SingleUseItems antidote = new SingleUseItems();
        antidote.setName("Antidote");
        antidote.setDescription("Heals poison");
        antidote.setEffects("Heals poison");
        antidote.setQuantity(Constants.DEFAULT_INVENTORY_QUANTITY);
        playerInventory[0][1] = antidote;
        
        SingleUseItems ether = new SingleUseItems();
        ether.setName("Ether");
        ether.setDescription("Resores magic");
        ether.setEffects("Restores 20 magic points");
        ether.setQuantity(Constants.DEFAULT_INVENTORY_QUANTITY);
        playerInventory[0][2] = ether;
        
        SingleUseItems greaterPotion = new SingleUseItems();
        greaterPotion.setName("Greater Potion");
        greaterPotion.setDescription("Restores more health");
        greaterPotion.setEffects("Restores 50 health points");
        greaterPotion.setQuantity(Constants.DEFAULT_INVENTORY_QUANTITY);
        playerInventory[0][3] = greaterPotion;
        

        SingleUseItems pheonixDown = new SingleUseItems();
        pheonixDown.setName("Pheonix Down");
        pheonixDown.setDescription("Revives");
        pheonixDown.setEffects("Blah");
        pheonixDown.setQuantity(0);
        playerInventory[0][4] = pheonixDown;


        //Armor ----------------------------------------------------------

        Gear leatherHelm = new Gear();
        leatherHelm.setName("Leather Helmet");
        leatherHelm.setAttackBonus(0);
        leatherHelm.setDefenseBonus(2);
        leatherHelm.setMagicAttackBonus(0);
        leatherHelm.setMagicDefenseBonus(0);
        leatherHelm.setDescription("A weak helmet made of leather");
        leatherHelm.setSpecialEffects("None");
        leatherHelm.setQuantity(Constants.DEFAULT_INVENTORY_QUANTITY);
        playerInventory[1][0] = leatherHelm;
       
        Gear ironBreastplate = new Gear();
        ironBreastplate.setName("Iron Breastplate");
        ironBreastplate.setAttackBonus(0);
        ironBreastplate.setDefenseBonus(4);
        ironBreastplate.setMagicAttackBonus(0);
        ironBreastplate.setMagicDefenseBonus(0);
        ironBreastplate.setDescription("An average breastplate made of iron");
        ironBreastplate.setSpecialEffects("None");
        ironBreastplate.setQuantity(Constants.DEFAULT_INVENTORY_QUANTITY);
        playerInventory[1][1] = ironBreastplate;
        
        Gear woodenShield = new Gear();
        woodenShield.setName("Wooden Shield");
        woodenShield.setAttackBonus(0);
        woodenShield.setDefenseBonus(2);
        woodenShield.setMagicAttackBonus(0);
        woodenShield.setMagicDefenseBonus(0);
        woodenShield.setDescription("A weak sheild made of wood");
        woodenShield.setSpecialEffects("None");
        woodenShield.setQuantity(Constants.DEFAULT_INVENTORY_QUANTITY);
        playerInventory[1][2] = woodenShield;
       
        Gear clothCloak = new Gear();
        clothCloak.setName("Cloth Cloak");
        clothCloak.setAttackBonus(0);
        clothCloak.setDefenseBonus(1);
        clothCloak.setMagicAttackBonus(1);
        clothCloak.setMagicDefenseBonus(3);
        clothCloak.setDescription("A simple cloak that is easy to move in");
        clothCloak.setSpecialEffects("None");
        clothCloak.setQuantity(Constants.DEFAULT_INVENTORY_QUANTITY);
        playerInventory[1][3] = clothCloak;
        

        
        //Weapons -----------------------------------------------------------
        Gear oakStaff = new Gear();
        oakStaff.setName("Oak Staff");
        oakStaff.setAttackBonus(1);
        oakStaff.setDefenseBonus(0);
        oakStaff.setMagicAttackBonus(2);
        oakStaff.setMagicDefenseBonus(0);
        oakStaff.setDescription("An old magic staff made of Oak");
        oakStaff.setSpecialEffects("None");
        oakStaff.setQuantity(Constants.DEFAULT_INVENTORY_QUANTITY);
        playerInventory[2][0] = oakStaff;
        
        Gear steelSword = new Gear();
        steelSword.setName("Cloth Cap");
        steelSword.setAttackBonus(5);
        steelSword.setDefenseBonus(0);
        steelSword.setMagicAttackBonus(0);
        steelSword.setMagicDefenseBonus(0);
        steelSword.setDescription("A sturdy sword made of steel");
        steelSword.setSpecialEffects("None");
        steelSword.setQuantity(Constants.DEFAULT_INVENTORY_QUANTITY);
        playerInventory[2][1] = steelSword;
        
        Gear fireStave = new Gear();
        fireStave.setName("Fire Stave");
        fireStave.setAttackBonus(2);
        fireStave.setDefenseBonus(0);
        fireStave.setMagicAttackBonus(5);
        fireStave.setMagicDefenseBonus(0);
        fireStave.setDescription("An elaborate staff, brimming with fire magic");
        fireStave.setSpecialEffects("Increases damage of fire spells");
        fireStave.setQuantity(Constants.DEFAULT_INVENTORY_QUANTITY);
        playerInventory[2][2] = fireStave;
        
        Gear ironSword = new Gear();
        ironSword.setName("Iron Sword");
        ironSword.setAttackBonus(2);
        ironSword.setDefenseBonus(0);
        ironSword.setMagicAttackBonus(0);
        ironSword.setMagicDefenseBonus(0);
        ironSword.setDescription("A plain old sword made of iron");
        ironSword.setSpecialEffects("None");
        ironSword.setQuantity(Constants.DEFAULT_INVENTORY_QUANTITY);
        playerInventory[2][3] = ironSword;
        
        //Raw Materials--------------------------------------------------------
        RawMaterial wood = new RawMaterial();
        wood.setName("Wood");
        wood.setDescription("Wood used to craft items");
        wood.setQuantity(Constants.DEFAULT_INVENTORY_QUANTITY);
        playerInventory[3][0] = wood;
        
        RawMaterial ore = new RawMaterial();
        ore.setName("Ore");
        ore.setDescription("Ore used to craft items");
        ore.setQuantity(Constants.DEFAULT_INVENTORY_QUANTITY);
        playerInventory[3][1] = ore;
        
        RawMaterial crystal = new RawMaterial();
        crystal.setName("Crystal");
        crystal.setDescription("Crystal used to craft items");
        crystal.setQuantity(Constants.DEFAULT_INVENTORY_QUANTITY);
        playerInventory[3][2] = crystal;
        
        RawMaterial magicSand = new RawMaterial();
        magicSand.setName("Magic Sand");
        magicSand.setDescription("Magic sand used to craft items");
        magicSand.setQuantity(Constants.DEFAULT_INVENTORY_QUANTITY);
        playerInventory[3][3] = magicSand;
        
        RawMaterial silver = new RawMaterial();
        silver.setName("Silver");
        silver.setDescription("Valuable metal used to craft items");
        silver.setQuantity(Constants.DEFAULT_INVENTORY_QUANTITY);
        playerInventory[3][4] = silver;
        
              return playerInventory;  
    }


    public static Actor[][] createActor() {
        Actor[][] actors = new Actor[Constants.NUMBER_OF_ACTOR_TYPES][Constants.NUMBER_OF_ENEMIES];
        
        PlayerCharacter newPlayerCharacter = new PlayerCharacter();
        newPlayerCharacter.setName(playerCharacter.getName());
        newPlayerCharacter.setAttack(0);
        newPlayerCharacter.setDefense(0);
        newPlayerCharacter.setGender(null);
        newPlayerCharacter.setMagicAttack(0);
        newPlayerCharacter.setMagicDefense(0);
        newPlayerCharacter.setHealthPoints(50);
        newPlayerCharacter.setMagicPoints(20);
        actors [0][0] = newPlayerCharacter;
        
        Enemy goblin = new Enemy();
        goblin.setName("Goblin");
        goblin.setAttack(2);
        goblin.setDefense(2);
        goblin.setMagicAttack(0);
        goblin.setMagicDefense(0);
        goblin.setHealthPoints(10);
        goblin.setMagicPoints(0);
        goblin.setExperienceValue(20);
        goblin.setItemsDropped("woodenShield, clothCloak");
        actors [1][0] = goblin;
        
        Enemy jelly = new Enemy();
        jelly.setName("Goblin");
        jelly.setAttack(0);
        jelly.setDefense(0);
        jelly.setMagicAttack(2);
        jelly.setMagicDefense(2);
        jelly.setHealthPoints(15);
        jelly.setMagicPoints(30);
        jelly.setExperienceValue(30);
        jelly.setItemsDropped("potion, clothCap");
        actors [1][0] = jelly;
        
        return actors;
        
    }

    public static World createWorld() {
        World gameWorld = new World();
        
        return gameWorld;
    }

    public static void createCraftRecipe() {
        System.out.println("create Craft Recipe stub called");
    }
    
    public static void sort(Inventory[][] array){

        System.out.println("Array Length" + array[0].length);
        Inventory temp;
        for (Inventory[] array1 : array) {
            for (int i = 0; i < array1.length - 1; i++) {
                for (int j = i + 1; j < array1.length; j++) {
                    if ((array1[i].getName().compareToIgnoreCase(array1[j].getName())) > 0 && array1[j].getQuantity() > 0) {
                        temp = array1[i];
                        array1[i] = array1[j];
                        array1[j] = temp;
                    }
                }
            }  
        }
    }
    
    public static void sort(Actor[][] array){
        
        System.out.println("Array Length" + array[0].length);
        Actor temp;
        for (Actor[] array1 : array) {
            for (int j=0; j < array1.length - 1; j++){
                for(int k = j + 1; k<array1.length; k++){
                    if((array1[j].getName().compareToIgnoreCase(array1[k].getName()))> 0) {
                        temp = array1[j];
                        array1[j] = array1[k];
                        array1[k] = temp;
                    } 
                }
            }  
        }
    }
}


