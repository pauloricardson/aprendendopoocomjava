package academy.devdojo.maratonajava.javacore.heranca.dominio;

public class Funcionario extends Pessoa {
    private double salario;
    static {
        System.out.println("Dentro do bloco estático de Funionario");
    }

    {
        System.out.println("Dentro do bloco de inicialização de funcionario 1");
    }

    {
        System.out.println("Dentro do bloco de inicialização de funcionario 2");
    }
    public Funcionario(String nome) {
        super(nome);
        System.out.println("Dentro do construtor de funcionario");
    }

    public double getSalario() {
        return salario;
    }


    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void imprime() {
        super.imprime();
        System.out.println("Salário: " + this.salario);
    }

}
