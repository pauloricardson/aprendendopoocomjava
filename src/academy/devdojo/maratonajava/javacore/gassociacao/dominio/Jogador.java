package academy.devdojo.maratonajava.javacore.gassociacao.dominio;

public class Jogador {
    private String nome;
    private Time time;

    public void imprime() {
        System.out.println(this.nome);
    }

    public Jogador(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }
}
