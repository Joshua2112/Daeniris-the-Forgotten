/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.CIT260.DaenirisTheForgotten.Control;



public class Constants {
    
    public static final int MAP_MAX_X = 9;
    public static final int MAP_MIN_X = 0;
    public static final int MAP_MAX_Y = 9;
    public static final int MAP_MIN_Y = 0;
    
    
    public static final int DEFAULT_INVENTORY_QUANTITY = 100;
    public static final int NUMBER_OF_ACTOR_TYPES = 2;
    public static final int NUMBER_OF_ENEMIES = 100;

    //Inventory Display Constants
    public static final int INV_COL_WIDTH = 25;
    public static final int INV_ROW_COUNT = 5;
    public static final int INV_COL_COUNT = 4;
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
    public static final int SPELL_ROW_COUNT = 3;
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
    public static final int ACT_COL_COUNT = 2;

    
    //Actor Stats Display Constants
    public static final int ACTOR_COL_WIDTH = 25;
    public static final int ACTOR_ROW_COUNT = 5;
    public static final int ACTOR_COL_COUNT = 4;
    public static final int ACTOR_LABEL_COL = 0;
    public static final int ACTOR_VALUE_COL = 1;
    
    //Spell Types
    public static final int SPELL_ATTACK = 1;
    public static final int SPELL_HEALTH = 2;
    public static final int SPELL_MAGIC_DEFENSE = 3;
    public static final int SPELL_ATTACK_DEFENSE = 4;
}
