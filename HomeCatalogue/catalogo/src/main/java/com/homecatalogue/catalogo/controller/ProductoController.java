package com.homecatalogue.catalogo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.homecatalogue.catalogo.modelo.Producto;
import com.homecatalogue.catalogo.service.ProductoService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/v1/productos")
public class ProductoController {

    @Autowired
    private ProductoService productoService;
    
    @GetMapping
    public List <Producto> listar(){
        return productoService.listarProducto();
    }


    @GetMapping("/(id)")
    public ResponseEntity<Producto> obtener(@PathVariable Long id){
        return productoService.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }


    @GetMapping("/(id_categoria)")
    public ResponseEntity<Producto> obtenerIdCategoria(@PathVariable Long idCategoria){
        return productoService.buscarPorIdCategoria(idCategoria)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Producto guardarProducto(@RequestBody Producto producto) {
        return productoService.guardar(producto);
    }
    

}
