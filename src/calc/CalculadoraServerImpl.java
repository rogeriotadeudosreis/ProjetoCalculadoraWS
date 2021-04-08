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

		case "Círculo":
			Circulo circulo = new Circulo(raio);
			return circulo.calcularAreaDoCirculo();

		case "Retângulo":
			Retangulo retangulo = new Retangulo(base, altura);
			return retangulo.calcularAreaDoRetangulo();

		case "Triângulo":
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

		case "Círculo":
			Circulo circulo = new Circulo(raio);
			return circulo.calcularPerimetroDoCirculo();

		case "Retângulo":
			Retangulo retangulo = new Retangulo(base, altura);
			return retangulo.calcularPerimetroDoRetangulo();

		case "Triângulo":
			Triangulo triangulo = new Triangulo(base, altura);
			return triangulo.calcularPerimetroDoTriangulo();

		}
		return 0;
	}

}
