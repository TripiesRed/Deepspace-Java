/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deepspace;

/**
 *
 * @author gonzalomp
 */
public class SuppliesPackage {
    
    private float ammoPower;
    private float fuelUnits;
    private float shieldPower;
    
    SuppliesPackage (float ammo, float fuel, float shieldpower){
        
        this.ammoPower = ammo;
        this.fuelUnits = fuel;
        this.shieldPower = shieldpower;
    }
    
    SuppliesPackage (SuppliesPackage other){
        
       this(other.ammoPower, other.fuelUnits, other.shieldPower);
    }
    
    public float getAmmoPower (){
        return ammoPower;
    }
    
    public float getFuelUnits (){
        return fuelUnits;
    }
    
    public float getShieldPower (){
        return shieldPower;
    }
    
}
