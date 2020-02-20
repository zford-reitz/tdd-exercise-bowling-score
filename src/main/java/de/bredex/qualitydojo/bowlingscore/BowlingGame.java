package de.bredex.qualitydojo.bowlingscore;

public interface BowlingGame {

	void roll(int numberOfPins);
	boolean isOver();
	int getDisplayedScore();
	int getCurrentFrameNumber();
	int getCurrentRollNumberInFrame();
	
}
