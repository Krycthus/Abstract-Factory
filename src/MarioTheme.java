/**
 * Created by barabepierre on 09/01/2017.
 */
import javax.swing.*;

public class MarioTheme extends JButton implements IThemeFactory{

    @Override
    public JButton createButton() {
        return new MarioThemeButton();
    }
}