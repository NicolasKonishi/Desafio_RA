
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Para procurar 1 aluno em específico, foi criado um objeto com as informações que devem ser adquirada do aluno
        RegistroDeAluno aluno = new RegistroDeAluno("Nicolas", "DSP17", "F356CA6");

        Scanner Leitura = new Scanner(System.in);
        System.out.println("Consulta de RA (Aluno Nicolas)\n");
        int sair = 1;
        while(sair != 0) {

            System.out.println("Digite o seu nome: ");
            String nome = Leitura.nextLine();

            System.out.println("Digite a sua turma: ");
            String turma = Leitura.nextLine();
            if (nome.equalsIgnoreCase("Nicolas")) {
                if(turma.equalsIgnoreCase("DSP17")){
                    System.out.println(aluno.toString());
                }
            }else{
                System.out.println("Aluno não encontrado! :(");
            }
            System.out.println("Digite 0 para sair ou 1 para continuar");
            sair = Leitura.nextInt();
            Leitura.nextLine();


        }
    }
}
