package examen2;
import javax.swing.*;
import java.net.URL;
import java.awt.*;
import javax.imageio.ImageIO;
import examen2.UpperCase;


//Clase examen2, presentado por Juan Barreto V-31106376 Computación Gráfica Sección N-813
//Lunes, 26 de febrero de 2024
public class Examen2 extends JFrame {
    
    //Método constructor de la clase
    public Examen2() {
    URL iconURL = getClass().getResource("/resources/notepad.png"); //Buscar recurso del icono
    Image icon = new javax.swing.ImageIcon(iconURL).getImage();
    this.setIconImage(icon); //Se establece el ícono para el frame
    this.setSize(600,512); //Se establece un tamaño para la ventana 
    this.setTitle("Examen 2 Formulario Barreto"); //Titulo del formulario
    this.setLocationRelativeTo(null); //Centrar
    this.setDefaultCloseOperation(EXIT_ON_CLOSE); //Terminar el programa al cerrar la ventana
    this.setResizable(false);
    initializeComponents(); //inicializar componentes
    }
    
    //Clase fondo panel
    //Esta subclase extiende a la clase JPanel, se utiliza para realizar una sobrecarga al método
    //Paint, y permitir el renderizado de un determinado recurso a modo de imagen de fondo.
    class FondoPanel extends JPanel {
    private Image imagen; //Inicializacion de imagen

