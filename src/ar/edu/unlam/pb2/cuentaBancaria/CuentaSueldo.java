package ar.edu.unlam.pb2.cuentaBancaria;

public class CuentaSueldo extends Cuenta {

	public CuentaSueldo(Double saldo) {
		super(saldo);
	}

	public void extraer(Double extraccion) {
		if (extraccion >= 0) {
			if (extraccion <= this.saldo) {
				this.saldo -= extraccion;
			} else {
				System.out.print("Saldo insuficiente");
			}
		} else {
			System.out.print("Importe Incorrecto");
		}

	}
}
