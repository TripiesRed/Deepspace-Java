/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package deepspace;

/**
 *
 * @author gonzalomp
 */
public class TestP1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Test class: Loot
        Loot enemy_1 = new Loot(12, 3, 5, 5, 8);
        Loot enemy_2 = new Loot(1, 2, 8, 3, 13);
        
        System.out.print("Este es el loot del enemigo 1: \nSupplies " + enemy_1.getNSupplies()
        + "\nWeapons " + enemy_1.getNWeapons()+ "\nHangars " + enemy_1.getNHangars()
        + "\nWeapons " + enemy_1.getNShields()+ "\nMedals " + enemy_1.getNMedals()+ "\n\n");
        
        System.out.print("Este es el loot del enemigo 2: \nSupplies " + enemy_2.getNSupplies()
        + "\nWeapons " + enemy_2.getNWeapons()+ "\nHangars " + enemy_2.getNHangars()
        + "\nWeapons " + enemy_2.getNShields()+ "\nMedals " + enemy_2.getNMedals()+ "\n\n");
        
        
        //Test class: SuppliesPackage
        SuppliesPackage pack_1 = new SuppliesPackage (1.0f, 20f, 3.0f);
        SuppliesPackage pack_2 = new SuppliesPackage (2.0f, 1.0f, 3.0f);
        
        System.out.print("Este es el Supplie Package 1: \nAmmoPower " + pack_1.getAmmoPower()
        + "\nFuelUnits " + pack_1.getFuelUnits() + "\nShieldPower " + pack_1.getShieldPower()+ "\n\n");
        
        System.out.print("Este es el Supplie Package 2: \nAmmoPower " + pack_2.getAmmoPower()
        + "\nFuelUnits " + pack_2.getFuelUnits() + "\nShieldPower " + pack_2.getShieldPower()+ "\n\n");
        
        
        //Test class: ShieldBooster
        ShieldBooster boost_1 = new ShieldBooster ("Potenciador 1", 4.0f, 3);
        ShieldBooster boost_2 = new ShieldBooster ("Potenciador 2", 2.5f, 1);
        ShieldBooster boostcopy_1 = boost_1;
        
        System.out.print("Este es el Shield Booster 1: \nBoost " + boost_1.getBoost()
        + "\nFuelUnits " + boost_1.getUses() + "\n\n");
        
        System.out.print("Este es el Shield Booster 2: \nBoost " + boost_2.getBoost()
        + "\nFuelUnits " + boost_2.getUses() + "\n\n");
        
        System.out.print("Este es el Shield Booster Copia 1: \nBoost " + boostcopy_1.getBoost()
        + "\nFuelUnits " + boostcopy_1.getUses() + "\n\n");
        
        boost_1.useIt();
        boost_2.useIt();
        
        System.out.print("Tras 1er uso: \nBoost 1: " + boost_1.getUses() + "\nBoost 2: " + boost_2.getUses() + 
                "\nBoost Copia 1: " + boostcopy_1.getUses() + "\n\n");
        
        boost_2.useIt();
        boostcopy_1.useIt();
        
        System.out.print("Tras 2º uso: \nBoost 1: " + boost_1.getUses() + "\nBoost 2: " + boost_2.getUses() + 
                "\nBoost Copia 1: " + boostcopy_1.getUses() + "\n\n");
        
        
        //Test class: Weapon
        Weapon weapon_1 = new Weapon ("Arma 1", WeaponType.LASER, 3);
        Weapon weapon_2 = new Weapon ("Arma 2", WeaponType.MISSILE, 1);
        Weapon weapon_3 = new Weapon ("Arma 2", WeaponType.PLASMA, 4);
        Weapon weaponcopy_1 = weapon_1;
        
        System.out.print("Este es el Arma 1: \nType " + weapon_1.getType()
        + "\nPower " + weapon_1.power() + "\nUses " + weapon_1.getUses() + "\n\n");
        
        System.out.print("Este es el Arma 2: \nType " + weapon_2.getType()
        + "\nPower " + weapon_2.power() + "\nUses " + weapon_2.getUses() + "\n\n");
        
        System.out.print("Este es el Arma 3: \nType " + weapon_3.getType()
        + "\nPower " + weapon_3.power() + "\nUses " + weapon_3.getUses() + "\n\n");
        
        System.out.print("Este es el Arma Copia 1: \nType " + weaponcopy_1.getType()
        + "\nPower " + weaponcopy_1.power() + "\nUses " + weaponcopy_1.getUses() + "\n\n");
        
        weapon_1.useIt();
        weapon_2.useIt();
        weapon_3.useIt();
        
        System.out.print("Tras 1er uso: \nArma 1: " + weapon_1.getUses() + "\nArma 2: " + weapon_2.getUses() 
                + "\nArma 3: " + weapon_3.getUses() + "\nArma Copia 1: " + weaponcopy_1.getUses() + "\n\n");
        
        weaponcopy_1.useIt();
        weapon_2.useIt();
        weapon_3.useIt();
        
        System.out.print("Tras 2º uso: \nArma 1: " + weapon_1.getUses() + "\nArma 2: " + weapon_2.getUses() 
                + "\nArma 3: " + weapon_3.getUses() + "\nArma Copia 1: " + weaponcopy_1.getUses() + "\n\n");
        
        
        //Test class: Dice
        Dice dados = new Dice();
        int initWithNoHangars = 0, initWithHangars = 0;
        int initWithOneWeapon = 0, initWithTwoWeapons = 0, initWithThreeWeapons = 0;
        int initWithNoShields = 0, initWithShields = 0;
        int nSpaceStation = 0, nEnemyStarship = 0;
        float speed = 0.4f;
        int evade = 0, no_evade = 0;
        
        for(int i = 0; i < 100; i++){
            
            //Hangars Probs
            if(dados.initWithNHangars() == 0) 
                initWithNoHangars++;

            else initWithHangars++;
            
            //Weapons Probs
            switch (dados.initWithNWeapons()) {
                case 1:
                    initWithOneWeapon++;
                    break;
                case 2:
                    initWithTwoWeapons++;
                    break;
                default:
                    initWithThreeWeapons++;
                    break;
            }
            
            //Shields Probs
            if(dados.initWithNShields() == 0) 
                initWithNoShields++;

            else initWithShields++;
            
            //GameCharacter Probs
            if(dados.firstShot()== GameCharacter.ENEMYSTARSHIP) 
                nEnemyStarship++;
            
            else nSpaceStation++;
            
            //SpaceStationMoves to evade
            if(dados.spaceStationMoves(speed) == false)
                no_evade++;
            
            else evade++;
            
        }
        
        System.out.print("Las probabilidades obtenidas son: \n\n"
        + "-NoHangars: " + initWithNoHangars + "\n" 
        + "-Hangars: " + initWithHangars + "\n\n"
        + "-NoShields: " + initWithNoShields + "\n" 
        + "-Shields: " + initWithShields + "\n\n"
        + "-One Weapon: " + initWithOneWeapon + "\n" 
        + "-Two Weapon: " + initWithTwoWeapons + "\n" 
        + "-Three Weapon: " + initWithThreeWeapons + "\n\n"
        + "-EnemyStarships: " + nEnemyStarship + "\n" 
        + "-SpaceStations: " + nSpaceStation + "\n\n"
        + "-Evades: " + evade + "\n" 
        + "-No Evades: " + no_evade + "\n\n");
        
    }
    
}
