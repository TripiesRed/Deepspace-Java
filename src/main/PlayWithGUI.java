/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;


import View.View;
import View.GUI.MainWindow;
import controller.ControllerGUI;
import deepspace.GameUniverse;

/**
 *
 * @author gonzalomp
 */
public class PlayWithGUI {
    public static void main(String[] args) {
      GameUniverse game = new GameUniverse();
      MainWindow ui = MainWindow.getInstance();
      ControllerGUI controller = ControllerGUI.getInstance();
      controller.setModelView(game,ui);
      controller.start();   
    }
  
}
