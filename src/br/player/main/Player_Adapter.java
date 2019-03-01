package br.player.main;

import br.player.Classe.Reproducao;
import java.util.Scanner;

public class Player_Adapter {

    public static void main(String[] args) {

        Scanner musica = new Scanner(System.in);
        int escolha;
        String url = "";

        System.out.println("-----Player do Karika-----");
        System.out.println("Musica 1: ELA VAI SENTAR PRO MBAPPÉ");
        System.out.println("Musica 2: FUNK DO SAX \n");
        System.out.println("Digite o número da musica para ouvir \n");

        escolha = musica.nextInt();

        if (escolha == 1) {
            url = "file:///C:/Users/USER-17/Documents/NetBeansProjects/Player_Adapter/src/br/player/Classe/Musicas/ELA%20VAI%20SENTAR%20PRO%20MBAPPÉ.wav";
        } else if (escolha == 2) {
            url = "C:\\Users\\USER-17\\Documents\\NetBeansProjects\\Player_Adapter\\src\\br\\player\\Classe\\Musicas\\Funk do sax.mp3";
        }
        String tipo = url.substring(url.lastIndexOf("."), url.length());

        Reproducao faixa = new Reproducao();

        faixa.tocar(url, tipo);
//        faixa.Espera();
    }
}
