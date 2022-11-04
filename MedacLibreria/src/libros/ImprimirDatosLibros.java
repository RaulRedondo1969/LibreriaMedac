package libros;

import java.util.ArrayList;

import autores.Autores;

public class ImprimirDatosLibros {
	
	
	public static void imprimirLibro(Libros libro, ArrayList<Autores> listaAutores) {
		
		
	System.out.println("Titulo del libro..."+libro.getTitulo());
	System.out.println("Precio del libro..."+libro.getPrecio());
	
	for (Autores autores : listaAutores) {
		
		System.out.println("Nombre de autor...."+autores.getNombreAutor());
		System.out.println("Licencia de autor...."+autores.getLicenciaFiscal());
		
		
	}
	
	
	/*for (int i = 0; i < libro.getListaAutores().size(); i++) {
		System.out.println("El nombre del autor es: "+ libro.getListaAutores().get(i).getNombreAutor() 
				+ " y su licencia fiscal es: " + libro.getListaAutores().get(i).getLicenciaFiscal());
	}*/
	
	
	}
	
	

}
