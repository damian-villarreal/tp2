package ar.edu.unlam.pb2.cuentaBancaria;

public class CajaDeAhorro extends Cuenta {

	private Integer cantidadDeExtracciones = 0;

	public CajaDeAhorro(Double saldo) {
		super(saldo);
	}

	public void extraer(Double extraccion) {
		super.extraer(extraccion);
		cantidadDeExtracciones++;
		if (cantidadDeExtracciones >= 5) {
			this.saldo -= 6;
		}
	}
}
