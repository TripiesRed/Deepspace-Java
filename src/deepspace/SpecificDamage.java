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
    
    @Override
    public void discardWeapon (Weapon w){
        
        WeaponType weapon_type = w.getType();
        int weapon_index = arrayContainsTypewt(getWeapons(), weapon_type);
        
        if (!getWeapons().isEmpty() && weapon_index != -1) {
            getWeapons().remove(weapon_index);
            setNWeapons( (getNWeapons() - 1) );
        }
    }
    
    @Override
    SpecificDamageToUI getUIversion(){
        return new SpecificDamageToUI(this);
    }
    

    @Override
    public SpecificDamage adjust (ArrayList<Weapon> w, ArrayList<ShieldBooster> s) {
            
        int new_n_weapons = 0;
        int new_n_shields = 0;
        ArrayList<WeaponType> new_wl = new ArrayList<>();
            // Ajustamos nWeapons
        if (getNWeapons() > w.size()) {
            new_n_weapons = w.size();
            
            for (Weapon i : w) {
                new_wl.add(i.getType());
            }
            
        } else {
            new_n_weapons = getNWeapons();
            int i = 0;
            while (i < w.size()) {
                if (getWeapons().contains(w.get(i).getType())) {
                    new_wl.add(w.get(i).getType());
                }
                i++;
            }
        }

        // Ajustamos nShields
        if (getNShields() > s.size()) {
            new_n_shields = s.size();
        } else {
            new_n_shields = getNShields();
        }

        return new SpecificDamage(new_wl, new_n_shields);
    }
    
    //Métodos privados
    private int arrayContainsType (ArrayList<Weapon> w, WeaponType t) {
        
        int pos = -1;
        boolean encontrado = false;
        int i = 0;
        
        while(i<w.size() && !encontrado) {
            if (w.get(i).getType() == t) {
                encontrado = true;
                pos = i;
            }
            else
                i++;
        }
        
        return pos;
    }
    
    private int arrayContainsTypewt (ArrayList<WeaponType> w, WeaponType t) {
        
        int pos = -1;
        boolean encontrado = false;
        int i = 0;
        
        while(i<w.size() && !encontrado) {
            if (w.get(i) == t) {
                encontrado = true;
                pos = i;
            }
            else
                i++;
        }
        
        return pos;
    }
}
