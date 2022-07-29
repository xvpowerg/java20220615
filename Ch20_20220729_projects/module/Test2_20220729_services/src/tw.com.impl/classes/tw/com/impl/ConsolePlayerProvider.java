/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tw.com.impl;

import tw.com.api.Player;
import tw.com.api.PlayerProvider;

/**
 *
 * @author xvpow
 */
public class ConsolePlayerProvider implements PlayerProvider {

    @Override
    public Player player() {
         return new ConsonlePlayer();
    }
    
}
