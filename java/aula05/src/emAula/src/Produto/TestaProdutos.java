package emAula.src.Produto;

import emAula.src.Produto;
import emAula.src.ProdutoPerecivel;

public class TestaProdutos {
    public static void main(String[] args) {
        Produto pr1, pr2;
        ProdutoPerecivel prpe1, prpe2;

        pr1 = new Produto("0001", "Carne Solta",10);
        pr2 = new Produto("0002", "Presilhas",5);
        System.out.println("Pr1: "+pr1);
        System.out.println("Pr2: "+pr2);

       // System.out.println("Descrição do pr1: "+pr1.descricao);
        System.out.println("Descrição do pr1: "+pr1.getDescricao());
       // pr1.descricao = "Nova descrição";
        System.out.println("Descrição do pr1: "+pr1.descricao);
        System.out.println("Pr1: "+pr1);


        pr1.retiraEstoque(20);
        System.out.println("Pr1 retirendo 20: "+pr1);

        pr1.retiraEstoque(12);
        System.out.println("Pr1 retirendo 12: "+pr1);

        pr1.retiraEstoque(12);
        System.out.println("Pr1 retirendo 12: "+pr1);

        pr2.retiraEstoque(-1);
        System.out.println("Pr2 retirendo -1: "+pr2);

        pr2.retiraEstoque(0);
        System.out.println("Pr2 retirendo 0: "+pr2);

        pr2.retiraEstoque(0);
        System.out.println("Pr2 colocando 0: "+pr2);

        pr2.retiraEstoque(-2);
        System.out.println("Pr2 colocando -1: "+pr2);




    }
}
