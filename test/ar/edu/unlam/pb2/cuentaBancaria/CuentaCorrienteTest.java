package ar.edu.unlam.pb2.cuentaBancaria;

import org.junit.Assert;
import org.junit.Test;

public class CuentaCorrienteTest {
	@Test
	public void queSeDescuenteDelDescubiertoYLaComision() {
		CuentaCorriente UnaCuentaCorriente = new CuentaCorriente(100.00, 150.00);

		UnaCuentaCorriente.extraer(200.00);
		Double descubiertoEsperado = 45.00;

		Assert.assertEquals(descubiertoEsperado,
				UnaCuentaCorriente.consultaDescubierto());
	}
}
