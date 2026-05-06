package com.ecommerce.ecommerce.service;

import com.ecommerce.ecommerce.entity.Usuario;
import com.ecommerce.ecommerce.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service // Diz ao Spring que aqui ficam as regras de negócio
public class UsuarioService {

    @Autowired // "Injeta" o repository para podermos usar os comandos de banco
    private UsuarioRepository usuarioRepository;

    public Usuario salvar(Usuario usuario) {
        return usuarioRepository.save(usuario); // Usa o método que já vem no JpaRepository
    }

    public List<Usuario> listarTodos() {
        return usuarioRepository.findAll();
    }
}