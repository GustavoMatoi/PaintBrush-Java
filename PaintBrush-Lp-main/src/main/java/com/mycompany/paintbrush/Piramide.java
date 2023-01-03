/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.paintbrush;

import java.awt.*;

/**
 *
 * @author gutei
 */
public class Piramide extends D2 {
    public Piramide(){
        super();
        
    }
    public Piramide(int xInicial, int yInicial, int xFinal, int yFinal, Color cor){
        super.xInicial=xInicial;
        super.yInicial=yInicial;
        this.xFinal=xFinal;
        this.yFinal=yFinal;
        super.cor=cor;
    }
    
    @Override
    public void paint(Graphics graficos, Color c){
        int largura = super.largura();
        int altura = super.altura();
        graficos.setColor(c);
        graficos.drawLine(super.xInicial, super.yInicial, super.xInicial+largura/2, super.yInicial-altura);
        graficos.drawLine(super.xInicial+largura, super.yInicial, super.xInicial+largura/2, super.yInicial-altura);
        graficos.drawLine(super.xInicial, super.yFinal, super.xInicial+largura/2, super.yInicial-altura);
        graficos.drawLine(super.xInicial+largura , super.yFinal, super.xInicial+largura/2, super.yInicial-altura);
        graficos.drawRect(super.xInicial, super.yInicial, largura, altura);
        volume();
    }
    public void volume(){
        int areaB=super.altura()*super.largura();
        System.out.println("Volume da piramide: "+((areaB*altura())/3) +" m3");
    }
}
