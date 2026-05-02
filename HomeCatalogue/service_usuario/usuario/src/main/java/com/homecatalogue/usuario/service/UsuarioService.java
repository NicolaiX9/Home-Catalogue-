package com.homecatalogue.usuario.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.homecatalogue.usuario.model.Usuario;
import com.homecatalogue.usuario.repository.UsuarioRepository;

import jakarta.transaction.Transactional;

//Le indica al software que esta pieza pertenece a la capa de service
@Service

public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public List <Usuario> listarTodos(){
        return usuarioRepository.findAll();
    }

    @Transactional
    public Usuario guardar(Usuario usuario){
        if (usuario.getId() != null){
            
        }
        return usuarioRepository.save(usuario);
    }

}




