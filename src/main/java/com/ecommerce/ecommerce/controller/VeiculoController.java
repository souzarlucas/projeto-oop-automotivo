package com.ecommerce.ecommerce.controller;

import com.ecommerce.ecommerce.entity.Veiculo;
import com.ecommerce.ecommerce.service.VeiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/veiculos") // Agora o endereço será http://localhost:8080/veiculos
public class VeiculoController {

    @Autowired
    private VeiculoService veiculoService;

    @PostMapping
    public Veiculo criar(@RequestBody Veiculo veiculo) {
        return veiculoService.salvar(veiculo);
    }

    @GetMapping
    public List<Veiculo> listar() {
        return veiculoService.listarTodos();
    }
}
