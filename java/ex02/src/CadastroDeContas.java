import java.util.Arrays;

public class CadastroDeContas {
    ContaCorrente[] cc = new ContaCorrente[5];
    private int nroContas = 0;
    double resposta =0.0;

    //private boolean resposta;// usado no novaContaCorrente

    public static void main(String[] args) {
        CadastroDeContas cadc = new CadastroDeContas();

        cadc.getConta(300);//ok
        cadc.getSaldoTotal();
        //cadc.novaContaCorrente(cadc.cc[0]=new ContaCorrente(2)); //certo, mas mostra erro
        //cadc.cc[0] = new ContaCorrente(2);

        //System.out.println(Arrays.toString(cadc.cc));
        //cadc.novaContaCorrente(cadc.cc[0]);


    }



    public boolean novaContaCorrente(ContaCorrente c) {
        boolean resposta = false;
        if (c != null || nroContas < cc.length) {
           // nroContas = cc.length;//recebendo o tamanho do array cad/5
            cc[nroContas] = c;
            nroContas++;
            resposta = true;
            System.out.println("Não é null");
        }else {
            System.out.println("É null");
            resposta = false;
        }
        System.out.println("Resposta: "+resposta);
        System.out.println("Como está c: "+c);
        return resposta;
    }//fecha novaContaCorrente

    public ContaCorrente getConta(int nro) {
        ContaCorrente res;
        int i;
        for (i = 0; i < nroContas; i++)
            if (nro == cc[i].getNroConta())
                break;
            if (i == nroContas)
                res = null;
             else
                res = cc[i];
        System.out.println("Conta corrente: "+res);
            return res;
        }


        /*if(nroCta == 0){
            System.out.println("Vazio");
            return null;
        }else{
            System.out.println("Número da conta: "+nroCta);
        }
        return null;
    }//fecha getConta*/

    /*public double getSaldoTotal(){
    }//fecha getSaldo
    */

    public double getSaldoTotal(){
       // Arrays.fill(cc,40);
        double resp =0.0;
        for(int i=0;i< cc.length;i++){
           // resp += cc[0].getSaldo();
        }

        System.out.println("Saldo total: "+resp);
        return resp;
    }

}//fecha classe