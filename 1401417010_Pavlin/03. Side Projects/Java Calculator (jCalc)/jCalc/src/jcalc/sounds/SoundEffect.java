package jcalc.sounds;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;


public class SoundEffect {
    
    public void sound(String path) {
        
        try {

            AudioInputStream inputStream = AudioSystem.getAudioInputStream(this.getClass().getClassLoader().getResource(path));

            Clip sound = AudioSystem.getClip();

            sound.open(inputStream);

            sound.start();
        }
        
        catch(Exception e) {}
    }
}
