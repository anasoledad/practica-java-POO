package billeteravirtual;

public class Tarjeta {
	
	int numeroTarjeta;
	String titular;
	double saldo;
	
	public Tarjeta() {
		super();
	}

	public Tarjeta(int numeroTarjeta, String titular, double saldo) {
		super();
		this.numeroTarjeta = numeroTarjeta;
		this.titular = titular;
		this.saldo = saldo;
	}
	
	public void cargarSaldo(int carga) {
		saldo = saldo + carga;	
	}
	
	public void mostrarObjeto() {
		System.out.println("Número de la tarjeta: " + numeroTarjeta + ", titular: " + titular + ", saldo: " + saldo);
	}
	
	
	

}
