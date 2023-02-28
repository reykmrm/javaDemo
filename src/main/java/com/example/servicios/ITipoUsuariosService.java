package com.example.servicios;

import com.example.modelos.TipoUsuarios;

import java.util.List;

public interface ITipoUsuariosService {
    List<TipoUsuarios> getTipoUsuarios();
    TipoUsuarios getTipoUsuariosById(Integer id);
    TipoUsuarios createTipoUsuarios(TipoUsuarios tipoUsuarios);
    TipoUsuarios updateTipoUsuarios(TipoUsuarios tipoUsuarios);
    void deleteTipoUsuariosById(Integer id);
}
