package webServices.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import webServices.domain.Usuario;

public class UsuarioServiceTest {
    private UsuarioService usuarioService;
    private Usuario usuario;

    @BeforeEach
    public void beforeAll() {
        usuarioService = new UsuarioService();
        usuarioService.iniciar();
    }

    @Test
    void cadastraUsuario() {
        usuario = new Usuario("Claudio", "001", TipoUsuario.LOCADOR);
        String usuarioSalvo = usuarioService.cadastraUsuario(usuario);
        Assertion.assertEquals(usuarioSalvo, "Usuário cadastrado com sucesso!");
    }

    @Test
    void usuarioJaExiste() {
        usuario = new Usuario("Claudio", "001", TipoUsuario.LOCADOR);
        String usuarioSalvo = usuarioService.cadastraUsuario(usuario);
        Assertion.assertEquals(usuarioSalvo, "Usuário cadastrado com sucesso!");
    }

    @Test
    void buscaUsuario() {
        usuario usuarioSalvo = usuarioService.buscaUsuario("Lia")
        Assertion.assertEquals(usuarioSalvo.getUser(), "Lia");
    }

    @Test
    void delete() {
        String resposta = usuarioService.delete("Lia");
        Assertion.assertEquals(resposta, "Remova com sucesso!");
    }

    @Test
    void valida() {
        Assertion.assertEquals(usuarioService.valida("Lia", "123"), "Locador Logado");
    }

}

}
