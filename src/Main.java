import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;
public class Main {

    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Spring Boot");
        curso1.setDescricao("Java, hibernate e Spring");
        curso1.setCargaHoraria(10);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de java e spring");
        mentoria.setDescricao("Mentoria do curso de java e spring boot");
        mentoria.setData(LocalDate.now());

        Curso curso2 = new Curso();
        curso2.setTitulo("Golang");
        curso2.setDescricao("Introdução ao Go a linguagem do google");
        curso2.setCargaHoraria(6);

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp java developer");
        bootcamp.setDescricao("Novo bootcamp com java 17");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Desenvolvedor danielDev = new Desenvolvedor();

        danielDev.setNome("Daniel F S");
        danielDev.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos" + danielDev.getConteudosInscritos());
        danielDev.progredir();
        danielDev.progredir();
        System.out.println("Conteúdos inscritos" + danielDev.getConteudosInscritos());
        System.out.println("Conteúdos concluidos Daniel" + danielDev.getConteudosConcluidos());
        System.out.println("XP " + danielDev.calcularTotalXp());

        Desenvolvedor fulanoDev = new Desenvolvedor();

        fulanoDev.setNome("Fulano");
        fulanoDev.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos" + fulanoDev.getConteudosInscritos());
        fulanoDev.progredir();
        System.out.println("Conteúdos inscritos" + fulanoDev.getConteudosInscritos());
        System.out.println("Conteúdos concluidos Fulano" + fulanoDev.getConteudosConcluidos());
        System.out.println("XP " + fulanoDev.calcularTotalXp());

    }

}
