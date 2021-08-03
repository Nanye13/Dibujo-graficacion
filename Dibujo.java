import java.awt.*;
import java.awt.Color;
import java.awt.geom.*;
import java.awt.image.*;
import javax.swing.*;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.BasicStroke;
import java.awt.RenderingHints;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.util.Random;
//Autor Nancy Yesenia Ojeda Perez
public class Dibujo extends JPanel
{
    private Rectangle2D.Float r1 =
            new Rectangle2D.Float(500.0f,50.0f,100.0f,100.0f);
    private Rectangle2D.Float r2 =
            new Rectangle2D.Float(450.0f,100.0f,100.0f,100.0f);
    private Rectangle2D.Float r3 =
            new Rectangle2D.Float(400.0f,150.0f,100.0f,100.0f);
    private Rectangle2D.Float r4 =
            new Rectangle2D.Float(350.0f,200.0f,100.0f,100.0f);    
    private Rectangle2D.Float r5 =
            new Rectangle2D.Float(500.0f,150.0f,100.0f,100.0f);
    private Rectangle2D.Float r6 =
            new Rectangle2D.Float(450.0f,200.0f,100.0f,100.0f);
    private Rectangle2D.Float r7 =
            new Rectangle2D.Float(400.0f,250.0f,100.0f,100.0f);
    private Rectangle2D.Float r8 =
            new Rectangle2D.Float(350.0f,300.0f,100.0f,100.0f);    
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        
        Graphics2D g2d=(Graphics2D)g;

        
        g2d.setColor(Color.BLACK);
        setBackground(Color.WHITE);
        
        Dimension size= getSize();
        Insets insets= getInsets();
        int w = size.width - insets.left - insets.right;
        int h = size.height - insets.top - insets.bottom;
        
        Random r= new Random();
        for(int i=0;i<1000;i++){
            int x= Math.abs(r.nextInt())%w;
            int y= Math.abs(r.nextInt())%h;
            g2d.drawLine(x, y, x, y);
        }
        
