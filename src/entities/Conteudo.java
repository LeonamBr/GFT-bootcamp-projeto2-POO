package entities;

public abstract class Conteudo {

	private String titulo;

	private String description;

	public Conteudo() {
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public abstract double calcularXp();

}
