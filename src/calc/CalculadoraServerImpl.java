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

	public float calcularAreaDeFiguraGeometrica(FiguraGeometrica figura, float base, float raio, float altura) {

		if (figura.getNomeFigura().equals("Quadrado")) {
			Quadrado quadradoArea = new Quadrado(base);
			return quadradoArea.calcularAreaDoQuadrado();
		}
		return 0;
	}

	@Override
	public float calcularPerimetroDeFiguraGeometrica(FiguraGeometrica figura, float base, float raio, float altura) {

		if (figura.getNomeFigura().equals("Quadrado")) {
			Quadrado quadradoPerimetro = new Quadrado(base);
			return quadradoPerimetro.calcularPerimetroDoQuadrado();
		}
		return 0;
	}

}
