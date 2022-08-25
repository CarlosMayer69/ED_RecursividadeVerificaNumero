package view;

import javax.swing.JOptionPane;

import controller.VerificaController;

public class Principal {

	public static void main(String[] args) {
		//Teremos que fazer validações!
		VerificaController vCont = new VerificaController();
		
		int entrada = Integer.parseInt(
				JOptionPane.showInputDialog(null, "Digite um número de 10 a 999999: ")
				);
		int digito = Integer.parseInt(
				JOptionPane.showInputDialog(null, "Digite um dígito: ")
				);
		if((entrada >= 10 && entrada <= 999999)&&
				(digito >= 0 && digito <= 9)) {
			int incidencias = vCont.verifica(entrada, digito);
			System.out.println("O dígito " + digito + " aparece "
					+ incidencias + " vezes!");
		}else {
			System.err.println("Digite valores válidos!");
		}
	
	}

}
