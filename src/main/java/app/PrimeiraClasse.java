package app;

public class PrimeiraClasse {
    public static void main(String[] args) {
        System.out.println("Ola Gradle!!!");

        Aluno a1 = new Aluno();
        a1.setId(1);
        a1.setNome("Pedro");
        a1.setIdade(20);

        System.out.println(a1.getId());
        System.out.println(a1.getNome());
        System.out.println(a1.getIdade());
    }
}