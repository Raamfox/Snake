import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class Game
        implements KeyListener {
    private Snake player;
    private Food food;
    private Graphics graphics;

    private JFrame window;

    public static final int width = 40;
    public static final int height = 40;
    public static final int dimension = 20;

    public Game() {
        window = new JFrame();

        player = new Snake();

        food = new Food(player);

        graphics = new Graphics(this);

        window.add(graphics);

        window.setTitle("Snake");
        window.setSize(width * dimension + 2, height * dimension + dimension + 4);//how does dimensions work in JFrame
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void start() {
        graphics.state = "Running";
    }

    public void update() {
        if(graphics.state == "Running") {
            if(check_food_collision()) {
                player.grow();
                food.random_spawn(player);
            }
            else if(check_wall_collision() || check_self_collision()) {
                graphics.state = "End";
            }
            else {
                player.move();
            }
        }
    }

    //make unit test here
    private boolean check_wall_collision() {
        if(player.getX() < 0 || player.getX() >= width * dimension
                || player.getY() < 0|| player.getY() >= height * dimension) {
            return true;
        }
        return false;
    }

    //make unit test here
    private boolean check_food_collision() {
        if(player.getX() == food.getX() * dimension && player.getY() == food.getY() * dimension) {
            return true;
        }
        return false;
    }

    //make unit test here
    private boolean check_self_collision() {
        for(int i = 1; i < player.getBody().size(); i++) {
            if(player.getX() == player.getBody().get(i).x &&
                    player.getY() == player.getBody().get(i).y) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void keyTyped(KeyEvent e) {	}

    @Override
    public void keyPressed(KeyEvent e) {

        int keyCode = e.getKeyCode();

        if(graphics.state == "Running") {
            if(keyCode == KeyEvent.VK_W && player.getMove() != "Down") {
                player.up();
            }

            if(keyCode == KeyEvent.VK_S && player.getMove() != "Up") {
                player.down();
            }

            if(keyCode == KeyEvent.VK_A && player.getMove() != "Right") {
                player.left();
            }

            if(keyCode == KeyEvent.VK_D && player.getMove() != "Left") {
                player.right();
            }
        }
        else {
            this.start();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {	}

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