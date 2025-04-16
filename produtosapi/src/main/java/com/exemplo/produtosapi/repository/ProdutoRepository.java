package com.exemplo.produtosapi.repository;

import com.exemplo.produtosapi.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, String> {



}
