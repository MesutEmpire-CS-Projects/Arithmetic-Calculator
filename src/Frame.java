import javax.swing.*;

public class Frame extends JFrame {
    Frame() {
        super("Calculator");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(420, 550);
        this.setLayout(null);

        //create image icon
        ImageIcon image = new ImageIcon("../assets/calculator-icon-1.png");
        this.setIconImage(image.getImage());
    }
}