        g2d.setPaint( Color.BLACK);
        g2d.setStroke(new BasicStroke(10.0f));
        g2d.fill( new Rectangle2D.Double(180, 100, 80, 10));
        g2d.fill( new Rectangle2D.Double(180, 60, 10, 40));
        g2d.setPaint(new GradientPaint(5, 30, Color.BLUE, 35, 100,
                        Color.WHITE, true));
         //g2d.setPaint( Color.BLUE);
         g2d.fill( new Rectangle2D.Double(190, 90, 30, 10));
         g2d.fill( new Rectangle2D.Double(190, 80, 20, 10));
         g2d.fill( new Rectangle2D.Double(200, 70, 20, 10));
         g2d.fill( new Rectangle2D.Double(190, 60, 30, 10));
         g2d.fill( new Rectangle2D.Double(200, 50, 10, 10));
          g2d.setPaint( Color.BLACK);
        g2d.fill( new Rectangle2D.Double(190, 70, 10, 10));
        g2d.fill( new Rectangle2D.Double(190, 50, 10, 10));
        g2d.fill( new Rectangle2D.Double(200, 40, 10, 10));
        g2d.fill( new Rectangle2D.Double(210, 50, 10, 10));
        g2d.fill( new Rectangle2D.Double(220, 60, 10, 40));
        g2d.fill( new Rectangle2D.Double(210, 80, 10, 10));
        g2d.fill( new Rectangle2D.Double(250, 100, 10, 40));
        //g2d.setPaint(new GradientPaint(5, 30, Color.ORANGE, 35, 100,
                        //Color.WHITE, true));
                    g2d.setPaint(new Color(255,128,0));
        g2d.fill( new Rectangle2D.Double(240, 130, 10, 20));
        g2d.fill( new Rectangle2D.Double(230, 140, 10, 20));
        g2d.fill( new Rectangle2D.Double(220, 150, 10, 20));
        g2d.fill( new Rectangle2D.Double(210, 160, 10, 20));
        g2d.setPaint(new GradientPaint(5, 30, Color.GREEN, 35, 100,
                        Color.WHITE, true));
        g2d.fill( new Rectangle2D.Double(200, 140, 10, 40));
        g2d.fill( new Rectangle2D.Double(210, 130, 10, 30));
        g2d.fill( new Rectangle2D.Double(220, 120, 10, 30));
        g2d.fill( new Rectangle2D.Double(230, 110, 10, 30));
        g2d.fill( new Rectangle2D.Double(240, 110, 10, 30));
        g2d.fill( new Rectangle2D.Double(190, 160, 10, 10));
         //g2d.setPaint(new GradientPaint(5, 30, Color.PINK, 35, 100,
                        //Color.WHITE, true));
              //g2d.setPaint( Color.PINK);
              g2d.setPaint(new Color(245,0,128));
        g2d.fill( new Rectangle2D.Double(210, 110, 20, 10));
        g2d.fill( new Rectangle2D.Double(200, 120, 20, 10));
        g2d.fill( new Rectangle2D.Double(190, 130, 20, 10));
        g2d.fill( new Rectangle2D.Double(180, 140, 20, 10));
        g2d.fill( new Rectangle2D.Double(170, 150, 30, 10));
        g2d.fill( new Rectangle2D.Double(160, 160, 30, 10));
         g2d.setPaint( Color.YELLOW);
        g2d.fill( new Rectangle2D.Double(170, 110, 40, 10));
        g2d.fill( new Rectangle2D.Double(160, 120, 40, 10));
        g2d.fill( new Rectangle2D.Double(150, 130, 40, 10));
        g2d.fill( new Rectangle2D.Double(140, 140, 40, 10));
        g2d.fill( new Rectangle2D.Double(130, 150, 40, 10));
        g2d.fill( new Rectangle2D.Double(120, 160, 40, 10));
        g2d.fill( new Rectangle2D.Double(120, 170, 30, 10));
         g2d.setPaint(new Color(175,0,175));
        g2d.fill( new Rectangle2D.Double(140, 110, 30, 10));
        g2d.fill( new Rectangle2D.Double(140, 120, 20, 10));
        g2d.fill( new Rectangle2D.Double(130, 130, 20, 10));
        g2d.fill( new Rectangle2D.Double(120, 140, 20, 10));
        g2d.fill( new Rectangle2D.Double(110, 150, 20, 10));
        g2d.fill( new Rectangle2D.Double(110, 160, 10, 10));
        g2d.fill( new Rectangle2D.Double(100, 170, 20, 10));
         g2d.setPaint( Color.BLACK);
        g2d.fill( new Rectangle2D.Double(260, 100, 10, 10));
        g2d.fill( new Rectangle2D.Double(270, 80, 10, 20));
        g2d.fill( new Rectangle2D.Double(280, 70, 10, 10));
        g2d.fill( new Rectangle2D.Double(290, 60, 10, 10));
        g2d.fill( new Rectangle2D.Double(300, 70, 10, 10));
        g2d.fill( new Rectangle2D.Double(310, 80, 10, 50));
        g2d.fill( new Rectangle2D.Double(290, 90, 10, 10));
        g2d.fill( new Rectangle2D.Double(280, 100, 10, 30));
        g2d.fill( new Rectangle2D.Double(300, 130, 10, 10));
        g2d.fill( new Rectangle2D.Double(280, 140, 20, 10));
        g2d.fill( new Rectangle2D.Double(290, 150, 10, 20));
        g2d.fill( new Rectangle2D.Double(300, 170, 10, 20));
        g2d.fill( new Rectangle2D.Double(310, 190, 10, 40));
        g2d.fill( new Rectangle2D.Double(320, 230, 10, 50));
        g2d.fill( new Rectangle2D.Double(310, 280, 10, 20));
        g2d.fill( new Rectangle2D.Double(300, 300, 10, 10));
        g2d.fill( new Rectangle2D.Double(280, 310, 20, 10));
        g2d.fill( new Rectangle2D.Double(260, 320, 20, 10));
        g2d.fill( new Rectangle2D.Double(170, 330, 90, 10));
        g2d.fill( new Rectangle2D.Double(150, 320, 20, 10));
        g2d.fill( new Rectangle2D.Double(140, 310, 10, 10));
        g2d.fill( new Rectangle2D.Double(130, 300, 10, 10));
        g2d.fill( new Rectangle2D.Double(120, 280, 10, 20));
        g2d.fill( new Rectangle2D.Double(110, 190, 10, 90));
        g2d.fill( new Rectangle2D.Double(100, 180, 50, 10));
        g2d.fill( new Rectangle2D.Double(150, 170, 50, 10));
        g2d.fill( new Rectangle2D.Double(200, 180, 20, 10));
        g2d.fill( new Rectangle2D.Double(220, 170, 10, 10));
        g2d.fill( new Rectangle2D.Double(230, 160, 10, 10));
        g2d.fill( new Rectangle2D.Double(250, 140, 10, 10));
        g2d.fill( new Rectangle2D.Double(240, 150, 10, 10));
        g2d.fill( new Rectangle2D.Double(90, 170, 10, 10));
        g2d.fill( new Rectangle2D.Double(100, 160, 10, 10));
        g2d.fill( new Rectangle2D.Double(90, 150, 20, 10));
        g2d.fill( new Rectangle2D.Double(110, 140, 10, 10));
        g2d.fill( new Rectangle2D.Double(120, 130, 10, 10));
        g2d.fill( new Rectangle2D.Double(130, 110, 10, 20));
        g2d.fill( new Rectangle2D.Double(120, 100, 60, 10));
        g2d.fill( new Rectangle2D.Double(110, 90, 10, 10));
        g2d.fill( new Rectangle2D.Double(100, 80, 10, 10));
        g2d.fill( new Rectangle2D.Double(90, 90, 10, 10));
        g2d.fill( new Rectangle2D.Double(80, 100, 10, 50));
        g2d.fill( new Rectangle2D.Double(100, 110, 10, 20));
        g2d.fill( new Rectangle2D.Double(310, 310, 10, 40));
        g2d.fill( new Rectangle2D.Double(320, 350, 10, 40));
        g2d.fill( new Rectangle2D.Double(330, 390, 10, 30));
        //patita derecha
        g2d.fill( new Rectangle2D.Double(310, 420, 40, 10));
        g2d.setPaint(new GradientPaint(5, 30, Color.BLUE, 35, 100,
                        Color.WHITE, true));
        g2d.fill( new Rectangle2D.Double(310, 430, 40, 10));
        g2d.fill( new Rectangle2D.Double(300, 440, 60, 40));
        g2d.fill( new Rectangle2D.Double(310, 480, 40, 10));
         g2d.setPaint( Color.BLACK);
        g2d.fill( new Rectangle2D.Double(300, 430, 10, 10));
        g2d.fill( new Rectangle2D.Double(350, 430, 10, 10));
        g2d.fill( new Rectangle2D.Double(360, 440, 10, 40));
        g2d.fill( new Rectangle2D.Double(350, 480, 10, 10));
        g2d.fill( new Rectangle2D.Double(310, 490, 40, 10));
        g2d.fill( new Rectangle2D.Double(300, 480, 10, 10));
        g2d.fill( new Rectangle2D.Double(290, 440, 10, 40));
        //
        g2d.fill( new Rectangle2D.Double(260, 460, 30, 10));
        g2d.setPaint(new GradientPaint(5, 30, Color.BLUE, 35, 100,
                        Color.WHITE, true));
        g2d.fill( new Rectangle2D.Double(220, 460, 40, 10));
        g2d.fill( new Rectangle2D.Double(170, 460, 40, 10));
        g2d.setPaint( Color.BLACK);
        g2d.fill( new Rectangle2D.Double(270, 430, 10, 30));
        g2d.fill( new Rectangle2D.Double(280, 400, 10, 30));
        g2d.fill( new Rectangle2D.Double(290, 380, 10, 20));
        g2d.fill( new Rectangle2D.Double(160, 450, 110, 10));
        g2d.fill( new Rectangle2D.Double(210, 400, 10, 80));
        g2d.fill( new Rectangle2D.Double(170, 470, 90, 10));
        g2d.fill( new Rectangle2D.Double(160, 460, 10, 10));
        g2d.fill( new Rectangle2D.Double(150, 430, 10, 30));
        g2d.fill( new Rectangle2D.Double(140, 390, 10, 40));
        g2d.fill( new Rectangle2D.Double(130, 370, 10, 20));
        g2d.fill( new Rectangle2D.Double(130, 420, 10, 30));
        g2d.fill( new Rectangle2D.Double(130, 450, 20, 10));
        g2d.fill( new Rectangle2D.Double(120, 410, 10, 10));
        //Patita izquierda
        g2d.fill( new Rectangle2D.Double(80, 400, 40, 10));
        g2d.setPaint(new GradientPaint(5, 30, Color.BLUE, 35, 100,
                        Color.WHITE, true));
        g2d.fill( new Rectangle2D.Double(80, 410, 40, 10));
        g2d.fill( new Rectangle2D.Double(70, 420, 60, 40));
        g2d.fill( new Rectangle2D.Double(80, 460, 40, 10));
         g2d.setPaint( Color.BLACK);
        g2d.fill( new Rectangle2D.Double(70, 410, 10, 10));
        g2d.fill( new Rectangle2D.Double(60, 420, 10, 40));
        g2d.fill( new Rectangle2D.Double(70, 460, 10, 10));
        g2d.fill( new Rectangle2D.Double(80, 470, 40, 10));
        g2d.fill( new Rectangle2D.Double(120, 460, 10, 10));
        g2d.fill( new Rectangle2D.Double(90, 390, 10, 10));
        g2d.fill( new Rectangle2D.Double(100, 370, 10, 30));
        g2d.fill( new Rectangle2D.Double(110, 340, 10, 30));
         g2d.fill( new Rectangle2D.Double(120, 310, 10, 30));
         //0jos
         //g2d.fill( new Rectangle2D.Double(160, 220, 30, 10));
          g2d.fill( new Rectangle2D.Double(160, 200, 30, 40));
          g2d.setPaint( Color.WHITE);
          g2d.fill( new Rectangle2D.Double(160, 210, 10, 10));
          g2d.setPaint( Color.BLACK);
          g2d.fill( new Rectangle2D.Double(240, 200, 30, 40));
          g2d.setPaint( Color.WHITE);
          g2d.fill( new Rectangle2D.Double(240, 210, 10, 10));
          g2d.setPaint( Color.BLACK);
          g2d.fill( new Rectangle2D.Double(190, 270, 10, 10));
          g2d.fill( new Rectangle2D.Double(240, 270, 10, 10));
          //
        
        
        //cuadros 
        g2d.setColor(Color.red);
        g2d.fill(r1);
        g2d.fill(r8);
         
