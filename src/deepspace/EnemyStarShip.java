/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deepspace;

/**
 *
 * @author gonzalomp
 */
public class EnemyStarShip {
    
    //Atributos
    private String name;
    private float ammoPower;
    private float shieldPower;
    private Loot loot;
    private Damage damage;
    
    //Constructores
    EnemyStarShip (String n, float a, float s, Loot l, Damage d){
        name = n;
        ammoPower = a;
        shieldPower = s;
        loot = l;
        damage = d;
    }
    
    EnemyStarShip (EnemyStarShip e){
        this(e.name, e.ammoPower, e.shieldPower, e.loot, e.damage);
    }
    
    //Métodos Visibilidad de Paquete
    EnemyToUI getEnemyToUIversion (){ return new EnemyToUI(this); }
    
    //Métodos Públicos
    public float fire(){ return ammoPower; }
    
    public float getAmmoPower(){ return ammoPower; }
    
    public Damage getDamage(){ return damage; }
    
    public Loot getLoot(){ return loot; }
    
    public String getName(){ return name; }
    
    public float getShieldPower(){ return shieldPower; }
    
    public float protection(){ return shieldPower; }
    
    public ShotResult receiveShot(float shot){
        
        if(shieldPower < shot) return ShotResult.DONOTRESIST;
        
        else return ShotResult.RESIST;
        
    }
    
    
    
    
    
}
