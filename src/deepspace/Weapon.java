/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deepspace;

/**
 *
 * @author gonzalomp
 */
public class Weapon {
    
    //Atributos de instancia
    private String name;
    private WeaponType type;
    private int uses;
    private final float DEFAULT_RETURN_VALUE = 1.0f;
    
    //Constructores
    Weapon (String newname, WeaponType newtype, int nuses){
        
        this.name = newname;
        this.type = newtype;
        this.uses = nuses;
    }
    
    Weapon (Weapon other){
        
       this(other.name, other.type, other.uses);
    }
    
    //Consultores de los atributos
    WeaponType getType() { 
        return type; 
    }
    
    int getUses() { 
        return uses; 
    }
    
    public float power(){
        return type.getPower();
    }
    
    public float useIt(){
        
        if (uses > 0){
            
            uses = uses-1;
            return power();
            
        }
       
        else{ return DEFAULT_RETURN_VALUE; }
    }
    
    
}
