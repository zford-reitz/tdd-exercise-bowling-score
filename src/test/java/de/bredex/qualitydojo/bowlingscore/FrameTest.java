package de.bredex.qualitydojo.bowlingscore;

import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class FrameTest {

	@Test
	public void frameWithNoRollsIsNotComplete() {
		Frame frame = new TenPinBowlingFrame();
		
		assertFalse(frame.isComplete());
	}
	
}
