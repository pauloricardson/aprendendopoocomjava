package academy.devdojo.maratonajava.javacore.gassociacao.test;

import academy.devdojo.maratonajava.javacore.gassociacao.dominio.Jogador;

public class JogadorTest01 {

    static void main() {
        Jogador j1 = new Jogador("Neymar");
        Jogador j2 = new Jogador("Paulinho");
        Jogador j3 = new Jogador("Ricardo");

        Jogador[] jogadores = {j1, j2, j3};

        for (Jogador jogador : jogadores) {
            jogador.imprime();
        }

    }
}