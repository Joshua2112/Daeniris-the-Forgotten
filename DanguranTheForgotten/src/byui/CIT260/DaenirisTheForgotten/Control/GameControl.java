/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.CIT260.DaenirisTheForgotten.Control;

import byui.CIT260.DaenirisTheForgotten.Model.Actor;
import byui.CIT260.DaenirisTheForgotten.Model.ArrayLocation;
import byui.CIT260.DaenirisTheForgotten.Model.BattleScene;
import byui.CIT260.DaenirisTheForgotten.Model.CraftRecipe;
import byui.CIT260.DaenirisTheForgotten.Model.Enemy;
import byui.CIT260.DaenirisTheForgotten.Model.EquippedGear;
import byui.CIT260.DaenirisTheForgotten.Model.Game;
import byui.CIT260.DaenirisTheForgotten.Model.Gear;
import byui.CIT260.DaenirisTheForgotten.Model.Inventory;
import byui.CIT260.DaenirisTheForgotten.Model.Location;
import byui.CIT260.DaenirisTheForgotten.Model.PlayerCharacter;
import byui.CIT260.DaenirisTheForgotten.Model.RawMaterial;
import byui.CIT260.DaenirisTheForgotten.Model.Resource;
import byui.CIT260.DaenirisTheForgotten.Model.SingleUseItems;
import byui.CIT260.DaenirisTheForgotten.Model.Spells;
import byui.CIT260.DaenirisTheForgotten.Model.World;
import dangurantheforgotten.DanguranTheForgotten;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;

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
        DanguranTheForgotten.setCurrentGame(game);

        //Create game data
        game.setInventory(createInventory());
        game.setWorld(createWorld());
        game.setActor(createActor());
        game.setCraftRecipe(createCraftRecipe());
        game.setSpells(createSpells());
        game.setHelms(createHelmList());
        game.setArmors(createArmorList());
        game.setWeapons(createWeaponList());
        game.setSecondaries(createSecondaryList());
        game.setEquippedGear(initialGear());
        game.setBattle(createBattle());
        game.setPicURL(getImage());

                
        Actor[][] actor = game.getActor();
    }

    public static Spells[] createInventory() {
        Spells[] playerInventory =
                    new Spells[Constants.GEAR_LIST_COUNT];
        
        SingleUseItems blank = new SingleUseItems();
        blank.setName("");
        blank.setQuantity(0);
        
        
        
        // Single Use Items
        Spells potion = new Spells();
        potion.setSpellName("Potion");
        potion.setDescription("Heals 20 health points");
        potion.setMessage("Your health was restored by 20");
        potion.setSpellType(Constants.POTION_RESTORE_HEALTH);
        potion.setSpecialEffects(20);
        potion.setQuantity(Constants.STARTING_ITEM_QUANTITY);
        potion.setCost(10);
        playerInventory[0] = potion;
        
        Spells greaterPotion = new Spells();
        greaterPotion.setSpellName("Greater Potion");
        greaterPotion.setDescription("Restore Health by 40");
        greaterPotion.setMessage("Your health was restored by");
        greaterPotion.setSpellType(Constants.POTION_RESTORE_HEALTH);
        greaterPotion.setSpecialEffects(40);
        greaterPotion.setQuantity(Constants.STARTING_ITEM_QUANTITY);
        greaterPotion.setCost(20);
        playerInventory[1] = greaterPotion;
        
        Spells antidote = new Spells();
        antidote.setSpellName("Antidote");
        antidote.setDescription("Heals poison");
        antidote.setMessage("You were cured");
        antidote.setSpellType(Constants.POTION_ANTIDOTE);
        antidote.setSpecialEffects(15);
        antidote.setQuantity(Constants.STARTING_ITEM_QUANTITY);
        antidote.setCost(10);
        playerInventory[2] = antidote;
                
        Spells ether = new Spells();
        ether.setSpellName("Ether");
        ether.setDescription("Restore mana by 20");
        ether.setMessage("Your mana was restored by");
        ether.setSpellType(Constants.POTION_RESTORE_MANA);
        ether.setSpecialEffects(15);
        ether.setQuantity(Constants.STARTING_ITEM_QUANTITY);
        ether.setCost(20);
        playerInventory[3] = ether;
        
        Spells greaterEther = new Spells();
        greaterEther.setSpellName("Greater Ether");
        greaterEther.setDescription("Restore mana by 40");
        greaterEther.setMessage("Your mana was restored by");
        greaterEther.setSpellType(Constants.POTION_RESTORE_MANA);
        greaterEther.setSpecialEffects(15);
        greaterEther.setQuantity(Constants.STARTING_ITEM_QUANTITY);
        greaterEther.setCost(20);
        playerInventory[4] = greaterEther;

        Spells pheonixDown = new Spells();
        pheonixDown.setSpellName("Pheonix Down");
        pheonixDown.setDescription("Restore mana by 40");
        pheonixDown.setMessage("You will be fully restored upon your death.");
        pheonixDown.setSpellType(Constants.POTION_PHEONIX);
        pheonixDown.setSpecialEffects(100);
        pheonixDown.setQuantity(Constants.STARTING_ITEM_QUANTITY);
        pheonixDown.setCost(20);
        playerInventory[5] = pheonixDown;
        
        /*RawMaterial wood = new RawMaterial();
        RawMaterial wood = new RawMaterial();
        wood.setName("Wood");
        wood.setDescription("Wood used to craft items");
        wood.setQuantity(Constants.DEFAULT_INVENTORY_QUANTITY);
        playerInventory[1][0] = wood;
        
        RawMaterial ore = new RawMaterial();
        ore.setName("Ore");
        ore.setDescription("Ore used to craft items");
        ore.setQuantity(Constants.DEFAULT_INVENTORY_QUANTITY);
        playerInventory[1][1] = ore;
        
        RawMaterial crystal = new RawMaterial();
        crystal.setName("Crystal");
        crystal.setDescription("Crystal used to craft items");
        crystal.setQuantity(Constants.DEFAULT_INVENTORY_QUANTITY);
        playerInventory[1][2] = crystal;
        
        RawMaterial magicSand = new RawMaterial();
        magicSand.setName("Magic Sand");
        magicSand.setDescription("Magic sand used to craft items");
        magicSand.setQuantity(Constants.DEFAULT_INVENTORY_QUANTITY);
        playerInventory[1][3] = magicSand;
        
        RawMaterial silver = new RawMaterial();
        silver.setName("Silver");
        silver.setDescription("Valuable metal used to craft items");
        silver.setQuantity(Constants.DEFAULT_INVENTORY_QUANTITY);
        playerInventory[1][4] = silver;*/
        
        return playerInventory;
    }
        
    //Helmets -------------------------------------------------------------------
        public static Gear[] createHelmList() {
        Gear[] helmList = new Gear[Constants.GEAR_LIST_COUNT];
        
        Gear blank = new Gear();
        blank.setName("zz");
        blank.setAttackBonus(0);
        blank.setDefenseBonus(0);
        blank.setDescription("");
        blank.setMagicAttackBonus(0);
        blank.setMagicDefenseBonus(0);
        blank.setSpecialEffects("");
        blank.setSpecialEffects("");
        blank.setGearType("helmet");
        blank.setCost(0);
        blank.setItemAvailable(false);
        blank.setQuantity(0);
        
        for(int i = 0; i < (Constants.GEAR_LIST_COUNT); i ++){
            helmList[i] = blank;
        }

        Gear leatherHelm = new Gear();
        leatherHelm.setName("Leather Helmet");
        leatherHelm.setAttackBonus(0);
        leatherHelm.setDefenseBonus(1);
        leatherHelm.setMagicAttackBonus(0);
        leatherHelm.setMagicDefenseBonus(0);
        leatherHelm.setDescription("A weak helmet made of leather");
        leatherHelm.setSpecialEffects("None");
        leatherHelm.setQuantity(Constants.STARTING_INVENTORY_ITEM_QUANTITY);
        leatherHelm.setCost(25);
        leatherHelm.setItemAvailable(Constants.SHOP_ITEM);
        helmList[0] = leatherHelm;
        
        Gear clothCap = new Gear();
        clothCap.setName("Cloth Cap");
        clothCap.setAttackBonus(0);
        clothCap.setDefenseBonus(1);
        clothCap.setMagicAttackBonus(0);
        clothCap.setMagicDefenseBonus(2);
        clothCap.setDescription("A flexible cap of cloth");
        clothCap.setSpecialEffects("None");
        clothCap.setQuantity(Constants.STARTING_INVENTORY_ITEM_QUANTITY);
        clothCap.setCost(20);
        clothCap.setItemAvailable(Constants.SHOP_ITEM);
        helmList[1] = clothCap;
        
        Gear ironHelmet = new Gear();
        ironHelmet.setName("Iron Helmet");
        ironHelmet.setAttackBonus(0);
        ironHelmet.setDefenseBonus(4);
        ironHelmet.setMagicAttackBonus(0);
        ironHelmet.setMagicDefenseBonus(0);
        ironHelmet.setDescription("A sturdy helmet made of iron");
        ironHelmet.setSpecialEffects("None");
        ironHelmet.setQuantity(Constants.DEFAULT_INVENTORY_QUANTITY);
        ironHelmet.setCost(50);
        ironHelmet.setItemAvailable(Constants.SHOP_ITEM);
        helmList[2] = ironHelmet;
        
        Gear magiciansHat = new Gear();
        magiciansHat.setName("Magician's Hat");
        magiciansHat.setAttackBonus(0);
        magiciansHat.setDefenseBonus(2);
        magiciansHat.setMagicAttackBonus(2);
        magiciansHat.setMagicDefenseBonus(4);
        magiciansHat.setDescription("A pointy hat worn by wizards");
        magiciansHat.setSpecialEffects("None");
        magiciansHat.setQuantity(Constants.DEFAULT_INVENTORY_QUANTITY);
        magiciansHat.setCost(75);
        magiciansHat.setItemAvailable(Constants.SHOP_ITEM);
        helmList[3] = magiciansHat;
        
        Gear hornedHelm = new Gear();
        hornedHelm.setName("Horned Helmet");
        hornedHelm.setAttackBonus(2);
        hornedHelm.setDefenseBonus(4);
        hornedHelm.setMagicAttackBonus(0);
        hornedHelm.setMagicDefenseBonus(0);
        hornedHelm.setDescription("A helmet with horns on it");
        hornedHelm.setSpecialEffects("None");
        hornedHelm.setQuantity(Constants.DEFAULT_INVENTORY_QUANTITY);
        hornedHelm.setCost(80);
        hornedHelm.setItemAvailable(Constants.SHOP_ITEM);
        helmList[4] = hornedHelm;
        
        Gear steelHelm = new Gear();
        steelHelm.setName("Steel Helmet");
        steelHelm.setAttackBonus(0);
        steelHelm.setDefenseBonus(7);
        steelHelm.setMagicAttackBonus(0);
        steelHelm.setMagicDefenseBonus(0);
        steelHelm.setDescription("A strong helmet made of steel");
        steelHelm.setSpecialEffects("None");
        steelHelm.setQuantity(Constants.DEFAULT_INVENTORY_QUANTITY);
        steelHelm.setCost(125);
        steelHelm.setItemAvailable(Constants.SHOP_ITEM);
        helmList[5] = steelHelm;
        /*
        Gear legendaryDragonHelm = new Gear();
        legendaryDragonHelm.setName("Legendary Helmet of the Dragon");
        legendaryDragonHelm.setAttackBonus(5);
        legendaryDragonHelm.setDefenseBonus(12);
        legendaryDragonHelm.setMagicAttackBonus(4);
        legendaryDragonHelm.setMagicDefenseBonus(6);
        legendaryDragonHelm.setDescription("A legendary helmet found in the stomach of a red dragon");
        legendaryDragonHelm.setSpecialEffects("Resistance to fire");
        legendaryDragonHelm.setQuantity(Constants.DEFAULT_INVENTORY_QUANTITY);
        legendaryDragonHelm.setCost(500);
        legendaryDragonHelm.setItemAvailable(Constants.RARE_ITEM);
        helmList[6] = legendaryDragonHelm;
        
        Gear amnorsHat = new Gear();
        amnorsHat.setName("Amnor's hat");
        amnorsHat.setAttackBonus(2);
        amnorsHat.setDefenseBonus(5);
        amnorsHat.setMagicAttackBonus(12);
        amnorsHat.setMagicDefenseBonus(10);
        amnorsHat.setDescription("Amnor was a legendary mage, and he infused his hat with great magical power");
        amnorsHat.setSpecialEffects("none");
        amnorsHat.setQuantity(Constants.DEFAULT_INVENTORY_QUANTITY);
        amnorsHat.setCost(710);
        amnorsHat.setItemAvailable(Constants.RARE_ITEM);
        helmList[7] = amnorsHat;*/
        
        return helmList;
        
        }
        
        //armors ----------------------------------------------------------------
        public static Gear[] createArmorList() {
        Gear[] armorList = new Gear[Constants.GEAR_LIST_COUNT];
        
        Gear blank = new Gear();
        blank.setName("zz");
        blank.setAttackBonus(0);
        blank.setDefenseBonus(0);
        blank.setDescription("");
        blank.setMagicAttackBonus(0);
        blank.setMagicDefenseBonus(0);
        blank.setSpecialEffects("");
        blank.setSpecialEffects("");
        blank.setGearType("armor");
        blank.setCost(0);
        blank.setItemAvailable(false);
        blank.setQuantity(0);
        
        for(int i = 0; i < (Constants.GEAR_LIST_COUNT); i ++){
            armorList[i] = blank;
        }
       
        Gear ironBreastplate = new Gear();
        ironBreastplate.setName("Iron Breastplate");
        ironBreastplate.setAttackBonus(0);
        ironBreastplate.setDefenseBonus(3);
        ironBreastplate.setMagicAttackBonus(0);
        ironBreastplate.setMagicDefenseBonus(0);
        ironBreastplate.setDescription("An average breastplate made of iron");
        ironBreastplate.setSpecialEffects("None");
        ironBreastplate.setQuantity(Constants.STARTING_INVENTORY_ITEM_QUANTITY);
        ironBreastplate.setCost(55);
        armorList[0] = ironBreastplate;
        
        Gear clothCloak = new Gear();
        clothCloak.setName("Cloth Cloak");
        clothCloak.setAttackBonus(0);
        clothCloak.setDefenseBonus(1);
        clothCloak.setMagicAttackBonus(1);
        clothCloak.setMagicDefenseBonus(3);
        clothCloak.setDescription("A simple cloak that is easy to move in");
        clothCloak.setSpecialEffects("None");
        clothCloak.setQuantity(Constants.STARTING_INVENTORY_ITEM_QUANTITY);
        clothCloak.setCost(40);
        armorList[1] = clothCloak;
        
        Gear steelPlate = new Gear();
        steelPlate.setName("Steel Breastplate");
        steelPlate.setAttackBonus(0);
        steelPlate.setDefenseBonus(6);
        steelPlate.setMagicAttackBonus(0);
        steelPlate.setMagicDefenseBonus(0);
        steelPlate.setDescription("Strong armor made of steel");
        steelPlate.setSpecialEffects("None");
        steelPlate.setQuantity(Constants.DEFAULT_INVENTORY_QUANTITY);
        steelPlate.setCost(150);
        armorList[2] = steelPlate;
        
        Gear wanderersCloak = new Gear();
        wanderersCloak.setName("Wanderer's Cloak");
        wanderersCloak.setAttackBonus(0);
        wanderersCloak.setDefenseBonus(3);
        wanderersCloak.setMagicAttackBonus(4);
        wanderersCloak.setMagicDefenseBonus(4);
        wanderersCloak.setDescription("A cloak from a magical wanderer");
        wanderersCloak.setSpecialEffects("None");
        wanderersCloak.setQuantity(Constants.DEFAULT_INVENTORY_QUANTITY);
        wanderersCloak.setCost(160);
        armorList[3] = wanderersCloak;
        
        Gear dragonScaleArmor = new Gear();
        dragonScaleArmor.setName("Dragon Scale Armor");
        dragonScaleArmor.setAttackBonus(0);
        dragonScaleArmor.setDefenseBonus(10);
        dragonScaleArmor.setMagicAttackBonus(2);
        dragonScaleArmor.setMagicDefenseBonus(5);
        dragonScaleArmor.setDescription("Armor made from dragon scales");
        dragonScaleArmor.setSpecialEffects("Fire resistance");
        dragonScaleArmor.setQuantity(Constants.DEFAULT_INVENTORY_QUANTITY);
        dragonScaleArmor.setCost(780);
        armorList[4] = dragonScaleArmor;
        
        Gear magicRobe = new Gear();
        magicRobe.setName("Magic Robe");
        magicRobe.setAttackBonus(0);
        magicRobe.setDefenseBonus(0);
        magicRobe.setMagicAttackBonus(4);
        magicRobe.setMagicDefenseBonus(8);
        magicRobe.setDescription("The robe of choice for mages");
        magicRobe.setSpecialEffects("none");
        magicRobe.setQuantity(Constants.DEFAULT_INVENTORY_QUANTITY);
        magicRobe.setCost(420);
        armorList[5] = magicRobe;
        
        return armorList;
        
        }
        
        //secondaries --------------------------------------------------------
        public static Gear[] createSecondaryList() {
        Gear[] secondaryList = new Gear[Constants.GEAR_LIST_COUNT];
        
        Gear blank = new Gear();
        blank.setName("zz");
        blank.setAttackBonus(0);
        blank.setDefenseBonus(0);
        blank.setDescription("");
        blank.setMagicAttackBonus(0);
        blank.setMagicDefenseBonus(0);
        blank.setSpecialEffects("");
        blank.setSpecialEffects("");
        blank.setGearType("secondary");
        blank.setCost(0);
        blank.setQuantity(0);
        
        for(int i = 0; i < (Constants.GEAR_LIST_COUNT); i ++){
            secondaryList[i] = blank;
        }
        
        Gear woodenShield = new Gear();
        woodenShield.setName("Wooden Shield");
        woodenShield.setAttackBonus(0);
        woodenShield.setDefenseBonus(2);
        woodenShield.setMagicAttackBonus(0);
        woodenShield.setMagicDefenseBonus(0);
        woodenShield.setDescription("A weak sheild made of wood");
        woodenShield.setSpecialEffects("None");
        woodenShield.setQuantity(Constants.STARTING_INVENTORY_ITEM_QUANTITY);
        woodenShield.setCost(15);
        secondaryList[0] = woodenShield;
        
        Gear leatherGloves = new Gear();
        leatherGloves.setName("Leather Gloves");
        leatherGloves.setAttackBonus(0);
        leatherGloves.setDefenseBonus(1);
        leatherGloves.setMagicAttackBonus(0);
        leatherGloves.setMagicDefenseBonus(1);
        leatherGloves.setDescription("Simple leather gloves");
        leatherGloves.setSpecialEffects("None");
        leatherGloves.setQuantity(Constants.STARTING_INVENTORY_ITEM_QUANTITY);
        leatherGloves.setCost(20);
        secondaryList[1] = leatherGloves;
        
        Gear ironShield = new Gear();
        ironShield.setName("Iron Shield");
        ironShield.setAttackBonus(0);
        ironShield.setDefenseBonus(4);
        ironShield.setMagicAttackBonus(0);
        ironShield.setMagicDefenseBonus(0);
        ironShield.setDescription("A sturdy shield of iron");
        ironShield.setSpecialEffects("None");
        ironShield.setQuantity(Constants.DEFAULT_INVENTORY_QUANTITY);
        ironShield.setCost(45);
        secondaryList[2] = ironShield;
        
        Gear smallMagicOrb = new Gear();
        smallMagicOrb.setName("Small Magic Orb");
        smallMagicOrb.setAttackBonus(0);
        smallMagicOrb.setDefenseBonus(0);
        smallMagicOrb.setMagicAttackBonus(2);
        smallMagicOrb.setMagicDefenseBonus(3);
        smallMagicOrb.setDescription("A small, clear orb with magic properties");
        smallMagicOrb.setSpecialEffects("None");
        smallMagicOrb.setQuantity(Constants.DEFAULT_INVENTORY_QUANTITY);
        smallMagicOrb.setCost(55);
        secondaryList[3] = smallMagicOrb;
        
        Gear steelShield = new Gear();
        steelShield.setName("Steel Shield");
        steelShield.setAttackBonus(0);
        steelShield.setDefenseBonus(5);
        steelShield.setMagicAttackBonus(0);
        steelShield.setMagicDefenseBonus(0);
        steelShield.setDescription("A strong sheild made of steel");
        steelShield.setSpecialEffects("None");
        steelShield.setQuantity(Constants.DEFAULT_INVENTORY_QUANTITY);
        steelShield.setCost(85);
        secondaryList[4] = steelShield;
        
        Gear magicRoot = new Gear();
        magicRoot.setName("Magic Root");
        magicRoot.setAttackBonus(0);
        magicRoot.setDefenseBonus(1);
        magicRoot.setMagicAttackBonus(2);
        magicRoot.setMagicDefenseBonus(5);
        magicRoot.setDescription("A root from a Mandragora that has magical properties");
        magicRoot.setSpecialEffects("None");
        magicRoot.setQuantity(Constants.DEFAULT_INVENTORY_QUANTITY);
        magicRoot.setCost(75);
        secondaryList[5] = magicRoot;
              
        return secondaryList;
        }
        
        //Weapons --------------------------------------------------------
        public static Gear[] createWeaponList() {
        Gear[] weaponList = new Gear[Constants.GEAR_LIST_COUNT];
        
        Gear blank = new Gear();
        blank.setName("zz");
        blank.setAttackBonus(0);
        blank.setDefenseBonus(0);
        blank.setDescription("");
        blank.setMagicAttackBonus(0);
        blank.setMagicDefenseBonus(0);
        blank.setSpecialEffects("");
        blank.setSpecialEffects("");
        blank.setGearType("secondary");
        blank.setQuantity(0);
        
        for(int i = 0; i < (Constants.GEAR_LIST_COUNT); i ++){
            weaponList[i] = blank;
        }
        
        Gear ironSword = new Gear();
        ironSword.setName("Iron Sword");
        ironSword.setAttackBonus(2);
        ironSword.setDefenseBonus(0);
        ironSword.setMagicAttackBonus(0);
        ironSword.setMagicDefenseBonus(0);
        ironSword.setDescription("A plain old sword made of iron");
        ironSword.setSpecialEffects("None");
        ironSword.setQuantity(Constants.STARTING_INVENTORY_ITEM_QUANTITY);
        ironSword.setCost(30);
        weaponList[0] = ironSword;   
        
        Gear steelSword = new Gear();
        steelSword.setName("Steel Sword");
        steelSword.setAttackBonus(5);
        steelSword.setDefenseBonus(0);
        steelSword.setMagicAttackBonus(0);
        steelSword.setMagicDefenseBonus(0);
        steelSword.setDescription("A sturdy sword made of steel");
        steelSword.setSpecialEffects("None");
        steelSword.setQuantity(Constants.DEFAULT_INVENTORY_QUANTITY);
        steelSword.setCost(200);
        weaponList[1] = steelSword;
        
        Gear oakStaff = new Gear();
        oakStaff.setName("Oak Staff");
        oakStaff.setAttackBonus(1);
        oakStaff.setDefenseBonus(0);
        oakStaff.setMagicAttackBonus(2);
        oakStaff.setMagicDefenseBonus(0);
        oakStaff.setDescription("An old magic staff made of Oak");
        oakStaff.setSpecialEffects("None");
        oakStaff.setQuantity(Constants.STARTING_INVENTORY_ITEM_QUANTITY);
        oakStaff.setCost(30);
        weaponList[2] = oakStaff;        
        
        Gear fireStave = new Gear();
        fireStave.setName("Fire Stave");
        fireStave.setAttackBonus(2);
        fireStave.setDefenseBonus(0);
        fireStave.setMagicAttackBonus(5);
        fireStave.setMagicDefenseBonus(0);
        fireStave.setDescription("An elaborate staff, brimming with fire magic");
        fireStave.setSpecialEffects("Increases damage of fire spells");
        fireStave.setQuantity(Constants.DEFAULT_INVENTORY_QUANTITY);
        fireStave.setCost(145);
        weaponList[3] = fireStave;
        
        Gear brassKnuckles = new Gear();
        brassKnuckles.setName("Brass Knuckles");
        brassKnuckles.setAttackBonus(6);
        brassKnuckles.setDefenseBonus(-2);
        brassKnuckles.setMagicAttackBonus(5);
        brassKnuckles.setMagicDefenseBonus(0);
        brassKnuckles.setDescription("A powerful close range weapon that leaves you vulnerable");
        brassKnuckles.setSpecialEffects("none");
        brassKnuckles.setQuantity(Constants.DEFAULT_INVENTORY_QUANTITY);
        brassKnuckles.setCost(300);
        weaponList[4] = brassKnuckles;
        
        Gear spear = new Gear();
        spear.setName("Spear");
        spear.setAttackBonus(5);
        spear.setDefenseBonus(3);
        spear.setMagicAttackBonus(0);
        spear.setMagicDefenseBonus(1);
        spear.setDescription("A long range weapon, good for defense");
        spear.setSpecialEffects("none");
        spear.setQuantity(Constants.DEFAULT_INVENTORY_QUANTITY);
        spear.setCost(400);
        weaponList[5] = spear;
               
        return weaponList;
        
    }

