import javax.swing.*;
import java.awt.*;

public class TextField extends JTextField {
    TextField() {
        this.setBounds(50, 25, 300, 50);
        this.setFont(Main.myfont);
        this.setEditable(false);
        this.setBackground(Color.white);
    }
}
