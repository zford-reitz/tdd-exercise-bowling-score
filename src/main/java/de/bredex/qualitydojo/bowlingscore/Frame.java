package de.bredex.qualitydojo.bowlingscore;

public interface Frame {

	void roll(int numberOfPinsKnockedDownByRoll);
	boolean isComplete();
	int getScore();
	
}
