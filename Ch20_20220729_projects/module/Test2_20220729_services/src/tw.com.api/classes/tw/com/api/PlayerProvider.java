/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package tw.com.api;

import java.util.ServiceLoader;

/**
 *
 * @author xvpow
 */
public interface PlayerProvider {
    Player player();
    public static Player providePlayer(){
        return ServiceLoader.load(PlayerProvider.class).findFirst().
                orElseThrow(()->new RuntimeException(" 沒有服務")).
                player();
    }
}
