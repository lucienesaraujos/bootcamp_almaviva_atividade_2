import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Curso de Linguagem Java para iniciante");
        curso1.setCargaHoraria( 8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Java Script");
        curso2.setDescricao("Curso de Linguagem Java Script para iniciante");
        curso2.setCargaHoraria( 4);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Auxílio na construção de habilidades em Java");
        mentoria1.setData(LocalDate.now());

        Mentoria mentoria2 = new Mentoria();
        mentoria2.setTitulo("Mentoria Java Scricpt");
        mentoria2.setDescricao("Auxílio na construção de habilidades em Java Script");
        mentoria2.setData(LocalDate.now());

            
        /*
        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);
        System.out.println(mentoria2);
        */
        
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Formar desenvolvedores Full Stack Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);
        bootcamp.getConteudos().add(mentoria2);

        Dev devLuciene = new Dev();
        devLuciene.setNome("Luciene Araujo");
        devLuciene.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Luciene: " + devLuciene.getConteudosIncristos());
        devLuciene.progredir();
        devLuciene.progredir();
        devLuciene.progredir();
        System.out.println("********");
        System.out.println("Conteúdos Inscritos Luciene: " + devLuciene.getConteudosIncristos());
        System.out.println("Conteúdos Concluídos Luciene: " + devLuciene.getConteudosConcluidos());
        System.out.println("XP: " + devLuciene.calcularTotalXp());

        System.out.println("===========================================");

        Dev devThiago = new Dev();
        devThiago.setNome("Thiago Sousa");
        devThiago.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Thiago: " + devThiago.getConteudosIncristos());
        devThiago.progredir();
        devThiago.progredir();
        devThiago.progredir();
        devThiago.progredir();
        System.out.println("**********");
        System.out.println("Conteúdos Inscritos Thiago: " + devThiago.getConteudosIncristos());
        System.out.println("Conteúdos Concluídos Thiago: " + devThiago.getConteudosConcluidos());
        System.out.println("XP: " + devThiago.calcularTotalXp());
    }
}
