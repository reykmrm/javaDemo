package com.example.repositorios.persistencia;

import com.example.modelos.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUsuarioRepositoryJpa extends JpaRepository<Usuarios, Integer> {
}
