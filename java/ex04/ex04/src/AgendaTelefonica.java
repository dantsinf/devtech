import java.util.HashMap;

public class AgendaTelefonica {

    String nome, numero;
    HashMap<String,String> colecao = new HashMap<>();


    public void inserir(String nome, String numero){
        colecao.put(nome,numero);
        System.out.printf("\nNome: "+nome+  " Número: "+numero);

    }//inserir

    public String buscarNumero(String nome){
        String resposta = colecao.get(numero);
        System.out.printf("\nNúmero encontrado: "+ nome);
        return resposta;

    }//buscarNumero

    public void remover(String nome){
        colecao.remove(nome);
        System.out.printf("\n"+nome+" foi removido");
    }//remover

    public int tamanho(){
        int resposta =  colecao.keySet().size();
        System.out.printf("\nTamanho da lista: "+resposta);
        return resposta;
    }//tamanho

    /*
    public void mostrar(){
        System.out.printf("\nNome: "+nome+  " Número: "+numero);
        System.out.printf("\nNúmero encontrado: "+ numero);
       // System.out.printf("");
    }//fecha mostrar
    */

}
