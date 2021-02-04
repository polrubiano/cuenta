package cuenta;

public class Cuenta {
	private String titular;
	private double cantidad;
	
	Cuenta(){
		this.titular = null;
		this.cantidad = 0;
	}
	
	Cuenta(String titular, double cantidad){
		this.titular = titular;
		this.cantidad = cantidad;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}
	
	public String toString() {
		return "titular: " + this.titular + "\ncantidad: " + cantidad;
	}
	
	public double ingresar (double cantidad) {
		if (cantidad > 0) {
			this.cantidad += cantidad;
		}
		return this.cantidad;
	}
	
	public double retirar (double cantidad) {
		if ((this.cantidad - cantidad) <= 0) {
			this.cantidad = 0;
		}else {
			this.cantidad -= cantidad;
		}
		return this.cantidad;
	}
}
