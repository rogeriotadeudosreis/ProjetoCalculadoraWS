package calc;

public class Triangulo extends FiguraGeometrica {

	private float area;
	private float perimetro;
	private float base;
	private float altura;

	public Triangulo() {

	}

	public Triangulo(float base, float altura) {
		this.base = base;
		this.altura = altura;
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
		return base;
	}

	public void setBase(float base) {
		this.base = base;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float calcularAreaDoTriangulo() {
		this.area = (base * altura) / 2;
		return this.area;
	}

	public float calcularPerimetroDoTriangulo() {
		this.perimetro = base + base + base;
		return this.perimetro;
	}

}
