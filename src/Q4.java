import java.util.Scanner;
public class Q4 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int nota1 = Integer.parseInt(scanner.nextLine());
        int nota2 = Integer.parseInt(scanner.nextLine());
        int nota3 = Integer.parseInt(scanner.nextLine());
        float media = (float) ((nota1 * 2) + (nota2 * 3) + (nota3 * 5)) / nota1 + nota2 + nota3;
        System.out.printf("MEDIA: %.2f", media);
    }
    
}
