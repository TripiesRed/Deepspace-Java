/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package View;

/**
 *
 * @author gonzalomp
 */

import controller.Controller;
import deepspace.GameUniverse;
import java.util.ArrayList;

/**
 *
 * @author Profe
 */
public interface View {
  public void updateView();
  public void showView();
  public ArrayList<String> readNamePlayers();
  public boolean confirmExitMessage();
}