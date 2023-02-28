package com.example.servicios;

import com.example.modelos.TipoUsuarios;
import com.example.repositorios.ITipoUsuariosRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TipoUsuariosServiceImpl implements ITipoUsuariosService{
    private final ITipoUsuariosRepository tipoUsuariosRepository;
    @Override
    public List<TipoUsuarios> getTipoUsuarios() {
        return tipoUsuariosRepository.getTipoUsuarios();
    }

    @Override
    public TipoUsuarios getTipoUsuariosById(Integer id) {
        return tipoUsuariosRepository.getTipoUsuariosById(id);
    }

    @Override
    public TipoUsuarios createTipoUsuarios(TipoUsuarios tipoUsuarios) {
        return tipoUsuariosRepository.createTipoUsuarios(tipoUsuarios);
    }

    @Override
    public TipoUsuarios updateTipoUsuarios(TipoUsuarios tipoUsuarios) {
        return tipoUsuariosRepository.updateTipoUsuarios(tipoUsuarios);
    }

    @Override
    public void deleteTipoUsuariosById(Integer id) {
        tipoUsuariosRepository.deleteTipoUsuariosById(id);
    }
}
