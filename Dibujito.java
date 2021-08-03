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

// Autor Nancy Yesenia Ojeda Perez 
public class Dibujito extends JPanel
{
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        
        Graphics2D g2d=(Graphics2D)g;
        
        g2d.setColor(Color.WHITE);
        setBackground(Color.BLACK);
        //gd.setColor(Color.ORANGE);
        
        Dimension size= getSize();
        Insets insets= getInsets();
        int w = size.width - insets.left - insets.right;
        int h = size.height - insets.top - insets.bottom;
        
        Random r= new Random();
        for(int i=0;i<800;i++){
            int x= Math.abs(r.nextInt())%w;
            int y= Math.abs(r.nextInt())%h;
            g2d.drawLine(x, y, x, y);
        }
        
        float [] dash4 = { 4f, 4f, 1f };
        BasicStroke bs4= new BasicStroke (1,BasicStroke.CAP_BUTT,
        BasicStroke.JOIN_ROUND, 1.0f, dash4,2f);
        g2d.setColor(Color.YELLOW);
        g2d.setStroke(bs4);
        g2d.drawLine(20,20,250,20);
        g2d.drawLine(470,20,250,20);
        g2d.drawLine(20,430,250,430);
        g2d.drawLine(470,430,250,430);
        //g2d.setColor(Color.WHITE);
        //g2d.fill (new Ellipse2D.Double( 5, 30, 90, 100));
        
        g2d.setPaint( Color.RED);
        g2d.setStroke(new BasicStroke(10.0f));
        g2d.draw( new Rectangle2D.Double(241, 375, 10, 10));
        
        float [] dash1 = { 3f, 0f, 2f };
        BasicStroke bs1= new BasicStroke (1,BasicStroke.CAP_BUTT,
        BasicStroke.JOIN_ROUND, 1.0f, dash1,2f);
        g2d.setStroke(bs1);
        g2d.drawLine(410,380,250,380);
        //dibujar arco 2D en forma de pastel, en color blanco
        g2d.setPaint( Color.WHITE);
        g2d.setStroke( new BasicStroke( 6.0f));
        g2d.draw( new Arc2D.Double( 300, 300, 90, 100, 0, 180, Arc2D.PIE));
        //
        g2d.setPaint( Color.GREEN);
        g2d.setStroke(new BasicStroke(10.0f));
        g2d.draw( new Rectangle2D.Double(340, 358, 20, 10));
        //
         //g2d.setPaint( Color.WHITE);
         g2d.setPaint(new GradientPaint(5, 30, Color.GREEN, 35, 100,
                        Color.WHITE, true));
        g2d.fill (new Ellipse2D.Double( 50, 350, 50,50 ));
        //g2d.fill (new Ellipse2D.Double( 200, 50, 50,5 ));
        
        g2d.fill (new Ellipse2D.Double(10, 350, 50,50 ));
         g2d.fill (new Ellipse2D.Double( 90, 350, 50,50 ));
          g2d.fill (new Ellipse2D.Double( 125, 350, 50,50 ));
          g2d.fill (new Ellipse2D.Double( 165, 345, 70,70 ));
          g2d.setPaint( Color.BLACK);
          g2d.fill (new Ellipse2D.Double( 188, 366, 10,10 ));
          g2d.fill (new Ellipse2D.Double( 188, 390, 10,10 ));
        //
        g2d.setPaint( Color.WHITE);
        g2d.setStroke(new BasicStroke(10.0f));
        g2d.fill( new Rectangle2D.Double(270, 150, 10, 10));
        
        //g2d.setPaint( Color.WHITE);
        g2d.setPaint(new GradientPaint(5, 30, Color.BLUE, 35, 100,
                        Color.YELLOW, true));
        g2d.setStroke( new BasicStroke( 6.0f));
        g2d.draw( new Arc2D.Double( 225, 89, 90, 100, 30, 100, Arc2D.PIE));
        g2d.setStroke( new BasicStroke( 6.0f));
        
        g2d.draw( new Arc2D.Double( 215, 100, 90, 100, 125, 70, Arc2D.PIE));
        g2d.draw( new Arc2D.Double( 248, 100, 90, 100, 345, 60, Arc2D.PIE));
        g2d.draw( new Arc2D.Double( 237, 116, 90, 100, 290, 60, Arc2D.PIE));
        //
        g2d.setPaint(new GradientPaint(5, 30, Color.PINK, 35, 100,
                        Color.BLUE, true));
        g2d.draw( new Arc2D.Double( 70, 170, 90, 100, 0, 360, Arc2D.PIE));
        g2d.draw( new Arc2D.Double( 140, 170, 90, 100, 0, 360, Arc2D.PIE));
        g2d.draw( new Arc2D.Double( 100, 190, 90, 100, 0, 360, Arc2D.PIE));
        //
        
         ///
        //dibujar rectangulo 2D redondeado con fondo tamponado
        BufferedImage buffImage = new BufferedImage (10,10, BufferedImage.TYPE_INT_RGB);
        
        Graphics2D gg = buffImage.createGraphics();
        gg.setColor( Color.YELLOW); //dibujar en amarillo
        gg.fillRect( 0, 0, 10, 10); //dibujar un rectangulo relleno
        gg.setColor( Color.BLACK); //dibujar en negro
        gg.drawRect( 1, 1, 6, 6); //dibujar un rectangulo 
        gg.setColor( Color.BLUE); //dibujar en azul
        gg.fillRect( 1, 1, 3, 3); //dibujar un rectangulo relleno
        gg.setColor( Color.RED); //dibujar en rojo
        gg.fillRect( 4, 4, 3, 3); //dibujar un rectangulo relleno
        //pintar buffImage en el objeto JFrame
        g2d.setPaint( new TexturePaint( buffImage, new Rectangle( 10,10)));
        g2d.fill( new RoundRectangle2D.Double( 370, 100, 75, 100, 150, 40));
    }
    public static void main (String[]args){
        JFrame jframe= new JFrame("Dibujito");
        jframe.setDefaultCloseOperation(jframe.EXIT_ON_CLOSE);
        jframe.add(new Dibujito());
        jframe.setSize(500,500);
        jframe.setLocationRelativeTo(null);
        jframe.setVisible(true);
    }
}
