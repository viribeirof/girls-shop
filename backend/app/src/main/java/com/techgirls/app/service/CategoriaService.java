package com.techgirls.app.service;

import com.techgirls.app.entity.Categoria;
import com.techgirls.app.repository.CategoriaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoriaService {

    private final CategoriaRepository categoriaRepository;

    public List<Categoria> listarTodos() {
        return categoriaRepository.findAll();
    }

    public Categoria salvar(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }

    public Categoria buscarPorId(Long id) {
        return categoriaRepository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Categoria não encontrada."));
    }

    public Categoria atualizar(Long id, Categoria categoriaAtualizada) {

        Categoria categoria = buscarPorId(id);

        categoria.setNome(categoriaAtualizada.getNome());
        categoria.setDescricao(categoriaAtualizada.getDescricao());

        return categoriaRepository.save(categoria);
    }

    public void excluir(Long id) {

        Categoria categoria = buscarPorId(id);

        categoriaRepository.delete(categoria);
    }
}