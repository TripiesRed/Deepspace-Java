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
public abstract class Damage {

    //Atributos
    private int nShields;
    private int nWeapons;
    private ArrayList<WeaponType> weapons;
    
    //Constructores
    Damage (int s, int w){
        nWeapons = w;
        nShields = s;
        weapons = new ArrayList<>();
    }
    
    Damage (Damage d){
       this.nShields = d.nShields;
       this.nWeapons = d.nWeapons;
       this.weapons = d.weapons;
    }
     
    
    // Métodos abstractos
    public abstract Damage adjust (ArrayList<Weapon> w, ArrayList<ShieldBooster> s);
    
    abstract DamageToUI getUIversion();
    
    public abstract void discardWeapon(Weapon w);
    
    //Métodods Públicos y Protegidos
    
    public void discardShieldBooster (){
        
        if(nShields > 0) nShields--;
        
    }
    
    public boolean hasNoEffect (){ return nShields == 0 && nWeapons == 0; }
    
    public int getNShields (){ return nShields; }
    
    public int getNWeapons (){ return nWeapons; }
    
    public ArrayList<WeaponType> getWeapons () { return weapons; }
    
    protected void setNWeapons(int n ){ nWeapons = n; }
    
    protected void setWeapons(ArrayList<WeaponType> w) {
        nWeapons = w.size();
        weapons = w;
    }
    
  
}

