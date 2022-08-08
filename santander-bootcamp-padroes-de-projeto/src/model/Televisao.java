package model;

public class Televisao {
	
	private static int canalAtual = 2;
	private static boolean ligado = false;
	private static int volume = 0;
	
	private static Televisao instancia = new Televisao();
	
	private Televisao() {
		super();
	}
	
	public static Televisao getInstance() {
		return instancia;
	}

	public void aumentarCanal() {
		this.ligar();
		if(canalAtual == 60) {
			Televisao.canalAtual = 0;		
			System.out.println("Canal Atual: "+  Televisao.canalAtual);
		}else {			
			Televisao.canalAtual++;			
			System.out.println("Canal atual: "+ Televisao.canalAtual);
		}
	}

	public void diminuirCanal() {
		this.ligar();
		if(canalAtual == 0) {
			Televisao.canalAtual = 60;		
			System.out.println("Canal Atual: "+  Televisao.canalAtual);
		}else {			
			Televisao.canalAtual--;			
			System.out.println("Canal atual: "+ Televisao.canalAtual);
		}
	}
	
	public void aumentarVolume() {
		this.ligar();
		if(Televisao.volume < 100) {
			Televisao.volume++;			
			System.out.println("Volume Atual: "+ Televisao.volume);
		}else {
			System.out.println("Volume maximo!");
		}
	}
	
	public void diminuirVolume() {
		this.ligar();
		if(Televisao.volume > 0) {
			Televisao.volume--;
			System.out.println("Volume atual: "+ Televisao.volume);
		}else {
			System.out.println("Volume minimo!");
		}
	}
	
	public void ligarDesligar() {
		if(Televisao.ligado) {
			Televisao.ligado = !Televisao.ligado;
			System.out.println("Aparelho desligado(a)!");
		}else {
			Televisao.ligado = !Televisao.ligado;
			System.out.println("Aparelho ligado(a)!");
		}
	}
	
	private void ligar() {
		if(!ligado) {
			Televisao.ligado = true;
			System.out.println("Aparelho ligado(a)!");
		}
	}

	public static int getCanalAtual() {
		return canalAtual;
	}

	public static void setCanalAtual(int canalAtual) {
		Televisao.canalAtual = canalAtual;
	}

	public static boolean isLigado() {
		return ligado;
	}

	public static int getVolume() {
		return volume;
	}

	public static void setVolume(int volume) {
		Televisao.volume = volume;
	}
	

}
