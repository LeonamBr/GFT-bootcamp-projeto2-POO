package application;

import java.time.Instant;

import entities.BootCamp;
import entities.Conteudo;
import entities.Curso;
import entities.Dev;
import entities.Mentoria;

public class Program {

	public static void main(String[] args) {
		
		BootCamp bootcamp = new BootCamp("BootCamp GFT get Strat #4", "Hey Dev, j� considerou a possibilidade de se tornar ainda mais potente para o mercado, se especializando na tecnologia de desenvolvimento mais utilizada no mundo? Se sim, este � o seu momento de brilhar! O Bootcamp GFT Start #4 Java foi pensado exclusivamente para o seu desenvolvimento na tecnologia de Java, contendo uma sequ�ncia completa de cursos, mentorias e desafios. N�o perca essa chance e inscreva-se j�!");
		
		Conteudo conteudo = new Curso("Boas-vindas ao Bootcamp GFT Start #4 Java", "Conhe�a alguns colaboradores da GFT Brasil e descubra por que ela � refer�ncia em inova��o e tecnologia!", 1);
		
		bootcamp.addConteudo(conteudo);
		
		conteudo = new Curso("L�gica de Programa��o Essencial", "L�gica de programa��o � a forma como o desenvolvedor entende a comunica��o a fim de programar uma fun��o de um programa. Faz uso de algoritmos, que s�o sequ�ncias de passos bem estabelecidos, como por exemplo, uma receita de bolo.", 4);
		
		bootcamp.addConteudo(conteudo);
		
		conteudo = new Curso("Aprenda o que s�o Estrutura de Dados e Algoritmos", "Aprenda o que s�o estruturas de dados em um sistema, qual a import�ncia dela e como trabalhar com o armazenamento dessas informa��es de forma �gil e otimizada.", 4);
		
		bootcamp.addConteudo(conteudo);
		
		Mentoria mentoria = new Mentoria("Aula Inaugural - GFT Start #4 Java", "Chegou a hora de voc� come�ar a criar sua nova jornada, o passo a passo completo para que voc� consiga aumentar suas chances de contrata��o. Nesta aula  ser� mostrada como o Bootcamp � dividido, o que s�o cursos, mentorias, projetos e desafios de c�digo.", Instant.now().plusSeconds(864000) );
		
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
