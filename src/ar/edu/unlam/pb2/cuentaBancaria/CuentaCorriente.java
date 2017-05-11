package ar.edu.unlam.pb2.cuentaBancaria;

public class CuentaCorriente extends Cuenta {
	private Double descubierto;

	public CuentaCorriente(Double saldo,Double descubierto) {
		super(saldo);
		this.descubierto=descubierto;
	}

	
	@Override
	public void extraer(Double extraccion) {
		if (extraccion > 0) {
			if (extraccion > this.getSaldo()) {
				this.descubierto = descubierto + (this.saldo - extraccion)
						+ ((this.saldo - extraccion)*(double)0.05);
				this.saldo = (double) 0;
			} else {
				this.saldo -= extraccion;
			}
		} else {
			System.out.print("Importe Incorrecto");
		}
	}
	
	public Double consultaDescubierto(){
		return this.getDescubierto();
	}


	public Double getDescubierto() {
		return descubierto;
	}


	public void setDescubierto(Double descubierto) {
		this.descubierto = descubierto;
	}
	
}
