package com.example.servicios;

import com.example.modelos.Usuarios;
import com.example.repositorios.IUsuariosRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UsuariosServiceImpl implements IUsuariosServece{

    private final IUsuariosRepository usuariosRepository;
    @Override
    public List<Usuarios> getUsuarios() {
        return this.usuariosRepository.getUsuarios();
    }

    @Override
    public Usuarios getUsuarioById(Integer id) {
        return this.usuariosRepository.getUsuarioById(id);
    }

    @Override
    public Usuarios createUsuario(Usuarios usuario) {
        return this.usuariosRepository.createUsuario(usuario);
    }

    @Override
    public Usuarios updateUsuario(Usuarios usuario) {
        return this.usuariosRepository.updateUsuario(usuario);
    }

    @Override
    public void deleteUsuarioById(Integer id) {
        this.usuariosRepository.deleteUsuarioById(id);
    }
}
