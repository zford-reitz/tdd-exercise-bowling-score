package de.bredex.qualitydojo.bowlingscore;

public interface Frame {

	boolean isComplete();

	void roll(int numberOfPinsKnockedDown);

}
