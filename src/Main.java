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

        
        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);
        System.out.println(mentoria2);



    }
}
