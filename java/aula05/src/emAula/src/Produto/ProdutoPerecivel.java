package emAula.src;

import java.time.*;

public class ProdutoPerecivel extends Produto{
    private LocalDate dataValidade;

    public ProdutoPerecivel(String c, String d, int q, LocalDate dt){
        super(d, d, q); //construtor super, sem ele o java tenta chamar ele novamente e fica super();
        dataValidade = dt;
    }

    public int retiraEstoque(int n, LocalDate dtCOrrente) {
        int res = n;
        Period difDate = Period.between(dtCOrrente, dataValidade);

        if(difDate.getMonths()>2 || (difDate.getMonths() == 2 && difDate.getDays() > 0))
            res = 0;
            else res = super.retiraEstoque(n);
            return res;
    }

    /*Não necessário sobrescrever a original. Se não, temos ocmportamento inconsistente.*/

    public int retiraEstoque(int n){
        return retiraEstoque(n, LocalDate.now());
    }

    public void  colocaEstoque(int n, LocalDate dtCorrente){
        if(dtCorrente.equals(dataValidade))
            super.colocaEstoque(n);
    }

    /*Não necessário sobrescrever a original. Se não, temos ocmportamento inconsistente.*/

    public void colocaEstoque(int n){
        colocaEstoque(n, LocalDate.now());
    }




}
