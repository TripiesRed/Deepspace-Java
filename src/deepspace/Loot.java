/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deepspace;

/**
 *
 * @author diegoos_03
 */
class Loot {
    
    private int nSupplies;
    private int nWeapons;
    private int nShields;
    private int nHangars;
    private int nMedals;
    private boolean getEfficient;
    private boolean spaceCity;
    
    Loot(int nSupplies, int nWeapons, int nShields, int nHangars, int nMedals){
        
        this.nSupplies = nSupplies;
        this.nWeapons = nWeapons;
        this.nShields = nShields;
        this.nHangars = nHangars;
        this.nMedals = nMedals;
        this.getEfficient = false;
        this.spaceCity = false;
        
    }
    
    Loot(int nSupplies, int nWeapons, int nShields, int nHangars, int nMedals, boolean ef, boolean city){
        
        this.nSupplies = nSupplies;
        this.nWeapons = nWeapons;
        this.nShields = nShields;
        this.nHangars = nHangars;
        this.nMedals = nMedals;
        this.getEfficient = ef;
        this.spaceCity = city;
        
    }
    
    public int getNSupplies(){ return nSupplies; }
    
    public int getNWeapons(){ return nWeapons; }
    
    public int getNShields(){ return nShields; }
    
    public int getNHangars(){ return nHangars; }
    
    public int getNMedals(){ return nMedals; }
    
    public boolean getEfficient() { return this.getEfficient; }
    
    public boolean spaceCity() { return this.spaceCity; }
    
    public LootToUI getUIversion() { return new LootToUI(this); }
    
}
