package de.bredex.qualitydojo.bowlingscore;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GameTest {

	private Game game = new TenPinBowlingGame();
 
	@Test
	public void scoreIsZeroAtStartOfGame() {
		assertEquals(0, game.getScore());
	}
	
	@Test
	public void scoreIsZeroForScorelessGame() {
		for (int i = 0; i < 20; i++) {
			game.roll(0);
		}
		
		assertEquals(0, game.getScore());
	}
	
}
