package br.com.codandosimple.dao;

import br.com.codandosimple.model.Categoria;
import br.com.codandosimple.model.Despesa;

import java.util.List;
import java.util.Optional;

public interface IDespesaDAO {
    Despesa save(Despesa despesa);
    Despesa update(Despesa despesa);
    void  delete(Long id);
    List<Despesa> findAll();
    Optional<Despesa> findById(Long id);
    List<Despesa> findByCategoria(Categoria categoria);



}
