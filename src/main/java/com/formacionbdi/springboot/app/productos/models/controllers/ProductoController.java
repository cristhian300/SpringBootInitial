package com.formacionbdi.springboot.app.productos.models.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.formacionbdi.springboot.app.productos.models.entity.Producto;
import com.formacionbdi.springboot.app.productos.models.services.ProductoServiceImpl;

@RestController
public class ProductoController {

	@Autowired
	ProductoServiceImpl productoService;
	
	
	
	@GetMapping("/listadoProducto")
	public List<Producto> listProduct(){
		
		return productoService.findAll();
	}
	
	
	@GetMapping("/ver/{id}")
	public Producto detalle(@PathVariable  long id){
		
		return productoService.findById(id);
	}
}
