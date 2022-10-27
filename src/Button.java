import javax.swing.*;

public class Button extends JButton {
    Button(String operator) {
        super(operator);
//        this.addActionListener();
        this.setFont(Main.myfont);
        this.setFocusable(false);
    }
}
