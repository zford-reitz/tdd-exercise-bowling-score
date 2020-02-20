package de.bredex.qualitydojo.bowlingscore;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

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

	@Test
	public void gameWithNoRollsIsNotComplete() {
		assertFalse(game.isComplete());
	}
	
	@Test
	public void gameIsCompleteWhenFinalFrameIsComplete() {
		// Given
		Frame finalFrame = new TenPinBowlingFrame();
		game = new TenPinBowlingGame(finalFrame);
		
		assertTrue(game.isComplete());
	}
	

	private void rollAll(int numberOfPinsPerRoll) {
		for (int i = 0; i < 20; i++) {
			game.roll(numberOfPinsPerRoll);
		}
	}
}
