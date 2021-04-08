package calc;

import javax.jws.WebService;

@WebService(endpointInterface = "calc.CalculadoraServer")
public class CalculadoraServerImpl implements CalculadoraServer {

	public float soma(float num1, float num2) {
		return num1 + num2;
	}

	public float subtracao(float num1, float num2) {
		return num1 - num2;
	}

	public float multiplicacao(float num1, float num2) {
		return num1 * num2;
	}

	public float divisao(float num1, float num2) {
		return num1 / num2;
	}

	public float calcularAreaDeFiguraGeometrica(FiguraGeometrica figura, float altura, float base, float raio) {

		String tipoDeFigura = figura.getNomeFigura();

		switch (tipoDeFigura) {

		case "Quadrado":
			Quadrado quadradoArea = new Quadrado(base);
			return quadradoArea.calcularAreaDoQuadrado();

		case "C�rculo":
			Circulo circulo = new Circulo(raio);
			return circulo.calcularAreaDoCirculo();

		case "Ret�ngulo":
			Retangulo retangulo = new Retangulo(base, altura);
			return retangulo.calcularAreaDoRetangulo();

		case "Tri�ngulo":
			Triangulo triangulo = new Triangulo(base, altura);
			return triangulo.calcularAreaDoTriangulo();

		}
		return 0;
	}

	@Override
	public float calcularPerimetroDeFiguraGeometrica(FiguraGeometrica figura, float altura, float base, float raio) {

		String tipoDeFigura = figura.getNomeFigura();

		switch (tipoDeFigura) {

		case "Quadrado":
			Quadrado quadradoArea = new Quadrado(base);
			return quadradoArea.calcularPerimetroDoQuadrado();

		case "C�rculo":
			Circulo circulo = new Circulo(raio);
			return circulo.calcularPerimetroDoCirculo();

		case "Ret�ngulo":
			Retangulo retangulo = new Retangulo(base, altura);
			return retangulo.calcularPerimetroDoRetangulo();

		case "Tri�ngulo":
			Triangulo triangulo = new Triangulo(base, altura);
			return triangulo.calcularPerimetroDoTriangulo();

		}
		return 0;
	}

}
