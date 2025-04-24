package org.listaalgoritmos.template;

import java.util.Arrays;

public class RespostaListaExercicio {

	/*
	 * Utilize apenas o método main para testar a implementação dos métodos. 
	 * Não se faz necessário implementar dentro do escopo do método.
	 */
	public static void main(String[] args) {
		calcularImc(70f, 1.85f);
		calcularAreaTrapezio(20f, 10f, 1.85f);
		maiorEntreDoisInteiros(5, 10);
		verificarParImpar(1);
		calcularMediaNotas(new float[]{10.0f, 6.3f, 7.5f, 9.7f});
		imprimirArrayInverso(new int[]{1, 2, 3, 4, 5});
		imprimirElementosPrimos(new int[]{2, 3, 4, 5, 6, 7, 8, 9, 10});
		imprimirElementosImpares(new int[]{2, 3, 4, 5, 6, 7, 8, 9, 10});
	}

	/**
	 * Método deve calcular o IMC utilizando peso e altura. Como resultado
	 * o método deve retornar uma variável resultado do tipo float.
	 * @param peso
	 * @param altura
	 * @return resultado
	 */
	public static float calcularImc(float peso, float altura) {
		float resultado = peso / (altura * altura);
		System.out.printf("IMC: %.2f%n", resultado);
		return resultado;
	}

	/**
	 * Método deve calcular a área do trapézio independente da unidade de medida.
	 * Como resultado, o método deve retornar a área calculada.
	 * @param baseMaior
	 * @param baseMenor
	 * @param altura
	 * @return areaTrapezio
	 */
	public static float calcularAreaTrapezio(float baseMaior, float baseMenor, float altura) {
		float areaTrapezio = ((baseMaior + baseMenor) * altura) / 2;
		System.out.printf("Área do Trapezio: %.2f%n", areaTrapezio);
		return areaTrapezio;
	}

	/**
	 * O método deve calcular o maior entre dois inteiros, que são fornecidos
	 * como argumento do método. O retorno deve ser o maior valor dado
	 * como entrada, sendo do tipo inteiro.
	 * @param a
	 * @param b
	 * @return maiorValor
	 */
	public static int maiorEntreDoisInteiros(int a, int b) {
		int maiorValor = (a > b) ? a : b;
		System.out.printf("Maior valor: %d%n", maiorValor);
		return maiorValor;
	}

	/**
	 * Método verifica se o número apresentado como argumento é ímpar ou par.
	 * caso seja par, o retorno do método deve ser verdadeiro. Caso contrário,
	 * o valor retornado deve ser falso.
	 * @param numero
	 * @return condicao
	 */
	public static boolean verificarParImpar(int numero) {
		boolean condicao = numero % 2 == 0;
		System.out.printf("O número é par? %b%n", condicao);
		return condicao;
	}

	/**
	 * Método calcula a média aritmetica dos elementos float a partir de um array. 
	 * O retorno deve ser o resultado do cálculo da média.
	 * @param notas
	 * @return media
	 */
	public static float calcularMediaNotas(float[] notas) {
		float soma = 0f;
		for (float n : notas) {
			soma += n;
		}
		float media = soma / notas.length;
		System.out.printf("A média é %.1f%n", media);
		return media;
	}

	/**
	 * Método imprime array de inteiros no sentido inverso, separando os elementos por vírgula.
	 * O último elemento impresso não deve preceder vírgula. Use o System.out.print() para imprimir os valores.
	 * Os elementos devem ser impresso numa única linha.
	 * @param array
	 * @return 
	 */
	public static int[] imprimirArrayInverso(int[] array) {
		int[] invertido = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			invertido[i] = array[array.length - 1 - i];
		}
		System.out.printf("Array Invertido: %s%n", Arrays.toString(invertido));
		return invertido;
	}

	/**
	 * Método deve imprimir os elementos primos de um array de inteiros. O formato da impressão 
	 * deve ser feito numa única linha, utilizando espaço em branco (" ") entre os elementos e 
	 * após o último elemento. Utilize System.out.print()
	 * @param array
	 */
	public static void imprimirElementosPrimos(int[] array) {
		System.out.print("Números primos: ");
		for (int n : array) {
			int contador = 0;
			for (int i = 1; i <= n; i++) {
				if (n % i == 0) {
					contador++;
				}
			}
			if (contador == 2) {
				System.out.print(n + " ");
			}
		}
		System.out.println();
	}

	/**
	 * Método deve imprimir os elementos ímpares de um array de inteiros. O formato da impressão 
	 * deve ser feito numa única linha, utilizando espaço em branco (" ") entre os elementos e 
	 * após o último elemento. Utilize System.out.print()
	 * @param array
	 */
	public static void imprimirElementosImpares(int[] array) 
	{
		System.out.print("Números Impares: ");
		for (int n : array) {
				if (n % 2 == 1) {
					System.out.print(n + " ");
				}
		}
		System.out.println();
	}
	
	
	/**
	 * Método deve imprimir os elementos pares de um array de inteiros. O formato da impressão 
	 * deve ser feito numa única linha, utilizando espaço em branco (" ") entre os elementos e 
	 * após o último elemento. Utilize System.out.print()
	 * @param array
	 */
	public static void imprimirElementosPares(int[] array) 
	{
		System.out.print("");
	}
	
	
	/**
	 * Método deve imprimir o maior e o menor elemento de um array de inteiros. O formato da impressão 
	 * deve ser feito numa única linha, utilizando espaço em branco (" ") entre os elementos e 
	 * após o último elemento. Utilize System.out.print()
	 * @param array
	 */
	public static void imprimirMaiorMenorElemento(int[] array) 
	{
		System.out.print("");
	}
	
	/**
	 * O método calcula a média aritmética dos elementos de um array de inteiros. 
	 * Como resultado, o valor da média deve ser retornado no método.
	 * @param array
	 * @return media
	 */
	public static float calcularMediaAritmetica(int[] array) 
	{
		return 0f;
	}
	
}
