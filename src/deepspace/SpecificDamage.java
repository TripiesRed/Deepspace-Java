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
public class SpecificDamage extends Damage {
    
    SpecificDamage(ArrayList<WeaponType> weapons, int s){
        super(weapons.size(), s);
        setWeapons(weapons);
    }
    
    public void discardWeapon (Weapon w){
        
        WeaponType weapon_type = w.getType();
        int weapon_index = arrayContainsType(getWeapons(), weapon_type);
        
        if (!getWeapons().isEmpty() && weapon_index != -1) {
            getWeapons().remove(weapon_index);
            setNWeapons( (getNWeapons() - 1) );
        }
    }
    
    @Override
    SpecificDamageToUI getUIversion(){
        return new SpecificDamageToUI(this);
    }
    

    public SpecificDamage adjust (ArrayList<Weapon> w, ArrayList<ShieldBooster> s){
        int new_n_weapons = 0;
        int new_n_shields = 0;
        ArrayList<WeaponType> new_wl = new ArrayList<>();
        
        if (getNWeapons() > w.size()) {
            new_n_weapons = w.size();
            //OJO ERROR EN LA LÍNEA DE ABAJO
            // new_wl = w;
        }
        else {
            new_n_weapons = getNWeapons();
            
            int i = 0;
            while (i < w.size()) {
                int n = arrayContainsType(getWeapons(), getWeapons().get(i));
                if (n != -1) {
                    new_wl.add(getWeapons().get(n));
                }
                i++;
            }
        }
        
        if (getNShields() > s.size()) {
            new_n_shields = s.size();
        } 
        else {
            new_n_shields = getNShields();
        }
        return new SpecificDamage(new_wl, new_n_shields);
    }
    
    //Métodos privados
    private int arrayContainsType (ArrayList<WeaponType> w, WeaponType t) {
        
        int index = -1;
        
        if(w.contains(t)) index = w.indexOf(t);
        
        return index;
    }
}
