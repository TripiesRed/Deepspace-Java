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
        int new_n_weapons = 0;
        int new_n_shields = 0;
        
        if(getNWeapons() > w.size()){
            new_n_weapons = w.size();
        }
        else{
            new_n_weapons = getNWeapons();
        }
        
        
        if(getNShields() > s.size()){
            new_n_shields = s.size();
        }
        else{
            new_n_shields = getNShields();
        }
        
        return new NumericDamage(new_n_weapons, new_n_shields);
    }
}
