package DominandoALinguagem.EstruturasRepeticao;

public class Alunos {
    public static void main(String[] args) {
        String alunos[] = {"Felipe", "Thiago", "Matheus", "Otavio", "Marcos", "Lucas", "Roberto"};

        System.out.println("Quantidade de alunos: " + alunos.length + "\n");

        for (int x = 0; x < alunos.length; x++) {
            System.out.println("Aluno " + (x+1) + ": " + alunos[x]);
        }

        System.out.println("----");

        for (String aluno : alunos) {
            System.out.println("Nome do aluno: " + aluno);
        }

    }
}
