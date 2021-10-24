import java.awt.Rectangle;
import java.util.ArrayList;

public class Snake {
    private ArrayList<Rectangle> body;

    private int w = Game.width;
    private int h = Game.height;
    private int d = Game.dimension;


    //initialize Snake
    //This is the class is the starting point for snake

    public Snake () {
        body = new ArrayList<>();

        Rectangle temp = new Rectangle(Game.dimension, Game.dimension);
        temp.setLocation(Game.width / 2 * Game.dimension, Game.height / 2 * Game.dimension);
        body.add(temp);

        temp = new Rectangle(d,d);
        temp.setLocation((w / 2 - 2) * d, (h / 2 -2) * d);
        body.add(temp);
    }

    public ArrayList<Rectangle> getBody() {
        return body;
    }

    public void setBody(ArrayList<Rectangle> body) {
        this.body = body;
    }



}
