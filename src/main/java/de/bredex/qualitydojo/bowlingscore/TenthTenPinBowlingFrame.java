package de.bredex.qualitydojo.bowlingscore;

public class TenthTenPinBowlingFrame implements Frame {

	private int numberOfRolls = 0;
	private int totalNumberOfPinsKnockedDown = 0;
	private boolean isSpare;

	@Override
	public boolean isComplete() {
		return numberOfRolls == 3 || !this.isSpare;
	}

	@Override
	public void roll(int numberOfPinsKnockedDown) {
		numberOfRolls++;
		this.totalNumberOfPinsKnockedDown += numberOfPinsKnockedDown;
		if (numberOfRolls == 2 && totalNumberOfPinsKnockedDown == 10) {
			this.isSpare = true;
		}
	}

}
