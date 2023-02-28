package com.example.repositorios;

import com.example.modelos.TipoUsuarios;
import com.example.modelos.Usuarios;

import java.util.List;

public interface ITipoUsuariosRepository {
    List<TipoUsuarios> getTipoUsuarios();
    TipoUsuarios getTipoUsuariosById(Integer id);
    TipoUsuarios createTipoUsuarios(TipoUsuarios tipoUsuarios);
    TipoUsuarios updateTipoUsuarios(TipoUsuarios tipoUsuarios);
    void deleteTipoUsuariosById(Integer id);
}
