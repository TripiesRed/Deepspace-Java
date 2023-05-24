/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deepspace;

/**
 *
 * @author diegoos_03
 */
public class BetaPowerEfficientSpaceStation extends PowerEfficientSpaceStation {
    
    private static final float EXTRAEFFICIENCY = 1.2f;
    
    BetaPowerEfficientSpaceStation (SpaceStation station){
        super(station);
    }
    
    @Override
    public float fire(){
       
        Dice dice = new Dice();
        
        float fire = this.fire();
        
        if(dice.extraEfficiency()){
            return (fire*EXTRAEFFICIENCY);
        } else{
            return fire;
        }
    }
    
    @Override 
    public BetaPowerEfficientSpaceStationToUI getUIversion(){ return new BetaPowerEfficientSpaceStationToUI(this); }
}
