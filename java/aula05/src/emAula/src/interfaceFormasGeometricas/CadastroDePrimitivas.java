package emAula.src.interfaceFormasGeometricas;

import java.util.ArrayList;

public class CadastroDePrimitivas {

    private ArrayList<PrimitivaGrafica> cad = new ArrayList<>();

    public void addPrimitiva(PrimitivaGrafica p){
        cad.add(p);
    }

    public String toString(){
        String res = " ";

        for (PrimitivaGrafica p:cad){
            res += p.getNome();

            if (p instanceof  Circulo){
                res += " com centro em ("+
                        ((Circulo)p.getCentro().getX()+
                        ", " + ((Circulo)p.getCentro().getX()+ ") e raio "+
                                ((Circulo)p.getRaio();
            }
            else if (p instanceof Ponto){

            }
            else if (p instanceof Quadrado){

            }


        }
        return res;

    }



}
