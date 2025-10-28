package academy.devdojo.maratonajava.javacore.gassociacao.test;

import academy.devdojo.maratonajava.javacore.gassociacao.dominio.Escola;
import academy.devdojo.maratonajava.javacore.gassociacao.dominio.Professor;

public class EscolaTeste01 {
    static void main() {
        Professor professor = new Professor("Paulo");
        Professor professor1 = new Professor("Ricardson");
        Professor[] professores = {professor, professor1};

        Escola escola = new Escola("Gonzaga Mota", professores);

        escola.imprime();

    }
}
