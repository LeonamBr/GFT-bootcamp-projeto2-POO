package entities;

import java.time.Instant;

public class Mentoria extends Conteudo {
		
	private Instant date = Instant.now();
	
	public Mentoria() {
	}

	public Mentoria(String title, String description, Instant date) {
		setTitle(title);
		setDescription(description);
	}
	
	public Instant getDate() {
		return date;
	}

	@Override
	public double calcularXp() {
		return BASE_XP + 20.0;
	}
	
	@Override
	public String toString() {
		return "Mentoria [title=" + getTitle() + ", description=" + getDescription() + ", date=" + date + "]";
	}

}
