package com.idat.Practicando.modelo;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Table(name="Productos")
@Entity
public class Productos implements Serializable{
	
	private static final long serialVersionUID = 4219487095040714627L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idProducto;		
	private String nombreProducto;
	private String descripcion;
	private Double precio;
	private Integer stock;
	
	@OneToOne(mappedBy = "producto")
	private Proveedor proveedor;
	
	
	@ManyToMany(cascade = {CascadeType.PERSIST,CascadeType.MERGE})
	@JoinTable(name="producto_cliente",
		joinColumns =
			@JoinColumn(
					name="id_cliente", 
					nullable = false, 
					unique = true, 
					foreignKey = @ForeignKey(foreignKeyDefinition = "foreign key(id_cliente) references clientes(id_cliente)")),
		inverseJoinColumns = 
			@JoinColumn(
					name="id_producto", 
					nullable = false, 
					unique = true, 
					foreignKey = @ForeignKey(foreignKeyDefinition = "foreign key(id_producto) references Productos(id_producto)"))
	)
	private List<Cliente> cliente;
	
	
	
	public Productos(Integer idProducto, String nombreProducto, String descripcion, Double precio, Integer stock) {
		super();
		this.idProducto = idProducto;
		this.nombreProducto = nombreProducto;
		this.descripcion = descripcion;
		this.precio = precio;
		this.stock = stock;
	}
	public Integer getIdProducto() {
		return idProducto;
	}
	public void setIdProducto(Integer idProducto) {
		this.idProducto = idProducto;
	}
	public String getNombreProducto() {
		return nombreProducto;
	}
	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public Integer getStock() {
		return stock;
	}
	public void setStock(Integer stock) {
		this.stock = stock;
	}
	public Productos() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
