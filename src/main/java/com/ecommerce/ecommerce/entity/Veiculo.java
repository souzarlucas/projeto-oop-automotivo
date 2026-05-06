package com.ecommerce.ecommerce.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Veiculo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String cor;
    private Integer ano;
    private Double preco;
    private Integer quilometragem;
    private String status; // Disponível/Vendido

    @ManyToOne
    @JoinColumn(name = "modelo_id")
    private Modelo modelo;
}
