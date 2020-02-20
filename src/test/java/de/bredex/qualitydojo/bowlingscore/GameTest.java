package de.bredex.qualitydojo.bowlingscore;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class GameTest {

	private final class CompletedFrame implements Frame {
		@Override
		public boolean isComplete() {
			return true;
		}

		@Override
		public void roll(int numberOfPinsKnockedDown) {
		}
	}


	private Game game;
	
	@Before
	public void setup() {
		game = new TenPinBowlingGame();
	}
 
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
		Frame finalFrame = new CompletedFrame();
		game = new TenPinBowlingGame(finalFrame);
		
		assertTrue(game.isComplete());
	}

	@Test
	public void gameIsNotCompleteWhenFinalFrameIsNotComplete() {
		game = new TenPinBowlingGame(new TenthTenPinBowlingFrame());
		
		assertFalse(game.isComplete());
	}
	
	private void rollAll(int numberOfPinsPerRoll) {
		for (int i = 0; i < 20; i++) {
			game.roll(numberOfPinsPerRoll);
		}
	}
}
