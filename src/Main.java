import br.com.dio.desafio.dominio.*;

public class Main {

	public static void main(String[] args) {
		
		Curso curso1 = new Curso();
		curso1.setTitulo("Sintaxe");
		curso1.setDescricao("Sintaxe básica do Java.");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Pilares POO");
		curso2.setDescricao("Pilares da Programação Orientada à Objetos.");
		curso2.setCargaHoraria(10);

		
		Mentoria mentoria1 = new Mentoria();
		mentoria1.setTitulo("Mentoria de java 1");
		mentoria1.setDescricao("Revisão de Sintaxe básica");
		
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Java Developer");
		bootcamp.setDescricao("Aprenda conteudos sobre desenvolvimento com Java.");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria1);
		
		Dev devAlexia = new Dev();
		devAlexia.setNome("Alexia");
		devAlexia.inscreverBootcamp(bootcamp);
		System.out.println("Alexia inscrita:" + devAlexia.getConteudoInscritos());
		System.out.println("Alexia concluiu:" + devAlexia.getConteudoConcluidos());
		System.out.println("XP:"+ devAlexia.calcularTotalXp());
		devAlexia.progredir();
		System.out.println("Alexia inscrita:" + devAlexia.getConteudoInscritos());
		System.out.println("Alexia concluiu:" + devAlexia.getConteudoConcluidos());
		System.out.println("XP:"+ devAlexia.calcularTotalXp());
		devAlexia.progredir();
		System.out.println("Alexia inscrita:" + devAlexia.getConteudoInscritos());
		System.out.println("Alexia concluiu:" + devAlexia.getConteudoConcluidos());
		System.out.println("XP:"+ devAlexia.calcularTotalXp());

		devAlexia.progredir();
		System.out.println("Alexia inscrita:" + devAlexia.getConteudoInscritos());
		System.out.println("Alexia concluiu:" + devAlexia.getConteudoConcluidos());
		System.out.println("XP:"+ devAlexia.calcularTotalXp());




	}

}
