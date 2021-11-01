
import java.awt.Color;
import java.awt.Rectangle;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.Timer;

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

    //Setting the colors for the game
    public void PaintComponent(java.awt.Graphics g){
        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;

        g2d.setColor(Color.black);
        g2d.fillRect(0,0, Game.width * Game.dimension, Game.height * Game.dimension);

        if(state == "Start"){
            g2d.setColor(Color.white);
            g2d.drawString("Press Any Key", Game.width/ 2 * Game.dimension - 40, Game.height / 2 * Game.dimension -20);
        }
        else if (state == "Running"){
            g2d.setColor(Color.red);
            g2d.fillRect(food.getXFoodPos()* Game.dimension,food.getYFoodPos() * Game.dimension, Game.dimension, Game.dimension);

            g2d.setColor(Color.blue);
            for(Rectangle rectangle: snake.getSnakeBody()) {
                g2d.fill(rectangle);
            }
        }
        else{
            g2d.setColor(Color.white);
            g2d.drawString("Your score:" + (snake.getSnakeBody().size()-3), Game.width/ 2 * Game.dimension - 40, Game.height / 2 * Game.dimension -20);

        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
        game.update();


    }
}
