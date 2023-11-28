package classe;

import java.util.Scanner;

public class ProdutoTeste {
    public static void main(String[] args) {

       // int a = 3; (uma classe define um tipo igual uma variavel

        Produto p1 = new Produto("notebook",4356.89,0.25);

        var p2 = new Produto();
        p2.nome = "caneta preta";
        p2.preco = 12.56;
        p2.desconto = 0.29;

        System.out.println(p1.nome);
        System.out.println(p2.nome);

        double precoFinal1 = p1.precoComDesconto();
        double precoFinal2 = p2.precoComDesconto();
        double mediaCarinho =(precoFinal1 + precoFinal2 ) / 2;

        System.out.printf("média do carrinho = R$%.2f." , mediaCarinho);
    }
}
