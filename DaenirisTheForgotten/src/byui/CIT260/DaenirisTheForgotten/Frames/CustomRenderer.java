/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.CIT260.DaenirisTheForgotten.Frames;

import byui.CIT260.DaenirisTheForgotten.Model.Game;
import byui.CIT260.DaenirisTheForgotten.Model.Location;
import byui.CIT260.DaenirisTheForgotten.Model.World;
import daeniristheforgotten.DaenirisTheForgotten;
import java.awt.Color;
import java.awt.Component;
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
            Game game = DaenirisTheForgotten.getCurrentGame();
            World world = game.getWorld();
       
            Location[][] mapArray = game.getWorld().getMap();
            
            JLabel label = (JLabel)super.getTableCellRendererComponent(
                    table, value, isSelected, hasFocus, row, column);
            java.awt.Component cellComponent = super.getTableCellRendererComponent(
                    table, value, isSelected, hasFocus, row, column);
       
            if(world.getxLoc() == row && world.getyLoc() == column){
                setIcon(new ImageIcon("C:/Users/Nathan/Desktop/warrior.jpg"));
            }
            else if (mapArray[row][column].getSymbol() == 'T'
                     && mapArray[row][column].isDiscovered()){
                setIcon(new ImageIcon("C:/Users/Nathan/Desktop/tree.jpg"));   
            }
            else if (mapArray[row][column].getSymbol() == '_'
                     && mapArray[row][column].isDiscovered()){
                setIcon(new ImageIcon("C:/Users/Nathan/Desktop/plains.jpg"));   
            }
            else if (mapArray[row][column].getSymbol() == 'Y'
                     && mapArray[row][column].isDiscovered()){
                setIcon(new ImageIcon("C:/Users/Nathan/Desktop/dark.jpg"));   
            }
            else if (mapArray[row][column].getSymbol() == '^'
                     && mapArray[row][column].isDiscovered()){
                setIcon(new ImageIcon("C:/Users/Nathan/Desktop/mount.jpg"));   
            }
            else if (mapArray[row][column].getSymbol() == 'D'
                     && mapArray[row][column].isDiscovered()){
                setIcon(new ImageIcon("../../Images/dungeon1"));   
            }
            else if (mapArray[row][column].getSymbol() == 'd'
                     && mapArray[row][column].isDiscovered()){
                setIcon(new ImageIcon("C:/Users/Nathan/Desktop/dungeon2.jpg"));   
            }
            else if (mapArray[row][column].getSymbol() == 'X'
                     && mapArray[row][column].isDiscovered()){
                setIcon(new ImageIcon("C:/Users/Nathan/Desktop/dungeon3.jpg"));   
            }
            else if (mapArray[row][column].getSymbol() == 'S'){
                setIcon(new ImageIcon("C:/Users/Nathan/Desktop/shop.jpg"));   
            }
            else{
                setIcon(new ImageIcon("C:/Users/Nathan/Desktop/blank.jpg"));
            }
            return cellComponent; 
        }
    }

                //cellComponent.setBackground(Color.WHITE);
