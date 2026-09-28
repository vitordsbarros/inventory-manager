public class Produto {
    private int id;
    private String nome;
    private double preco;
    private int quantidade;
    private Categoria categoria;

    public Produto (
            int id,
            String nome,
            double preco,
            int quantidade,
            Categoria categoria
    ){
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.categoria = categoria;
    }

    public void adicionarEstoque(int quantidade) {
        if (quantidade <= 0) {
            System.out.println("Quantidade invalida.");
        }

        this.quantidade += quantidade;
    }

    public boolean removerEstoque(int quantidade) {
        if (validarRemocao(quantidade)) {
            this.quantidade -= quantidade;
            return true;
        }
        return false;
    }

    private boolean validarRemocao(int quantidade) {
        if (quantidade <= 0) {
            System.out.println("Quantidade invalida.");
            return false;
        }

        if (quantidade > this.quantidade) {
            System.out.println("Estoque insuficiente");
            return false;
        }
        return true;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}