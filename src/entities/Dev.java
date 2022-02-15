package entities;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class Dev {

	private String name;

	private Set<Conteudo> inscritos = new LinkedHashSet<>();

	private Set<Conteudo> concluidos = new LinkedHashSet<>();

	public Dev() {
	}

	public Dev(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Conteudo> getInscritos() {
		return inscritos;
	}

	public Set<Conteudo> getConcluidos() {
		return concluidos;
	}

	public void increver(BootCamp bootcamp) {
		this.inscritos.addAll(bootcamp.getConteudo());
	}

	public double calcularXp() {
		double sum = 0.0;
		for (Conteudo conteudo : concluidos) {
			sum += conteudo.calcularXp();
		}
		return sum;
	}
	
	public void progredir() {
		Optional<Conteudo> opt = inscritos.stream().findFirst();
		if (opt.isPresent()) {
			concluidos.add(opt.get());
			inscritos.remove(opt.get());
		} else
			System.out.println("Parabens você se formou!!!");
	}

	@Override
	public String toString() {
		return "Dev [name=" + name + ", inscritos=" + inscritos + ", concluidos=" + concluidos + "]";
	}

}
