import javax.swing.*;

public class Game {

    private Snake player;
    private Food food;
    private Graphics graphics;

    private JFrame window;

    public static final int width = 20;
    public static final int height = 20;
    public static final int dimension = 20;

    public Game() {
        window = new JFrame();

        window.setTitle("Snake");
        window.setSize(width * dimension, height * dimension);
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
