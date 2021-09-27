package Física;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

	calcularForcaPeso(); }

	private static void calcularForcaPeso() {
	Scanner teclado = new Scanner(System.in);
	System.out.println("Digite a massa:");
	float massa = teclado.nextFloat();
	Calculos calc = new Calculos();
	float forca = calc.forcaPeso(massa);
	System.out.println("O resulstado é:" + forca);
	teclado.close();
	}

	//private static void forcaCentripeta() {
	//Scanner tecado = new Scanner(System.in);
	//System.out.println("Digite a massa:");
	//float massa = teclado.nextFloat();
	//System.out.println("Digite a velocidade:");
	//float velocidade = teclado.nextFloat();
	//System.out.println("Digite a raio:");
	//float raio = teclado.nextFloat();
	//Calculos calc = new Calculos();
	//float Centripeta = calc.forcaCentripeta(massa, velocidade, raio);
	//System.out.println("O resulstado é:" + Centripeta);
//	teclado.close();
	

	//private static void forcaElastica() {
	//Scanner teclado = new Scanner(System.in);
	//System.out.println("Digite a força aplicada:");
	//float forcaAplicada = teclado.nextFloat();
	//System.out.println("Digite a Constante elastica:");
	//float constanteElastica = teclado.nextFloat();
	//System.out.println("Digite a variaçao sofrida pelo elastico");
	//float variacaoSofridaPeloElastico = teclado.nextFloat();
	//Calculos calc = new Calculos();
	//float Elastico = calc.forcaElastica(forcaAplicada, constanteElastica, variacaoSofridaPeloElastico);
	//System.out.println("O resulstado é:" + Elastico);
	//teclado.close();
	

	//private static void velocidadeMedia() {
	//Scanner teclado = new Scanner(System.in);
	//System.out.println("Digite a distancia:");
	//float distancia = teclado.nextFloat();
	//System.out.println("Digite o tempo:");
	//float tempo = teclado.nextFloat();
	//Calculos calc = new Calculos();
	//float Vm = calc.velocidadeMedia(distancia, tempo);
	//System.out.println("O resultado é:" + Vm);
	//teclado.close();
		

//	private static void movimentoRetilineoUniforme() {
	//Scanner teclado = new Scanner(System.in);
	//System.out.println("Digite a velocidade inicial:");
	//float velocidadeinicial = teclado.nextFloat();
	//System.out.println("Digite a aceleração:");
	//float aceleracao = teclado.nextFloat();
	//System.out.println("Digite o tempo:");
	//float tempo = teclado.nextFloat();
	//Calculos calc = new Calculos();
	//float Muv = calc.movimentoRetilineoUniforme(velocidadeinicial, aceleracao, tempo);
	//System.out.println("O resultado é:" + Muv);
//	teclado.close();
	}

	//private static void movimentoRetilineoUniformeVariado() {
	
	//Scanner teclado = new Scanner(System.in);
	//System.out.println("Digite a velocidade inicial:");
	//float velocidadeinicial = teclado.nextFloat();
	//System.out.println("Digite a velocidade final:");
	//float velocidadefinal = teclado.nextFloat();
	//System.out.println("Digite o tempo inicial:");
//	float tempoinicial = teclado.nextFloat();
	//System.out.println("Digite o tempo final:");
//	float tempofinal = teclado.nextFloat();
	//teclado.close();
	


