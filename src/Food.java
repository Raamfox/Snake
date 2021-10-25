import java.awt.Rectangle;

public class Food {


    private int x;
    private int y;


    public Food (Snake player) {
        this.randomSpawn(player);

    }

    //initializing random spawn for food
    public void randomSpawn(Snake player) {

       boolean onSnake = false;
       while (!onSnake) {
           x = (int)(Math.random() * Game.width);
           y = (int)(Math.random() * Game.height);

           for (Rectangle rectangle : player.getSnakeBody()){
               if (rectangle.x == x && rectangle.y == y) {
                   onSnake = true;
               }
           }
       }
    }
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
