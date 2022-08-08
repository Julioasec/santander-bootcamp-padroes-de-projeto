package controller;

import model.Controle;
import model.ControleTelevisao;
import model.Televisao;

public class Singleton {

	public static void main(String[] args) {
		
		
		Televisao televisao = Televisao.getInstance();
		Televisao televisaoControle = Televisao.getInstance();
		

		Controle controleTelevisao = new ControleTelevisao(televisaoControle);
	
		
		televisao.aumentarCanal();
		controleTelevisao.aumentarCanal();
		
		televisao.diminuirCanal();
		controleTelevisao.diminuirCanal();
		
		televisao.aumentarVolume();
		controleTelevisao.aumentarVolume();
		
		televisao.diminuirVolume();
		controleTelevisao.diminuirVolume();
		
		televisao.ligarDesligar();
		controleTelevisao.ligarDesligar();
	}
}
