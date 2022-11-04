package libros;

import java.util.ArrayList;

import autores.Autores;

public class Libros {
	
	//POJO LIBROS
	
	private String titulo; //1-1
	private double precio; // 1-11
	private ArrayList<Autores> listaAutores;   //1-n
	private Autores autor; 
	
	
	public Libros() {};
	
	public Libros(String titulo, double precio, ArrayList<Autores> listaAutores) {
		super();
		this.titulo = titulo;
		this.precio = precio;
		this.listaAutores = listaAutores;
	}
	
	
	public Libros(String titulo, double precio, Autores autor) {
		super();
		this.titulo = titulo;
		this.precio = precio;
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public ArrayList<Autores> getListaAutores() {
		return listaAutores;
	}

	public void setListaAutores(ArrayList<Autores> listaAutores) {
		this.listaAutores = listaAutores;
	}
	
	
	

}
