/**
 * Created by barabepierre on 04/01/2017.
 */
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {
    public Main() {
        this.setTitle("Abstract Factory");
        this.setSize(500, 250);
        this.setLocation(350,300);

        JPanel P = new JPanel();

        JComboBox<Choice> CB_Choice = new JComboBox<>(Choice.values());
        P.add(CB_Choice);

        JButton myBtn = new MarioTheme().createButton();
        P.add(myBtn);

        CB_Choice.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton myBtn;
                if (CB_Choice.getSelectedItem() == Choice.Mario) {
                    myBtn = new MarioTheme().createButton();
                } else {
                    myBtn = new StarWarsTheme().createButton();
                }

                P.remove(1);
                P.add(myBtn);
                P.repaint();
                P.revalidate();
                ;
            }
        });

        this.setContentPane(P);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        JFrame frame = new Main();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}
