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
	public void frameWithSpareIsNotComplete() {
		frame.roll(3);
		frame.roll(7);
		
		assertFalse(frame.isComplete());
	}
}
