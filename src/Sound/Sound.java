/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sound;


import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

/**
 *
 * @author Liam
 */
public class Sound {
    File file = new File("res/textures/intro.wav");
    
    public void play( int delay, int numberOfLoops) {
		for (int i = 0; i < numberOfLoops; i++) {
			new Thread() {
				@Override
				public void run() {
					try {
					Clip clip = AudioSystem.getClip();
					clip.open(AudioSystem.getAudioInputStream(file));
					clip.start();
                                       	Thread.sleep(clip.getMicrosecondLength());

					} catch (Exception e) {
						System.out.println(e.getMessage());
					}
				}
			}.start();
			try {
				Thread.sleep(delay);
                               
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
    }
}
