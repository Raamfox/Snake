import javax.swing.*;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

public class Game
implements KeyListener{
    private Snake player;
    private Food food;
    private Graphics graphics;

    private JFrame window;

    public static final int width = 20;
    public static final int height = 20;
    public static final int dimension = 20;

    //Creating JFrame and setting Dimensions for the Applet
    
    public Game() {
        window = new JFrame();

        window.setTitle("Snake");
        window.setSize(width * dimension, height * dimension);
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    @Override
    public void keyTyped(KeyEvent e) {
        
    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
