/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tw.com.impl;

import tw.com.api.Player;

/**
 *
 * @author xvpow
 */
public class ConsonlePlayer  implements Player{

    @Override
    public void play(String video) {
        System.out.println("正在播放:"+video);
    }
    
}
