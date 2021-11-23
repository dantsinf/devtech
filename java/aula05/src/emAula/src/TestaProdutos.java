package emAula.src;

public class TestaProdutos {
    public static void main(String[] args) {
        Produto pr1, pr2;
        ProdutoPerecivel prpe1, prpe2;

        pr1 = new Produto("0001", "Carne Solta",10);
        pr2 = new Produto("0002", "Presilhas",5);
        System.out.printf("Pr1: "+pr1);
        System.out.printf("Pr2: "+pr2);

        pr1.retiraEstoque(20);
        System.out.printf("Pr1 retirendo 20: "+pr1);

        pr1.retiraEstoque(12);
        System.out.printf("Pr1 retirendo 12: "+pr1);

        pr1.retiraEstoque(12);
        System.out.printf("Pr1 retirendo 12: "+pr1);

        pr2.retiraEstoque(-1);
        System.out.printf("Pr2 retirendo -1: "+pr2);

        pr2.retiraEstoque(0);
        System.out.printf("Pr2 retirendo 0: "+pr2);

        pr2.retiraEstoque(0);
        System.out.printf("Pr2 colocando 0: "+pr2);

        pr2.retiraEstoque(-2);
        System.out.printf("Pr2 colocando -1: "+pr2);


    }
}
