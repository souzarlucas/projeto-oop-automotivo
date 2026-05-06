package com.ecommerce.ecommerce.repository;

import com.ecommerce.ecommerce.entity.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VeiculoRepository extends JpaRepository<Veiculo, Long> {
    List<Veiculo> findByStatus(String status);
    List<Veiculo> findByPrecoLessThan(Double preco);
}
