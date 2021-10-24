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
    public void keyTyped(KeyEvent e) { }

    @Override
    public void keyPressed(KeyEvent e) {
        int KeyCode = e.getKeyCode();

        if(KeyCode == KeyEvent.VK_W ) {
            player.Up();

        }
        else if(KeyCode == KeyEvent.VK_S ) {
            player.Down();

        }

        else if(KeyCode == KeyEvent.VK_A ) {
            player.Left();

        }
        else{
            player.Right();

        }
    }

    @Override
    public void keyReleased(KeyEvent e) { }

    public Snake getPlayer() {
        return player;
    }

    public void setPlayer(Snake player) {
        this.player = player;
    }

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    public JFrame getWindow() {
        return window;
    }

    public void setWindow(JFrame window) {
        this.window = window;
    }
}
