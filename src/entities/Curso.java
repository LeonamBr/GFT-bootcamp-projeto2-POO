package entities;

import java.time.Instant;

public class Curso extends Conteudo {
	
	private String title;
	
	private String description;
	
	private Integer workload;
	
	private final Instant startdate = Instant.now();
	
	private final Instant endDate = startdate.plusSeconds(3888000);
	
	public Curso() {
	}

	public Curso(String title, String description, Integer workload) {
		this.title = title;
		this.description = description;
		this.workload = workload;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getWorkload() {
		return workload;
	}

	public void setWorkload(Integer workload) {
		this.workload = workload;
	}
	
	@Override
	public double calcularXp() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String toString() {
		return "Curso [title=" + title + ", description=" + description + ", workload=" + workload + "]";
	}

}
