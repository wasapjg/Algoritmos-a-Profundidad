public class Main {
	public static void main(String[] args) {
		int[] miArreglo = {3, 1, 4, 2, 5};
		int elementoABuscar = 4;
		int resultado = BusquedaSecuencial.busquedaSecuencial(miArreglo, elementoABuscar);
		System.out.println("El elemento " + elementoABuscar + " se encuentra en el índice: "
		+ resultado);
	}
}
