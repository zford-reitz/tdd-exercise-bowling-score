package de.bredex.qualitydojo.bowlingscore;

public class TenthTenPinBowlingFrame implements Frame {

	private int numberOfRolls = 0;
	private int totalNumberOfPinsKnockedDown = 0;
	private boolean isSpare = false;
	private boolean isStrike = false;

	@Override
	public boolean isComplete() {
		return numberOfRolls == 3 || hasNoBonusRolls();
	}

	private boolean hasNoBonusRolls() {
		return !this.isSpare && !this.isStrike;
	}

	@Override
	public void roll(int numberOfPinsKnockedDown) {
		numberOfRolls++;
		this.totalNumberOfPinsKnockedDown += numberOfPinsKnockedDown;
		if (numberOfRolls == 2 && totalNumberOfPinsKnockedDown == 10) {
			this.isSpare = true;
		} else if (numberOfRolls == 1 && numberOfPinsKnockedDown == 10) {
			this.isStrike = true;
		}
	}

}
