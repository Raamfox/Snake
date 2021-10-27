import javax.swing.JFrame;

import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

public class Game
implements KeyListener{
    private Snake player;
    private Food food;
    private Graphics graphics;

    private JFrame window;

    public static final int width = 40;
    public static final int height = 40;
    public static final int dimension = 20;

    //Creating JFrame and setting Dimensions for the Applet
    
    public Game() {
        window = new JFrame();

        player = new Snake();
        food = new Food(player);
        graphics = new Graphics(this);

        window.add(graphics);


        window.setTitle("Snake");
        window.setSize(width * dimension +2, height * dimension + dimension + 4);
        window.setVisible(true);
        window.setResizable(false);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public void start() {
        graphics.state = "Running";
    }

    public void update () {
        if(graphics.state.equals("Running")) {
            if(checkFoodCollision()){
                player.grow();
                food.randomSpawn(player);
            }
            else if (checkWallCollision() || checkSelfCollision()) {
                graphics.state = "End";
            }
            else {
                player.move();
            }
        }
    }

    private boolean checkWallCollision(){
        if(player.getX() < 0 || player.getX() >= width * dimension
                || player.getY() <0 || player.getY() >= height * dimension){
            return true;
        }
        return false;
    }

    private boolean checkFoodCollision(){
        if(player.getX() == food.getX() * dimension && player.getY() == food.getY() * dimension){
            return true;
        }
        return false;
    }

    private boolean checkSelfCollision(){
        for(int i = 1; i < player.getSnakeBody().size();++i){
            if(player.getX() == player.getSnakeBody().get(i).x && player.getY() == player.getSnakeBody().get(i).y){
                return true;
            }
        }
        return false;
    }

    @Override
    public void keyTyped(KeyEvent e) { }

    //Initializing player input
    @Override
    public void keyPressed(KeyEvent e) {
        int KeyCode = e.getKeyCode();

        if(graphics.state.equals("Running")) {
            if (KeyCode == KeyEvent.VK_W && !player.getMove().equals("Down")) {
                player.Up();
            }
             if (KeyCode == KeyEvent.VK_S && !player.getMove().equals("Up")) {
                 player.Down();
             }
             if (KeyCode == KeyEvent.VK_A && !player.getMove().equals("Right")) {
                 player.Left();
             }
             if (KeyCode == KeyEvent.VK_D && !player.getMove().equals("Left")){
                player.Right();
            }
        }
        else {
            this.start();
        }
    }



    @Override
    public void keyReleased(KeyEvent e) { }

    //Getters and setters
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
