package com.ecommerce.ecommerce.repository;

import com.ecommerce.ecommerce.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

// Estender JpaRepository entrega todos os comandos de banco (Salvar, Deletar, Buscar)
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    // Método personalizado: O Spring cria o SQL sozinho apenas lendo o nome do
    // método!
    Optional<Usuario> findByNome(String nome);
}