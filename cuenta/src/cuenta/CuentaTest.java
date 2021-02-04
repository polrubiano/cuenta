package cuenta;

import static org.junit.Assert.*;

import org.junit.Test;

public class CuentaTest {
	
	@Test
	public void testIngresar() {
		Cuenta  cuenta = new Cuenta();
		double resultado = cuenta.ingresar(250);
		double esperado = 250;
		assertEquals(esperado,resultado,0.1);
	}
	@Test
	public void testIngresar01() {
		Cuenta  cuenta = new Cuenta("Diego", 1000);
		double resultado = cuenta.ingresar(250.55);
		double esperado = 1250.55;
		assertEquals(esperado,resultado,0.1);
	}

	@Test
	public void testRetirar() {
		Cuenta  cuenta = new Cuenta("Diego", 1000);
		double resultado = cuenta.retirar(334);
		double esperado = 666;
		assertEquals(esperado,resultado,0.1);
	}
	@Test
	public void testRetirar01() {
		Cuenta  cuenta = new Cuenta();
		double resultado = cuenta.retirar(334);
		double esperado = 0;
		assertEquals(esperado,resultado,0.1);
	}
}
