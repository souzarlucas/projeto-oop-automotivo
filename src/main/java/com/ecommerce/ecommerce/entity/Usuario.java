package com.ecommerce.ecommerce.entity;

import jakarta.persistence.*;
import lombok.*;
import java.util.List;

@Entity // Diz ao Java que isso será uma tabela no banco [cite: 233, 311]
@Getter // Cria automaticamente os métodos para ler os dados [cite: 233, 310]
@Setter // Cria automaticamente os métodos para alterar os dados [cite: 233, 310]
@NoArgsConstructor // Cria o construtor vazio (exigido pelo JPA) [cite: 233, 281]
@AllArgsConstructor // Cria o construtor com todos os campos [cite: 233, 310]
public class Usuario {

    @Id // Define que este campo é a chave primária (o RG da linha) [cite: 233, 275]
    @GeneratedValue(strategy = GenerationType.IDENTITY) // O banco gera o ID sozinho (1, 2, 3...) [cite: 233, 312]
    private Long id;

    private String nome;

    // Relacionamento: Um usuário para muitos produtos [cite: 235, 276, 309]
    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
    private List<Produto> produtos;
}