package view;

import controller.comparaController;

public class Principal {
	
	public static void main(String[] args) {
		
		comparaController cc = new comparaController();
		
		int n1 = 836363;
		int n2 = 3;
		int compara = cc.compara(n1, n2);
		
		System.out.println(compara + " vezes");
		
	}
	
}