/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logomitsubishi;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author juan
 */
public class LogoMitsubishi extends JFrame {

    public LogoMitsubishi( ){
        this.setSize(500,475);
        this.setTitle("Mitsubishi Barreto");
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        this.add(panel);
        panel.setLayout(null);
        panel.setVisible(true);
        this.setVisible(true);
    }
    
    
    public void paint(Graphics g){
    super.paint(g);
    Graphics2D g2d = (Graphics2D) g;
    g2d.setStroke(new BasicStroke(10));
    
    g.setColor(Color.RED);
    
    //Cuadrilatero inferior izquierdo mitsubishi
    int[] x1 = {100,200,250,150};
    int[] y1 = {400,400,300,300};
    g.fillPolygon(x1,y1,4);
    
    
    //Cuadrilatero inferior derecho mitsubishi
    int[] x2 = {250,350,400,300};
    int[] y2 = {300,300,400,400};
    g.fillPolygon(x2,y2,4);
    
    //Diamante superior 
    int[] x3 = {250,200,250,300};
    int[] y3 = {100,200,300,200};
    g.fillPolygon(x3,y3,4);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LogoMitsubishi d1 = new LogoMitsubishi();
        d1.setVisible(true);
    }
    
}
