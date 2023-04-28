import java.util.Scanner;

public class recebenotas{
    public float nota1, nota2, nota3, media;
    public void notas(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite a primeira nota: ");
        nota1 = scan.nextFloat();
        System.out.print("Digite a segunda nota: ");
        nota2 = scan.nextFloat();
        System.out.print("Digite a terceira nota: ");
        nota3 = scan.nextFloat();
        media = (nota1 + nota2 + nota3)/3; 
        System.out.println("A media é de "+ media);
    }
}