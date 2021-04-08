package calc;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

class CalculadoraClient {

	public static void main(String args[]) throws Exception {
		URL url = new URL("http://127.0.0.1:9876/calc?wsdl");
		QName qname = new QName("http://calc/", "CalculadoraServerImplService");
		Service ws = Service.create(url, qname);

		CalculadoraServer calc = ws.getPort(CalculadoraServer.class);

		PresentationOfResults result;
		List<PresentationOfResults> listResults = new ArrayList<PresentationOfResults>();

		result = new PresentationOfResults("Soma (5+1): ", calc.soma(5, 1));
		listResults.add(result);
		result = new PresentationOfResults("Subtracao (5-1): ", calc.subtracao(5, 1));
		listResults.add(result);
		result = new PresentationOfResults("Multiplicacao (5*1): ", calc.multiplicacao(5, 1));
		listResults.add(result);
		result = new PresentationOfResults("Divisao (5/1): ", calc.divisao(5, 1));
		listResults.add(result);
		result = new PresentationOfResults("Área do Quadrado: ",
				calc.calcularAreaDeFiguraGeometrica(new FiguraGeometrica("Quadrado"), 0, 5, 0));
		listResults.add(result);
		result = new PresentationOfResults("Perímetro do Quadrado: ",
				calc.calcularPerimetroDeFiguraGeometrica(new FiguraGeometrica("Quadrado"), 0, 5, 0));
		listResults.add(result);
		result = new PresentationOfResults("Área do Círculo: ",
				calc.calcularAreaDeFiguraGeometrica(new FiguraGeometrica("Círculo"), 0, 0, 6));
		listResults.add(result);
		result = new PresentationOfResults("Perímetro do Círculo: ",
				calc.calcularPerimetroDeFiguraGeometrica(new FiguraGeometrica("Círculo"), 0, 0, 6));
		listResults.add(result);
		result = new PresentationOfResults("Área do Retangulo: ",
				calc.calcularAreaDeFiguraGeometrica(new FiguraGeometrica("Retângulo"), 5, 6, 0));
		listResults.add(result);
		result = new PresentationOfResults("Perímetro do Retângulo: ",
				calc.calcularPerimetroDeFiguraGeometrica(new FiguraGeometrica("Retângulo"), 5, 6, 0));
		listResults.add(result);
		result = new PresentationOfResults("Área do Triângulo: ",
				calc.calcularAreaDeFiguraGeometrica(new FiguraGeometrica("Triângulo"), 5, 6, 0));
		listResults.add(result);
		result = new PresentationOfResults("Perímetro do Triângulo: ",
				calc.calcularPerimetroDeFiguraGeometrica(new FiguraGeometrica("Triângulo"), 5, 6, 0));
		listResults.add(result);
		
		
		
		

		System.out.println(" ----- Presentation of Results of Operations ----- ");
		for (int i = 0; i < listResults.size(); i++) {
			System.out.println(listResults.get(i).toString());
		}
		System.out.println("\nQuantidade de operações: " + listResults.size());

	}
}
