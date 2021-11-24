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

    }

}
