import javax.swing.*;
import javax.swing.Timer;

import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Graphics
extends JPanel
implements ActionListener {
    private  Timer t = new Timer(100,this);
    public String state;

    private Snake s;
    private Food f;
    private Game game;

    public Graphics(Game g) {
        t.start();
        state = "Start";

        game = g;
        s = game.getPlayer();
        f = game.getFood();

        this.addKeyListener(g);
        this.setFocusable(true);
        this.setFocusTraversalKeysEnabled(false);
    }

    public void PaintComponent(java.awt.Graphics g){
        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();

    }
}
