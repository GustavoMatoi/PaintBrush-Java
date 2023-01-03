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
public abstract class D2 extends Ponto{

    protected int xFinal;
    protected int yFinal;
    
    public D2(){
        super();
        this.xFinal = 0;
        this.yFinal = 0;
    }

    public int getXFinal() {
        return xFinal;
    }

    public void setXFinal(int xFinal) {
        this.xFinal = xFinal;
    }

    public int getYFinal() {
        return yFinal;
    }

    public void setYFinal(int yFinal) {
        this.yFinal = yFinal;
    }

    public int altura(){
        return this.yFinal-super.yInicial;
    }
    public int largura(){
        return this.xFinal-super.xInicial;
    }


    public abstract void paint(Graphics g, Color c);
}
