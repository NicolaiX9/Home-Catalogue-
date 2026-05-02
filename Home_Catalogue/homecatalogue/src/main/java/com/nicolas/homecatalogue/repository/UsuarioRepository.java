package com.nicolas.homecatalogue.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nicolas.homecatalogue.model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

    
    Optional<Usuario> findByRun(String run); 
            
        
    
    

}
