package applet;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Image;
import javax.swing.*;

public class miApplet extends Applet {
    private Image img;
    private ImageIcon img2;
 
    @Override
    public void init() {
        img = getImage(getDocumentBase(), "p1.jpg");
        
    }
    @Override
   public void paint (Graphics g){
    g.drawImage(img, 500, 500, this);
    g.setColor (Color.blue);
    g.drawRect (45, 25, 35, 150);
    g.setColor(Color.red);
    g.fillOval(170, 75, 120, 20);
    g.fillOval(210 , 65, 15, 45);
    g.fillOval( 260 , 55, 15, 30);
    g.setColor(Color.blue);
    g.fillRect(100, 150, 30, 80);
    g.setColor(Color.yellow);
    g.fillRect(108, 155, 18, 20);
    }
}

