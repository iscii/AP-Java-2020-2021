// ________________________________________________

import java.awt.*;
import javax.swing.*;

public class Main extends JPanel
{
  // Declare skyColor:
  // ________________________________________________
  Color skyColor = new Color(0, 255, 255);

  public Main()
  {
    setBackground(skyColor);
  }

  // Draws the rainbow.
  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);
    int width = getWidth();    
    int height = getHeight();

    // Declare and initialize local int variables xCenter, yCenter
    // that represent the center of the rainbow rings:
    // ________________________________________________
    int xCenter = width/2;
    int yCenter = height/2;
 
    // Declare and initialize the radius of the large semicircle:
    // ________________________________________________
    int rad = 200;

    g.setColor(Color.RED);

    // Draw the large semicircle:
    // g.fillArc( ______________ );
    // Declare and initialize the radii of the small and medium
    // semicircles and draw them:
    // ________________________________________________
    g.fillArc(xCenter-rad/2, yCenter-rad/2+40, rad, rad, 0, 180);
    
    // Calculate the radius of the innermost (sky-color) semicircle
    // so that the width of the middle (green) ring is the
    // arithmetic mean of the widths of the red and magenta rings:
    // ________________________________________________
    rad-=40;
    g.setColor(Color.GREEN);

    g.fillArc(xCenter-rad/2, yCenter-rad/2+40, rad, rad, 0, 180);
    rad-=40;
    g.setColor(Color.PINK);

    g.fillArc(xCenter-rad/2, yCenter-rad/2+40, rad, rad, 0, 180);
    
    // Draw the sky-color semicircle:
    // ________________________________________________
    rad-=40;
    g.setColor(Color.CYAN);
    
    g.fillArc(xCenter-rad/2, yCenter-rad/2+40, rad, rad, 0, 180);
}

  public static void main(String[] args)
  {
    JFrame w = new JFrame("Rainbow");
    w.setBounds(300, 300, 300, 200);
    w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container c = w.getContentPane();
    c.add(new Main());
    w.setVisible(true);
  }
}