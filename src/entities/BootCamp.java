package entities;

import java.time.Instant;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class BootCamp {

	private String name;

	private String Description;

	private Set<Conteudo> conteudos = new LinkedHashSet<>();

	private final Instant START_DATE = Instant.now();

	private final Instant END_DATE = START_DATE.plusSeconds(3888000);

	public BootCamp() {
	}

	public BootCamp(String name, String description) {
		super();
		this.name = name;
		Description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public Set<Conteudo> getConteudo() {
		return conteudos;
	}
	
	public void addConteudo(Conteudo conteudo) {
		conteudos.add(conteudo);
	}

	public Instant getSTART_DATE() {
		return START_DATE;
	}

	public Instant getEND_DATE() {
		return END_DATE;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BootCamp other = (BootCamp) obj;
		return Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "BootCamp [name=" + name + ", Description=" + Description + ", conteudos=" + conteudos + ", START_DATE="
				+ START_DATE + ", END_DATE=" + END_DATE + "]";
	}

}
