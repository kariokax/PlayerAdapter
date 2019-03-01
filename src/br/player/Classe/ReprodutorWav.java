package br.player.Classe;

import java.applet.Applet;
import java.applet.AudioClip;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;

public class ReprodutorWav {

    public void tocarMusica(String arquivo) throws MalformedURLException, URISyntaxException, InterruptedException {

        URL url = new URL(arquivo);
        AudioClip audio = Applet.newAudioClip(url);
        audio.play();
        audio.wait(1452);
    }

}
