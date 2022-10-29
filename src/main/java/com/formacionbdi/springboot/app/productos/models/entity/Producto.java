package com.formacionbdi.springboot.app.productos.models.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "productos" )
public class Producto {

	private Long id;
	private String nombre;
	private Double precio;
	private Date createAt;
}