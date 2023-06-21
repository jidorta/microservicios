package com.ibandorta.app.productos.models.service;

import java.util.List;

import com.ibandorta.app.productos.models.entity.Producto;

public interface IProductosService {
	
	public List<Producto>findAll();
	public Producto findById(Long i);

}
