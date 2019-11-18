import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NowaGraWindow extends JFrame{

    //final static int WIDTH = 300;
    //final static int HEIGHT = 200;
    private JLabel pole;
    private JTextField nick;
    private JButton grajButton;
    private JButton wyjdzButton;


    public NowaGraWindow() {
        //setSize(WIDTH, HEIGHT);
        setTitle("Nazwa Gracza");

        pole = new JLabel("Nick :");
        nick = new JTextField(20);
        grajButton = new JButton("Graj");
        wyjdzButton = new JButton("Wyjdz");

        JPanel northPanel = new JPanel();
        northPanel.add(pole);
        northPanel.add(nick);


        JPanel southPanel = new JPanel();
        southPanel.add(grajButton);
        southPanel.add(wyjdzButton);

        this.setLayout(new BorderLayout());
        this.add(northPanel, BorderLayout.NORTH);
        this.add(southPanel, BorderLayout.SOUTH);

        grajButton.addActionListener(new ActionListener() {
            @Override// this - wskaznik na obiekt klasy AL (te e), bo NowaGraWindow.this to wkasznik na aktualny obiekt klasy nowa gra
            public void actionPerformed(ActionEvent e) {
                NowaGraWindow.this.setVisible(false );
                String nazwa = NowaGraWindow.this.getNick();
                AnimacjaWindow nowaGra = new AnimacjaWindow(nazwa, 2, 1259);
                nowaGra.setVisible(true);
            }
        });


        pack();
        this.setLocationRelativeTo(null);

    }

    public String getNick() {
        return nick.getText();
    }





}
