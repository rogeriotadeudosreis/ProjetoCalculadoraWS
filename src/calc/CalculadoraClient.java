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
		result = new PresentationOfResults("�rea do Quadrado: ",
				calc.calcularAreaDeFiguraGeometrica(new FiguraGeometrica("Quadrado"), 0, 5, 0));
		listResults.add(result);
		result = new PresentationOfResults("Per�metro do Quadrado: ",
				calc.calcularPerimetroDeFiguraGeometrica(new FiguraGeometrica("Quadrado"), 0, 5, 0));
		listResults.add(result);
		result = new PresentationOfResults("�rea do C�rculo: ",
				calc.calcularAreaDeFiguraGeometrica(new FiguraGeometrica("C�rculo"), 0, 0, 6));
		listResults.add(result);
		result = new PresentationOfResults("Per�metro do C�rculo: ",
				calc.calcularPerimetroDeFiguraGeometrica(new FiguraGeometrica("C�rculo"), 0, 0, 6));
		listResults.add(result);
		result = new PresentationOfResults("�rea do Retangulo: ",
				calc.calcularAreaDeFiguraGeometrica(new FiguraGeometrica("Ret�ngulo"), 5, 6, 0));
		listResults.add(result);
		result = new PresentationOfResults("Per�metro do Ret�ngulo: ",
				calc.calcularPerimetroDeFiguraGeometrica(new FiguraGeometrica("Ret�ngulo"), 5, 6, 0));
		listResults.add(result);
		result = new PresentationOfResults("�rea do Tri�ngulo: ",
				calc.calcularAreaDeFiguraGeometrica(new FiguraGeometrica("Tri�ngulo"), 5, 6, 0));
		listResults.add(result);
		result = new PresentationOfResults("Per�metro do Tri�ngulo: ",
				calc.calcularPerimetroDeFiguraGeometrica(new FiguraGeometrica("Tri�ngulo"), 5, 6, 0));
		listResults.add(result);
		
		
		
		

		System.out.println(" ----- Presentation of Results of Operations ----- ");
		for (int i = 0; i < listResults.size(); i++) {
			System.out.println(listResults.get(i).toString());
		}
		System.out.println("\nQuantidade de opera��es: " + listResults.size());

	}
}
