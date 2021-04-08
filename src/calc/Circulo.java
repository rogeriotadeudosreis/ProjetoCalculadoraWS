package calc;

public class Circulo extends FiguraGeometrica {

	private float area;
	private float perimetro;
	private float raio;
	private final float PI = 3.1415f;

	public Circulo() {

	}

	public Circulo(float raio) {
		this.raio = raio;
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

	public float getRaio() {
		return raio;
	}

	public void setRaio(float raio) {
		this.raio = raio;
	}

	public float calcularAreaDoCirculo() {

		this.area = PI * ((float) Math.pow(raio, 2));

		return this.area;

	}

	public float calcularPerimetroDoCirculo() {

		this.perimetro = 2 * PI * raio;
		return this.perimetro;
	}

}
