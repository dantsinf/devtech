package emAula.src.excecoes;

public class TesteExcecoesComTratamento {

    public static void testa(String ...args){
        ImpString s1 = null, s2 = null;
        int n = 0;
        try{
            s1 = new ImpString(args[0]);
            s2 = new ImpString(args[1]);
            n = Integer.parseInt (args[2]);
        } catch (Exception e){
            System.out.println("Erro ao procesar entradas");
            System.exit(0);
        }
        try {
            s1.impSep(n);
            s1.impInv(n);
            s2.impSep(n);
            s2.impInv(n);
        }
        catch (Exception e){
            System.out.println("Valor invalido");
            System.exit(0);
        }
        System.out.println("Fim do processamento");
    }//testa

    public static void main(String[] args) {
        System.out.println("Teste POlimorfismo 1:");
        testa("TestePolimorfismo", "Excecoes","4");

        System.out.println("TestaPolimorfismo 2:");
        testa("TestePolimorfismo", "Excecoes","10");

        System.out.println("TestaPolimorfismo 3:");
        testa("TestePolimorfismo", "Excecoes","TestaPOlimorfismo");

        System.out.println("TestaPolimorfismo 4:");
        testa("TestePOlimorfismo");

    }

}
