import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;


public class TicTacToeTest {

	@Test (expected = InvalidMoveException.class)
	public void testSettingSameFieldTwiceIsInvalid() {
		Game g = new Game();
		g.setX(0,0);
		g.setO(0,0);
	}
	
	@Test (expected = InvalidMoveException.class)
	public void testSettingSamePlayerTwiceIsInvalid() {
		Game g = new Game();
		g.setX(0,0);
		g.setX(0,1);
	}

	@Test
	public void testPlayerXHasTurnAtGameBegin() {
		Game g = new Game();
		assertEquals(Player.X, g.currentPlayer());
	}

	@Test
	public void testFirstMovePlayerOHasTurn() {
		Game g = new Game();
		g.setX(0,0);
		assertEquals(Player.O, g.currentPlayer());
	}
	
	@Test (expected = InvalidMoveException.class)
	public void testPlayerOMayNotMoveAtGameBegin() {
		Game g = new Game();
		g.setO(0,0);
	}

	@Test
	public void testSettingDifferentPlayerIsValid() {
		Game g = new Game();
		g.setX(0,0);
		g.setO(0,1);
		assertEquals(Player.X, g.currentPlayer());
	}

}
