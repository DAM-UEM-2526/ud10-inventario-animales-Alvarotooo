package tarea;

import java.util.ArrayList;

public class Inventario {

	// Inventario con las mascotas
	private ArrayList<Mascotas> inventario = new ArrayList<Mascotas>();

	// Metodo para vaciar con el removeall
	public void vaciar() {
		inventario.removeAll(inventario);
	}

	// Metodo para insertar las mascotas
	public void insertaMascota(Mascotas a) {
		inventario.add(a);
	}

	// En este foreach se va buscando el nombre de la mascota recorriendo toda la
	// lista y comparando los nombre
	public void eliminaMascota(String nombreI) {

		for (Mascotas mascotas : inventario) {
			if (mascotas.nombrel.equals(nombreI)) {
				inventario.remove(mascotas);
			}
		}
	}

	// Aqui va recorriendo todos los animales y imprime su nombre
	public void imprimirTodos() {
		for (Mascotas mascotas : inventario) {
			System.out.println(mascotas.nombrel);
		}
	}

	// Este metodo funciona exactamente igual que el anterior pero tiene un if con
	// el instance of para saber si el animal en el que está es un perro
	public void imprimirperros() {
		for (Mascotas mascotas : inventario) {
			if (mascotas instanceof Perro) {
				System.out.println(mascotas.nombrel);
			}
		}
	}

}
