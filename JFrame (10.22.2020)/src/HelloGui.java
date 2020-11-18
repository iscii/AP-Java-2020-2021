import java.awt.*;
import javax.swing.*;
public class HelloGui extends JFrame
{
  public HelloGui()   // Constructor
  {
    super("GUI Demo");    // Set the title bar
    Container c = getContentPane();
    c.setBackground(Color.RED);
    c.setLayout(new FlowLayout());
    c.add(new JTextField("I love this class!", 10));
  }
}