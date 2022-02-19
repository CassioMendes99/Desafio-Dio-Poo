import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso java");
        curso1.setDescricao("Descrição curso java");
        curso1.setCarga_horaria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso js");
        curso2.setDescricao("Descrição curso js");
        curso2.setCarga_horaria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de java");
        mentoria.setDescricao("Descrição mentoria java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp java developer");
        bootcamp.setDescricao("Descrição bootcamp java developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCassio = new Dev();
        devCassio.setNome("Cássio");
        devCassio.inscreverbootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Cássio" + devCassio.getConteudosInscritos());

        devCassio.progredir();
        devCassio.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Cássio" + devCassio.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Cássio" + devCassio.getConteudosConcluidos());
        System.out.println("XP:" + devCassio.calculartotalxp());

        System.out.println("----------");

        Dev devNaomi = new Dev();
        devNaomi.setNome("Naomi");
        devNaomi.inscreverbootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Naomi" + devNaomi.getConteudosInscritos());

        devNaomi.progredir();
        devNaomi.progredir();
        devNaomi.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Naomi" + devNaomi.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Naomi" + devNaomi.getConteudosConcluidos());
        System.out.println("XP:" + devNaomi.calculartotalxp());

    }
    }
