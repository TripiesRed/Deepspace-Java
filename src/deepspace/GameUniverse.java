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
public class GameUniverse {
    private static final int WIN = 10;
    private int currentStationIndex;
    private int turns;
    private GameStateController gameState;
    private Dice dice;
    private SpaceStation currentStation;
    private ArrayList<SpaceStation> spaceStations;
    private EnemyStarShip currentEnemy;
    
    
    GameUniverse(){
        gameState = new GameStateController();
        turns = 0;
        dice = new Dice();
        currentEnemy = null;
        spaceStations =  new ArrayList<SpaceStation>();
        currentStationIndex = 0;
        currentStation = null;
    }
    
    void mountShiedBooster(int i){
        
        if(gameState.getState() == GameState.INIT || 
           gameState.getState() == GameState.AFTERCOMBAT){
            currentStation.mountShieldBooster(i);
        }
    }
    
    void mountWeapon(int i){
        
        if(gameState.getState() == GameState.INIT || 
           gameState.getState() == GameState.AFTERCOMBAT){
            currentStation.mountWeapon(i);
        }
    }
    
    void discardHangar(){
        
        if(gameState.getState() == GameState.INIT || 
           gameState.getState() == GameState.AFTERCOMBAT){
            currentStation.discardHangar();
        }
    }
    
    void discardShieldBooster(int i){
        
        if(gameState.getState() == GameState.INIT || 
           gameState.getState() == GameState.AFTERCOMBAT){
            currentStation.discardShieldBooster(i);
        }
    }
    
    void discardShieldBoosterInHangar(int i){
        
        if(gameState.getState() == GameState.INIT || 
           gameState.getState() == GameState.AFTERCOMBAT){
            currentStation.discardShieldBoosterInHangar(i);
        }
    }
    
    void discardWeapon(int i){
        
        if(gameState.getState() == GameState.INIT || 
           gameState.getState() == GameState.AFTERCOMBAT){
            currentStation.discardWeapon(i);
        }
    }
    
    void discardWeaponInHangar(int i){
        
        if(gameState.getState() == GameState.INIT || 
           gameState.getState() == GameState.AFTERCOMBAT){
            currentStation.discardWeaponInHangar(i);
        }
    }
    
    boolean haveAWinner(){
        
        if(currentStation.getNMedals() == WIN){
            return true;
        }
        else{
            return false;
        }
    }
    
    boolean nextTurn(){
        
        if(gameState.getState() == GameState.AFTERCOMBAT){
            
            if(currentStation.validState()){
                
                currentStationIndex = (currentStationIndex + 1) 
                                    % spaceStations.size();
                turns++;
                currentStation = spaceStations.get(currentStationIndex);
                currentStation.cleanUpMountedItems();
                
                CardDealer dealer = CardDealer.getInstance();
                
                currentEnemy = dealer.nextEnemy();
                gameState.next(turns, spaceStations.size());
                
                return true;
            }
            else{
                return false;
            }
        }
        else{
                   
            return false;
        }
    }
}
