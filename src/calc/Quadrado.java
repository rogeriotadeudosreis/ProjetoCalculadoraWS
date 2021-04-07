package calc;

public class Quadrado extends FiguraGeometrica {

	private float area;
	private float perimetro;
	private float lado;
	
	public Quadrado() {
		
	}
	
	public Quadrado(float valor) {
		this.lado = valor;
	}

	public float getArea() {
		return area;
	}

	public void setArea(float area) {
		this.area = area;
	}

	public float getPerimetro() {
		return perimetro;
	}

	public void setPerimetro(float perimetro) {
		this.perimetro = perimetro;
	}

	public float getBase() {
		return lado;
	}

	public void setBase(float base) {
		this.lado = base;
	}

	public float calcularAreaDoQuadrado() {

		this.area = (float) Math.pow(lado, 2);

		return this.area;
	}
	
	public float calcularPerimetroDoQuadrado() {
		
		this.perimetro = lado *4;
		
		return this.perimetro;
		
	}

}
