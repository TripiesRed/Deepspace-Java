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
public class SpaceCity extends SpaceStation {
    
    private SpaceStation base;
    private ArrayList<SpaceStation> collaborators;
    
    SpaceCity(SpaceStation b, ArrayList<SpaceStation> r){
        
        super(b.getName(), 
             new SuppliesPackage(b.getAmmoPower(), b.getFuelUnits(), b.getShieldPower()));
        
        setWeapons(b.getWeapons());
        setNMedals(b.getNMedals());
        setShieldBoosters(b.getShieldBoosters());
        base = b;
        collaborators = new ArrayList<SpaceStation>(r);
        
        if(b.getPendingDamage() != null){
            setPendingDamage(b.getPendingDamage());
        }
        
        if(b.getHangar() != null){
            receiveHangar( new Hangar(b.getHangar()));
        }
    }
    
    ArrayList<SpaceStation> getCollaborators(){
        return collaborators;
    }
    
    @Override
    public float fire(){
        
        float total = super.fire();
        
        for (SpaceStation i : collaborators) {
            total += i.fire();
        }
        
        return total;
    }
    
    @Override
    public float protection(){
        
        float total = super.protection();
        
        for (SpaceStation i : collaborators) {
            total += i.protection();
        }
        
        return total;
    }
    
    @Override
    public Transformation setLoot(Loot loot){
        super.setLoot(loot);
        return Transformation.NOTRANSFORM;
    }
    
    @Override 
    public SpaceCityToUI getUIversion(){ return new SpaceCityToUI(this); }
}
