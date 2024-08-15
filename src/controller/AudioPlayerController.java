package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import model.AudioPlayerModel;

public class AudioPlayerController {

    // Referens till modell som hanterar ljudspelandet
    private AudioPlayerModel audioPlayerModel = new AudioPlayerModel();

    @FXML
    private Button playBeepButton;

    @FXML
    private Button playChimeButton;

    // När användaren trycker på "Spela Beep"-knappen
    @FXML
    public void playBeepSound() {
        audioPlayerModel.playSound("beep.mp3");
    }

    // När användaren trycker på "Spela Chime"-knappen
    @FXML
    public void playChimeSound() {
        audioPlayerModel.playSound("chime.mp3");
    }
}
