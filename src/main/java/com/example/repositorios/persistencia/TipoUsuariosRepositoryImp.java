package com.example.repositorios.persistencia;

import com.example.modelos.TipoUsuarios;
import com.example.repositorios.ITipoUsuariosRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@AllArgsConstructor
public class TipoUsuariosRepositoryImp implements ITipoUsuariosRepository {

    private final ITipoUsuarioRepositoryJpa tipoUsuarioRepository;


    @Override
    public List<TipoUsuarios> getTipoUsuarios() {
        return tipoUsuarioRepository.findAll();
    }

    @Override
    public TipoUsuarios getTipoUsuariosById(Integer id) {
        return this.tipoUsuarioRepository.findById(id).orElse(null);
    }

    @Override
    public TipoUsuarios createTipoUsuarios(TipoUsuarios tipoUsuarios) {
        return tipoUsuarioRepository.save(tipoUsuarios);
    }

    @Override
    public TipoUsuarios updateTipoUsuarios(TipoUsuarios tipoUsuarios) {
        return tipoUsuarioRepository.save(tipoUsuarios);
    }

    @Override
    public void deleteTipoUsuariosById(Integer id) {
        tipoUsuarioRepository.deleteById(id);
    }
}
