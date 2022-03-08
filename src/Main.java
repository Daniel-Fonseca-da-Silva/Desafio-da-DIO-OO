import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Spring Boot");
        curso1.setDescricao("Java, hibernate e Spring");
        curso1.setCargaHoraria(10);

        System.out.println(curso1);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de java e spring");
        mentoria.setDescricao("Mentoria do curso de java e spring boot");
        mentoria.setData(LocalDate.now());

        Curso curso2 = new Curso();
        curso1.setTitulo("Golang");
        curso1.setDescricao("Introdução ao Go a linguagem do google");
        curso1.setCargaHoraria(6);

        System.out.println(curso1);
        System.out.println(mentoria);

       Conteudo conteudo = new Curso();

    }

}
