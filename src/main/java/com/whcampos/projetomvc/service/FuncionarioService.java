package com.whcampos.projetomvc.service;

import com.whcampos.projetomvc.model.Cargo;
import com.whcampos.projetomvc.model.Funcionario;

import java.time.LocalDate;
import java.util.List;

public interface FuncionarioService {

    void salvar (Funcionario funcionario);
    void editar(Funcionario funcionario);
    void excluir(Long id);

    Funcionario buscarPorId(Long id);
    List<Funcionario> buscarTodos();

    List<Funcionario> buscarPorNome(String nome);

    List<Funcionario> buscarPorCargo(Long id);

    List<Funcionario> buscarPorDatas(LocalDate entrada, LocalDate saida);
}
