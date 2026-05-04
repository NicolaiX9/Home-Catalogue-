package com.homecatalogue.catalogo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.homecatalogue.catalogo.modelo.Producto;



public interface ProductoRepository extends JpaRepository <Producto, Long> {


    Optional <Producto> findByIdCategoria(Long idCategoria);

}
