package backend.model;

import java.util.ArrayList;

public class Proveedor {

	private Negocio negocio;
	private ArrayList<Menu> menus;

	public Proveedor() {
		this.negocio = null;
		this.menus = new ArrayList<Menu>();
	}
}
