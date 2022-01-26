package com.whcampos.projetomvc.dao;

import com.whcampos.projetomvc.model.Funcionario;
import org.springframework.stereotype.Repository;

@Repository
public class FuncionarioDAOImp extends AbstractDAO<Funcionario, Long> implements FuncionarioDAO{
}
