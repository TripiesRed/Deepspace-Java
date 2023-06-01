/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;


import View.DeepSpaceView;
import View.GUI.MainWindow;
import controller.Controller;
import deepspace.GameUniverse;

/**
 *
 * @author gonzalomp
 */
public class PlayWithGUI {
    public static void main(String[] args) {
      GameUniverse game = new GameUniverse();
      MainWindow ui = MainWindow.getInstance();
      Controller controller = Controller.getInstance();
      controller.setModelView(game,ui);
      controller.start();   
    }
  
}
