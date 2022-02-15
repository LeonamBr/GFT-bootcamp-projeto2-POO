package entities;

public abstract class Conteudo {

	private String title;

	private String description;
	
	protected final Double BASE_XP = 10.0; 

	public Conteudo() {
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String titulo) {
		this.title = titulo;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public abstract double calcularXp();

}
