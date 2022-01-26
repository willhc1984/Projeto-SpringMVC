package com.whcampos.projetomvc.dao;

import com.whcampos.projetomvc.model.Departamento;

import java.util.List;

public interface DepartamentoDAO {

    void save(Departamento departamento);
    void update(Departamento departamento);
    void delete(Long id);
    Departamento findById(Long id);
    List<Departamento> findAll();

}
