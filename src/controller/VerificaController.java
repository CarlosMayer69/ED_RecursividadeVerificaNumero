package controller;

public class VerificaController {

	public VerificaController() {
		super();
	}
	
	public int verifica(int entrada, int digito) {
		//Condição de Parada do Exercício
		if(entrada == 0) {
			return 0;
			
		}else {
			int resto = entrada % 10;
			entrada = entrada / 10;
			int incidencia = 0;
			if(digito == resto) {
				incidencia ++;
			}
			return incidencia + verifica(entrada, digito);
		}
	}

}
