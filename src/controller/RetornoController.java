package controller;

public class RetornoController {

	public int calculardigitos(String[] vt, int tamanho, String numero, int numerodevezes) {
		if(tamanho==0) {
			return numerodevezes;
		}else {
			tamanho--;
			if(vt[tamanho].contains(numero)) {
				numerodevezes++;
			}
		}
		return calculardigitos(vt, tamanho, numero, numerodevezes);
	}

}
