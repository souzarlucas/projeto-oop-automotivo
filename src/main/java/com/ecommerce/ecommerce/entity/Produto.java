package com.ecommerce.ecommerce.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity // Marca como tabela [cite: 237, 311]
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor // "Mágica" do Lombok para economizar código [cite: 237, 280]
public class Produto {

    @Id // Chave primária [cite: 238, 312]
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-incremento [cite: 238, 312]
    private Long id;

    private String nome;
    private Double preco;

    // Relacionamento: Muitos produtos pertencem a um único usuário [cite: 239, 278,
    // 315]
    @ManyToOne
    @JoinColumn(name = "usuario_id") // Nome da coluna que ligará as duas tabelas (FK) [cite: 239, 279, 316]
    private Usuario usuario;
}