package backend.model;

import java.util.Optional;
import java.util.OptionalInt;

public class Menu {

	/*TODO:
	 * Mejorar el constructor de la clase. Tiene demaciados parametros.
	 */
	private String nombre;
	private String descrpicion;
	private Categoria categoria;
	private Integer valorDelivery;
	private Object periodo;
	private Integer tiempoPromedio;
	private Integer cantidadMinima;
	private Integer cantidadMaximaDiaria;
	private Optional<Integer> cantidadMinima2;
	private Integer precio;
	private Integer precioCantidadMinima;
	private Optional<Integer> precioCantidadMinima2;
	
	public Menu(String nombre, String descripcion, Categoria categoria, 
			Integer valorDelivery, Object periodoDesdeHasta, Integer tiempoPromedioEnMinutos, 
			Integer cantidadMinima, Integer precioCantidadMinima, Integer cantidadMaximaVentasPorDia) {
		
		this.nombre = nombre;
		this.descrpicion = descripcion;
		this.categoria = categoria;
		this.valorDelivery = valorDelivery;
		this.periodo = periodoDesdeHasta;
		this.tiempoPromedio = tiempoPromedioEnMinutos;
		this.precio = 0;
		this.cantidadMinima = cantidadMinima;
		this.precioCantidadMinima = precioCantidadMinima;
		this.cantidadMaximaDiaria = cantidadMaximaVentasPorDia;
		this.cantidadMinima2 = Optional.empty();
		this.precioCantidadMinima2 = Optional.empty();
	}
}
