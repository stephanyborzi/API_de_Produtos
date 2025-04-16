package com.exemplo.produtosapi.controller;

import com.exemplo.produtosapi.model.Produto;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    private List<Produto> listaProdutos = new ArrayList<>();

    @PostMapping
    public Produto salvar(@RequestBody Produto produto) {
        listaProdutos.add(produto);
        return produto;
    }

    @GetMapping
    public List<Produto> listar() {
        return listaProdutos;
    }
}
