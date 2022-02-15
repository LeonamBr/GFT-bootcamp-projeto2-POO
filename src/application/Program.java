package application;

import java.time.Instant;

import entities.BootCamp;
import entities.Conteudo;
import entities.Curso;
import entities.Dev;
import entities.Mentoria;

public class Program {

	public static void main(String[] args) {
		
		BootCamp bootcamp = new BootCamp("BootCamp GFT get Strat #4", "Hey Dev, já considerou a possibilidade de se tornar ainda mais potente para o mercado, se especializando na tecnologia de desenvolvimento mais utilizada no mundo? Se sim, este é o seu momento de brilhar! O Bootcamp GFT Start #4 Java foi pensado exclusivamente para o seu desenvolvimento na tecnologia de Java, contendo uma sequência completa de cursos, mentorias e desafios. Não perca essa chance e inscreva-se já!");
		
		Conteudo conteudo = new Curso("Boas-vindas ao Bootcamp GFT Start #4 Java", "Conheça alguns colaboradores da GFT Brasil e descubra por que ela é referência em inovação e tecnologia!", 1);
		
		bootcamp.addConteudo(conteudo);
		
		conteudo = new Curso("Lógica de Programação Essencial", "Lógica de programação é a forma como o desenvolvedor entende a comunicação a fim de programar uma função de um programa. Faz uso de algoritmos, que são sequências de passos bem estabelecidos, como por exemplo, uma receita de bolo.", 4);
		
		bootcamp.addConteudo(conteudo);
		
		conteudo = new Curso("Aprenda o que são Estrutura de Dados e Algoritmos", "Aprenda o que são estruturas de dados em um sistema, qual a importância dela e como trabalhar com o armazenamento dessas informações de forma ágil e otimizada.", 4);
		
		bootcamp.addConteudo(conteudo);
		
		Mentoria mentoria = new Mentoria("Aula Inaugural - GFT Start #4 Java", "Chegou a hora de você começar a criar sua nova jornada, o passo a passo completo para que você consiga aumentar suas chances de contratação. Nesta aula  será mostrada como o Bootcamp é dividido, o que são cursos, mentorias, projetos e desafios de código.", Instant.now().plusSeconds(864000) );
		
		bootcamp.addConteudo(mentoria);
		
		Dev leonam = new Dev("Leonam Braga");
		
		leonam.increver(bootcamp);
		
		System.out.println(leonam.getInscritos());
		
		leonam.progredir();
		leonam.progredir();
		
		System.out.println(leonam.getInscritos());
		System.out.println(leonam.getConcluidos());
		
		
		System.out.println(leonam.calcularXp());
		
		
		System.out.println(leonam);

	}

}
