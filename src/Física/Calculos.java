package F�sica;

public class Calculos {
	public float forcaPeso(float massa) {
		return massa * 9.8f;
	}

	public float forcaCentripeta(float massa, float velocidade, float raio) {
		return massa * (velocidade * velocidade) / raio;
	}

	public float forcaElastica(float forcaAplicada, float constanteElastica, float variacaoSofridaPeloElastico) {
		return forcaAplicada / (constanteElastica * variacaoSofridaPeloElastico);
	}

	public float velocidadeMedia(float distancia, float tempo) {
		return distancia / tempo;
	}

	public float movimentoRetilineoUniforme(float velocidadeInicial, float acelera��o, float tempo) {
		return velocidadeInicial + (acelera��o * tempo);
	}

	public float movimentoRetilineoUniformeVariado(float velocidadadeinicial, float velocidadefinal, float tempofinal,
			float tempoinicial) {
		return (velocidadadeinicial - velocidadefinal) / (tempofinal - tempoinicial);
	}

}
