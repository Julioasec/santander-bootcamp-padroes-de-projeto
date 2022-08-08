package model;

public class ControleTelevisao extends Controle {

	private static Televisao televisao;
	
	public ControleTelevisao(Televisao televisao){
		this.televisao = televisao;
	}

	@Override
	public void ligarDesligar() {
		televisao.ligarDesligar();
	}

	@Override
	public void aumentarCanal() {
		televisao.aumentarCanal();
	}

	@Override
	public void diminuirCanal() {
		televisao.diminuirCanal();
	}

	@Override
	public void aumentarVolume() {
		televisao.aumentarVolume();
		
	}

	@Override
	public void diminuirVolume() {
		televisao.diminuirVolume();
	}
	
	

	
}
