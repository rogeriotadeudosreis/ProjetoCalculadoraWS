package calc;

public class Retangulo extends FiguraGeometrica {

	private float area;
	private float perimetro;
	private float base;
	private float altura;

	public Retangulo() {

	}

	public Retangulo(float base, float altura) {
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

	public float calcularAreaDoRetangulo() {
		this.area = base * altura;
		return this.area;
	}

	public float calcularPerimetroDoRetangulo() {
		this.perimetro = (2 * base) + (2 * altura);
		return this.perimetro;
	}

}
