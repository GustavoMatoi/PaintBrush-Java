/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.paintbrush;

import java.awt.Graphics;
import javax.swing.JFrame;

/**
 *
 * @author gutei
 */
public class Paintbrush extends JFrame {
    
    
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Interface paintbrush = new Interface();
        paintbrush.setVisible(true);
    }
}
