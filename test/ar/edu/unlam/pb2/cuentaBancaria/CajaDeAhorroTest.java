package ar.edu.unlam.pb2.cuentaBancaria;

import org.junit.Assert;
import org.junit.Test;

public class CajaDeAhorroTest {
	@Test
	public void queSeCobreElCostoAdicionalLuegoDe5Extracciones() {
		CajaDeAhorro UnaCajaDeAhorro = new CajaDeAhorro(1000.00);
		UnaCajaDeAhorro.extraer(100.00);
		UnaCajaDeAhorro.extraer(100.00);
		UnaCajaDeAhorro.extraer(100.00);
		UnaCajaDeAhorro.extraer(100.00);
		UnaCajaDeAhorro.extraer(100.00);

		Double saldoEsperado = 494.00;

		Assert.assertEquals(saldoEsperado, UnaCajaDeAhorro.consultarSaldo());

	}

}
