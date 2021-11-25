package emAula.src.excecoes;

public class TesteExcecoesSemTratamento {
    public static void testa(String... args){
        ImpString s1, s2;
        int n;
        s1 = new ImpString(args[0]);
        s2 = new ImpString(args[1]);
        n = Integer.parseInt(args[2]);
        s1.impSep(n);
        s1.impInv(n);
        s2.impSep(n);
        s2.impInv(n);
        System.out.println("Fim do teste/n/n");
    }

    public static void main(String[] args) {
        System.out.print("TestePolimorfismo 1:");
        testa("TestePolimorfismo", "Excecoes", "4");

        System.out.print("TestePolimorfismo 2:");
        testa("TestePolimorfismo", "Excecoes", "10");

        System.out.print("TestePolimorfismo 1:");
        testa("TestePolimorfismo", "Excecoes", "4");
        //vai mostrar erro , pois não foi capturado as exceções
    }

}
