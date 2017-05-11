package ar.edu.unlam.pb2.cuentaBancaria;

import org.junit.Test;

public class CuentaSueldoTest {
	@Test
	public void queNoSePuedaExtraerUnImporteMayorQueElSaldo() {

		CuentaSueldo UnacuentaSueldo = new CuentaSueldo(200.00);
		UnacuentaSueldo.extraer(300.00);
	}
}
