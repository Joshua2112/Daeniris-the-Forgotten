/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.CIT260.DaenirisTheForgotten.Model;
import java.io.Serializable;
/**
 *
 * @author Nathan
 */
public class BattleScene extends Location{
    private boolean attackFirst;

    public BattleScene() {}

    public boolean isAttackFirst() {
        return attackFirst;
    }

    public void setAttackFirst(boolean attackFirst) {
        this.attackFirst = attackFirst;
    }

    @Override
    public String toString() {
        return "BattleScene{" + "attackFirst=" + attackFirst + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + (this.attackFirst ? 1 : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final BattleScene other = (BattleScene) obj;
        if (this.attackFirst != other.attackFirst) {
            return false;
        }
        return true;
    }
    
    
    
    
    
}
