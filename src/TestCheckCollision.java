import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class TestCheckCollision {
    @Test
    public void testCheckWallCollision(){

        Snake player;
        player = new Snake();

        boolean collisionResult = Game.checkWallCollision2(player);
        System.out.println(player);
        System.out.println(collisionResult);
        assertEquals(false,collisionResult);

    }
}
