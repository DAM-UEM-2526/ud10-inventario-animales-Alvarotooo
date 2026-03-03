package tarea;

public class Test {

	public static void main(String[] args) {

		// Creamos los dos objetos
		Perro r = new Perro("Rocky", 3, "OK", "2312211");
		Gato g = new Gato("Negro", 2, "OK", "01");

		// Mostramos el nombre de r y el estado de g
		System.out.println(r.getNombrel());
		System.out.println(g.getEstado());

		// Nuevo objeto de Inventario
		Inventario i = new Inventario();

		// Insertamos las mascotas
		i.insertaMascota(r);
		i.insertaMascota(g);

		// Imprimo todos para despues imprimir solo los perros
		i.imprimirTodos();
		i.imprimirperros();

		// Vacio la lista y no se muestra nada
		i.vaciar();
		i.imprimirTodos();
		i.imprimirperros();

	}
}
