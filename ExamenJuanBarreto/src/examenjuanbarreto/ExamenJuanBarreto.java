
package examenjuanbarreto;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Juan Barreto V-31106376 Computación Gráfica N-813P
 */
public class ExamenJuanBarreto extends JFrame{
    
    public ExamenJuanBarreto() {
    this.setSize(500,450);
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    this.setLocationRelativeTo(null);
    JPanel panel = new JPanel();
    panel.setLayout(null);
    this.add(panel);
    panel.setVisible(true);
    this.setVisible(true);
    this.setTitle("Chanel Juan Barreto");
            
    //Texto Chanel
    JLabel texto = new JLabel();
    texto.setText("CHANEL");
    texto.setBounds(35,270,500,80);
    texto.setFont(new Font("ARIAL", 1,100));
    texto.setVisible(true);
    texto.setForeground(Color.black);
    panel.add(texto);
    }
    
    public void paint(Graphics g) {
    super.paint(g);
    Graphics2D g2d = (Graphics2D) g;
    g2d.setStroke(new BasicStroke(25));
     
    //circulo derecha
    g.drawArc(200,100,200,200,40,280);
    //circulo izquierda
    g.drawArc(100,100,200,200,220,280);
    }
    
    public static void main(String[] args) {
       ExamenJuanBarreto d1 = new ExamenJuanBarreto();
       d1.setVisible(true);
    }
    
}
