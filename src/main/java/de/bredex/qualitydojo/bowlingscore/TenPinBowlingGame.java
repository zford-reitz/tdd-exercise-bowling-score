package de.bredex.qualitydojo.bowlingscore;

public class TenPinBowlingGame implements Game {

	private int totalNumberOfPinsKnockedDown = 0;

	@Override
	public int getScore() {
		return this.totalNumberOfPinsKnockedDown;
	}

	@Override
	public void roll(int numberOfPinsKnockedDown) {
		this.totalNumberOfPinsKnockedDown += numberOfPinsKnockedDown;
	}

	@Override
	public boolean isComplete() {
		return false;
	}

}
