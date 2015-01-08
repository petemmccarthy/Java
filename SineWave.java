import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class SineWave
{
    public static void main ( String[] args )
    {
      SineFrame frame = new SineFrame();
      frame.setDefaultCloseOperatioin(JFrame.EXIT_ON_CLOSE);
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
    }
}