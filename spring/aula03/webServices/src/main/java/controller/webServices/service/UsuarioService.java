package controller.webServices.service;

import java.util.ArrayList;
import java.util.List;

public class UsuarioService {
    ArrayList<Usuario> listaUsuarios = new ArrayList<>();
    public void iniciar(){
        listaUsuarios.add(new Usuario("Vanessa","8", TipoUsuario.LOCADOR));
        listaUsuarios.add(new Usuario("Vanessa","8", TipoUsuario.LOCATARIO));
    }

    public Usuario cadastraUsuario(Usuario usuario){
        listaUsuarios.add(usuario);
        return usuario;
    }

    public List busca(){
        return listaUsuarios;
    }
    public Usuario buscaUsuario(String user){
        for (int i=0; i< listaUsuarios.size(); i++){
            if (listaUsuarios.get(i).geUser().equals(user))
                return listaUsuarios.get(i);
        }
        return null;
    }

    public String delte(String user){
        String resposta = null;
        for(int=0; i<listaUsuarios.size();i++){
            if (listaUsuarios.get(i).getUser().equals(user)){
                listaUsuarios.remove(i);
                resposta = "Removido com sucesso!";
            }else{
                resposta = "Usuário não encontrado!";
            }
        }
        return resposta;
    }

    public String valida(String user, String senha){
        Usuario usuario = listaUsuarios.stream().filter(iterator->iterator.getUser().equals(user)).findFirst();
        if (usuario.getSenha().equals(senha) && usuario.getTipoUsuario().equals(TipoUsuario.LOCADOR)){
            locadorLogado = true;
            return "Locador logado";
        }else if (usuario.getSenha().equals(senha) && usuario.getTipoUsuario().equals(TipoUsuario.LOCADOR)){
            locatarioLogado=true;
            return "Loctario Logado";
        }
        return "Não logado";
    }
}
