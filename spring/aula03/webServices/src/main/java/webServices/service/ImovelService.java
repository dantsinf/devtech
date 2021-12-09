package webServices.service;

import webServices.domain.Imovel;
import webServices.domain.TipoImovel;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ImovelService {
    ArrayList<Imovel> imoveis = new ArrayList<>();
    public List buscaTodosImoveis(){
        List imoveisDisponiveis = new ArrayList();
        return imoveisDisponiveis = imoveis.stream().filter(iterator-> iterator.isDisponibilidade()==true).collect(Collectors.toList());
    }

    public List buscaImoveisDisponiveisPorTipo(TipoImovel tipoImovel){
        List buscaImoveisDisponiveisPorTipo = new ArrayList();
        return buscaImoveisDisponiveisPorTipo = imoveis.stream().filter(iterator-> iterator.isDisponibilidade()==true && iterator.getTipoImovel().equals(tipoImovel)).collect(Collectors.toList());
    }




}
