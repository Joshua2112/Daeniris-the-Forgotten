/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.CIT260.DaenirisTheForgotten.Control;



public class Constants {
    
    public static final int MAP_MAX_X = 45;
    public static final int MAP_MIN_X = 0;
    public static final int MAP_MAX_Y = 100;
    public static final int MAP_MIN_Y = 0;
    public static final boolean MAP_DISCOVERED = false;
    public static final int MAP_START_X = 20;
    public static final int MAP_START_Y = 0;
    
    
    public static final int DEFAULT_INVENTORY_QUANTITY = 0;
    public static final int STARTING_GEAR_QUANTITY = 1;
    public static final int STARTING_ITEM_QUANTITY = 4;
    public static final boolean SHOP_ITEM = true;
    public static final boolean RARE_ITEM = false;
    public static final int NUMBER_OF_ACTOR_TYPES = 5;
    public static final int NUMBER_OF_ENEMIES = 100;

    //Inventory Display Constants
    public static final int INV_COL_WIDTH = 25;
    public static final int INV_ROW_COUNT = 5;
    public static final int INV_COL_COUNT = 1;
    public static final int INV_POTION_COL = 0;
    public static final int INV_WEAPON_COL = 1;
    public static final int INV_ARMOR_COL = 2;
    public static final int INV_RESOURCES_COL = 3;
    
    //Craft Recipe Display Constants
    public static final int CRAFT_ROW_COUNT = 3;
    public static final int CRAFT_COL_COUNT = 2;
    public static final int CRAFT_COL_WIDTH = 25;
    public static final int CRAFT_WEAPON_COL = 0;
    public static final int CRAFT_ARMOR_COL = 0;
    
    //Battle Display Constants
    public static final int BATTLE_ROW_COUNT = 3;
    public static final int BATTLE_COL_COUNT = 2;
    public static final int BATTLE_COL_WIDTH = 35;
    
    //Spell Display Constants
    public static final int SPELL_ROW_COUNT = 5;
    public static final int SPELL_COL_COUNT = 2;
    public static final int SPELL_COL_WIDTH = 25;
    public static final int SPELL_BLACK_COL = 0;
    public static final int SPELL_WHITE_COL = 1;
    
    //Types
    public static final int INVENTORY = 1;
    public static final int MAGIC = 2;
    public static final int CRAFTS = 3;
    public static final int ACTOR = 4;
    public static final int SPELLS = 5;
    public static final int BATTLE = 6;

    
    //Actor Stats Display Constants
    public static final int ACTOR_COL_WIDTH = 25;
    public static final int ACTOR_ROW_COUNT = 3;
    public static final int ACTOR_COL_COUNT = 6;
    public static final int ACTOR_LABEL_COL = 5;
    public static final int ACTOR_VALUE_COL = 1;
    
    //Spell Types
    public static final int SPELL_HEAL_HEALTH = 1;
    public static final int SPELL_ATTACK_HEALTH = 2;
    public static final int SPELL_ATTACK_MAGIC_DEFENSE = 3;
    public static final int SPELL_ATTACK_DEFENSE = 4;
    public static final int SPELL_INCREASE_MAGIC_DEFENSE = 5;
    public static final int SPELL_INCREASE_DEFENCE = 6;
    public static final int SPELL_INCREASE_MANA = 7;
    public static final int SPELL_INCREASE_HEALTH = 8;
    public static final int SPELL_REDUCE_HEALTH = 9;
    public static final int SPELL_REDUCE_MANA = 10;
    public static final int SPELL_SIGHT = 11;
    public static final int POTION_RESTORE_HEALTH = 12;
    public static final int POTION_RESTORE_MANA = 13;
    public static final int POTION_ANTIDOTE = 14;
    public static final int POTION_PHEONIX = 15;
    
    
    //Spell Variables
    public static final double SPELL_BONUS_PERCENT = .25;
    
    public static final int GEAR_LIST_COUNT = 6;
    public static final int STARTING_GOLD = 100;
    public static final int STARTING_INVENTORY_ITEM_QUANTITY = 0;
    
    //Image Data
    public static final String IMAGEWARRIOR = "/byui/CIT260/DaenirisTheForgotten/Images/warrior.jpg";
    public static final String IMAGETREE = "/byui/CIT260/DaenirisTheForgotten/Images/tree.jpg";
    public static final String IMAGEPLAINS = "/byui/CIT260/DaenirisTheForgotten/Images/plains.jpg";
    public static final String IMAGEDARK = "/byui/CIT260/DaenirisTheForgotten/Images/dark.jpg";
    public static final String IMAGEMOUNT = "/byui/CIT260/DaenirisTheForgotten/Images/mount.jpg";
    public static final String IMAGEDUNGEON1 = "/byui/CIT260/DaenirisTheForgotten/Images/dungeon1.jpg";
    public static final String IMAGEDUNGEON2 = "/byui/CIT260/DaenirisTheForgotten/Images/dungeon2.jpg";
    public static final String IMAGEDUNGEON3 = "/byui/CIT260/DaenirisTheForgotten/Images/dungeon3.jpg";
    public static final String IMAGESHOP = "/byui/CIT260/DaenirisTheForgotten/Images/shop.jpg";
    public static final String IMAGEBLANK = "/byui/CIT260/DaenirisTheForgotten/Images/blank.jpg";
    
    public static final int IMAGECOUNT = 10;
    
    public static final int WARRIOR = 0;
    public static final int FOREST = 1;
    public static final int PLAINS = 2;
    public static final int DARKFOREST = 3;
    public static final int MOUNT = 4;
    public static final int DUNGEON1 = 5;
    public static final int DUNGEON2 = 6;
    public static final int DUNGEON3 = 7;
    public static final int SHOP = 8;
    public static final int BLANK = 9;
    
}
