package entities;

public class Curso extends Conteudo {
		
	private Integer workload;
	
	public Curso() {
	}

	public Curso(String title, String description, Integer workload) {
		setTitle(title);
		setDescription(description);
		this.workload = workload;
	}

	public Integer getWorkload() {
		return workload;
	}

	public void setWorkload(Integer workload) {
		this.workload = workload;
	}

	@Override
	public double calcularXp() {
		return BASE_XP*workload;
	}

	@Override
	public String toString() {
		return "Curso [title=" + getTitle() + ", description=" + getDescription() + ", workload=" + workload + "]";
	}

}
