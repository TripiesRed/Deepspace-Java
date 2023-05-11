/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deepspace;
import java.util.ArrayList;

/**
 *
 * @author gonzalomp
 */
public class Damage {
    
    //Atributos
    private int nShields;
    private int nWeapons;
    private ArrayList<WeaponType> weapons;
    
    //Constructores
    Damage (int s, int w){
        nWeapons = w;
        nShields = s;
    }
    
    Damage (ArrayList<WeaponType> wl, int s){
        weapons = wl;
        nShields = s;
        nWeapons = wl.size();
    }
    
    Damage (Damage d){
        this(d.weapons, d.nShields);
    }
    
    //Métodos Visibilidad de Paquete
    DamageToUI getUIversion(){ return new DamageToUI(this); }
    
    //Métodos Privados
    int arrayContainsType (ArrayList<WeaponType> w, WeaponType t) {
        
        int index = -1;
        
        if(w.contains(t)) index = w.indexOf(t);
        
        return index;
    }
    
    //Métodods Públicos
    Damage adjust (ArrayList<Weapon> w, ArrayList<ShieldBooster> s){
        
        int newNWeapons, newNShields;
        
        //Ajustamos nWeapons
        if(nWeapons > w.size()) newNWeapons = w.size();
        
        else newNWeapons = nWeapons;
       
        //Ajustamos nShields
        if(nShields > s.size()) newNShields = s.size();
        
        else newNShields = nShields;
        
        return new Damage(newNWeapons, newNShields);
    }
    
    void discardWeapon (Weapon w){
        
        if(weapons != null && !weapons.isEmpty() && weapons.contains(w.getType())) weapons.remove(w.getType());
        
        else if(nWeapons > 0) nWeapons--;
        
    }
    
    void discardShieldBooster (){
        
        if(nShields > 0) nShields--;
        
    }
    
    boolean hasNoEffect (){ return nShields == 0 && nWeapons == 0; }
    
    int getNShields (){ return nShields; }
    
    int getNWeapons (){ return nWeapons; }
    
    ArrayList<WeaponType> getWeapons () { return weapons; }
    
}
