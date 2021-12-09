package com.example.webServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@SpringBootApplication
public class UsuarioController {
	public static boolean locatarioLogado = false;
	public static boolean locadorLogado = false;

	@Autowired
	UsuarioService usuarioService;
	@PostMapping
	public void cadastro(@RequestBody Usuario usuario){
		usuarioService.cadastroUsuario(usuario);
	}
	@PostMapping("/login/{user}/{senha}")
	public String login(@PathVariable String user,@PathVariable String senha){
		return usuarioService.valida(user,senha);
	}

	@GetMapping("/iniciar")
	public void iniciar(){
		usuarioService.iniciar();
	}

	@GetMapping
	public List buscarTodos(){
		return  usuarioService.busca();
	}

	@DeleteMapping("/{user}")
	public void delete(@PathVariable String user) {
		usuarioService.delete(user);
	}


}
