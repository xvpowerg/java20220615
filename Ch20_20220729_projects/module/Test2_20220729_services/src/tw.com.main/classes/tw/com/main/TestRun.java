/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tw.com.main;

import tw.com.api.Player;
import tw.com.api.PlayerProvider;

/**
 *
 * @author xvpow
 */
public class TestRun {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player player = PlayerProvider.providePlayer();
        player.play("GoGo!!");
    }
    
}