        AlphaComposite ac = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.5f);
        g2d.setColor(Color.green);
        g2d.setComposite(ac);
        g2d.fill(r2);
        g2d.fill(r6);
        
        ac = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1.0f);
        g2d.setColor(Color.magenta);
        g2d.setComposite(ac);
        g2d.fill(r3);
        ac = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1.0f);
        g2d.setColor(Color.blue);
        g2d.fill(r7);
        
        ac = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.8f);
        g2d.setColor(Color.yellow);
        g2d.setComposite(ac);
        g2d.fill(r4);
        g2d.fill(r5);
        //pastito
        //dibujar arco 2D en forma de pastel, en color blanco
        g2d.setPaint( Color.GREEN);
        g2d.setStroke( new BasicStroke( 6.0f));
        g2d.draw( new Arc2D.Double( 10, 520, 75, 100, 0, 45, Arc2D.PIE));
        g2d.draw( new Arc2D.Double( 40, 520, 75, 100, 0, 45, Arc2D.PIE));
        g2d.draw( new Arc2D.Double( 70, 520, 75, 100, 0, 45, Arc2D.PIE));
        g2d.draw( new Arc2D.Double( 110, 520, 75, 100, 0, 45, Arc2D.PIE));
        g2d.draw( new Arc2D.Double( 140, 520, 75, 100, 0, 45, Arc2D.PIE));
        g2d.draw( new Arc2D.Double( 170, 520, 75, 100, 0, 45, Arc2D.PIE));
        g2d.draw( new Arc2D.Double( 210, 520, 75, 100, 0, 45, Arc2D.PIE));
        g2d.draw( new Arc2D.Double( 240, 520, 75, 100, 0, 45, Arc2D.PIE));
        g2d.draw( new Arc2D.Double( 270, 520, 75, 100, 0, 45, Arc2D.PIE));
        g2d.draw( new Arc2D.Double( 310, 520, 75, 100, 0, 45, Arc2D.PIE));
        g2d.draw( new Arc2D.Double( 340, 520, 75, 100, 0, 45, Arc2D.PIE));
        g2d.draw( new Arc2D.Double( 370, 520, 75, 100, 0, 45, Arc2D.PIE));
        g2d.draw( new Arc2D.Double( 410, 520, 75, 100, 0, 45, Arc2D.PIE));
        //flor
        g2d.setPaint(new Color(245,0,128));
        g2d.fill (new Ellipse2D.Double( 460, 482, 15, 15));
        g2d.fill (new Ellipse2D.Double( 450, 410, 30, 70));
        g2d.fill (new Ellipse2D.Double( 387, 480, 70, 30));
        g2d.fill (new Ellipse2D.Double( 450, 500, 30, 70));
        g2d.fill (new Ellipse2D.Double( 478, 480, 70, 30));
         /** Titulo  */
        g2d.setColor( Color.BLACK );
        g2d.setFont( new Font( " Harrington", Font.BOLD, 26 ) );
        g2d.drawString( "U N I C O R N I O", 50, 600 );
     
        //lineas 
        g2d.setStroke(new BasicStroke(3.0f));
        g2d.drawLine(20,20,550,20);
        g2d.drawLine(20,650,550,650);
        //
        
      }
      public static void main (String[]args){
        JFrame jframe= new JFrame("Dibujito");
        jframe.setDefaultCloseOperation(jframe.EXIT_ON_CLOSE);
        jframe.add(new Dibujo());
        jframe.setSize(600,900);
        jframe.setLocationRelativeTo(null);
        jframe.setVisible(true);
    }
    }

