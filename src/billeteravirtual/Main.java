package billeteravirtual;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tarjeta tarjeta1 = new Tarjeta();
		
		Tarjeta tarjeta2 = new Tarjeta(49050505, "Alexis", 1000);
		
		tarjeta2.mostrarObjeto();
		tarjeta2.cargarSaldo(2500);
		tarjeta2.mostrarObjeto();

	}

}
