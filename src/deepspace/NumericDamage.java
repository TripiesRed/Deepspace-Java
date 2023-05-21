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
    
    NumericDamage (ArrayList<WeaponType> wl, int s){
        super(wl, s);
    }
    
    NumericDamage (NumericDamage d){
        this(d.getWeapons(), d.getNShields());
    }
}
