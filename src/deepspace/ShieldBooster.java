/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deepspace;

/**
 *
 * @author diegoos_03
 */
class ShieldBooster {
    
    private String name;
    private float boost;
    private int uses;
    
    private final float DEFAULT_RETURN_VALUE = 1.0f;
    
    ShieldBooster(String name, float boost, int uses){
        
        this.name = name;
        this.boost = boost;
        this.uses = uses;
    
    }
    
    ShieldBooster(ShieldBooster other){
        
        this(other.name, other.boost, other.uses);
    }
    
    public float getBoost(){ 
        return boost; 
    }
    
    public int getUses(){ 
        return uses; 
    }
    
    public float useIt(){
        
        if (uses > 0){
            
            uses = uses-1;
            return boost;
            
        }
       
        else{ return DEFAULT_RETURN_VALUE; }
    }
    
    ShieldToUI getUIversion() { return new ShieldToUI(this); }
}




