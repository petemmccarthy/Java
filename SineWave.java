import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class SineWave
{
    public static void main ( String[] args )
    {
      SineFrame frame = new SineFrame();
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
    }
}

/**
  A frame with a message panel
*/
class SineFrame extends JFrame
{
    public SineFrame()
    {
      setTitle("SineTest");
      setSize(WIDTH,HEIGHT);

      // add panel to frame
      SinePanel panel = new SinePanel();
      Container contentPane = getContentPane();
      conetentPane.add(panel);
    }

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
}

/**
  A panel that shows a sine wave
*/
class SinePanel extends JPanel
{
  
}








