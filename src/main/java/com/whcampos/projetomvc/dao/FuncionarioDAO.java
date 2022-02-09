package com.whcampos.projetomvc.dao;

import com.whcampos.projetomvc.model.Cargo;
import com.whcampos.projetomvc.model.Funcionario;

import java.time.LocalDate;
import java.util.List;

public interface FuncionarioDAO {

    void save(Funcionario funcionario);
    void update(Funcionario funcionario);
    void delete(Long id);
    Funcionario findById(Long id);
    List<Funcionario> findAll();

    List<Funcionario> findByNome(String nome);

    List<Funcionario> findByCargoId(Long id);

    List<Funcionario> findByDataEntradaSaida(LocalDate entrada, LocalDate saida);

    List<Funcionario> findByDataSaida(LocalDate saida);

    List<Funcionario> findByDataEntrada(LocalDate entrada);
}
