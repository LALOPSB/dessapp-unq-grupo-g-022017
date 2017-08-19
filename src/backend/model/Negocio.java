package backend.model;

public class Negocio {

	/*TODO: 
	 * Se podrian poner los campos 'nombre', 'localidad','email', 'telefono'
	 * en un objeto aparte Persona. 
	 * Esos campos tambien los tienen los clientes, ademas del CUIT
	 */
	/*TODO 2:
	 * Cambiar los campos de tipo 'Object' por una clase del modelo.
	 */
	
	private String numbre;
	private String localidad;
	private Object logo;
	private Object ubicacionGoogle;
	private String descripcion;
	private Object email;
	private String telefono;
	private Object localidadDeEntregas;
	private Object horariosDeAtencion;
	private String sitioWeb;

	public Negocio(String nombre, Object logo, String localidad, String descripcion, String email, String telefono) {
		this.numbre = nombre;
		this.logo = logo;
		this.localidad = localidad;
		this.ubicacionGoogle = this.conseguirUbicacionGoogleMaps();
		this.descripcion = descripcion;
		this.sitioWeb = "";
		this.email = email;
		this.telefono = telefono;
		this.horariosDeAtencion = horariosDeAtencion;
		this.localidadDeEntregas = this.getLocalidadDeEntregas();
	}

	private Object getLocalidadDeEntregas() {
		// TODO Auto-generated method stub
		return null;
	}

	private Object conseguirUbicacionGoogleMaps() {
		// TODO Auto-generated method stub
		return null;
	}

}
