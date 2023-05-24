/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deepspace;
import java.util.ArrayList;
/**
 *
 * @author diegoos_03
 */
public class NumericDamage extends Damage {
    
    //Constructores
    NumericDamage (int s, int w){
        super(s, w);
    }
    
    @Override
    public void discardWeapon (Weapon w){
        
        if(getNWeapons() > 0){
            setNWeapons( (getNWeapons() - 1) );
        }
    }
    
    @Override
    NumericDamageToUI getUIversion(){
        return new NumericDamageToUI(this);
    }

    @Override
    public NumericDamage adjust (ArrayList<Weapon> w, ArrayList<ShieldBooster> s){
        
        int l_nshields = Math.min(s.size(), this.getNShields());
        int l_nweapons = Math.min(w.size(), this.getNWeapons());

        return new NumericDamage(l_nweapons, l_nshields);
    }
}
