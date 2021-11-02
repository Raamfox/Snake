import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UnitTest {

    @Test
    public void testInitialPlayerPosWithFoodPos() {

        Snake player = new Snake();
        Food food = new Food(player);

        assertNotEquals(player.getX(), food.getX());
        assertNotEquals(player.getY(), food.getY());
        System.out.println(player);
        System.out.println(food);

    }

    @Test
    public void testSnakeMoveUp() {
        Snake snake = new Snake();
        int snakeBodyBeforeMove = snake.getY();
        System.out.println(snakeBodyBeforeMove);
        snake.Up();
        snake.move();
        int snakeBodyAfterMove = snake.getY();
        System.out.println(snakeBodyAfterMove);
        assertEquals(380,snakeBodyAfterMove);

    }
    @Test
    public void testSnakeMoveDown() {
        Snake snake = new Snake();
        int snakeBodyBeforeMove = snake.getY();
        System.out.println(snakeBodyBeforeMove);
        snake.Down();
        snake.move();
        int snakeBodyAfterMove = snake.getY();
        System.out.println(snakeBodyAfterMove);
        assertEquals(420,snakeBodyAfterMove);
    }
    @Test
    public void testSnakeMoveLeft() {
        Snake snake = new Snake();
        int snakeBodyBeforeMove = snake.getX();
        System.out.println(snakeBodyBeforeMove);
        snake.Left();
        snake.move();
        int snakeBodyAfterMove = snake.getX();
        System.out.println(snakeBodyAfterMove);
        assertEquals(380,snakeBodyAfterMove);
    }
    @Test
    public void testSnakeMoveRight() {
        Snake snake = new Snake();
        int snakeBodyBeforeMove = snake.getX();
        System.out.println(snakeBodyBeforeMove);
        snake.Right();
        snake.move();
        int snakeBodyAfterMove = snake.getX();
        System.out.println(snakeBodyAfterMove);
        assertEquals(420,snakeBodyAfterMove);
    }


}
