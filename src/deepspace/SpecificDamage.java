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
    

    @Override
    public SpecificDamage adjust (ArrayList<Weapon> w, ArrayList<ShieldBooster> s){
        int l_nshields = Math.min(s.size(), this.getNShields());

        ArrayList<WeaponType> result = new ArrayList();
        ArrayList<Weapon> aux = new ArrayList(w);

        for (int i = 0; i<this.getWeapons().size(); i++) {
            WeaponType element = this.getWeapons().get(i);
            int indice = this.arrayContainsType(aux, element);
            if (indice != -1) {
                result.add(element);
                aux.remove(indice);
            }
        }                    

        return new SpecificDamage(result, l_nshields);
    }
    
    //Métodos privados
    private int arrayContainsType (ArrayList<WeaponType> w, WeaponType t) {
        
        int index = -1;
        
        if(w.contains(t)) index = w.indexOf(t);
        
        return index;
    }
}
