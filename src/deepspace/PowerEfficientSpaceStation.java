/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deepspace;

/**
 *
 * @author diegoos_03
 */
public class PowerEfficientSpaceStation extends SpaceStation {
    
    private static final float EFFICIENCYFACTOR = 1.1f;
    
    PowerEfficientSpaceStation (SpaceStation station){
        super(station.getName(), 
              new SuppliesPackage(station.getAmmoPower(), station.getFuelUnits(), station.getShieldPower()));
    }
    
    @Override
    public float fire(){
       
        int size = getWeapons().size();
        float factor = EFFICIENCYFACTOR;
        
        for(int i = 0; i < size; i++){
            
            Weapon w = getWeapons().get(i);
            factor *= w.useIt();      
            
        }
        
        return getAmmoPower()*factor;
    }
    
    @Override
    public float protection(){
        
        int size = getShieldBoosters().size();
        float factor = EFFICIENCYFACTOR;
        
        for(int i = 0; i < size; i++){
            
            ShieldBooster s = getShieldBoosters().get(i);
            factor *= s.useIt();
            
        }
        
        return getShieldPower()*factor;
    }
    
    @Override
    public Transformation setLoot(Loot loot){
        super.setLoot(loot);
        return Transformation.NOTRANSFORM;
    }
    
    @Override 
    public PowerEfficientSpaceStationToUI getUIversion(){ return new PowerEfficientSpaceStationToUI(this); }
}

