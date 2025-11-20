package academy.devdojo.maratonajava.javacore.heranca.test;

import academy.devdojo.maratonajava.javacore.heranca.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.heranca.dominio.Funcionario;

public class Teste {
    static void main() {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 03");
        endereco.setCep("6315000");


        Funcionario funcionario = new Funcionario("Paulo");
        funcionario.setNome("Ricardson");
        funcionario.setCpf("62558442399");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(2418.55);

        System.out.println("-------------------------------------");

        funcionario.imprime();

    }
}
