package com.nicolas.homecatalogue.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nicolas.homecatalogue.model.Usuario;
import com.nicolas.homecatalogue.repository.UsuarioRepository;

import jakarta.transaction.Transactional;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<Usuario> listarUsuario(){
        return usuarioRepository.findAll();
    }

    @Transactional
    public Optional<Usuario> buscarPorId(Long id){
        return usuarioRepository.findById(id);
    }

    @Transactional
    public Optional<Usuario> buscarPorRun(String run){
        return usuarioRepository.findByRun(run);
    }


    public Usuario guardarUsuario(Usuario usuario){
        return usuarioRepository.save(usuario);
    }
}
