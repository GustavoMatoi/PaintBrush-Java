/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.paintbrush;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author gutei
 */
public class Retangulo extends D2{

        public Retangulo(){
            super();
        }
        public Retangulo(int xInicial, int yInicial, int xFinal, int yFinal, Color cor){
            super.xInicial=xInicial;
            super.yInicial=yInicial;
            this.xFinal=xFinal;
            this.yFinal=yFinal;
            super.cor=cor;

        }

        @Override
        public void paint(Graphics g, Color c){
            g.setColor(c);
            g.drawRect(super.xInicial,super.yInicial, super.largura() , super.altura());
        }
    
    public void preenche(Graphics g,Color c){
        g.setColor(c);
        g.fillRect(super.xInicial+1,super.yInicial+1, super.largura()-1 , super.altura()-1);
        this.area();
    }

    public void area(){
        System.out.println("Area do retângulo "+ (super.altura()*largura()));
    }
    
}
