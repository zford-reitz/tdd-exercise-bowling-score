package de.bredex.qualitydojo.bowlingscore;

public class TenthTenPinBowlingFrame implements Frame {

	private int totalNumberOfPinsKnockedDown = 0;

	@Override
	public boolean isComplete() {
		return this.totalNumberOfPinsKnockedDown != 10;
	}

	@Override
	public void roll(int numberOfPinsKnockedDown) {
		this.totalNumberOfPinsKnockedDown += numberOfPinsKnockedDown;
	}

}
