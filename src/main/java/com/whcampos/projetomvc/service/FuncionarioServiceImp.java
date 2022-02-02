package com.whcampos.projetomvc.service;

import com.whcampos.projetomvc.dao.FuncionarioDAO;
import com.whcampos.projetomvc.model.Funcionario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class FuncionarioServiceImp implements FuncionarioService{

    @Autowired
    private FuncionarioDAO dao;

    @Transactional(readOnly = false)
    @Override
    public void salvar(Funcionario funcionario) {
        dao.save(funcionario);
    }

    @Transactional(readOnly = false)
    @Override
    public void editar(Funcionario funcionario) {
        dao.update(funcionario);
    }

    @Transactional(readOnly = false)
    @Override
    public void excluir(Long id) {
        dao.delete(id);
    }

    @Override
    public Funcionario buscarPorId(Long id) {
        return dao.findById(id);
    }

    @Override
    public List<Funcionario> buscarTodos() {
        return dao.findAll();
    }
}
