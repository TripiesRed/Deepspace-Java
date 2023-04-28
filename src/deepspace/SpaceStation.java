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
        la nave y la potencia de disparo (@ammoPower).
    
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
        multiplicando la potencia del escudo (@shieldPower) por los factores 
        potenciadores de todos los potenciadores de escudo disponibles.
    
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
    
    /****************************************************************/
    /* receiveShot(shot): ShotResult
    
    -Funcionalidad: Calcula el resultado de recibir un disparo. Se calcula
        decrementando la potencia del escudo en función de la potencia de 
        disparoo recibido y devolver si se ha resistido o no.
    
    -Parámetros: <shot> Valor float de un disparo recibido.
    
    -Return: Indica el resultado de recibir el disparo.
    
    */
    /****************************************************************/
    ShotResult receiveShot(float shot){
        
        float myProtection = protection();
        
        if(myProtection >= shot){
            
            shieldPower -= SHIELDLOSSPERUNITSHOT*shot;
            
            if(shieldPower < 0.0) shieldPower = 0.0f;
            
            return ShotResult.RESIST;
        }
        
        else{
            
            shieldPower = 0.0f;
            
            return ShotResult.DONOTRESIST;
        }
        
    }
    
    /****************************************************************/
    /* setLoot(loot): void
    
    -Funcionalidad: Recibe un botín. Por cada elemento de cada tipo, se 
        le pide a CardDealer un elemento del mismo tipo, y se intenta almacenar
        mediante el método correspondiente.
    
    -Parámetros: <loot> Botín recibido.
    
    -Return: void
    
    */
    /****************************************************************/
    void setLoot(Loot loot){
        CardDealer dealer = CardDealer.getInstance();
        
        int h = loot.getNHangars();
        
        //Recibe Hangar
        if(h > 0){
            Hangar hangar = dealer.nextHangar();
            this.receiveHangar(hangar);
        }
        
        int elements = loot.getNSupplies();
        
        //Recibe Provisiones(Supplies)
        for(int i = 0; i < elements; i++){
            SuppliesPackage sup = dealer.nextSuppliesPackage();
            this.receiveSupplies(sup);
        }
        
        elements = loot.getNWeapons();
        
        //Recibe Armas(Weapons)
        for(int i = 0; i < elements; i++){
            Weapon weap = dealer.nextWeapon();
            this.receiveWeapon(weap);
        }
        
        elements = loot.getNShields();
        
        //Recibe Escudo(ShieldBoosters)
        for(int i = 0; i < elements; i++){
            ShieldBooster sh = dealer.nextShieldBooster();
            this.receiveShieldBooster(sh);
        }
        
        //Recibe Medallas
        nMedals += loot.getNMedals();
        
    }
    
    /****************************************************************/
    /* discardWeapon(i): void
    
    -Funcionalidad: Se intenta descartar el arma con índice i de la colección
        de armas en uso (@weapons). También actualiza el valor de daño 
        pendiente (@pendingDamage) en caso de haberlo.
    
    -Parámetros: <i> Índice del arma a descartar.
    
    -Return: void
    
    */
    /****************************************************************/
    void discardWeapon(int i){
        
        int size = weapons.size();
        
        if(i >= 0 && i < size){
            
            Weapon w = weapons.remove(i);
            
            //Actualizamos pendingDamage en caso de haberlo
            if(pendingDamage != null){
                pendingDamage.discardWeapon(w);
                cleanPendingDamage();
            }
            
        }
    }
    
    /****************************************************************/
    /* discardShieldBooster(i): void
    
    -Funcionalidad: Se intenta descartar el potenciador de escudo con índice i 
        de la colección de potenciadores en uso (@shieldBoosters). 
        También actualiza el valor de daño pendiente (@pendingDamage) en caso 
        de haberlo.
    
    -Parámetros: <i> Índice del potenciador de escudo a descartar.
    
    -Return: void
    
    */
    /****************************************************************/
    void discardShieldBooster(int i){
        
        int size = shieldBoosters.size();
        
        if(i >= 0 && i < size){
            
            shieldBoosters.remove(i);
            
            //Actualizamos pendingDamage en caso de haberlo
            if(pendingDamage != null){
                pendingDamage.discardShieldBooster();
                cleanPendingDamage();
            }
            
        }
    }
}

