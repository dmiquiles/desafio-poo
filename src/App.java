import java.time.LocalDate;

import br.com.desafio.Bootcamp;
import br.com.desafio.Curso;
import br.com.desafio.Dev;
import br.com.desafio.Mentoria;

public class App {
    public static void main(String[] args) throws Exception {


        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devDaniel = new Dev();
        devDaniel.setNome("Camila");
        devDaniel.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Camila:" + devDaniel.getConteudosInscritos());
        devDaniel.progredir();
        devDaniel.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Camila:" + devDaniel.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Camila:" + devDaniel.getConteudosConcluidos());
        System.out.println("XP:" + devDaniel.calcularTotalXp());

        System.out.println("-------");

        Dev devValeria = new Dev();
        devValeria.setNome("Joao");
        devValeria.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João:" + devValeria.getConteudosInscritos());
        devValeria.progredir();
        devValeria.progredir();
        devValeria.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos João:" + devValeria.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos João:" + devValeria.getConteudosConcluidos());
        System.out.println("XP:" + devValeria.calcularTotalXp());

        
    }
}
