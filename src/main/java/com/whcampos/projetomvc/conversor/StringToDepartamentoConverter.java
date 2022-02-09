package com.whcampos.projetomvc.conversor;

import com.whcampos.projetomvc.model.Departamento;
import com.whcampos.projetomvc.service.DepartamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class StringToDepartamentoConverter implements Converter<String, Departamento>{

    @Autowired
    private DepartamentoService departamentoService;

    @Override
    public Departamento convert(String text) {
        if(text.isEmpty()){
            return null;
        }
        Long id = Long.valueOf(text);
        return departamentoService.buscarPorId(id);
    }
}
