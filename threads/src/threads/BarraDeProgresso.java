package threads;

/*public class BarraDeProgresso {

	public void executa() {
		for (int i = 0; i < 10000; i++) {
			System.out.println("progresso barra");
		}
	}

}*/

public class BarraDeProgresso implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 10000; i++) {
			System.out.println("progresso barra");
		}
	}

}
