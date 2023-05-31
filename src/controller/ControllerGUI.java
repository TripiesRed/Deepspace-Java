/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import View.GUI.MainWindow;
import deepspace.GameUniverseToUI;
import deepspace.GameUniverse;
import deepspace.LootToUI;

/**
 *
 * @author gonzalomp
 */

public class ControllerGUI {
    private static final ControllerGUI instance = new ControllerGUI();
    
    public static final int WEAPON = 0x1;
    public static final int SHIELD = 0x2;
    public static final int HANGAR = 0x4;
    private GameUniverse game;
    private MainWindow view;
    
    private ControllerGUI () {}
    
    public static ControllerGUI getInstance () {
      return instance;
    }
    
    public void setModelView (GameUniverse aGame, MainWindow aView) {
      game = aGame;
      view = aView;
    }
    
    public void start() {
        game.init(view.getNames());
        view.updateView();
        view.showView();
    }
    
    public void finish (int i) {
        System.exit(i);
    }
    
    public GameUniverseToUI getUIversion(){
        return game.getUIversion();
    }
    
    public LootToUI getLoot(){
        return game.getALoot();
    }
      
}
