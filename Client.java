import javax.swing.*;
public class Client extends JApplet {
    public Client() { }
    
    public static void main(String[] args) {
        Client c = new Client();
        JFrame frame = new JFrame("MICT v0.0");
        frame.setContentPane(c.getContentPane());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);


    }
}