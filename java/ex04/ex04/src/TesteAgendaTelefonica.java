public class TesteAgendaTelefonica {
    public static void main(String[] args) {
        AgendaTelefonica agtel = new AgendaTelefonica();

        agtel.inserir("Carla","51991332477");
        agtel.inserir("Maria","51991226777");
        agtel.inserir("Ana","51991332400");
        agtel.inserir("Marcia","51991116777");
        agtel.inserir("Luiza","51991119877");

        agtel.buscarNumero("51991116777");
        agtel.remover("Maria");
        agtel.tamanho();

        //agtel.mostrar();

    }
}
