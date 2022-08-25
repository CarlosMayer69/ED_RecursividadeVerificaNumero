package view;

import javax.swing.JOptionPane;

import controller.VerificaController;

public class Principal {

	public static void main(String[] args) {
		//Teremos que fazer valida��es!
		VerificaController vCont = new VerificaController();
		
		int entrada = Integer.parseInt(
				JOptionPane.showInputDialog(null, "Digite um n�mero de 10 a 999999: ")
				);
		int digito = Integer.parseInt(
				JOptionPane.showInputDialog(null, "Digite um d�gito: ")
				);
		if((entrada >= 10 && entrada <= 999999)&&
				(digito >= 0 && digito <= 9)) {
			int incidencias = vCont.verifica(entrada, digito);
			System.out.println("O d�gito " + digito + " aparece "
					+ incidencias + " vezes!");
		}else {
			System.err.println("Digite valores v�lidos!");
		}
	
	}

}
