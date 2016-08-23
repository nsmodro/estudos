package threads;

/*public class CopiadorDeArquivos {

	public void executa() {
		for (int i = 0; i < 10000; i++) {
			System.out.println("copia");
		}
	}

}*/

public class CopiadorDeArquivos implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 10000; i++) {
			System.out.println("copia");
		}
	}

}