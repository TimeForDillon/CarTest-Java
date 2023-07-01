package Car;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

/**
   This component draws two car shapes.
*/
public class CarComponent extends JComponent
{  
   public void paintComponent(Graphics g)
   {  
      Graphics2D g2 = (Graphics2D) g;

      Car car1 = new Car(0, 0);    
      Car car2 = new Car(60, 0);
      Car car3 = new Car(120, 0);
      Car car4 = new Car(15, 15);

      g2.setColor(Color.yellow);
      car1.draw(g2);
      g2.setColor(Color.red);
      car2.draw(g2);
      g2.setColor(Color.white);
      car3.draw(g2);
      g2.setColor(Color.black);

      g2.scale(2, 2);
      car4.draw(g2);
   }
}