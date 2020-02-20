package de.bredex.qualitydojo.bowlingscore;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TenthFrameTest {

	private Frame frame = new TenthTenPinBowlingFrame();

	@Test
	public void openFrameWithTwoRollsIsComplete() {
		frame.roll(0);
		frame.roll(0);
		
		assertTrue(frame.isComplete());
	}

	@Test
	public void openFrameWithOneRollsIsNotComplete() {
		frame.roll(0);
		
		assertFalse(frame.isComplete());
	}

	@Test
	public void frameWithSpareIsNotComplete() {
		frame.roll(3);
		frame.roll(7);
		
		assertFalse(frame.isComplete());
	}

	@Test
	public void frameWithSpareAndThirdRollIsComplete() {
		frame.roll(6);
		frame.roll(4);
		
		// Initially tried 4 here, and test passed although I didn't expect it to
		frame.roll(0);
		
		assertTrue(frame.isComplete());
	}
	
	@Test
	public void frameWithStrikeIsNotComplete() {
		frame.roll(10);
		
		assertFalse(frame.isComplete());
	}

	@Test
	public void frameWithTwoStrikesIsNotComplete() {
		frame.roll(10);
		frame.roll(10);
		
		assertFalse(frame.isComplete());
	}

	@Test
	public void frameWithThreeStrikesIsComplete() {
		frame.roll(10);
		frame.roll(10);
		frame.roll(10);
		
		assertTrue(frame.isComplete());
	}
}
