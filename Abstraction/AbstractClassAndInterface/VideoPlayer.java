package com.AbstractClassAndInterface;

public class VideoPlayer implements MediaPlayer {

	@Override
	public void play() {
		System.out.println("Video Play");
		
	}

	@Override
	public void pause() {
	System.out.println("Video Pause");
		
	}

}
