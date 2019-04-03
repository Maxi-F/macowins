package macowins;

import macowins.TipoPrenda.*;

public class Prenda {
	private TipoPrenda tipo;
	private int precioBase;
	
	public Prenda(TipoPrenda unTipo, int unPrecioBase) {
		this.tipo = unTipo;
		this.precioBase = unPrecioBase;
	}
	
	public boolean esSaco() {
		return (this.tipo == TipoPrenda.SACO);
	}
}
