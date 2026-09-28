import java.util.ArrayList;
import java.util.List;

public class Estoque {
    private List<Produto> produtos;

    public Estoque(){
        this.produtos= new ArrayList<>();
    }

    public void adicionarProduto(Produto produto){
        produtos.add(produto);
    }

    public Produto buscarProduto(int id){
        for (Produto produto : produtos) {
            if (produto.getId() == id) {
                return produto;
            }
        }
        return null;
    }

    public void entrada(int id, int quantidade) {
        Produto produto = buscarProduto(id);

        if (produto == null){
            System.out.println("Produto não encontrado!");
            return;
        }

        produto.adicionarEstoque(quantidade);

        System.out.println(
                "Entrada realizada: " + produto.getNome()
        );
    }

    public void saida(int id, int quantidade) {
        Produto produto = buscarProduto(id);

        if (produto == null){
            System.out.println("Produto não encontrado!");
            return;
        }

        boolean removido = produto.removerEstoque(quantidade);

        if (removido) {
            System.out.println("Saída realizada: " + produto.getNome());
        }
    }

    public void listarProduto(){
        System.out.println("\n === ESTOQUE ===");

        for (Produto produto : produtos){
            System.out.println(
                    "ID: " + produto.getId()
                    + " | Produto: " + produto.getNome()
                    + " | Preço: R$ " + produto.getPreco()
                    + " | Quantidade: " + produto.getQuantidade()
                    + " | Categoria " + produto.getCategoria().getNome()
            );
        }
    }
}
