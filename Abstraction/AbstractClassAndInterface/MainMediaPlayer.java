package com.AbstractClassAndInterface;

public class MainMediaPlayer {
	public static void main(String[] args) {
		MediaPlayer m;

		m = new AudioPlayer();
		m.play();
		m.pause();

		m = new VideoPlayer();
		m.play();
		m.pause();
	}
}
