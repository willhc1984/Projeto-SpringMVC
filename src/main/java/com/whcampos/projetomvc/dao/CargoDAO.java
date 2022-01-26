package com.whcampos.projetomvc.dao;

import com.whcampos.projetomvc.model.Cargo;
import com.whcampos.projetomvc.model.Departamento;

import java.util.List;

public interface CargoDAO {

    void save(Cargo cargo);
    void update(Cargo cargo);
    void delete(Long id);
    Cargo findById(Long id);
    List<Cargo> findAll();
}
