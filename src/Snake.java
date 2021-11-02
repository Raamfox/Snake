import java.awt.Rectangle;
import java.util.ArrayList;

public class Snake {
    private ArrayList<Rectangle> snakeBody;

    private int gameWidth = Game.width;
    private int gameHeight = Game.height;
    private int gameDimension = Game.dimension;

    public String move;

    //initialize Snake
    //Setting starting point for snake

    public Snake () {
        snakeBody = new ArrayList<>();

        Rectangle temp = new Rectangle(Game.dimension, Game.dimension);
        temp.setLocation(Game.width / 2 * Game.dimension, Game.height / 2 * Game.dimension);
        snakeBody.add(temp);

        temp = new Rectangle(gameDimension, gameDimension);
        temp.setLocation((gameWidth / 2 - 1) * gameDimension, (gameHeight / 2 ) * gameDimension);
        snakeBody.add(temp);

        temp = new Rectangle(gameDimension, gameDimension);
        temp.setLocation((gameWidth / 2 - 2) * gameDimension, (gameHeight / 2 ) * gameDimension);
        snakeBody.add(temp);

        move = "Nothing";
    }

    //Move function
    public void move () {
        if(!move.equals("Nothing")){
            Rectangle first = snakeBody.get(0);
            Rectangle temp = new Rectangle(Game.dimension, Game.dimension);

            if(move.equals("Up")){
                temp.setLocation(first.x, first.y - Game.dimension);
            }
            else if(move.equals("Down")) {
                temp.setLocation(first.x, first.y + Game.dimension);
            }
            else if(move.equals("Left")) {
                temp.setLocation(first.x - Game.dimension, first.y);
            }
            else{
                temp.setLocation(first.x + Game.dimension, first.y);
            }

            snakeBody.add(0, temp);
            snakeBody.remove(snakeBody.size()-1);
        }
    }

    //Grow function
    public void grow () {
        Rectangle first = snakeBody.get(0);
        Rectangle temp = new Rectangle(Game.dimension, Game.dimension);

        if(move.equals("Up")){
            temp.setLocation(first.x, first.y - Game.dimension);
        }
        else if(move.equals("Down")) {
            temp.setLocation(first.x, first.y + Game.dimension);
        }
        else if(move.equals("Left")) {
            temp.setLocation(first.x - Game.dimension, first.y);
        }
        else{
            temp.setLocation(first.x + Game.dimension, first.y);
        }

        snakeBody.add(0, temp);
    }

    public ArrayList<Rectangle> getSnakeBody() {
        return snakeBody;
    }

    public String getMove(){
        return move;
    }

    public int getX(){
        return snakeBody.get(0).x;
    }

    public int getY(){
        return snakeBody.get(0).y;
    }

    public void Up() {
            move = "Up";
    }

    public void Down() {
            move = "Down";
    }

    public void Left() {
            move = "Left";
    }

    public void Right() {
            move = "Right";
    }

}
