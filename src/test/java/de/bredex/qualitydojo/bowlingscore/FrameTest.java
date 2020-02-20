package de.bredex.qualitydojo.bowlingscore;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class FrameTest {

	private Frame frame;

	@Before
	public void setup() {
		frame = new StandardTenPinBowlingFrame();
	}
	
	@Test
	public void frameWithNoRollsIsNotComplete() {
		assertFalse(frame.isComplete());
	}
	
	@Test
	public void frameWithTwoRollsIsComplete() {
		frame.roll(0);
		frame.roll(0);
		
		assertTrue(frame.isComplete());
	}

	@Test
	public void frameWithStrikeIsComplete() {
		frame.roll(10);
		
		assertTrue(frame.isComplete());
	}
}
