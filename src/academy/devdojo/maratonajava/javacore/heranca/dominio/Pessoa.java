package academy.devdojo.maratonajava.javacore.heranca.dominio;

public class Pessoa {
    private String nome;
    private String cpf;
    private Endereco endereco;

    static {
        System.out.println("Dentro do bloco estático de pessoa");
    }

    {
        System.out.println("Dentro do bloco de inicialização de pessoa 1");
    }

    {
        System.out.println("Dentro do bloco de inicialização de pessoa 2");
    }

    public Pessoa(String nome) {
        System.out.println("Dentro doo contrutor de pessoa");
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void imprime(){
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Enderco: " + this.endereco.getRua() + ", CEP: " + this.endereco.getCep());
    }
}
