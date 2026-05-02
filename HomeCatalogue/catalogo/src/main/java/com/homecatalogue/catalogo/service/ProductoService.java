package com.homecatalogue.catalogo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.homecatalogue.catalogo.modelo.Producto;
import com.homecatalogue.catalogo.repository.ProductoRepository;

import jakarta.transaction.Transactional;

@Service

public class ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    public List <Producto> listarProducto(){
        return productoRepository.findAll();
    }

    public Optional <Producto> buscarPorId(Long id){
        return productoRepository.findById(id);
    }

    public Optional <Producto> buscarPorIdCategoria(Long idCategoria){
        return productoRepository.findByIdCategoria(idCategoria);
    }

    @Transactional
    public Producto guardar(Producto producto){
        return productoRepository.save(producto);
    }

}
