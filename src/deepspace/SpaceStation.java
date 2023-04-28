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
public class SpaceStation {
   
    private static final int MAXFUEL = 100;
    private static final float SHIELDLOSSPERUNITSHOT = 0.1f;
    
    private float ammoPower;
    private float fuelUnits;
    private String name;
    private int nMedals;
    private float shieldPower;
    private Damage pendingDamage;
    private ArrayList<Weapon> weapons;
    private ArrayList<ShieldBooster> shieldBoosters;
    private Hangar hangar;

    private void assignFuelValue(float f){
        if(f <= MAXFUEL){
            fuelUnits = f;
        }
        else{
            fuelUnits = MAXFUEL;
        }
    }
    
    private void cleanPendingDamage(){
        if(pendingDamage.hasNoEffect()){
            pendingDamage = null;
        }
    }
    
    SpaceStation(String n, SuppliesPackage supplies){
        name = n;
        ammoPower = supplies.getAmmoPower();
        fuelUnits = supplies.getFuelUnits();
        shieldPower = supplies.getShieldPower();
        nMedals = 0;
        pendingDamage = null;
        weapons = null;
        shieldBoosters = null;
        hangar = null;
    }
    
    float getAmmoPower(){
        return ammoPower;
    }
    
    float getFuelUnits(){
        return fuelUnits;
    }
    
    Hangar getHangar(){
        return hangar;
    }
    
    String getName(){
        return name;
    }
    
    int getNMedals(){
        return nMedals;
    }
    
    Damage getPendingDamage(){
        return pendingDamage;
    }
    
    ArrayList<ShieldBooster> getShieldBoosters(){
        return shieldBoosters;
    }
    
    ArrayList<Weapon> getWeapons(){
        return weapons;
    }
    
    float getShieldPower(){
        return shieldPower;
    }
    
    SpaceStationToUI getUIversion() { return new SpaceStationToUI(this); }
    
    boolean receiveWeapon(Weapon w){
        if(hangar != null){
            return hangar.addWeapon(w);
        }
        else{
            return false;
        }
    }
    
    boolean receiveShieldBooster(ShieldBooster s){
        if(hangar != null){
            return hangar.addShieldBooster(s);
        }
        else{
            return false;
        } 
    }
    
    void receiveHangar(Hangar h){
        if(hangar == null){
            hangar = h;
        }
    } 
    
    void discardHangar(){
        hangar = null;
    }
    
    void receiveSupplies(SuppliesPackage s){
        ammoPower += s.getAmmoPower();
        fuelUnits += s.getFuelUnits();
        shieldPower += s.getShieldPower();
    }
    
    void setPendingDamage(Damage d){
        pendingDamage = d.adjust(weapons, shieldBoosters);
    }
    
    void mountWeapon(int i){
        if( hangar != null){
            Weapon w = hangar.removeWeapon(i);
            if(w != null){
                weapons.add(w);
            }
        }   
    }
    
    void mountShieldBooster(int i){
        if( hangar != null){
            ShieldBooster s = hangar.removeShieldBooster(i);
            if(s != null){
                shieldBoosters.add(s);
            }
        }
    }
    
    void discardWeaponInHangar(int i){
        if(hangar != null){
            hangar.removeWeapon(i);
        }
    }
    
    void discardShieldBoosterInHangar(int i){
        if(hangar != null){
            hangar.removeShieldBooster(i);
        }
    }
    
    float getSpeed(){
        return fuelUnits / MAXFUEL;
    }
    
    void move(){
        if (getSpeed() <= fuelUnits){
            fuelUnits = fuelUnits - getSpeed();
        }
    }
    
    boolean validState(){
        return (pendingDamage == null);
    }
    
    void cleanUpMountedItems(){
        for(int i = 0; i < weapons.size(); i++){
            if(weapons.get(i).getUses() == 0){
                weapons.remove(i);
            }
        }
        
        for(int i = 0; i < shieldBoosters.size(); i++){
            if(shieldBoosters.get(i).getUses() == 0){
                shieldBoosters.remove(i);
            }
        }
    }
    
    /****************************************************************/
    /* fire(): float
    
    -Funcionalidad: Realiza el disparo de una nave SpaceStation. Se calcula  
        con el producto de multiplicar los potenciadores de las armas de 
        la nave y la potencia de disparo.
    
    -Parámetros: void
    
    -Return: La potencia de disparo. 
    
    */
    /****************************************************************/
    float fire(){
       
        int size = weapons.size();
        float factor = 1;
        
        for(int i = 0; i < size; i++){
            
            Weapon w = weapons.get(i);
            factor *= w.useIt();      
            
        }
        
        return ammoPower*factor;
        
    }
    
    
    /****************************************************************/
    /* protection(): float
    
    -Funcionalidad: Utiliza el escudo de una nave SpaceStation. Se calcula
        multiplicando la potencia del escudo por los factores potenciadores
        de todos los potenciadores de escudo disponibles.
    
    -Parámetros: void
    
    -Return: La energía del escudo utilizado.
    
    */
    /****************************************************************/
    float protection(){
        
        int size = shieldBoosters.size();
        float factor = 1;
        
        for(int i = 0; i < size; i++){
            
            ShieldBooster s = shieldBoosters.get(i);
            factor *= s.useIt();
            
        }
        
        return shieldPower*factor;
    }
    
}

