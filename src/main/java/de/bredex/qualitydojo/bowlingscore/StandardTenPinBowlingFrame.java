package de.bredex.qualitydojo.bowlingscore;

public class StandardTenPinBowlingFrame implements Frame {

	private int numberOfRolls = 0;
	
	@Override
	public boolean isComplete() {
		return numberOfRolls == 2;
	}

	@Override
	public void roll(int numberOfPinsKnockedDown) {
		numberOfRolls++;
	}

}
