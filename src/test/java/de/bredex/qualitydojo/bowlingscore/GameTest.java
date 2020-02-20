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
		rollAll(0);
		
		assertEquals(0, game.getScore());
	}

	@Test
	public void scoreForAllOpenFrames() {
		rollAll(1);
		
		assertEquals(20, game.getScore());
	}
	
	private void rollAll(int numberOfPinsPerRoll) {
		for (int i = 0; i < 20; i++) {
			game.roll(numberOfPinsPerRoll);
		}
	}
}
