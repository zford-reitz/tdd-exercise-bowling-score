package de.bredex.qualitydojo.bowlingscore;

public class TenPinBowlingGame implements Game {

	private int totalNumberOfPinsKnockedDown = 0;
	private Frame frame = null;

	public TenPinBowlingGame() {
	}

	public TenPinBowlingGame(Frame frame) {
		this.frame = frame;
		
	}

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
		if (frame == null) {
			return false;
		} else {
			return frame.isComplete();
		}
	}

}
