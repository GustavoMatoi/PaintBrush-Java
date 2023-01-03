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
public class Cilindro extends D2{
    public Cilindro(){
        super();
    }

    public Cilindro(int xInicial, int yInicial, int xFinal, int yFinal, Color cor){
        super.xInicial=xInicial;
        super.yInicial=yInicial;
        this.xFinal=xFinal;
        this.yFinal=yFinal;
        super.cor=cor;
    }

    @Override
    public void paint(Graphics graficos, Color c){
        int largura = super.largura();
        int raio = largura/2;
        int altura = super.altura();
        graficos.setColor(c);
        graficos.drawOval(super.xInicial, super.yInicial,largura, raio);
        graficos.drawOval(super.xInicial, super.yInicial + altura,(raio*2), raio);
        graficos.drawLine(super.xInicial, super.yInicial+(raio/2), super.xInicial, super.yInicial + altura + raio/2);
        graficos.drawLine(super.xFinal, super.yInicial+(raio/2), super.xFinal, super.yInicial + altura + raio/2);
        this.volume(raio);
    }
    public void volume(int raio){
        int a=super.altura();
        System.out.println("Volume do cilindro: "+(raio*raio*a*3.14) +" m3");
    }

}


