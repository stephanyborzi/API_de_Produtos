package com.exemplo.produtosapi.controller;

import com.exemplo.produtosapi.model.Produto;
import com.exemplo.produtosapi.repository.ProdutoRepository;
import lombok.Setter;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    private List<Produto> listaProdutos = new ArrayList<>();

    private ProdutoRepository produtoRepository;

    public ProdutoController(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    @PostMapping
    public Produto salvar(@RequestBody Produto produto) {
        listaProdutos.add(produto);
        var id = UUID.randomUUID().toString();
        produto.setId(id);
        produtoRepository.save(produto);
        return produto;
    }

    @GetMapping
    public List<Produto> listar() {
        return listaProdutos;
    }
}
