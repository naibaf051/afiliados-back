package com.emssanar.afiliadosback.service;

import com.emssanar.afiliadosback.entity.Afiliado;
import com.emssanar.afiliadosback.repository.AfiliadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AfiliadoService {
    @Autowired
    private AfiliadoRepository afiliadoRepository;

    public List<Afiliado> consultarTodos() throws Exception {
        List<Afiliado> list = afiliadoRepository.findAll();
        return list;
    }

    public Afiliado consultarAfiliado(int id) throws Exception {
        Optional<Afiliado> optAfiliado = afiliadoRepository.findById(id);
        return optAfiliado.get();
    }

    public Afiliado registrarAfiliado(Afiliado nuevoAfiliado) throws Exception {
        Afiliado afiliado = afiliadoRepository.save(nuevoAfiliado);
        return afiliado;
    }

    public Afiliado actualizarAfiliado(Afiliado nuevoAfiliado, int id) throws Exception {
        nuevoAfiliado.setId(id);
        Afiliado afiliado = afiliadoRepository.save(nuevoAfiliado);
        return afiliado;
    }

    public int eliminarAfiliado(Integer id) throws Exception {
        Afiliado afiliado = consultarAfiliado(id);
        afiliadoRepository.delete(afiliado);
        return id;
    }
}
