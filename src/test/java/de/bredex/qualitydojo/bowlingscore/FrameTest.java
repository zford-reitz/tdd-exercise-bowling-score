package de.bredex.qualitydojo.bowlingscore;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class FrameTest {

	@Test
	public void frameWithNoRollsIsNotComplete() {
		Frame frame = new StandardTenPinBowlingFrame();
		
		assertFalse(frame.isComplete());
	}
	
	@Test
	public void frameWithTwoRollsIsComplete() {
		Frame frame = new StandardTenPinBowlingFrame();
		frame.roll(0);
		frame.roll(0);
		
		assertTrue(frame.isComplete());
	}
}
