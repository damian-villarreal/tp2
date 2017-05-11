package ar.edu.unlam.pb2.cuentaBancaria;

public class Cuenta {
	protected Double saldo;

	public Cuenta(Double saldo) {
		this.saldo = saldo;
	}

	public void depositar(Double deposito) {
		if (deposito >= 0) {
			this.saldo += deposito;
		} else {
			System.out.print("Importe incorrecto");
		}
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

	public Double consultarSaldo() {
		return getSaldo();
	}

	public Double getSaldo() {
		return saldo;
	}

}
