package ejercicio01;

public class Libro {
	
	enum Genero{NARRATIVO, LIRICO, DRAMATICA, DIDACTICO, POETICO};
	private Genero gen;
	/**
	 * Atributo que guarda el titulo del libro
	 */
	private String titulo = "";

	/**
	 * Atributo que guarda el nombre del autor
	 */
	private String autor = "";

	/**
	 * Atributo que guarda el numero de ejemplares
	 */
	private int ejemplares;

	/**
	 * Atributo que guarda el numero de ejemplares prestados
	 */
	private int prestados;

	/**
	 * Constructor sin parametros
	 */
	public Libro() {

	}

	public Libro(String titulo, String autor, int ejemplares, int prestados, String genero) {
		this.titulo = titulo;
		this.autor = autor;
		this.ejemplares = ejemplares;
		this.prestados = prestados;
		this.gen = Genero.valueOf(genero.toUpperCase());
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getEjemplares() {
		return ejemplares;
	}

	public void setEjemplares(int ejemplares) {
		this.ejemplares = ejemplares;
	}

	public int getPrestados() {
		return prestados;
	}

	public void setPrestados(int prestados) {
		this.prestados = prestados;
	}

	public boolean prestamo(int cantidad) {

		boolean prestamo = false;

		if (this.ejemplares >= this.prestados) {
			prestamo = true;
			this.prestados += cantidad;
			this.ejemplares -= cantidad;
		}

		return prestamo;
	}

	public boolean devolucion(int cantidad) {

		boolean devolucion = false;

		if (this.prestados < ejemplares) {
			this.prestados -= cantidad;
			this.ejemplares += cantidad;
		}

		return devolucion;
	}
	
	@Override
	public String toString() {
		String cadena ="";
		cadena += "Titulo: " + this.titulo;
		cadena += "\nAutor: " + this.autor;
		cadena += "\nEjemplares: " + this.ejemplares;
		cadena += "\nPrestados: " + this.prestados;
		cadena += "\nGenero: " + this.gen;
		cadena += "\n----------------------";
		return cadena;
	}
}
