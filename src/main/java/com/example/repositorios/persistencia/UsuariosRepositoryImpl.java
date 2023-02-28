package com.example.repositorios.persistencia;

import com.example.modelos.Usuarios;
import com.example.repositorios.IUsuariosRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@AllArgsConstructor
public class UsuariosRepositoryImpl implements IUsuariosRepository {

    private final IUsuarioRepositoryJpa usuariosRepositoryJpa;

    @Override
    public List<Usuarios> getUsuarios() {
        return this.usuariosRepositoryJpa.findAll();
    }

    @Override
    public Usuarios getUsuarioById(Integer id) {
        return this.usuariosRepositoryJpa.findById(id).orElse(null);
    }

    @Override
    public Usuarios createUsuario(Usuarios usuario) {
        return this.usuariosRepositoryJpa.save(usuario);
    }

    @Override
    public Usuarios updateUsuario(Usuarios usuario) {
        return this.usuariosRepositoryJpa.save(usuario);
    }

    @Override
    public void deleteUsuarioById(Integer id) {
        this.usuariosRepositoryJpa.deleteById(id);
    }
}
