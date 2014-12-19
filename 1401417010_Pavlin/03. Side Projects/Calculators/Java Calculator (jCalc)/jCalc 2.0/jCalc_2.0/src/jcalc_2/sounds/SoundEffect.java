package jcalc_2.sounds;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

import javax.swing.JOptionPane;
        
public class SoundEffect {
    
    public void sound(String path) {
        
        try {
            
            AudioInputStream inputStream = AudioSystem.getAudioInputStream(this.getClass().getClassLoader().getResource("jcalc_2/sounds/wav/" + path));

            Clip sound = AudioSystem.getClip();

            sound.open(inputStream);

            sound.start();
        }

        catch(Exception err) {
            errorBox("Sound file not found: " + path, "jCalc Sound Error");
        }
    }
    
    public static void errorBox(String infoMessage, String titleBar) {
        JOptionPane.showMessageDialog(null, infoMessage, titleBar, JOptionPane.INFORMATION_MESSAGE);
    }
}




