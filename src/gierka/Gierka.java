/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gierka;

import gierka.display.Display;

/**
 *
 * @author KUBA
 */
public class Gierka {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Game game = new Game("The Game",500,500);
        game.start();
    }
    
}
