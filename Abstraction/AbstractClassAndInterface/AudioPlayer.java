package com.AbstractClassAndInterface;

public class AudioPlayer implements MediaPlayer {

	@Override
	public void play() {
		System.out.println("Audio Play");

	}

	@Override
	public void pause() {
		System.out.println("Audio Pause");

	}

}
