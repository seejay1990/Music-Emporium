package cst135.MusicEmporium;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import sun.audio.*;

public class PlayMusic {

	public static void playMusic(String filepath) {

		InputStream music;

		try {

			music = new FileInputStream(new File(filepath));
			AudioStream audio = new AudioStream(music);
			AudioPlayer.player.start(audio);

		} catch (Exception e) {
			System.out.println("File not Found!");
		}

	}

}
