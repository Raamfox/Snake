import javax.swing.JPanel;
import javax.swing.Timer;

import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Graphics
extends JPanel
implements ActionListener {
    private  Timer timer = new Timer(100,this);
    public String state;

    private Snake snake;
    private Food food;
    private Game game;

    public Graphics(Game g) {
        timer.start();
        state = "Start";

        game = g;
        snake = game.getPlayer();
        food = game.getFood();

        this.addKeyListener(g);
        this.setFocusable(true);
        this.setFocusTraversalKeysEnabled(false);
    }

    //repaint every time you move
    public void PaintComponent(java.awt.Graphics g){
        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;

        g2d
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();

    }
}
