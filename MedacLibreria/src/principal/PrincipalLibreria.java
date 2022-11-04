package principal;

import java.util.ArrayList;

import autores.Autores;
import libros.ImprimirDatosLibros;
import libros.Libros;

public class PrincipalLibreria {

	public static void main(String[] args) {

		Autores autor1 = new Autores("Perez de Reverte", 1111);
		Autores autor2 = new Autores("Cervantes", 2222);
		Autores autor3 = new Autores("Gongora", 3333);
		ArrayList<Autores> listaAutores = new ArrayList<>();
		listaAutores.add(autor1);
		listaAutores.add(autor2);
		listaAutores.add(autor3);


		Libros libro1 = new Libros("Desconocido", 22.00, listaAutores);
		ImprimirDatosLibros.imprimirLibro(libro1,listaAutores);

	
		

	}

}
