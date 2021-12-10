package webServices.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import webServices.domain.Usuario;

public class UsuarioServiceTest {
    private UsuarioService usuarioService;
    private Usuario usuario;

    @BeforeEach
    public void beforeAll(){
        usuarioService = new UsuarioService();
        usuarioService.iniciar();
    }

    @Test
    void cadastraUsuario(){
        usuario = new Usuario("Claudio","001", TipoUsuario.LOCADOR);
        String usuarioSalvo = usuarioService.cadastraUsuario(usuario);
        Assertion.assertEquals(usuarioSalvo, "Usuário cadastrado com sucesso!");
    }

    @Test
    void usuarioJaExiste(){
        usuario = new Usuario("Claudio","001", TipoUsuario.LOCADOR);
        String usuarioSalvo = usuarioService.cadastraUsuario(usuario);
        Assertion.assertEquals(usuarioSalvo, "Usuário cadastrado com sucesso!");
    }






}
