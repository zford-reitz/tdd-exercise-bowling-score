package de.bredex.qualitydojo.bowlingscore;

import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TenPinBowlingGame implements Game {

	private int totalNumberOfPinsKnockedDown = 0;
	private List<Frame> frames;

	private Iterator<Frame> frameIterator;
	private Frame currentFrame;

	public TenPinBowlingGame() {
		this(createDefaultFrames());
	}
	
	public TenPinBowlingGame(List<Frame> frames) {
		this.frames = frames;
		this.frameIterator = this.frames.iterator();
		this.currentFrame = this.frameIterator.next();
	}

	@Override
	public int getScore() {
		return this.totalNumberOfPinsKnockedDown;
	}

	@Override
	public void roll(int numberOfPinsKnockedDown) {
		this.totalNumberOfPinsKnockedDown += numberOfPinsKnockedDown;
		this.currentFrame.roll(numberOfPinsKnockedDown);
		if (this.currentFrame.isComplete() && this.frameIterator.hasNext()) {
			this.currentFrame = this.frameIterator.next();
		}
	}

	@Override
	public boolean isComplete() {
		return isFinalFrame() && this.currentFrame.isComplete();
	}

	private boolean isFinalFrame() {
		return !this.frameIterator.hasNext();
	}

	private static List<Frame> createDefaultFrames() {
		List<Frame> defaultFrames = Stream.generate(StandardTenPinBowlingFrame::new).limit(9).collect(Collectors.toList());
		defaultFrames.add(new TenthTenPinBowlingFrame());
		return defaultFrames;
	}

}
