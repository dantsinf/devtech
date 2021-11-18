public class ContaCorrente {

    private int nroConta;
    private Double oSaldo = 0.0;

    public ContaCorrente(int n){
        nroConta = n;
    }

    public void deposito(double valor){
        if(valor > 0){
            oSaldo+=valor;
        }
    }

    public double retirada(double valor){
        if(oSaldo - valor >= 0){
            oSaldo -= valor;
        }
        return oSaldo;
    }

    public double getSaldo(){
    return oSaldo;
    }

    public int getNroConta(){
    return nroConta;
    }


}//fecha Classe
