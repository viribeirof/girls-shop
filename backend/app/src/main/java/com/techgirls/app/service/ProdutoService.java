package com.techgirls.app.service;

import com.techgirls.app.entity.Categoria;
import com.techgirls.app.entity.Produto;
import com.techgirls.app.repository.CategoriaRepository;
import com.techgirls.app.repository.ProdutoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProdutoService {

    private final ProdutoRepository produtoRepository;
    private final CategoriaRepository categoriaRepository;

    public List<Produto> listarTodos() {
        return produtoRepository.findAll();
    }

    public Produto buscarPorId(Long id) {
        return produtoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Produto não encontrado."));
    }

    public Produto salvar(Produto produto) {

        Categoria categoria = categoriaRepository.findById(produto.getCategoria().getId())
                .orElseThrow(() -> new RuntimeException("Categoria não encontrada."));

        produto.setCategoria(categoria);

        return produtoRepository.save(produto);
    }

    public Produto atualizar(Long id, Produto produtoAtualizado) {

        Produto produto = buscarPorId(id);

        Categoria categoria = categoriaRepository.findById(produtoAtualizado.getCategoria().getId())
                .orElseThrow(() -> new RuntimeException("Categoria não encontrada."));

        produto.setNome(produtoAtualizado.getNome());
        produto.setDescricao(produtoAtualizado.getDescricao());
        produto.setPreco(produtoAtualizado.getPreco());
        produto.setEstoque(produtoAtualizado.getEstoque());
        produto.setCategoria(categoria);

        return produtoRepository.save(produto);
    }

    public void excluir(Long id) {

        Produto produto = buscarPorId(id);

        produtoRepository.delete(produto);
    }
}