package academy.devdojo.maratonajava.javacore.gassociacao.test;

import academy.devdojo.maratonajava.javacore.gassociacao.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.gassociacao.dominio.Time;

public class JogadorTest02 {
    static void main() {
        Jogador j1 = new Jogador("Ricardson");
        Time time = new Time("Fortaleza");
        j1.setTime(time);
    }
}


