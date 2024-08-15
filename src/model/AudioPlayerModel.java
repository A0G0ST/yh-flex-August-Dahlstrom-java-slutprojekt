package model;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import java.io.File;

public class AudioPlayerModel {

    // Metod för att spela ett ljud baserat på filnamn
    public void playSound(String soundFileName) {
        try {
            // Skapar en File-referens till ljudfilen i 'sounds'-mappen
            String soundFilePath = "src/resources/sounds/" + soundFileName;
            Media sound = new Media(new File(soundFilePath).toURI().toString());

            // Spela upp ljudet
            MediaPlayer mediaPlayer = new MediaPlayer(sound);
            mediaPlayer.play();
        } catch (Exception e) {
            System.out.println("Kunde inte spela upp ljudet: " + e.getMessage());
        }
    }
}
