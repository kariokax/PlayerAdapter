package br.player.Classe;

import br.player.Interface.Audio_Interface;
import javax.swing.JOptionPane;

public class Reproducao implements Audio_Interface {

    PlayAdapter feh;

    @Override
    public void tocar(String url, String tipo) {

        if (tipo.equals(".wav")) {

            ReprodutorWav play = new ReprodutorWav();

            try {
                play.tocarMusica(url);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }

        if (tipo.equals(".mp3")) {

            feh = new PlayAdapter(tipo);
            feh.tocar(url, tipo);
        }
    }

    public void Espera() {
        while (true) {
        }
    }
}
