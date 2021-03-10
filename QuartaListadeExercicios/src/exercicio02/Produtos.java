package exercicio02;

public class Produtos {
    //Criação dos endereços de memória
    private int ID;
    private String nome;
    private int valor;
    private int quantidade;
        
    public Produtos (int ID, String nome, int valor, int quantidade) {
        this.ID = ID;
        this.nome = nome;
        this.valor = valor;
        this.quantidade = quantidade;     
    }

    public int getId() {
        return ID;
    }

    public void setId (int ID) {
        this.ID = ID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome (String nome) {
        this.nome = nome;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}