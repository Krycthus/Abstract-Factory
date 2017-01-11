/**
 * Created by barabepierre on 09/01/2017.
 */
import javax.swing.*;
import java.awt.*;

public class MarioThemeButton extends JButton{

    public MarioThemeButton(){
        super("Mario");
        this.setBackground(Color.RED);
        this.setContentAreaFilled(false);
        this.setOpaque(true);
    }
}