//Actors --------------------------------------------------------
    public static Actor[][] createActor() {
        Actor[][] actors = new Actor[Constants.ACTOR_COL_COUNT][Constants.ACTOR_ROW_COUNT];
        
        PlayerCharacter blank = new PlayerCharacter();
        blank.setName("zz");
        blank.setJob("");
        blank.setAttack(3);
        blank.setDefense(3);
        blank.setGender("");
        blank.setMagicAttack(3);
        blank.setMagicDefense(3);
        blank.setHealthPoints(30);
        blank.setCurrentHealthPoints(30);
        blank.setMagicPoints(20);
        blank.setCurrentMagicPoints(20);
        
        for(int i = 0; i < (Constants.ACTOR_COL_COUNT); i ++){
            for (int j = 0; j < (Constants.ACTOR_ROW_COUNT); j++){
                actors[i][j] = blank;
            }
        }
        
        PlayerCharacter newPlayerCharacter = new PlayerCharacter();
        newPlayerCharacter.setName("Joshua");
        newPlayerCharacter.setJob("Cleric");
        newPlayerCharacter.setAttack(10);
        newPlayerCharacter.setDefense(5);
        newPlayerCharacter.setGender("Male");
        newPlayerCharacter.setMagicAttack(4);
        newPlayerCharacter.setMagicDefense(3);
        newPlayerCharacter.setHealthPoints(35);
        newPlayerCharacter.setCurrentHealthPoints(20);
        newPlayerCharacter.setMagicPoints(25);
        newPlayerCharacter.setCurrentMagicPoints(25);
        newPlayerCharacter.setPlayerGold(Constants.STARTING_GOLD);
        newPlayerCharacter.setLevel(1);
        newPlayerCharacter.setExperiencePoints(0);
        newPlayerCharacter.setLevelPoints(0);
        actors [0][0] = newPlayerCharacter;
        
        Enemy goblin = new Enemy();
        goblin.setName("Goblin");
        goblin.setAttack(8);
        goblin.setDefense(5);
        goblin.setMagicAttack(0);
        goblin.setMagicDefense(0);
        goblin.setHealthPoints(15);
        goblin.setCurrentHealthPoints(15);
        goblin.setMagicPoints(0);
        goblin.setCurrentMagicPoints(0);
        goblin.setExperienceValue(15);
        goblin.setGoldValue(23);
        goblin.setItemsDropped("woodenShield, clothCloak");
        actors [1][0] = goblin;
        
        Enemy jelly = new Enemy();
        jelly.setName("Jelly");
        jelly.setAttack(18);
        jelly.setDefense(3);
        jelly.setMagicAttack(7);
        jelly.setMagicDefense(4);
        jelly.setHealthPoints(15);
        jelly.setCurrentHealthPoints(15);
        jelly.setMagicPoints(30);
        jelly.setCurrentMagicPoints(30);
        jelly.setExperienceValue(30);
        jelly.setGoldValue(27);
        jelly.setItemsDropped("potion, Cloth Cap");
        actors [1][1] = jelly;
        
        Enemy imp = new Enemy();
        imp.setName("Imp");
        imp.setAttack(11);
        imp.setDefense(5);
        imp.setMagicAttack(7);
        imp.setMagicDefense(4);
        imp.setHealthPoints(15);
        imp.setCurrentHealthPoints(15);
        imp.setMagicPoints(30);
        imp.setCurrentMagicPoints(30);
        imp.setExperienceValue(30);
        imp.setGoldValue(27);
        imp.setItemsDropped("potion, Cloth Cap");
        actors [1][2] = imp;
        
        Enemy hobGoblin = new Enemy();
        hobGoblin.setName("Hobgoblin");
        hobGoblin.setAttack(18);
        hobGoblin.setDefense(8);
        hobGoblin.setMagicAttack(0);
        hobGoblin.setMagicDefense(6);
        hobGoblin.setHealthPoints(30);
        hobGoblin.setCurrentHealthPoints(30);
        hobGoblin.setMagicPoints(0);
        hobGoblin.setCurrentMagicPoints(0);
        hobGoblin.setExperienceValue(50);
        hobGoblin.setGoldValue(76);
        hobGoblin.setItemsDropped("potion, Cloth Cap");
        actors [2][0] = hobGoblin;
        
        Enemy spellCaster = new Enemy();
        spellCaster.setName("Spell Caster");
        spellCaster.setAttack(8);
        spellCaster.setDefense(8);
        spellCaster.setMagicAttack(15);
        spellCaster.setMagicDefense(8);
        spellCaster.setHealthPoints(24);
        spellCaster.setCurrentHealthPoints(24);
        spellCaster.setMagicPoints(35);
        spellCaster.setCurrentMagicPoints(35);
        spellCaster.setExperienceValue(55);
        spellCaster.setGoldValue(81);
        spellCaster.setItemsDropped("potion, Cloth Cap");
        actors [2][1] = spellCaster;
        
        Enemy platedBeast = new Enemy();
        platedBeast.setName("Plated Beast");
        platedBeast.setAttack(15);
        platedBeast.setDefense(18);
        platedBeast.setMagicAttack(3);
        platedBeast.setMagicDefense(12);
        platedBeast.setHealthPoints(14);
        platedBeast.setCurrentHealthPoints(14);
        platedBeast.setMagicPoints(20);
        platedBeast.setCurrentMagicPoints(20);
        platedBeast.setExperienceValue(86);
        platedBeast.setGoldValue(103);
        platedBeast.setItemsDropped("potion, Cloth Cap");
        actors [2][2] = platedBeast;
        
        Enemy hobGoblin2 = new Enemy();
        hobGoblin2.setName("Ugly Hobgoblin");
        hobGoblin2.setAttack(28);
        hobGoblin2.setDefense(18);
        hobGoblin2.setMagicAttack(0);
        hobGoblin2.setMagicDefense(16);
        hobGoblin2.setHealthPoints(40);
        hobGoblin2.setCurrentHealthPoints(40);
        hobGoblin2.setMagicPoints(0);
        hobGoblin2.setCurrentMagicPoints(0);
        hobGoblin2.setExperienceValue(75);
        hobGoblin2.setGoldValue(176);
        hobGoblin2.setItemsDropped("potion, Cloth Cap");
        actors [3][0] = hobGoblin2;
       
        Enemy spellCaster2 = new Enemy();
        spellCaster2.setName("Ugly Spell Caster");
        spellCaster2.setAttack(18);
        spellCaster2.setDefense(18);
        spellCaster2.setMagicAttack(25);
        spellCaster2.setMagicDefense(18);
        spellCaster2.setHealthPoints(34);
        spellCaster2.setCurrentHealthPoints(34);
        spellCaster2.setMagicPoints(45);
        spellCaster2.setCurrentMagicPoints(45);
        spellCaster2.setExperienceValue(85);
        spellCaster2.setGoldValue(115);
        spellCaster2.setItemsDropped("potion, Cloth Cap");
        actors [3][1] = spellCaster2;
        
        Enemy platedBeast2 = new Enemy();
        platedBeast2.setName("Ugly Plated Beast");
        platedBeast2.setAttack(25);
        platedBeast2.setDefense(28);
        platedBeast2.setMagicAttack(13);
        platedBeast2.setMagicDefense(22);
        platedBeast2.setHealthPoints(24);
        platedBeast2.setCurrentHealthPoints(24);
        platedBeast2.setMagicPoints(30);
        platedBeast2.setCurrentMagicPoints(30);
        platedBeast2.setExperienceValue(100);
        platedBeast2.setGoldValue(150);
        platedBeast2.setItemsDropped("potion, Cloth Cap");
        actors [3][2] = platedBeast2;

        Enemy hobGoblin3 = new Enemy();
        hobGoblin3.setName("Mean Hobgoblin");
        hobGoblin3.setAttack(38);
        hobGoblin3.setDefense(28);
        hobGoblin3.setMagicAttack(0);
        hobGoblin3.setMagicDefense(26);
        hobGoblin3.setHealthPoints(50);
        hobGoblin3.setCurrentHealthPoints(50);
        hobGoblin3.setMagicPoints(0);
        hobGoblin3.setCurrentMagicPoints(0);
        hobGoblin3.setExperienceValue(100);
        hobGoblin3.setGoldValue(276);
        hobGoblin3.setItemsDropped("potion, Cloth Cap");
        actors [4][0] = hobGoblin3;
        
        Enemy spellCaster3 = new Enemy();
        spellCaster3.setName("Mean Spell Caster");
        spellCaster3.setAttack(28);
        spellCaster3.setDefense(28);
        spellCaster3.setMagicAttack(35);
        spellCaster3.setMagicDefense(28);
        spellCaster3.setHealthPoints(44);
        spellCaster3.setCurrentHealthPoints(44);
        spellCaster3.setMagicPoints(55);
        spellCaster3.setCurrentMagicPoints(55);
        spellCaster3.setExperienceValue(185);
        spellCaster3.setGoldValue(215);
        spellCaster3.setItemsDropped("potion, Cloth Cap");
        actors [4][1] = spellCaster3;
        
        Enemy dungeon1 = new Enemy();
        dungeon1.setName("Red Dragon");
        dungeon1.setAttack(20);
        dungeon1.setDefense(15);
        dungeon1.setMagicAttack(0);
        dungeon1.setMagicDefense(12);
        dungeon1.setHealthPoints(100);
        dungeon1.setCurrentHealthPoints(100);
        dungeon1.setMagicPoints(0);
        dungeon1.setCurrentMagicPoints(0);
        dungeon1.setExperienceValue(150);
        dungeon1.setGoldValue(276);
        dungeon1.setItemsDropped("potion, Cloth Cap");
        actors [5][0] = dungeon1;
        
        Enemy dungeon2 = new Enemy();
        dungeon2.setName("Boss 2");
        dungeon2.setAttack(28);
        dungeon2.setDefense(28);
        dungeon2.setMagicAttack(35);
        dungeon2.setMagicDefense(28);
        dungeon2.setHealthPoints(44);
        dungeon2.setCurrentHealthPoints(500);
        dungeon2.setMagicPoints(500);
        dungeon2.setCurrentMagicPoints(55);
        dungeon2.setExperienceValue(185);
        dungeon2.setGoldValue(215);
        dungeon2.setItemsDropped("potion, Cloth Cap");
        actors [5][1] = dungeon2;
        
        Enemy dungeon3 = new Enemy();
        dungeon3.setName("Boss 3");
        dungeon3.setAttack(35);
        dungeon3.setDefense(38);
        dungeon3.setMagicAttack(33);
        dungeon3.setMagicDefense(32);
        dungeon3.setHealthPoints(1000);
        dungeon3.setCurrentHealthPoints(1000);
        dungeon3.setMagicPoints(40);
        dungeon3.setCurrentMagicPoints(40);
        dungeon3.setExperienceValue(200);
        dungeon3.setGoldValue(250);
        dungeon3.setItemsDropped("potion, Cloth Cap");
        actors [5][2] = dungeon3;
        
        return actors;
    }
    
    
    //SPELL creation --------------------------------------------------------
    private static Spells[][] createSpells() {
        Spells[][] spells = new Spells[Constants.SPELL_COL_COUNT][Constants.SPELL_ROW_COUNT];
        
        Spells fire1 = new Spells();
        fire1.setSpellName("Fire I");
        fire1.setDescription("Inflicts fire damage to enemies");
        fire1.setMessage("The flames inflicted ");
        fire1.setSpellType(Constants.SPELL_ATTACK_HEALTH);
        fire1.setLearned(false);
        fire1.setMagicCost(5);
        fire1.setAttackDamage(15);
        fire1.setSpecialEffects(15);
        fire1.setQuantity(-1);
        spells[0][0] = fire1;
        
        Spells ice1 = new Spells();
        ice1.setSpellName("Ice I");
        ice1.setDescription("Inflicts ice damage to enemies");
        ice1.setMessage("The cold inflicted ");
        ice1.setSpellType(Constants.SPELL_ATTACK_HEALTH);
        ice1.setLearned(false);
        ice1.setMagicCost(5);
        ice1.setAttackDamage(15);
        ice1.setSpecialEffects(15);
        ice1.setQuantity(-1);
        spells[0][1] = ice1;
        
        Spells lighting1 = new Spells();
        lighting1.setSpellName("Lighting I");
        lighting1.setDescription("Inflicts lighting damage to enemies");
        lighting1.setMessage("The shock inflicts ");
        lighting1.setSpellType(Constants.SPELL_ATTACK_HEALTH);
        lighting1.setLearned(false);
        lighting1.setMagicCost(5);
        lighting1.setAttackDamage(15);
        lighting1.setSpecialEffects(15);
        lighting1.setQuantity(-1);
        spells[0][2] = lighting1;
        
        Spells fire2 = new Spells();
        fire2.setSpellName("Fire 2");
        fire2.setDescription("Inflicts extreme fire damage to enemies");
        fire2.setMessage("The flames inflicted ");
        fire2.setSpellType(Constants.SPELL_ATTACK_HEALTH);
        fire2.setLearned(false);
        fire2.setMagicCost(10);
        fire2.setAttackDamage(30);
        fire2.setSpecialEffects(30);
        fire2.setQuantity(-1);
        spells[0][3] = fire2;
        
        Spells ice2 = new Spells();
        ice2.setSpellName("Ice II");
        ice2.setDescription("Inflicts extreme ice damage to enemies");
        ice2.setMessage("The cold inflicted ");
        ice2.setSpellType(Constants.SPELL_ATTACK_HEALTH);
        ice2.setLearned(false);
        ice2.setMagicCost(10);
        ice2.setAttackDamage(30);
        ice2.setSpecialEffects(30);
        ice2.setQuantity(-1);
        spells[0][4] = ice2;
        
        Spells weaken = new Spells();
        weaken.setSpellName("Weaken I");
        weaken.setDescription("Weakens enemies defence");
        weaken.setMessage("The enemies defence is weakened by a percentage of ");
        weaken.setSpellType(Constants.SPELL_ATTACK_DEFENSE);
        weaken.setLearned(false);
        weaken.setMagicCost(5);
        weaken.setAttackDamage(10);
        weaken.setSpecialEffects(25);
        weaken.setQuantity(-1);
        spells[0][2] = weaken;
        
        Spells heal1 = new Spells();
        heal1.setSpellName("Heal I");
        heal1.setDescription("Heals minor damage to Health");
        heal1.setMessage("Your health was restored by ");
        heal1.setSpellType(Constants.SPELL_HEAL_HEALTH);
        heal1.setLearned(false);
        heal1.setMagicCost(5);
        heal1.setAttackDamage(0);
        heal1.setSpecialEffects(15);
        heal1.setQuantity(-1);
        spells[1][0] = heal1;
        
        Spells defend = new Spells();
        defend.setSpellName("Defend");
        defend.setDescription("Increases Defense");
        defend.setMessage("Your defence is increased by a percentage of ");
        defend.setSpellType(Constants.SPELL_INCREASE_DEFENCE);
        defend.setMagicCost(5);
        defend.setAttackDamage(0);
        defend.setSpecialEffects(15);
        defend.setQuantity(-1);
        spells[1][1] = defend;
        
        Spells heal2 = new Spells();
        heal2.setSpellName("heal II");
        heal2.setDescription("Heals heavy damage to health");
        heal2.setMessage("Your health was restored by: ");
        heal2.setSpellType(Constants.SPELL_HEAL_HEALTH);
        heal2.setLearned(false);
        heal2.setMagicCost(10);
        heal2.setAttackDamage(0);
        heal2.setSpecialEffects(30);
        heal2.setQuantity(-1);
        spells[1][2] = heal2;
        
        Spells sight1 = new Spells();
        sight1.setSpellName("Sight I");
        sight1.setDescription("Increase vision in current position x2");
        sight1.setMessage("");
        sight1.setSpellType(Constants.SPELL_SIGHT);
        sight1.setLearned(false);
        sight1.setMagicCost(5);
        sight1.setAttackDamage(0);
        sight1.setSpecialEffects(6);
        sight1.setQuantity(-1);
        spells[1][3] = sight1;
        
        Spells sight2 = new Spells();
        sight2.setSpellName("Sight II");
        sight2.setDescription("Increase vision in current position x3");
        sight2.setMessage("");
        sight2.setSpellType(Constants.SPELL_SIGHT);
        sight2.setLearned(false);
        sight2.setMagicCost(5);
        sight2.setAttackDamage(0);
        sight2.setSpecialEffects(10);
        sight2.setQuantity(-1);
        spells[1][4] = sight2;
           
        return spells;
    }
    
    public static World createWorld() {
        World gameWorld = new World();
        
        return gameWorld;
    }
    
    public static BattleScene createBattle(){
        BattleScene battle = new BattleScene(1);
        return battle;
    }

    public static CraftRecipe[][] createCraftRecipe(){
        
        CraftRecipe[][] craftRecipe = new CraftRecipe[Constants.CRAFT_COL_COUNT][Constants.CRAFT_ROW_COUNT];
        
        CraftRecipe blank = new CraftRecipe();
        blank.setCraftName(" ");
        
        for(int i = 0; i < (Constants.CRAFT_COL_COUNT); i ++){
            for (int j = 0; j < (Constants.CRAFT_ROW_COUNT); j++){
                craftRecipe[i][j] = blank;
            }
        }
        
        CraftRecipe flamingSword = new CraftRecipe();
        flamingSword.setCraftName("Flaming Sword");
        craftRecipe[0][0] = flamingSword;
        
        CraftRecipe ironSword = new CraftRecipe();
        ironSword.setCraftName("Iron Sword");
        craftRecipe[0][1] = ironSword;
        
        CraftRecipe diamondSword = new CraftRecipe();
        diamondSword.setCraftName("Diamond Sword");
        craftRecipe[0][2] = diamondSword;
        
        CraftRecipe diamondBreastplate = new CraftRecipe();
        diamondBreastplate.setCraftName("Diamond Breast Plate");
        craftRecipe[1][0] = diamondBreastplate;
        
        CraftRecipe flamingShield = new CraftRecipe();
        flamingShield.setCraftName("Flaming Shield");
        craftRecipe[1][1] = flamingShield;
        
        return craftRecipe;   
    }
    



   /* public static void sort(Inventory[] array){
>>>>>>> origin/master

        Inventory temp;

        for (int i = 0; i < array.length - 1; i++) {    
            for (int j = i + 1; j < array.length; j++) {
                if ((array[i].getName().compareToIgnoreCase(array[j].getName())) > 0 
                        && array[j].getQuantity() > 0) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }   
    }*/
    
    public static void sort(Actor[][] array){
        
        System.out.println("Array Length" + Constants.ACTOR_COL_COUNT);
        Actor temp;
        for (Actor[] array1 : array) {
            for (int i = 0; i < array1.length - 1; i++) {
                for (int j = i + 1; j < array1.length; j++) {
                    if((array1[i].getName().compareToIgnoreCase(array1[j].getName()))> 0) {
                        temp = array1[i];
                        array1[i] = array1[j];
                        array1[j] = temp;
                    } 
                }
            }  
       }
    }
    
    public static void sort(CraftRecipe[][] array){
        
        System.out.println("Array Length" + array[0].length);
        CraftRecipe temp;
        for (CraftRecipe[] array1 : array) {
            for (int i = 0; i < array1.length - 1; i++) {
                for (int j = i + 1; j < array1.length; j++) {
                    if((array1[i].getCraftName().compareToIgnoreCase(array1[j].getCraftName()))> 0) {
                        temp = array1[i];
                        array1[i] = array1[j];
                        array1[j] = temp;
                    } 
                }
            }  
       }
    }
    
    public static int stringSearch(CraftRecipe[][] array, String selection, int col){
        int row = 0;
        
        for(int i = 0; i < array.length; i++){
            if((array[col][i].getCraftName().compareToIgnoreCase(selection)== 0)){
                row = i;
                return row;
            }
        }
        return -1;
    }
    
    public static boolean stringSearch(Spells[][] array, String selection, ArrayLocation location) {

        for(int i = 0; i < Constants.SPELL_COL_COUNT; i++)
            for(int j = 0; j < Constants.SPELL_ROW_COUNT; j++){
                if((array[i][j].getSpellName().compareToIgnoreCase(selection)== 0)){
                    location.setColumn(i);
                    location.setRow(j);
                    return true;
                }
            }
        return false;
    }
    
    public static boolean stringSearch(Spells[] array, String selection, ArrayLocation location) {

        for(int i = 0; i < Constants.GEAR_LIST_COUNT; i++)
                if((array[i].getSpellName().compareToIgnoreCase(selection)== 0)){
                    location.setColumn(0);
                    location.setRow(i);
                    return true;
            }
        return false;
    }
    
    public static int stringSearch(Gear[] array, String selection) {

        int number = 0;
        
        for(int i = 0; i < Constants.GEAR_LIST_COUNT; i++)
                if((array[i].getName().compareToIgnoreCase(selection)== 0)){
                    number = i;
            }
        return number;
    }
    
    public static String[] inventoryStringConvert(Inventory[] array, int column){
        
        int count = 0;
        
        
        for(Inventory array1 : array){
            if (array != null){
                count++;
            }
        }
        
        String[] newArray = new String[count];
        
        for(int i = 0; i < newArray.length; i++){
            newArray[i] = array[i].getName();
        }
        
        
        return newArray;
    }
    
    public static String[] craftStringConv(CraftRecipe[][] array, int column){
        
        int count = 0;
        
        
        for(CraftRecipe[] array1 : array){
            if (array != null){
                count++;
            }
        }
        
        String[] newArray = new String[count];
        
        for(int i = 0; i < newArray.length; i++){
            newArray[i] = array[column][i].getCraftName();
        }
        
        
        return newArray;
    }

    private static EquippedGear initialGear() {
        EquippedGear playerGear = new EquippedGear();
        Game game = DanguranTheForgotten.getCurrentGame();
        Gear[] weapons = game.getWeapons();
        Gear[] armors = game.getArmors();
        Gear[] secondaries = game.getSecondaries();
        Gear[] helms = game.getHelms();
        
        playerGear.setArmor(armors[0]);
        playerGear.setWeapon(weapons[0]);
        playerGear.setHelmet(helms[0]);
        playerGear.setLeftHand(secondaries[0]);
        
        return playerGear;
    }

    public static void createMapLocations(Location[][] map){
    
        //Dungeon #1
        for(int i = 4; i < 11; i++)  
            for(int j = 16; j < 27; j++){
            Resource.setForest(map[i][j]);
        }
        
        for(int j = 19; j < 24; j += 4){
            for(int i = 5; i < 10; i++){
                Resource.setPlains(map[i][j]);
            }
        }
        
        for(int j = 5; j < 8; j += 6){
            for(int i = 20; i < 24; i++){
                Resource.setPlains(map[5][i]);
            }
        }
        
        Resource.setPlains(map[9][22]);
        Resource.setPlains(map[9][21]);
        Resource.setPlains(map[8][21]);
        Resource.setPlains(map[10][19]);
        
        //Dungeon #2
        for(int i = 29; i < 36; i++)  
            for(int j = 45; j < 56; j++){
            Resource.setForest(map[i][j]);
        }

        for (int i = 31; i < 34; i++){
            for(int j = 49; j < 52; j++){
                Resource.setMountains(map[i][j]);
            }
        }
        
        //Dungeon #3
        for(int i = 15; i < 24; i++)  {
            for(int j = 82; j < 100; j++){
                Resource.setMountains(map[i][j]);
            }
        }
        
        for(int i = 17; i < 22; i++){  
            for(int j = 84; j < 98; j++){
                Resource.setPlains(map[i][j]);
            }
        }
        
        for(int i = 15; i < 25; i++){  
            for(int j = 0; j < 10; j++){
                Resource.setPlains(map[i][j]);
            }
        }
        
        /*Mountain Range
        for(int i = 35; i > 20; i--){
            for(int j = 15; j < 25; j++){
                Resource.setMountains(map[i][j + 1]);
            }
        }*/
    }
    
    private static URL[] getImage() {
        Inventory value = new Inventory();
        
        String[] path = new String[]{
            Constants.IMAGEWARRIOR,
            Constants.IMAGETREE,
            Constants.IMAGEPLAINS,
            Constants.IMAGEDARK,
            Constants.IMAGEMOUNT,
            Constants.IMAGEDUNGEON1,
            Constants.IMAGEDUNGEON2,
            Constants.IMAGEDUNGEON3,
            Constants.IMAGESHOP,
            Constants.IMAGEBLANK
        };
        
        BufferedImage image = null;
        URL[] url = new URL[10];
        
       for(int i = 0; i < 10; i++){
            url[i] = value.getClass().getResource(path[i]);
                //image = ImageIO.read(url);
       }
       return url;
    }


}


