package calc;

public class PresentationOfResults {

	private String description;
	private float result;

	public PresentationOfResults() {
	}

	public PresentationOfResults(String description, float result) {
		this.description = description;
		this.result = result;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public float getResult() {
		return result;
	}

	public void setResult(float result) {
		this.result = result;
	}

	@Override
	public String toString() {
		return "\n" + description + " Result= " + result;
	}

}
