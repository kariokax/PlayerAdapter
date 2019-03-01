package br.player.Classe;

import br.player.Interface.Audio_Interface;
import br.player.Interface.PreparacaoAudio;
import java.io.FileNotFoundException;

public class PlayAdapter implements Audio_Interface {

    PreparacaoAudio vaiTocar;

    public PlayAdapter(String tipo) {

        if (tipo.equals(".mp3")) {
            vaiTocar = new ReproducaoMp3();
        }
    }

    @Override
    public void tocar(String url, String tipo) {
        try {
            vaiTocar.playMp3(url);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}
