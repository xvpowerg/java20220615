/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2SEModule/module-info.java to edit this template
 */

module tw.com.impl {
    requires tw.com.api;
    provides tw.com.api.PlayerProvider
       with tw.com.impl.ConsolePlayerProvider;
}
