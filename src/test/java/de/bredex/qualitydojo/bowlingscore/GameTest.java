package de.bredex.qualitydojo.bowlingscore;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GameTest {

	@Test
	public void scoreIsZeroAtStartOfGame() {
		Game game = new TenPinBowlingGame();
		
		assertEquals(0, game.getScore());
	}
	
}
