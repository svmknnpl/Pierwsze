import javax.swing.*;
import java.awt.*;

public class AnimacjaWindow extends JFrame{

    private  AnimacjaComponent poleAnimacja;
    private JButton pauseButton;
    private JButton wynikiButton;
    private JButton wyjscieButton;

    private JLabel nickLabel;
    private JLabel levelLabel;
    private JLabel punktyLabel;






    public AnimacjaWindow(String newName, int poziom, int punkty) {

        JPanel eastPanel = new JPanel();
        JPanel scorePanel = new JPanel();

        poleAnimacja = new AnimacjaComponent();

        pauseButton = new JButton("Pauza");
        wynikiButton = new JButton("Wyniki");
        wyjscieButton = new JButton("Wyjscie");

        scorePanel.setLayout(new GridLayout(2,3));
        scorePanel.add(new Label("nick:"));
        scorePanel.add(new Label("level:"));
        scorePanel.add(new Label("punkty:"));

        nickLabel = new JLabel(newName);
        levelLabel = new JLabel(String.valueOf(poziom));
        punktyLabel = new JLabel(String.valueOf(punkty));


        scorePanel.add(nickLabel);
        scorePanel.add(levelLabel);
        scorePanel.add(punktyLabel);
        scorePanel.getSize();


        scorePanel.setMinimumSize(new Dimension(100, 50));
        scorePanel.setMaximumSize(new Dimension(100, 50));
        scorePanel.setPreferredSize(new Dimension(100, 50));

        eastPanel.setLayout(new BorderLayout());

        eastPanel.add(scorePanel, BorderLayout.NORTH);



        // //System.out.println(pauseButton.getPreferredSize().width + " " + pauseButton.getPreferredSize().height);

        JPanel buttonPanel = new JPanel();
        GridLayout grid = new GridLayout(3,1);
        grid.setVgap(5);
        buttonPanel.setLayout(grid);
        buttonPanel.add(pauseButton);
        buttonPanel.add(wynikiButton);
        buttonPanel.add(wyjscieButton);

        int maxHgrid = 3 * pauseButton.getHeight() + grid.getVgap();

        //.setMinimumSize(new Dimension(100, 50));
        buttonPanel.setMaximumSize(new Dimension(100, maxHgrid));
        buttonPanel.setMinimumSize(new Dimension(100, maxHgrid));
        buttonPanel.setPreferredSize(new Dimension(100, maxHgrid));


        eastPanel.add(buttonPanel, BorderLayout.CENTER);
        eastPanel.add(new JPanel(), BorderLayout.SOUTH);

        this.setLayout(new BorderLayout());
        this.add(poleAnimacja, BorderLayout.WEST);
        this.add(eastPanel, BorderLayout.EAST);

        this.setLocationRelativeTo(null);

        pack();






    }


}

