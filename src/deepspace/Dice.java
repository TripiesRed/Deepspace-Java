/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deepspace;
import java.util.Random;

/**
 *
 * @author diegoos_03
 */
class Dice {
    
    private final float NHANGARSPROB;
    private final float NSHIELDSPROB;
    private final float NWEAPONSPROB;
    private final float FIRSTSHOTPROB;
    private final float EXTRAEFFICIENCYPROB;
    private Random generator;
    
    
    Dice(){
        NHANGARSPROB = 0.25f;
        NSHIELDSPROB = 0.25f;
        NWEAPONSPROB = 0.33f;
        FIRSTSHOTPROB = 0.5f;
        EXTRAEFFICIENCYPROB = 0.8f;
        this.generator = new Random();
    }
    
    public int initWithNHangars(){
        if (generator.nextFloat() < NHANGARSPROB) {
            return 0;
        } 
        else {
            return 1;
        }
    }
    
    public int initWithNWeapons(){
        
        float random = generator.nextFloat();
        int return_value;
        if(random < NWEAPONSPROB){
            return_value = 1;
        }
        else {
            if(random < 2*NWEAPONSPROB){
                return_value = 2;
            }
            else {
                return_value = 3;
            }
        }
        
        return return_value;
    }
    
    public int initWithNShields(){
        if (generator.nextFloat() < NSHIELDSPROB) {
            return 0;
        } else {
            return 1;
        }
    }
    
    public int whoStarts(int nPlayers){
        
        return generator.nextInt(nPlayers);
    }
    
    public GameCharacter firstShot(){
        if (generator.nextFloat() < FIRSTSHOTPROB) {
            return GameCharacter.SPACESTATION;
        } else {
            return GameCharacter.ENEMYSTARSHIP;
        }
    }
    
    public boolean spaceStationMoves(float speed){
        
        return generator.nextFloat() < speed;
    }
    
    public boolean extraEfficiency(){
        
        return generator.nextFloat() < EXTRAEFFICIENCYPROB;
    }
}