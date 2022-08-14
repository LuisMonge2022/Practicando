package com.idat.Practicando.servicio;

import java.util.List;

import com.idat.Practicando.dto.ProductoDTORequest;
import com.idat.Practicando.dto.ProductoDTOResponse;
import com.idat.Practicando.modelo.Productos;


public interface ProductoServicio {
	
	
	public void guardarProducto(ProductoDTORequest producto);
	public void editarProducto(ProductoDTORequest producto);
	
	public void eliminarProducto(Integer id);
	
	public List<ProductoDTOResponse> listarProductos();
	public ProductoDTOResponse obtenerProductoId(Integer id);

}
