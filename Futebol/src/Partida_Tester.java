
public class Partida_Tester {

	public static void main(String[] args) {
		Time t1 = new Time("Flamengo");
		Time t2 = new Time("Vasco");
		
		Partida p1 = new Partida(t1, t2);
		
		p1.iniciarPartida();
		p1.mostrarResultado();
		p1.finalizarPartida();
		
		t1.listar();
		t2.listar();
		
		p1.iniciarPartida();
		p1.mostrarResultado();
		p1.finalizarPartida();
		
		t1.listar();
		t2.listar();
		
	}

}
