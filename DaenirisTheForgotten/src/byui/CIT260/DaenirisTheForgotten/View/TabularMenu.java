/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.CIT260.DaenirisTheForgotten.View;

import byui.CIT260.DaenirisTheForgotten.Control.Constants;
import byui.CIT260.DaenirisTheForgotten.Model.Game;
import daeniristheforgotten.DaenirisTheForgotten;



/**
 *
 * @author Nathan
 */
public class TabularMenu {

        private String displayName;
        private int columnCount;
        private int rowCount;
        private int columnWidth;
        private String[] header;
        private String[][] data;
        private boolean hideInventory;
        private int type;

        
    public TabularMenu(){};    
        
    public int getColumnCount() {
        return columnCount;
    }

    public void setColumnCount(int columnCount) {
        this.columnCount = columnCount;
    }

    public int getRowCount() {
        return rowCount;
    }

    public void setRowCount(int rowCount) {
        this.rowCount = rowCount;
    }

    public int getColumnWidth() {
        return columnWidth;
    }

    public void setColumnWidth(int columnWidth) {
        this.columnWidth = columnWidth;
    }

    public String[] getHeader() {
        return header;
    }

    public void setHeader(String[] header) {
        this.header = header;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public boolean isHideInventory() {
        return hideInventory;
    }

    public void setHideInventory(boolean hideInventory) {
        this.hideInventory = hideInventory;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String[][] getData() {
        return data;
    }

    public void setData(String[][] data) {
        this.data = data;
    }
   
    public static TabularMenu createTabularMenu(){
        Game game = DaenirisTheForgotten.getCurrentGame();
        
        TabularMenu tab = new TabularMenu();
        tab.setDisplayName("Spell Display");
        tab.setColumnCount(Constants.SPELL_COL_COUNT);
        tab.setColumnWidth(Constants.SPELL_COL_WIDTH);
        tab.setRowCount(Constants.SPELL_ROW_COUNT);
        tab.setType(Constants.SPELLS);
        
        String[] header = new String[Constants.SPELL_COL_COUNT];
        header[0] = "Black Magic";
        header[1] = "White Magic";
        
        tab.setHeader(header);
            
        return tab;
        
    }
}
