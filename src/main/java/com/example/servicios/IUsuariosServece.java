package com.example.servicios;

import com.example.modelos.Usuarios;

import java.util.List;

public interface IUsuariosServece {
    List<Usuarios> getUsuarios();
    Usuarios getUsuarioById(Integer id);
    Usuarios createUsuario(Usuarios usuario);
    Usuarios updateUsuario(Usuarios usuario);
    void deleteUsuarioById(Integer id);
}
