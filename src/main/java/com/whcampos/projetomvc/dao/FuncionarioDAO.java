package com.whcampos.projetomvc.dao;

import com.whcampos.projetomvc.model.Cargo;
import com.whcampos.projetomvc.model.Funcionario;

import java.util.List;

public interface FuncionarioDAO {

    void save(Funcionario funcionario);
    void update(Funcionario funcionario);
    void delete(Long id);
    Funcionario findById(Long id);
    List<Funcionario> findAll();

}
