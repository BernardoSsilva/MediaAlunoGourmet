import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        recebenotas inserir = new recebenotas();
        mostrar checar = new mostrar();
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o nome do aluno: ");
        String nome = scan.nextLine();
        inserir.notas();
        float mediaFim = inserir.media;
        checar.aprovado(mediaFim);
    }
}
