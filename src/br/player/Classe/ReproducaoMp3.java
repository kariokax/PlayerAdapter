package br.player.Classe;

import br.player.Interface.PreparacaoAudio;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

public class ReproducaoMp3 implements PreparacaoAudio {

    @Override
    public void playMp3(String url) throws FileNotFoundException {

        FileInputStream file = new FileInputStream(url);
        Player playMp3;

        try {

            playMp3 = new Player(file);
            playMp3.play();

        } catch (JavaLayerException ex) {
            Logger.getLogger(ReproducaoMp3.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
