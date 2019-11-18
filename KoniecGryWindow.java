import javax.swing.*;
import java.awt.*;

public class KoniecGryWindow extends JFrame {

    private JButton nowaGraButton;
    private JButton menuButton;
    private JLabel koniecGry;
    private JLabel wynikInfo;

    public KoniecGryWindow(int wynik)
    {
        nowaGraButton = new JButton("Nowa gra");
        menuButton = new JButton("Menu");
        koniecGry = new JLabel("Game Over", JLabel.CENTER);
        wynikInfo = new JLabel("Wynik:" + String.valueOf(wynik), JLabel.CENTER);


        JPanel southPanel = new JPanel();
        southPanel.add(nowaGraButton);
        southPanel.add(menuButton);

        this.setLayout(new BorderLayout());
        this.add(koniecGry, BorderLayout.NORTH);
        this.add(wynikInfo, BorderLayout.CENTER);
        this.add(southPanel, BorderLayout.SOUTH);

        this.setLocationRelativeTo(null);

        pack();




    }
}
