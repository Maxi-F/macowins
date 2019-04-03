package macowins;

import junit.framework.Assert;

public class TipoPrendaTest {
	private Prenda prenda;
	
	@Before
	public void init() {
		this.prenda = new Prenda(SACO, 50);
	}
	
	@test
	public void tipoDePrendaSeriaSaco() {
		Assert.assertTrue(this.prenda.esSaco());
	}
}
