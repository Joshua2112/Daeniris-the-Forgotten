/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.CIT260.DaenirisTheForgotten.Frames;

import byui.CIT260.DaenirisTheForgotten.Control.Constants;
import byui.CIT260.DaenirisTheForgotten.Model.Game;
import byui.CIT260.DaenirisTheForgotten.Model.Location;
import byui.CIT260.DaenirisTheForgotten.Model.World;
import dangurantheforgotten.DanguranTheForgotten;
import java.awt.Color;
import java.awt.Component;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Nathan
 */
    class CustomRenderer extends javax.swing.table.DefaultTableCellRenderer {
        public java.awt.Component getTableCellRendererComponent(
                javax.swing.JTable table, 
                java.lang.Object value, 
                boolean isSelected, 
                boolean hasFocus, 
                int row, 
                int column)
        {
            Game game = DanguranTheForgotten.getCurrentGame();
            World world = game.getWorld();
            URL[] imageURL = game.getPicURL();
       
            Location[][] mapArray = game.getWorld().getMap();
            
            JLabel label = (JLabel)super.getTableCellRendererComponent(
                    table, value, isSelected, hasFocus, row, column);
            java.awt.Component cellComponent = super.getTableCellRendererComponent(
                    table, value, isSelected, hasFocus, row, column);
       
            if(world.getxLoc() == row && world.getyLoc() == column){
                setIcon(new ImageIcon(imageURL[Constants.WARRIOR]));
            }
            else if (mapArray[row][column].getSymbol() == 'T'
                     && mapArray[row][column].isDiscovered()){
                setIcon(new ImageIcon(imageURL[Constants.FOREST]));   
            }
            else if (mapArray[row][column].getSymbol() == '_'
                     && mapArray[row][column].isDiscovered()){
                setIcon(new ImageIcon(imageURL[Constants.PLAINS]));   
            }
            else if (mapArray[row][column].getSymbol() == 'Y'
                     && mapArray[row][column].isDiscovered()){
                setIcon(new ImageIcon(imageURL[Constants.DARKFOREST]));   
            }
            else if (mapArray[row][column].getSymbol() == '^'
                     && mapArray[row][column].isDiscovered()){
                setIcon(new ImageIcon(imageURL[Constants.MOUNT]));   
            }
            else if (mapArray[row][column].getSymbol() == 'D'
                     && mapArray[row][column].isDiscovered()){
                setIcon(new ImageIcon(imageURL[Constants.DUNGEON1]));   
            }
            else if (mapArray[row][column].getSymbol() == 'd'
                     && mapArray[row][column].isDiscovered()){
                setIcon(new ImageIcon(imageURL[Constants.DUNGEON2]));   
            }
            else if (mapArray[row][column].getSymbol() == 'X'
                     && mapArray[row][column].isDiscovered()){
                setIcon(new ImageIcon(imageURL[Constants.DUNGEON3]));   
            }
            else if (mapArray[row][column].getSymbol() == 'S'){
                setIcon(new ImageIcon(imageURL[Constants.SHOP]));   
            }
            else{
                setIcon(new ImageIcon(imageURL[Constants.BLANK]));
            }
            return cellComponent; 
        }
        
       private String getImage(Object value, String string){
           String str = null;
           return str;
       }
    }

                //cellComponent.setBackground(Color.WHITE);
