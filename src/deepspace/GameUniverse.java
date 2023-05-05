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
    
    //Constructor
    public GameUniverse(){
        gameState = new GameStateController();
        turns = 0;
        dice = new Dice();
        currentEnemy = null;
        spaceStations =  new ArrayList<SpaceStation>();
        currentStationIndex = 0;
        currentStation = null;
    }
    
    //Consultores
    public GameState getState(){
        return gameState.getState();
    }
    
    //Métodos Públicos
    public void mountShieldBooster(int i){
        
        if(gameState.getState() == GameState.INIT || 
           gameState.getState() == GameState.AFTERCOMBAT){
            currentStation.mountShieldBooster(i);
        }
    }
    
    public void mountWeapon(int i){
        
        if(gameState.getState() == GameState.INIT || 
           gameState.getState() == GameState.AFTERCOMBAT){
            currentStation.mountWeapon(i);
        }
    }
    
    public void discardHangar(){
        
        if(gameState.getState() == GameState.INIT || 
           gameState.getState() == GameState.AFTERCOMBAT){
            currentStation.discardHangar();
        }
    }
    
    public void discardShieldBooster(int i){
        
        if(gameState.getState() == GameState.INIT || 
           gameState.getState() == GameState.AFTERCOMBAT){
            currentStation.discardShieldBooster(i);
        }
    }
    
    public void discardShieldBoosterInHangar(int i){
        
        if(gameState.getState() == GameState.INIT || 
           gameState.getState() == GameState.AFTERCOMBAT){
            currentStation.discardShieldBoosterInHangar(i);
        }
    }
    
    public void discardWeapon(int i){
        
        if(gameState.getState() == GameState.INIT || 
           gameState.getState() == GameState.AFTERCOMBAT){
            currentStation.discardWeapon(i);
        }
    }
    
    public void discardWeaponInHangar(int i){
        
        if(gameState.getState() == GameState.INIT || 
           gameState.getState() == GameState.AFTERCOMBAT){
            currentStation.discardWeaponInHangar(i);
        }
    }
    
    public boolean haveAWinner(){
        
        if(currentStation.getNMedals() == WIN){
            return true;
        }
        else{
            return false;
        }
    }
    
    public boolean nextTurn(){
        
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
    
    public void init(ArrayList<String> names){
        
        if(gameState.getState() == GameState.CANNOTPLAY){
            
            CardDealer dealer = CardDealer.getInstance();
            
            int i = 0;
            while(i < names.size()){
                
                SuppliesPackage supplies = dealer.nextSuppliesPackage();
                SpaceStation station = new SpaceStation(names.get(i), supplies);
                
                spaceStations.add(station);
                
                int nh = dice.initWithNHangars();
                int nw = dice.initWithNWeapons();
                int ns = dice.initWithNShields();
                
                Loot lo = new Loot(0, nw, ns, nh, 0);
                
                station.setLoot(lo);
            }
            
            currentStationIndex = dice.whoStarts(names.size());
            currentStation = spaceStations.get(i);
            
            currentEnemy = dealer.nextEnemy();
            gameState.next(turns, spaceStations.size());
        }
    }
    
    public CombatResult combat(){
        
        if(gameState.getState() == GameState.BEFORECOMBAT || 
           gameState.getState() == GameState.INIT){
            
            return combat(currentStation, currentEnemy);
        }
        else{
            return CombatResult.NOCOMBAT;
        }
    }
    
    CombatResult combat(SpaceStation station,EnemyStarShip enemy){
        
        GameCharacter ch = dice.firstShot();
        boolean enemyWins;
        CombatResult combatResult;
        
        if(ch == GameCharacter.ENEMYSTARSHIP){
            float fire = enemy.fire();
            ShotResult result = station.receiveShot(fire);
            
            if(result == ShotResult.RESIST){
                fire = station.fire();
                result = enemy.receiveShot(fire);
                enemyWins = (result == ShotResult.RESIST);
            }
            else{
                enemyWins = true;
            }
        }
        else{
            float fire = station.fire();
            ShotResult result = station.receiveShot(fire);
            enemyWins = (result == ShotResult.RESIST);
        }
        
        if(enemyWins){
            
            float s = station.getSpeed();
            boolean moves = dice.spaceStationMoves(s);
            
            if(!moves){
                
                Damage damage = enemy.getDamage();
                station.setPendingDamage(damage);
                combatResult = CombatResult.ENEMYWINS;
            }
            else{
                station.move();
                combatResult = CombatResult.STATIONESCAPES;
            }
        }
        else{
            
            Loot aloot = enemy.getLoot();
            station.setLoot(aloot);
            combatResult = CombatResult.STATIONWINS;
        }
        
        return combatResult;
    }
    
    public GameUniverseToUI getUIversion() {
        
        return new GameUniverseToUI(currentStation, currentEnemy); 
    }
}
