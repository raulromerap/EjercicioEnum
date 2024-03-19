package ejercicio01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String genero = "";
		Libro lib1;
		Libro lib2;
		
		System.out.println("Introduce el genero del libro");
		genero = sc.nextLine();
		lib1 = new Libro("Pelele a la vista", "Héctor Parias", 100, 12, genero);
		
		System.out.println("Introduce el genero del libro");
		genero = sc.nextLine();
		 lib2 = new Libro("Cantos de una mujer enamorada", "Edupardo", 100, 12, genero);
		 
		 System.out.println(lib1);
		 System.out.println(lib2);
		 
		 sc.close();
	}
}
