import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel {
    Panel() {
        this.setBounds(50, 100, 300, 300);
        this.setLayout(new GridLayout(4, 4, 10, 10));
    }
}
