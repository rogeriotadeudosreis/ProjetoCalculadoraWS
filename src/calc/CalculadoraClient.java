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

		System.out.println("Soma (5+1): " + calc.soma(5, 1));
		System.out.println("Subtracao (5-1): " + calc.subtracao(5, 1));
		System.out.println("Multiplicacao (5*1): " + calc.multiplicacao(5, 1));
		System.out.println("Divisao (5/1): " + calc.divisao(5, 1));

		System.out.println("Área do Quadrado: "
				+ calc.calcularAreaDeFiguraGeometrica(new FiguraGeometrica("Quadrado"), 5, 0, 0));

		System.out.println("Perímetro do Quadrado: "
				+ calc.calcularPerimetroDeFiguraGeometrica(new FiguraGeometrica("Quadrado"), 5, 0, 0));
		
	}
}
