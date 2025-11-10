package academy.devdojo.maratonajava.javacore.heranca.test;

import academy.devdojo.maratonajava.javacore.heranca.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.heranca.dominio.Pessoa;

public class Teste {
    static void main() {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 03");
        endereco.setCep("6315000");

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Paulo");
        pessoa.setCpf("60325749388");
        pessoa.setEndereco(endereco);

        pessoa.imprime();

    }
}
