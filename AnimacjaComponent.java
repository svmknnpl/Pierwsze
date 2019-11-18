import javax.swing.*;
import java.awt.*;

public class AnimacjaComponent extends JComponent {

    final int WIDTH = 200;
    final int HEIGHT = 400;

    public AnimacjaComponent(){








    }
// metoda pack okna wywoluje metoe getPreferred size dla kazdej kontrolki dlatego musimy zrobic swoja metdoe
    @Override
    public Dimension getPreferredSize() {
        return new Dimension(WIDTH, HEIGHT);
    }
}
