package controller;

public class comparaController {
	
	public comparaController() {
		
		super();
		
	}
	
	public int compara(int v1, int v2) {
		
		int cont = 0;
		
		//Dividindo o v1 por 10 diversas vezes, resultará em 0, então retornará 0
		if (v1 == 0) {
			
			return 0;
			
		} else {
			
			int mod = v1 % 10;
			v1 = v1 / 10;
			
			if (v2 == mod) {
				
				cont = 1;
				
			}
			
			return cont + compara(v1, v2);
			//Sempre que o resto da divisão for igual ao v2, o contador receberá
			//1 que somará com a chamada da função
			
		}
		
	}
	
}