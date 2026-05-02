package com.homecatalogue.usuario.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.homecatalogue.usuario.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
