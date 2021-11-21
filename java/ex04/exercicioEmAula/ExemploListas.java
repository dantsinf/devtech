package exercicioEmAula;

import java.util.ArrayList;
import java.util.LinkedList;

public class ExemploListas {
    public void demo1(){
        System.out.printf("\nComeço do demo 1, com ArrayList");
        ArrayList<String> lStr = new ArrayList<>();

        lStr.add("Maria");
        lStr.add("Ana Paula");
        lStr.add("Leonardo Junior");
        for (int i=0; i<lStr.size();i++)//for com só uma linha de comando não precisa de {}
            System.out.printf("\nNome: "+lStr.get(i)+" "+" posição: "+i);

        System.out.printf("");
        lStr.add(0, "Lucia Regina");
        for (int i=0; i<lStr.size();i++)//for com só uma linha de comando não precisa de {}
            System.out.printf("\nNome: "+lStr.get(i)+" "+" posição: "+i);

        if (lStr.contains("Junior"))
            System.out.printf("\nJunior presente");
        else
            System.out.printf("\nJunior saiu");


        System.out.println("\n------------------- remove 0");

        lStr.remove(0);
        for (int i=0; i<lStr.size();i++)//for com só uma linha de comando não precisa de {}
            System.out.printf("\nNome: "+lStr.get(i)+" "+" posição: "+i);

        System.out.println("\n------------------- remove Maria");

        lStr.remove("Maria");
        for (int i=0; i<lStr.size();i++)//for com só uma linha de comando não precisa de {}
            System.out.printf("\nNome: "+lStr.get(i)+" "+" posição: "+i);

            System.out.println();
    }

    public void demo2(){
        System.out.printf("\nComeço do demo 2, com LinkedList");
        LinkedList<String> lStr = new LinkedList<>();

        lStr.add("Maria");
        lStr.add("Ana Paula");
        lStr.add("Leonardo Junior");
        for (int i=0; i<lStr.size();i++)//for com só uma linha de comando não precisa de {}
            System.out.printf("\nNome: "+lStr.get(i)+" "+" posição: "+i);

        System.out.printf("");
        lStr.add(0, "Lucia Regina");
        for (int i=0; i<lStr.size();i++)//for com só uma linha de comando não precisa de {}
            System.out.printf("\nNome: "+lStr.get(i)+" "+" posição: "+i);

        if (lStr.contains("Junior"))
            System.out.printf("\nJunior presente");
        else
            System.out.printf("\nJunior saiu");


        System.out.println("\n------------------- remove 0");

        lStr.remove(0);
        for (int i=0; i<lStr.size();i++)//for com só uma linha de comando não precisa de {}
            System.out.printf("\nNome: "+lStr.get(i)+" "+" posição: "+i);

        System.out.println("\n------------------- remove Maria");

        lStr.remove("Maria");
        for (int i=0; i<lStr.size();i++)//for com só uma linha de comando não precisa de {}
            System.out.printf("\nNome: "+lStr.get(i)+" "+" posição: "+i);

        System.out.println();
    }


    /*public void demo3(){
        ContaCorrente c1;
        ArrayList<ContaCorrente> lCtas = new ArrayList<>();

        c1 = new ContaCorrente(123456);
        lCtas.add(c1);

        c1 = new ContaCorrente(786940);
        lCtas.add(c1);

        c1 = new ContaCorrente(869463);
        lCtas.add(c1);

        c1 = new ContaCorrente(956342);
        lCtas.add(c1);

        for(int i =0; i<lCtas.size();i++)
            System.out.printf("Nome: "+lCtas.get(i).getNroConta() + " " + "Posição: "+i);
        System.out.println();

        for (ContaCorrente c:lCtas)
            System.out.printf("Nome: "+c.getNroConta() + " ");
        System.out.println();
    }*/

}

