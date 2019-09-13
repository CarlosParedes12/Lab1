/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import javax.swing.JApplet;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Image;
/**
 *
 * @author alumno
 */
public class NewJApplet extends JApplet {
    Image imp;
    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void init() {
        // TODO start asynchronous download of heavy resources
        imp = getImage(getCodeBase(),"ok.png");
    }
    

    // TODO overwrite start(), stop() and destroy() methods
    public void paint (Graphics g){
    g.setColor (Color.blue);
    g.drawRect (45, 25, 35, 150);
    g.setColor(Color.red);
    g.fillOval(170, 75, 120, 20);
    g.fillOval(210 , 65, 15, 45);
    g.fillOval( 260 , 55, 15, 30);
    Image img;
    img = getImage(getCodeBase(),"ok.png");
    g.drawImage(img,50,40,this);
    }
}
