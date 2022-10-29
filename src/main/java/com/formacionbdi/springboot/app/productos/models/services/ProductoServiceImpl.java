package com.formacionbdi.springboot.app.productos.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.formacionbdi.springboot.app.productos.models.dao.ProductoDao;
import com.formacionbdi.springboot.app.productos.models.entity.Producto;


@Service
public class ProductoServiceImpl implements IProductoService {

	
	@Autowired
	ProductoDao  productDao;
	
	@Override
	@Transactional()
	public List<Producto> findAll() {
	
		return ( List<Producto>)  productDao.findAll();
	}

	@Override
	@Transactional(readOnly = true )
	public Producto findById(Long id) {
		return productDao.findById(id).orElse(null); 
	}

}
