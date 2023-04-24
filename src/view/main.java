package view;

import java.util.Random;

import controller.RetornoController;

public class main {
	public static void main(String[] args) {
		Random gerador = new Random();
		//criando dois numeros aleatorios
		int valor = gerador.nextInt(999990)+10;
		int numero = gerador.nextInt(10);
		//Criando um split em um vetor e transformando o numero que iremos procurar em String para utilizar o contains
		String numerotxt = Integer.toString(numero);
		String valortxt = Integer.toString(valor);
		System.out.println("valor:" + valor);
		String[] vt = valortxt.split("");
		//Verificando o tamanho, e passando os parametros chamamos a operação recursiva!!
		int tamanho = vt.length;
		int numerodevezes=0;
		RetornoController r =new RetornoController();
		numerodevezes=r.calculardigitos(vt,tamanho,numerotxt,numerodevezes);
		System.out.println("A quantidade de vezes que o nuemero:"+numero + " Aparece no valor solicitado é:" + numerodevezes);

	}
	}

