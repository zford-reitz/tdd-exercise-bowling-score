package de.bredex.qualitydojo.bowlingscore;

public class TenPinBowlingGame implements Game {

	private int numberOfPinsKnockedDown;

	@Override
	public int getScore() {
		return this.numberOfPinsKnockedDown;
	}

	@Override
	public void roll(int numberOfPinsKnockedDown) {
		this.numberOfPinsKnockedDown += numberOfPinsKnockedDown;
	}

}
