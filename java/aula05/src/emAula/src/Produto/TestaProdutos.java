package emAula.src.Produto;


public class TestaProdutos {
    public static void main(String[] args) {
        Produto pr1, pr2,pr4;
        ProdutoPerecivel prpe1, prpe2;

        pr1 = new Produto("0001", "Carne Solta",10);
        pr2 = new Produto("0002", "Presilhas",5);
        System.out.println("Pr1: "+pr1);
        System.out.println("Pr2: "+pr2);

        //prpe1 = new Produto("003","Peixe", 30)// da erro pois tu não pode passar algo da subclasse para super
        pr4 = new ProdutoPerecivel("0004","Frutas",25, null);//certo, pois passa da super para subclasse

        prpe1 = (ProdutoPerecivel) pr4; //polimosfismo
        System.out.println(pr4); //polimorfirmo

       /* System.out.println("Descrição do pr1: "+pr1.descricao);
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
        */



    }
}
