package com.ecommerce.ecommerce.controller;

import com.ecommerce.ecommerce.entity.Usuario;
import com.ecommerce.ecommerce.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController // Define que esta classe é uma API REST
@RequestMapping("/usuarios") // Todas as URLs aqui começarão com /usuarios
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping // Método para CADASTRAR (enviar dados)
    public Usuario criar(@RequestBody Usuario usuario) {
        return usuarioService.salvar(usuario);
    }

    @GetMapping // Método para LISTAR (buscar dados)
    public List<Usuario> listar() {
        return usuarioService.listarTodos();
    }
}