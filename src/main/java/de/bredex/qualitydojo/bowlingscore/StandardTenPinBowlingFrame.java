package de.bredex.qualitydojo.bowlingscore;

public class StandardTenPinBowlingFrame implements Frame {

	private int numberOfRolls = 0;
	private boolean isStrike = false;
	
	@Override
	public boolean isComplete() {
		return numberOfRolls == 2 || isStrike;
	}

	@Override
	public void roll(int numberOfPinsKnockedDown) {
		numberOfRolls++;
		if (numberOfPinsKnockedDown == 10) {
			this.isStrike = true;
		}
	}

}