    @Override
    public void paint(Graphics g) { //sobrecarga del metodo paint
        imagen = new ImageIcon(getClass().getResource("/resources/books.png")).getImage();
        g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this); //se dibuja la imagen en el fondo del panel
        setOpaque(false);
        super.paint(g); //superclase paint

    }
}

    
    public void initializeComponents() {
    FondoPanel panel = new FondoPanel(); //Se inicializa un JPanel con imagen de fondo
    panel.setLayout(new BoxLayout(panel,BoxLayout.PAGE_AXIS)); //Se establece un BoxLayout al panel, el cual permite renderizar widgets uno debajo del otro sin necesidad de establecer posiciones de pixeles especificas
    
    JPanel panel1 = new JPanel(); // se inicializan JPanel con flowlayout, los cuales permiten renderizar widgets uno al lado del otro sin necesidad de establecer posiciones de pixeles en especifico
    panel1.setLayout(new FlowLayout(FlowLayout.CENTER, 5,10));
    panel1.setOpaque(false);
    
    JLabel welcomeMsg = new JLabel("Formulario del estudiante: "); //se inicializa un mensaje de bienvenida
    welcomeMsg.setFont(new Font("HELVETICA", Font.BOLD, 20));
    JLabel imageWelcomeMsg = new JLabel(); //Se añade un ícono a la imagen 
    setImageLbl(imageWelcomeMsg,"/resources/notepad.png"); //Se establece un icono para el label
    
    //Se añaden los widgets en el panel1
    panel1.add(welcomeMsg);
    panel1.add(imageWelcomeMsg);
    
    
    JPanel panel2 = new JPanel(); // se inicializan JPanel con flowlayout, los cuales permiten renderizar widgets uno al lado del otro sin necesidad de establecer posiciones de pixeles en especifico
    panel2.setLayout(new FlowLayout(FlowLayout.CENTER, 5,10));
    panel2.setOpaque(false);
    
    JLabel blankSpace = new JLabel("Cédula"); 
    JTextField txt1 = new JTextField();
    txt1.addKeyListener(new UpperCase.UppercaseListener());
    txt1.setPreferredSize(new Dimension(100,20));
    welcomeMsg.setFont(new Font("HELVETICA", Font.BOLD, 20));
    JLabel icon1 = new JLabel();
    setImageLbl(icon1,"/resources/num.png");

    
    //Se añaden los widgets en el panel1
    panel2.add(blankSpace);
    panel2.add(txt1);
    panel2.add(icon1);
    
    
    JPanel panel3 = new JPanel(); // se inicializan JPanel con flowlayout, los cuales permiten renderizar widgets uno al lado del otro sin necesidad de establecer posiciones de pixeles en especifico
    panel3.setLayout(new FlowLayout(FlowLayout.CENTER, 5,10));
    panel3.setOpaque(false);
    
    JLabel blankSpace2 = new JLabel("Nombre"); 
    JTextField txt2 = new JTextField();
    txt2.setPreferredSize(new Dimension(100,20));
        txt2.addKeyListener(new UpperCase.UppercaseListener());
    welcomeMsg.setFont(new Font("HELVETICA", Font.BOLD, 20));
    JLabel icon2 = new JLabel();
    setImageLbl(icon2,"/resources/abc.png");

    
    //Se añaden los widgets en el panel1
    panel3.add(blankSpace2);
    panel3.add(txt2);
    panel3.add(icon2);
    
    JPanel panel4 = new JPanel(); // se inicializan JPanel con flowlayout, los cuales permiten renderizar widgets uno al lado del otro sin necesidad de establecer posiciones de pixeles en especifico
    panel4.setLayout(new FlowLayout(FlowLayout.CENTER, 5,10));
    panel4.setOpaque(false);
    
    JLabel blankSpace4 = new JLabel("Apellido"); 
    JTextField txt4 = new JTextField();
    txt4.setPreferredSize(new Dimension(100,20));
        txt4.addKeyListener(new UpperCase.UppercaseListener());
    welcomeMsg.setFont(new Font("HELVETICA", Font.BOLD, 20));
    JLabel icon4= new JLabel();
    setImageLbl(icon4,"/resources/abc.png");

    
    //Se añaden los widgets en el panel1
    panel4.add(blankSpace4);
    panel4.add(txt4);
    panel4.add(icon4);
    
    JPanel panel5 = new JPanel(); // se inicializan JPanel con flowlayout, los cuales permiten renderizar widgets uno al lado del otro sin necesidad de establecer posiciones de pixeles en especifico
    panel5.setLayout(new FlowLayout(FlowLayout.CENTER, 5,10));
    panel5.setOpaque(false);
    
    JLabel blankSpace5 = new JLabel("Fecha de nacimiento"); 
    JTextField txt5 = new JTextField();
    txt5.setPreferredSize(new Dimension(100,20));
        txt5.addKeyListener(new UpperCase.UppercaseListener());
    welcomeMsg.setFont(new Font("HELVETICA", Font.BOLD, 20));
    JLabel icon5= new JLabel();
    setImageLbl(icon5,"/resources/calendar.png");

    
    //Se añaden los widgets en el panel1
    panel5.add(blankSpace5);
    panel5.add(txt5);
    panel5.add(icon5);
    
    
    JPanel panel6 = new JPanel(); // se inicializan JPanel con flowlayout, los cuales permiten renderizar widgets uno al lado del otro sin necesidad de establecer posiciones de pixeles en especifico
    panel6.setLayout(new FlowLayout(FlowLayout.CENTER, 5,10));
    panel6.setOpaque(false);
    
    JLabel blankSpace6 = new JLabel("Alergias"); 
    JTextField txt6 = new JTextField();
    txt6.setPreferredSize(new Dimension(100,20));
        txt6.addKeyListener(new UpperCase.UppercaseListener());
    welcomeMsg.setFont(new Font("HELVETICA", Font.BOLD, 20));
    JLabel icon6= new JLabel();
    setImageLbl(icon6,"/resources/cross.png");

    
    //Se añaden los widgets en el panel1
    panel6.add(blankSpace6);
    panel6.add(txt6);
    panel6.add(icon6);


   
    
    
    
    //Se añaden los paneles con flowlayout al panel principal con boxlayout
    panel.add(panel1);
    panel.add(panel2);
    panel.add(panel3);
    panel.add(panel4);
    panel.add(panel5);
    panel.add(panel6);

    
    JScrollPane scrollPane = new JScrollPane(panel); //Crear un ScrollPanel
    scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED); //Establecer la barra de desplazamiento vertical
    scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED); //Establecer la barra de desplazamiento horizontal
    this.getContentPane().add(scrollPane); 
    
    
    
    
    
    }
    
    
    //Metodo que se encarga de cargar una imagen, y setearlo como icono a un JLabel
    public void setImageLbl(JLabel imageLabel, String url) {
             try {
            URL imageUrl = getClass().getResource(url); 
            if (imageUrl == null) {
                throw new Exception("Image not found: " + imageUrl);
            }
            Image image = ImageIO.read(imageUrl);
            Image scaledImage = image.getScaledInstance(30, 30, Image.SCALE_SMOOTH); 
            imageLabel.setIcon(new ImageIcon(scaledImage));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    

    public static void main(String[] args) {
        Examen2 d1 = new Examen2();
        d1.setVisible(true);
    }
    
}
