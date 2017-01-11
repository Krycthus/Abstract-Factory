/**
 * Created by barabepierre on 04/01/2017.
 */
import javax.swing.*;

public class StarWarsTheme implements IThemeFactory
{
    @Override
    public JButton createButton() {
        return new StarWarsThemeButton();
    }
}
