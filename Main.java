import java.util.*;

public class Main {
    public void main(String[] args) {
        Estoque estoque = new Estoque();

        Categoria eletronicos = new Categoria(1, "Eletrônicos");
        Categoria perifericos = new Categoria(2, "Periféricos");
        Categoria hardwares = new Categoria(3, "Hardwares");

        Produto notebook = new Produto(
                1,
                "Notebook",
                3500.00,
                20,
                eletronicos
        );

        Produto mouse = new Produto(
                2,
                "Mouse",
                150.00,
                50,
                perifericos
        );

        Produto memoriaRam = new Produto(
                3,
                "Memoria RAM 32GB",
                2450.00,
                14,
                hardwares
        );

        estoque.adicionarProduto(notebook);
        estoque.adicionarProduto(mouse);
        estoque.adicionarProduto(memoriaRam);

        estoque.listarProduto();

        estoque.entrada(1, 4);
        estoque.saida(2, 2000);

        estoque.listarProduto();
    }
}

