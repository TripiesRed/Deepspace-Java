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
public class Hangar {
    
    private int maxElements;
    private ArrayList<Weapon> weapons;
    private ArrayList<ShieldBooster> shieldBoosters;
    
    //Constructores
    Hangar (int capacity ){
        maxElements = capacity;
        weapons  = new ArrayList<Weapon>();
        shieldBoosters = new ArrayList<ShieldBooster>();
    }
    
    Hangar (Hangar other){
        this(other.maxElements);
    }
    
    //Métodos con Visibilidad de Paquete
    HangarToUI getUIversion (){ return new HangarToUI(this); }
    
    //Métodos Privados
    private boolean spaceAvailable(){
        return maxElements > 0;
    }
    
    //Métodos Públicos
    public boolean addWeapon (Weapon w){
        boolean added;
        
        if(spaceAvailable()){
            
            weapons.add(w);
            maxElements--;
            added = true;
            
        }
        
        else added = false;
        
        return added;
    }
    
    public boolean addShieldBooster (ShieldBooster s){
        boolean added;
        
        if(spaceAvailable()){
            
            shieldBoosters.add(s);
            maxElements--;
            added = true;
            
        }
        
        else added = false;
        
        return added;
    }
    
    public int getMaxElements (){ return maxElements; }
    
    public ArrayList<ShieldBooster> getShieldBoosters(){ return shieldBoosters;}
    
    public ArrayList<Weapon> getWeapons() { return weapons; }
    
    public ShieldBooster removeShieldBooster(int s){
        
        if(shieldBoosters.size() > s){
            
            ShieldBooster deleted = shieldBoosters.get(s);
            shieldBoosters.remove(s);
            return deleted;
        }
        
        else return null;
    }
    
    public Weapon removeWeapon(int w){
        
        if(weapons.size() > w ){
            
            Weapon deleted = weapons.get(w);
            weapons.remove(w);
            return deleted;
        }
        
        else return null;
    }
    
    
}
