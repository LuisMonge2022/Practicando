package com.idat.Practicando.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.Practicando.modelo.Productos;


@Repository
public interface ProductoRepositorio extends JpaRepository<Productos, Integer>  {
	
	

}
