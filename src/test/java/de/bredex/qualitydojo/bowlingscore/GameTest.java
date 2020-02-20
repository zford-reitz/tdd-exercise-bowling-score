package de.bredex.qualitydojo.bowlingscore;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GameTest {

	@Test
	public void scoreIsZeroAtStartOfGame() {
		Game game = new TenPinBowlingGame();
		
		assertEquals(0, game.getScore());
	}
	
	@Test
	public void scoreIsZeroForScorelessGame() {
		Game game = new TenPinBowlingGame();
		
		for (int i = 0; i < 20; i++) {
			game.roll(0);
		}
		
		assertEquals(0, game.getScore());
	}
	
}
