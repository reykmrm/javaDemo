package com.example.repositorios.persistencia;

import com.example.modelos.TipoUsuarios;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ITipoUsuarioRepositoryJpa extends JpaRepository<TipoUsuarios, Integer> {
}
