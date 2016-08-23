package threads;

public class TestaConcorrencia {

	public static void main(String[] args) throws InterruptedException {
		
		/*
		 * executa um de cada vez -- caso 1
		BarraDeProgresso barra = new BarraDeProgresso();
		barra.executa();
		
		CopiadorDeArquivos copiador = new CopiadorDeArquivos();
		copiador.executa();*/
		
		/*
		 * executa misturado - caso 3
		BarraDeProgresso barra = new BarraDeProgresso();
		Thread t1 = new Thread(barra);
		t1.start();
		
		CopiadorDeArquivos copiador = new CopiadorDeArquivos();
		Thread t2 = new Thread(copiador);
		t2.start();*/
		
		
		Conta conta = new Conta(500.0);
		FazDeposito acao = new FazDeposito(conta);
		Thread thread1 = new Thread(acao);
		Thread thread2 = new Thread(acao);
		
		thread1.start();
		thread2.start();
		
		thread1.join();
		thread2.join();
		
		System.out.println(conta.getSaldo());
	}

}
