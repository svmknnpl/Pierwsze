import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuWindow extends JFrame {
    //final int WIDTH = 300;
    //final int HEIGHT = 200;


    private JLabel nazwaGry;
    private JButton newGameButton;
    private JButton wynikiButton;
    private JButton tworcyButton;
    private JButton wyjscieButton;




    public MenuWindow() {

        setSize(WIDTH, HEIGHT);
        setTitle("Menu");

        nazwaGry = new JLabel("Tetris", JLabel.CENTER);
        nazwaGry.setFont(new Font("Monospaced", Font.ITALIC, 15));
        newGameButton = new JButton("Nowa gra");
        wynikiButton = new JButton("Wyniki");
        tworcyButton = new JButton("Tworcy");
        wyjscieButton = new JButton("Wyjscie");

        setLayout(new GridLayout(5, 1));
        JPanel panel = new JPanel();
        panel.add(newGameButton);

        JPanel panel2 = new JPanel();
        panel2.add(wynikiButton);

        JPanel panel3 = new JPanel();
        panel3.add(tworcyButton);

        JPanel panel4 = new JPanel();
        panel4.add(wyjscieButton);






        add(nazwaGry);
        add(panel);
        add(panel2);
        add(panel3);
        add(panel4);

        pack();

        this.setLocationRelativeTo(null);











        newGameButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MenuWindow.this.setVisible(false);
                NowaGraWindow nowaGra = new NowaGraWindow();
                nowaGra.setVisible(true);

            }
        });

        wynikiButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("a");

            }
        });

        tworcyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("a");

            }
        });

        wyjscieButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("wyjscie");

            }
        });



/*
        ActionListener wynikiAction = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("bbb");

            }
        };
        wynikiButton.addActionListener(wynikiAction);

        class TworcyAction implements ActionListener
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("ccc");

            }

        };
        tworcyButton.addActionListener(new TworcyAction());


 */







    }
















}
